package Test;

import DB.MicroMarketDAOIMP;
import DB.MysqlCon;
import Manager.JsonConverter;
import models.MicroMarket;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.sql.SQLException;

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
    public void sqlInsertMMTest(){
        MicroMarket mm = TestData.GetTestMicroMarket();

        Assert.assertEquals(1,DAOIMP.insert(mm));
    }



}
