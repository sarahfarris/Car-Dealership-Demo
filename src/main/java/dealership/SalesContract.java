package dealership;

public class SalesContract {

    int contract_id;
    String customerName;
    double saleAmount;
    String vin;
    int dealership_id;
    String dateOfSale;

    public SalesContract(String dateOfSale, int dealership_id, String vin, double saleAmount, String customerName, int contract_id) {
        this.dateOfSale = dateOfSale;
        this.dealership_id = dealership_id;
        this.vin = vin;
        this.saleAmount = saleAmount;
        this.customerName = customerName;
        this.contract_id = contract_id;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getDealership_id() {
        return dealership_id;
    }

    public void setDealership_id(int dealership_id) {
        this.dealership_id = dealership_id;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}
