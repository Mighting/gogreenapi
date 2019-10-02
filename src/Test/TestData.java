package Test;

import models.MicroMarket;

import java.sql.Date;

public class TestData {


    static MicroMarket GetTestMicroMarket() {
        MicroMarket mm = new MicroMarket();
        mm.setZipCodeID(1);
        mm.setStreetName("Street");
        mm.setHouseNumber("2");
        mm.setFloorNumber(0);
        mm.setPhoneNumber("12345678");
        mm.setEmail("BelleGogreencom");
        mm.setFirstName("Belle");
        mm.setLastName("Bellar");
        mm.setActive(1);
        mm.setOrderHoursStart(new Date(100000));
        mm.setOrderHoursEnd(new Date(200000));
        mm.setOpeningHoursStart(new Date(10000000));
        mm.setOpeningHoursEnd(new Date(100000000));

        return mm;
    }

    static String GetTestJsonMicroMarket() {
        return "{\"ProductList\":[],\"MicroMarketId\":0,\"ZipCodeID\":1,\"OrderHoursStart\":\"1970-01-01 01:01:40\",\"OrderHoursEnd\":\"1970-01-01 01:03:20\",\"OpeningHoursStart\":\"1970-01-01 03:46:40\",\"OpeningHoursEnd\":\"1970-01-02 04:46:40\",\"streetName\":\"Street\",\"houseNumber\":\"2\",\"floorNumber\":0,\"phoneNumber\":\"12345678\",\"email\":\"BelleGogreencom\",\"firstName\":\"Belle\",\"lastName\":\"Bellar\",\"Active\":1}";
    }
}
