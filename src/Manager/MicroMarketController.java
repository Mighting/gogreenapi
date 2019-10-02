package Manager;


import DB.MicroMarketDAOIMP;
import models.MicroMarket;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/MicroMarket/Create")
public class MicroMarketController {


    @POST
    @Consumes("text/plain")

    public void postNewMM(String message){
        MicroMarket mm = new MicroMarket();
        JsonConverter jc = new JsonConverter();
        MicroMarketDAOIMP mmDAOIMP = new MicroMarketDAOIMP();

        mm = (MicroMarket) jc.StringToObject(message,mm.getClass());
        mmDAOIMP.insert(mm);
    }
}
