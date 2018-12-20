package serv;

import ClientServer.AccessService;
import com.caucho.hessian.server.HessianServlet;
import keeper.api.User;



import java.awt.*;
import java.net.MalformedURLException;
import java.sql.SQLException;


public class Server extends HessianServlet implements AccessService {

    public void login(String login, String password) {
        datamanager.getInstance().login(login, password);
    }



    public void createUser(int id, String login, String password, String position) throws SQLException, MalformedURLException {
        User user = new User();
        user.setUserID(id);
        user.setPosition(position);
        user.setPassword(password);
        user.setLogin(login);
        //serv.connectionManager();
        datamanager.getInstance().createUser(user);
    }


}
