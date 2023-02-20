
/**
  * @author (21039900 Nischal Acharya)
 * @version (1.0.0)
 */
public class ElectricCar extends Car{
    // Declaring the variables
    String customerName;
    int  batteryCapacity;
    int batteryWarranty;
    String purchaseDate;
    String range;
    int rechargeTime;
    boolean isBought;
    boolean isSold;
    //Initialzing the constructor and passing the required parameters
    ElectricCar( int carId, String carName, String carBrand, String carPrice, int batteryCapacity){
        super(carId, carName, carBrand, carPrice);
        //Assigning the value according to the passed parameters
        this.batteryCapacity= batteryCapacity;
        this.customerName= "";
        this.batteryWarranty= 0;
        this.purchaseDate= "";
        this.range= "";
        this.rechargeTime= 0;
        this.isBought= false;
        this.isSold= false;  
    }
    //Accessors methods for CustomerName
    public String getCustomerName(){
        return this.customerName;
    }
    //Accessors methods for BatteryCapacity
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    //Accessors methods for BatteryWarranty
    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }
    //Accessors methods for PurchaseDate
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    //Acessors methods for Range
    public String getRange(){
        return this.range;
    }
    //Accesors methods for RechargeTime
    public int getRechargeTime(){
        return this.rechargeTime;
    }
    //Accessors methods for IsBought
    public boolean getIsBought(){
        return this.isBought;
    }
    //Accessors methods for IsSold
    public boolean getIsSold(){
        return this.isSold;
    }
    //setters methods to change the customer name according to questions
    public void setCustomerName(String customerName){
        if (isBought == false){
            this.customerName = customerName;
        }
        else{
            System.out.println ("Since the car is already bought the customers name cannot be changed ");
        }
    }
    //Defining a methods to buy a new car
    public void buy(String customerName, int batteryWarranty, String purchseDate, String range, int rechargeTime){
        //For a car not bought yet
        if (isBought== false){
            setCustomerName(customerName);
            isBought = true;
        }
        else {
            System.out.println("The car has already been bought");
        }
    }
    //Defining a method to sell a car
    public void sell(String customerName){
        this.customerName= customerName;
        // For a car already sold
        if (isSold == false){
            batteryCapacity = 0;
            batteryWarranty = 0;
            purchaseDate = "";
            range = "";
            rechargeTime = 0;
            isSold = true;
            isBought = false;
        }
        //For a car not sold yet
        else{
            System.out.println("The car is already sold.");
        }
    }
    public void display(){
        super.display();
        if(isBought == true){
            System.out.println("The customers name is "+ this.customerName);
            System.out.println("The battery capacity is "+ this.batteryCapacity);
            System.out.println("The battery warranty is "+ this.batteryWarranty);
            System.out.println("The purchase date is "+ this.purchaseDate);
            System.out.println("The range  is "+ this.range);
            System.out.println("The recharge time is "+ this.rechargeTime);
        }
    }
}