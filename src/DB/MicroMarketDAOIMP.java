package DB;

import models.MicroMarket;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MicroMarketDAOIMP implements StandardDAO<MicroMarket> {


    @Override
    public MicroMarket getFromId(int id) {
        return null;
    }

    @Override
    public ArrayList<MicroMarket> getAll() {
        return null;
    }

    @Override
    public int insert(MicroMarket item) {
        Connection con = MysqlCon.getCon();
        int code;
        try {
            Statement stat = con.createStatement();
            String qr = "INSERT INTO MicroMarket (ZipcodeId, " +
                    "StreetName, " +
                    "HouseNumber, " +
                    "FloorNumber, " +
                    "PhoneNumber, " +
                    "Email, " +
                    "FirstName, " +
                    "LastName, " +
                    "Active, " +
                    "OrderHoursStart, " +
                    "OrderHoursEnd, " +
                    "OpeningHoursStart, " +
                    "OpeningHoursEnd) " +
                    "VALUES ("+ item.sqlInsertValues() +")";
            code = stat.executeUpdate(qr);
        }
        catch (SQLException sqle){
            return -1;
        }
        return code;
    }

    @Override
    public MicroMarket add(MicroMarket item) {
        return null;
    }

    @Override
    public MicroMarket update(MicroMarket item) {
        return null;
    }

    @Override
    public MicroMarket disable(MicroMarket item) {
        return null;
    }
}
