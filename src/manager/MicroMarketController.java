package manager;


import db.MicroMarketDAOIMP;
import models.MicroMarket;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/MicroMarket")
public class MicroMarketController {


    @POST
    @Consumes("application/json")
    public Response postNewMM(String message){
        MicroMarket mm = new MicroMarket();
        JsonConverter jc = new JsonConverter();
        MicroMarketDAOIMP mmDAOIMP = new MicroMarketDAOIMP();

        try {
            mm = (MicroMarket) jc.StringToObject(message,mm.getClass());
            mmDAOIMP.insert(mm);
        }catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST)
                    .header("Access-Control-Allow-Origin", "*")
                    .header("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST")
                    .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                    .header("Access-Control-Allow-Credentials", "true").entity(e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true").build();
    }

    @GET
    @Produces("application/json")
    public Response getClichedMessage() {
        MicroMarketDAOIMP microMarketDAOIMP = new MicroMarketDAOIMP();
        ArrayList<MicroMarket> mmlist = microMarketDAOIMP.getAll();
        JsonConverter js = new JsonConverter();
        String s = js.ObjectToString(mmlist);
        return Response.status(Response.Status.OK).entity(s).header("Access-Control-Allow-Origin", "*").build();
    }
}
