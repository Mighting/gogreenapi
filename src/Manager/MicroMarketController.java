package Manager;


import models.MicroMarket;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/MicroMarket/Create")
public class MicroMarketController {
    MicroMarket mm = new MicroMarket();

    JsonConverter jc = new JsonConverter();

    @POST
    @Consumes("text/plain")

    //TEST HERE!!!!!!!!!
    public void postNewMM(String message){
        jc.StringToObject(message,mm);
    }
}
