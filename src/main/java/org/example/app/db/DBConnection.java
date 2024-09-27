package org.example.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection ;
    public DBConnection(){
        this.connect();
    }
    public Connection connect() {
        try {
            String dbUrl ="jdbc:postgresql://localhost:5432/Shkolla";
            String user = "postgres";
            String password = "123456";
            this.connection = DriverManager.getConnection(dbUrl,user,password);
            //System.out.println("Connected to postgres database susscesfully");

        } catch (SQLException e) {
            System.out.println("We couldnt connect to database.");
            e.printStackTrace();
        }
        return connection;
    }
    public  Connection getConnection(){
        return this.connect();
    }

}
