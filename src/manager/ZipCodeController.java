package manager;

import db.ZipcodeDAOIMP;
import models.Zipcode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/Zipcode")
public class ZipCodeController {
    @GET
    @Produces("application/json")
    public Response getClichedMessage() {
        ZipcodeDAOIMP zipcodeDAOIMP = new ZipcodeDAOIMP();
        ArrayList<Zipcode> list = zipcodeDAOIMP.getAll();
        JsonConverter js = new JsonConverter();
        String s = js.ObjectToString(list);
        return Response.status(Response.Status.OK).entity(s).header("Access-Control-Allow-Origin", "*").build();
    }


}
