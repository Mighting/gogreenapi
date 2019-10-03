package db;

import models.Zipcode;

import java.sql.*;
import java.util.ArrayList;

public class ZipcodeDAOIMP implements StandardDAO<Zipcode> {


    @Override
    public Zipcode getFromID(int id) {
        return null;
    }

    @Override
    public ArrayList<Zipcode> getAll() {
        ArrayList<Zipcode> list = new ArrayList<Zipcode>();
        try {
            Connection con = MysqlCon.getCon();
            Statement stmt = con.createStatement();
            String qr = "SELECT * FROM Zipcode";
            ResultSet rs = stmt.executeQuery(qr);
            while (rs.next()) {
                int code = rs.getInt("Zipcode");
                String country = rs.getString("Country");
                String city = rs.getString("City");
                list.add(new Zipcode(code, country, city));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Zipcode item) {
        return  0;
    }

    @Override
    public Zipcode add(Zipcode item) {
        return null;
    }

    @Override
    public Zipcode update(Zipcode item) {
        return null;
    }

    @Override
    public Zipcode disable(Zipcode item) {
        return null;
    }
}
