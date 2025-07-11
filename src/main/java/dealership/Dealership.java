package dealership;

import java.util.ArrayList;


import java.util.List;

    public class Dealership {
        private String name;
        private String address;
        private String phone;

        private List<Vehicle> inventory = new ArrayList<>();

        public Dealership(int dealershipId, String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public List<Vehicle> getInventory() {
            return inventory;
        }


        public List<Vehicle> getVehiclesByPrice(double min, double max) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for(Vehicle vehicle : inventory) {
                if(vehicle.getPrice() <= max && vehicle.getPrice() >= min) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }

        public List<Vehicle> getVehiclesByMakeModel(String makeAndModel) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for(Vehicle vehicle : inventory) {
                if(vehicle.getMakeAndModel().equalsIgnoreCase(makeAndModel)) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }

        public List<Vehicle> getVehiclesByYear(double min, double max) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for(Vehicle vehicle : inventory) {
                if(vehicle.getYear() <= max && vehicle.getYear() >= min) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }


        public List<Vehicle> getVehiclesByMileage(double min, double max) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for(Vehicle vehicle : inventory) {
                if(vehicle.getOdometer() <= max && vehicle.getOdometer() >= min) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }


        public List<Vehicle> getAllVehicles() {
            return inventory;
        }

        public void addVehicle(Vehicle vehicle) {
            inventory.add(vehicle);
            DealershipFileManager.saveDealership(this);
        }

        public void removeVehicle(String vin) {
            inventory.remove(vin);
            DealershipFileManager.saveDealership(this);
        }

        public String toFileString() {
            return name + "|" + address + "|" + phone;
        }

    }

