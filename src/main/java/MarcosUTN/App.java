package MarcosUTN;

import MarcosUTN.entities.Player;
import MarcosUTN.repository.DBConnection;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, InterruptedException {

        DBConnection c = new DBConnection();
        c.connect();
        String word = c.getRandomWord();
        Game game = new Game(word);
        Thread thread = new Thread(new Player("Marcos",7, game));
        Thread thread2 = new Thread(new Player("Test",7, game));
        thread.setName("Marcos");
        thread2.setName("Test");
        thread.start();
        thread2.start();


    }
}
