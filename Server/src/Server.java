import ClientServer.AccessService;
import com.caucho.hessian.client.HessianProxyFactory;
import com.caucho.hessian.server.HessianServlet;
import keeper.api.User;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        //connectionManager();
        datamanager.getInstance().createUser(user);
    }


}
