package db;


import models.MicroMarket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MicroMarketDAOIMP implements StandardDAO<MicroMarket> {


    @Override
    public MicroMarket getFromID(int ID) {
        return null;
    }

    @Override
    public ArrayList<MicroMarket> getAll() {
        return null;
    }

    //TODO: Rewrite timeformat and InsertValues
    @Override
    public int insert(MicroMarket item) throws SQLException {
        Connection con = MysqlCon.getCon();
        int returnCode;
            String insertString = "INSERT INTO MicroMarket (ZipCode, " +
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
                    "OpeningHoursEnd, " +
                    "Password) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(insertString);
            preparedStatement.setInt(1,item.getZipCode());
            preparedStatement.setString(2,item.getStreetName());
            preparedStatement.setString(3,item.getHouseNumber());
            preparedStatement.setInt(4,item.getFloorNumber());
            preparedStatement.setString(5,item.getPhoneNumber());
            preparedStatement.setString(6,item.getEmail());
            preparedStatement.setString(7,item.getFirstName());
            preparedStatement.setString(8,item.getLastName());
            preparedStatement.setInt(9,1);
            preparedStatement.setDate(10,null);
            preparedStatement.setDate(11,null);
            preparedStatement.setDate(12,null);
            preparedStatement.setDate(13,null);
            preparedStatement.setString(14,item.getPassword());

            returnCode = preparedStatement.executeUpdate();



        return returnCode;
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
