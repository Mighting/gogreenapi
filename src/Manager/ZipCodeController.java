package Manager;

import DB.ZipcodeDAOIMP;
import models.Zipcode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;

@Path("/Zipcode")
public class ZipCodeController {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        ZipcodeDAOIMP zipcodeDAOIMP = new ZipcodeDAOIMP();
        ArrayList<Zipcode> list = zipcodeDAOIMP.getAll();
        JsonConverter js = new JsonConverter();
        String s = js.ObjectToString(list);
        return s;
    }


}
