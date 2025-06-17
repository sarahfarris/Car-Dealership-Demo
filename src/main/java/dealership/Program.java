package dealership;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/dealership_workshop");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        DataManager dataManager = new DataManager(dataSource); // does this need to be instantiated again here?

        UserInterface userInterface = new UserInterface();
        userInterface.display();
    }
}
