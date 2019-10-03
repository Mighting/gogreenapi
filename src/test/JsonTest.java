package test;

import manager.JsonConverter;
import models.MicroMarket;
import org.junit.Assert;
import org.junit.Test;

public class JsonTest {

    @Test
    public void ObjectToJson(){
        MicroMarket mm = TestData.GetTestMicroMarket();
        JsonConverter js = new JsonConverter();
        String Json = TestData.GetTestJsonMicroMarket();
        Assert.assertEquals(Json, js.ObjectToString(mm));
    }


    @Test
    public void JsonToObject(){
        String Json = TestData.GetTestJsonMicroMarket();
        JsonConverter js = new JsonConverter();
        MicroMarket mm = new MicroMarket();
        mm = (MicroMarket)js.StringToObject(Json,mm.getClass());
        Assert.assertEquals(TestData.GetTestMicroMarket().getFirstName(),mm.getFirstName());
    }





}
