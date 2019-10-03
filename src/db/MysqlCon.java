package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCon {
    private static Connection con;

    public MysqlCon() {

    }

    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.108.146.1/gogreen", "remotegod", "MySQL@gr33n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
