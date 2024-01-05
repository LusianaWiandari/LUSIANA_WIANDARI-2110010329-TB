package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private final String url = "jdbc:mysql://localhost:3306/db_pegawai";
    private final String user = "root";
    private final String pass = "";
    
    public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_pegawai";
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Database Terhubung");
            } catch (ClassNotFoundException | SQLException error) {
                System.out.println("Eror"+error.toString());
            }

        }
        return connection;
    }
    public static void main(String[] args) {
        Koneksi.getConnection();
    }
}