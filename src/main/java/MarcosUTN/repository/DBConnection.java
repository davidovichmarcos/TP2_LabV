package MarcosUTN.repository;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DBConnection {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_HOST = "//localhost/";
    static final String DB_NAME = "TP2LABV";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Statement st;
    private static java.sql.Connection connection;

    public static void connect() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection("jdbc:mysql:" + DB_HOST + DB_NAME , DB_USER , DB_PASS);
            st = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getRandomWord() throws SQLException {
        String query = "SELECT * FROM words; ";
        List<String> words = new ArrayList<String>();
        ResultSet rs = st.executeQuery(query);
        int i = 0;
        while (rs.next()) {
            words.add(rs.getString("word"));
            i++;
        }
        int index = new Random().nextInt(i);
        return words.get(index);
    }

}
