package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Start {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        new Server();
    }



}
