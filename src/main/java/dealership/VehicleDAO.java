package dealership;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO {
  // ways to look up different vehicles

  private static DataSource dataSource;

  public VehicleDAO(DataSource dataSource) {
    VehicleDAO.dataSource = dataSource;
  }

  public static List<Vehicle> getAllVehicles() {
    List<Vehicle> vehicles = new ArrayList<>();
    String query = "SELECT * FROM vehicles";
    try (Connection connection = dataSource.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery() ) {
      while (rs.next()) {
        vehicles.add(new Vehicle(rs.getString("VIN"), rs.getString("CarMakeModel"), rs.getInt("year"), rs.getDouble("Mileage"), rs.getBoolean("SOLD"), rs.getInt("dealership_id"), rs.getDouble("Price")));
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());

    }
    return vehicles;
  }


}
