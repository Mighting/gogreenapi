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
    MicroMarket mm = new MicroMarket();



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
        mm.setZipCodeID(1);
        mm.setStreetName("'Street'");
        mm.setHouseNumber("'2'");
        mm.setFloorNumber(0);
        mm.setPhoneNumber("'12345678'");
        mm.setEmail("'BelleGogreencom'");
        mm.setFirstName("'Belle'");
        mm.setLastName("'Bellar'");
        mm.setActive(1);
        mm.setOrderHoursStart(new Date(100000));
        mm.setOrderHoursEnd(new Date(200000));
        mm.setOpeningHoursStart(new Date(10000000));
        mm.setOpeningHoursEnd(new Date(100000000));

        Assert.assertEquals(1,DAOIMP.insert(mm));
    }

    @Test
    public void ObjectToJson(){
        mm.setZipCodeID(1);
        mm.setStreetName("'Street'");
        mm.setHouseNumber("'2'");
        mm.setFloorNumber(0);
        mm.setPhoneNumber("'12345678'");
        mm.setEmail("'BelleGogreencom'");
        mm.setFirstName("'Belle'");
        mm.setLastName("'Bellar'");
        mm.setActive(1);
        mm.setOrderHoursStart(new Date(100000));
        mm.setOrderHoursEnd(new Date(200000));
        mm.setOpeningHoursStart(new Date(10000000));
        mm.setOpeningHoursEnd(new Date(100000000));


        JsonConverter js = new JsonConverter();

        Assert.assertEquals("{\"ProductList\":[],\"MicroMarketId\":0,\"ZipCodeID\":1,\"OrderHoursStart\":\"jan. 1, 1970\",\"OrderHoursEnd\":\"jan. 1, 1970\",\"OpeningHoursStart\":\"jan. 1, 1970\",\"OpeningHoursEnd\":\"jan. 2, 1970\",\"streetName\":\"\\u0027Street\\u0027\",\"houseNumber\":\"\\u00272\\u0027\",\"floorNumber\":0,\"phoneNumber\":\"\\u002712345678\\u0027\",\"email\":\"\\u0027BelleGogreencom\\u0027\",\"firstName\":\"\\u0027Belle\\u0027\",\"lastName\":\"\\u0027Bellar\\u0027\",\"Active\":1}", js.ObjectToString(mm));
    }

}
