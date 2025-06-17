package dealership;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static dealership.DAO.VehicleDAO.dataSource;

//performs all CRUD operations in the database
// redundant if we're doing dao's for each class
public class DataManager {
    private static DataSource dataSource;

    public DataManager(DataSource dataSource) {
        DataManager.dataSource = dataSource;
    }


    }



