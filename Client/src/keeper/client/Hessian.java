package keeper.client;

import ClientServer.AccessService;
import com.caucho.hessian.client.HessianProxyFactory;

import java.io.IOException;

public class Hessian{

    public AccessService Hessian()  throws IOException  {

        String serverAddress = "http://localhost:8080/";
        HessianProxyFactory factory = new HessianProxyFactory();
        AccessService accessService = (AccessService) factory.create(AccessService.class, serverAddress + "DataService");
        return accessService;
    }
}
