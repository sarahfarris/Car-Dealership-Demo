package dealership.DAO;

import dealership.Dealership;
import dealership.SalesContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealershipDAO {

    // ways to look up different dealerships

    static Scanner scanner = new Scanner(System.in);

    public static DataSource dataSource;

    public DealershipDAO(DataSource dataSource) {
        SalesContractDAO.dataSource = dataSource;
    }

    public static List<Dealership> getAllDealerships() {
        ArrayList<Dealership> dealerships = new ArrayList<>();
        String query = "SELECT * FROM dealerships;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
        ) { while(rs.next()) {
        dealerships.add(
            new Dealership(
                rs.getInt("dealership_id"),
                rs.getString("DealershipName"),
                rs.getString("address"),
                rs.getString("phone")));
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dealerships;
    }
}
