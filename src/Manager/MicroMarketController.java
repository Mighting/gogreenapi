package Manager;


import DB.MicroMarketDAOIMP;
import models.MicroMarket;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/MicroMarket")
public class MicroMarketController {


    @POST
    @Consumes("text/plain")
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
                    .header("Access-Control-Allow-Credentials", "true").build();
        }
        return Response.status(Response.Status.CREATED)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true").build();
    }
}
