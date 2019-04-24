package MarcosUTN;

import MarcosUTN.entities.Player;

public class Game {
    private String coveredWord = new String();
    private String word;

    public Game(String word) {
        this.word = word;
        setCoveredWord(word);
        System.out.println("Word to guess: "+coveredWord);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public synchronized int play(Player player, String word, char character) throws InterruptedException {
        System.out.println("Playing: " + player.getName());
        System.out.println("Trying with: "+character);
            if(tryToGuess(word,character)){
                return 1;
            }else {
                return 0;
            }
    }

    private void setCoveredWord(String word) {
        for (int i = 0 ; i < word.length() ; i++) {
            this.coveredWord = this.coveredWord.concat("-");
        }
    }

    public boolean tryToGuess(String word, Character character) {
        return word.toLowerCase().contains(String.valueOf(character)) ? true : false;
    }

    public String underCoverChar(String word, char character) {
        char[] wordArray = word.toLowerCase().toCharArray();
        char[] coveredWordArray = this.coveredWord.toLowerCase().toCharArray();
        int i = 0;
        for (Character c : wordArray) {
            if (c.equals(character)) {
                coveredWordArray[i] = character;
            }
            i++;
        }
        String cWord = String.valueOf(coveredWordArray);
        this.coveredWord = cWord;
        return cWord;
    }

}
