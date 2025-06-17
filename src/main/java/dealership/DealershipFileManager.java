package dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static dealership.DAO.VehicleDAO.dataSource;


//public class DealershipFileManager {
////  public static String fileLocation =
////      "//C:\\pluralsight\\workshops\\CarDealershipWorkshop\\src\\main\\java\\dealership\\CSV_File\\inventory.csv";
//
//    public static Dealership getDealerShip() {
////        Dealership dealership = null;
////        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation))) {
////            String[] dealershipString = bufferedReader.readLine().split("\\|");
////            dealership = new Dealership(dealershipString[0], dealershipString[1], dealershipString[2]);
////            String line;
////            while((line = bufferedReader.readLine()) != null) {
////                String[] vehicleString = line.split("\\|");
////                Vehicle vehicle = new Vehicle(vehicleString[0], vehicleString[1], Integer.parseInt(vehicleString[2]), Double.parseDouble(vehicleString[3]), Boolean.parseBoolean(vehicleString[4]), Integer.parseInt(vehicleString[5]), Double.parseDouble(vehicleString[6]));
////            }
////
////        } catch(IOException e) {
////            e.printStackTrace();
////        }
////        return dealership;
//
//
//    }
//
//    public static void saveDealership(Dealership dealership) {
////        try(FileWriter fileWriter = new FileWriter(fileLocation)) {
////            fileWriter.write(dealership.toFileString());
////            for(Vehicle vehicle : dealership.getInventory()) {
////                fileWriter.write("\n" + vehicle.toFileString());
////            }
////        } catch(IOException e) {
////            e.printStackTrace();
////        }
//    }
//
//
//}
