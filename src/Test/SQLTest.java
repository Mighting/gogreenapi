package Test;

import DB.MicroMarketDAOIMP;
import DB.MysqlCon;
import DB.ZipcodeDAOIMP;
import Manager.JsonConverter;
import models.MicroMarket;
import models.Zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLTest {
    MicroMarketDAOIMP DAOIMP = new MicroMarketDAOIMP();

    @Test
    public void connectionTest(){
        try {
            Assert.assertFalse(MysqlCon.getCon().isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sqlInsertMMTest() throws SQLException {
        MicroMarket mm = TestData.GetTestMicroMarket();

        Assert.assertEquals(1,DAOIMP.insert(mm));
    }

    //Write it down
    @Test
    public void sqlSelectTest(){
        ZipcodeDAOIMP zipcodeDAOIMP = new ZipcodeDAOIMP();
        ArrayList<Zipcode> list = zipcodeDAOIMP.getAll();
        Assert.assertTrue(list.size() > 0);
    }



}
