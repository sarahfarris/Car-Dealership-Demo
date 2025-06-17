package dealership.DAO;

import dealership.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class VehicleDAO {
  // ways to look up different vehicles
  static Scanner scanner = new Scanner(System.in);

  public static DataSource dataSource;

  public VehicleDAO(DataSource dataSource) {
    VehicleDAO.dataSource = dataSource;
  }

  public static List<Vehicle> getAllVehicles() {
    List<Vehicle> vehicles = new ArrayList<>();
    String query = "SELECT * FROM vehicles";
    try (Connection connection = dataSource.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query)) {
      while (rs.next()) {
        vehicles.add(
            new Vehicle(
                rs.getString("VIN"),
                rs.getString("CarMakeModel"),
                rs.getInt("year"),
                rs.getDouble("Mileage"),
                rs.getBoolean("SOLD"),
                rs.getInt("dealership_id"),
                rs.getDouble("Price")));
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return vehicles;
    }

  public static List<Vehicle> getVehicleByVIN() {
    List<Vehicle> vehicles = new ArrayList<>();
    System.out.println("----- Search by VIN -----");
    System.out.println("Enter VIN:");
    String vin = scanner.nextLine();
    String query = "SELECT * FROM dealership_workshop.vehicles WHERE VIN LIKE '%" + vin + "%'";
    try (Connection connection = dataSource.getConnection();
         PreparedStatement ps = connection.prepareStatement(query);
         ResultSet rs = ps.executeQuery(query) ) {
      while (rs.next()) {
        vehicles.add(new Vehicle(rs.getString("VIN"), rs.getString("CarMakeModel"), rs.getInt("year"), rs.getDouble("Mileage"), rs.getBoolean("SOLD"), rs.getInt("dealership_id"), rs.getDouble("Price")));
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());

    }
    return vehicles;
  }


}
