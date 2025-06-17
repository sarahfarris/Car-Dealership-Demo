package dealership.DAO;

import dealership.SalesContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesContractDAO {

    //ways to look up different sales contracts

    static Scanner scanner = new Scanner(System.in);

    public static DataSource dataSource;

    public SalesContractDAO(DataSource dataSource) {
        SalesContractDAO.dataSource = dataSource;
    }

    public static List<SalesContract> getAllSalesContracts() {
        ArrayList<SalesContract> sales = new ArrayList<>();
        String query = "SELECT * FROM sales_contracts;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
        ) { while(rs.next()) {
            sales.add(new SalesContract(rs.getString("DateOfSale"), rs.getInt("contract_id"), rs.getString("CustomerName"), rs.getDouble("sale_amount"), rs.getString("VIN"), rs.getInt("dealership_id")));
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sales;
    }
}
