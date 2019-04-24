package MarcosUTN.entities;

import MarcosUTN.Game;
import java.util.concurrent.ThreadLocalRandom;

public class Player implements Runnable{

    private String name;
    private Integer lifes;
    private Game game;
    private String word;
    private  boolean gameEnded = false;

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    private boolean isPlaying;


    public Player() {

    }

    public Player(String name, Integer lifes, Game game) {
        this.name = name;
        this.lifes = lifes;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifes() {
        return lifes;
    }

    public void setLifes(Integer lifes) {
        this.lifes = lifes;
    }

    @Override
    public void run() {

        while (!gameEnded) {
            play();
        }
    }

    public synchronized void play()
    {

        try {
            while (this.isPlaying) {
                wait();
            }
            this.setPlaying(true);

            char character = this.getRandomChar();

            word = game.underCoverChar(game.getWord(),character);
            if (game.play(this, game.getWord(),character) == 0) {
                this.lifes--;
                System.out.println("Is not Present!\t "+this.getLifes()+" lifes left");
            }else {
                System.out.println("Is Present!\t "+ word);
            }

            this.setPlaying(false);
            notifyAll();
            if (!word.contains("-")) {
                gameEnded = true;
                System.out.println("Player: "+getName()+" Wins, word: "+ word);
            }else if (this.lifes == 0) {
                gameEnded = true;
                System.out.println("Player: "+getName()+" looses, no lifes left ");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public char getRandomChar() {
        char index = (char) ThreadLocalRandom.current().nextInt(97, 122);
        return index;
    }

}
