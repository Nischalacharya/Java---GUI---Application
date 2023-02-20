/**
  * @author (21039900 Nischal Acharya)
 * @version (1.0.0)
 */
public class FuelCar extends Car{
    //Declaring the given variables
    String distributorName;
    String fuelType;
    int numberofSeats;
    String bookedDate;
    String purchaseDate;
    int mileage;
    String transmissionType;
    boolean isPurchased;
    //Initialzing the constructor and passing the required parameters
    FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int numberofSeats, int mileage){
        super(carId, carName, carBrand, carPrice);
        //Assigning according to the questions
        this.fuelType = fuelType;
        this.numberofSeats = numberofSeats;
        this.mileage = mileage;
        this.distributorName = "";
        this.bookedDate = "";
        this.purchaseDate = "";
        this.transmissionType = "";
        this.isPurchased = false;

    }
    //Accesors Methods for DistributorName
    public String getDistributorName(){
        return this.distributorName;
    }
    //Accesors Methods for FuelType
    public String getFuelType(){
        return this.fuelType;
    }
    //Accesors Methods for NumberofSeats
    public int getNumberofSeats(){
        return this.numberofSeats;
    }
    //Accesors Methods for BookeDate
    public String getBookedDate(){
        return this.bookedDate;
    }
    //Accesors Methods for PurchaseDate
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    //Accesors Methods for Mileage
    public int getMileage(){
        return this.mileage;
    }
    //Accesors Methods for TransmissionType
    public String getTransmissionType(){
        return this.transmissionType;
    }
    //Accesors Methods for IsPurchased
    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    //corrensponding setter method for distributorname
    public void setDistributorName(String distributorName){
        this.distributorName= distributorName;
    }
    //corrensponding setter method for transmissiontype
    public void setTransmissionType(String transmissionType){
        this.transmissionType= transmissionType;
    }
    //methods for purchasing fuel car
    public void purchase(String purchaseDate, String bookedDate){
        //For the car already purchased
        if(isPurchased == true){
            super.setCarColor(getCarColor());
            System.out.println("The Id of the car is " + getCarId());
            System.out.println("The name of the car is " + getCarName());
            System.out.println("The brand of the car is " + getCarBrand());
            System.out.println("The price of the car is " + getCarPrice());
            System.out.println("The distributor of the car is " + this.distributorName);
        }
        //For the car not purchased yet
        else{
            setDistributorName(distributorName);
            setTransmissionType( transmissionType);
            this.purchaseDate = purchaseDate;
            this.bookedDate = bookedDate;
            this.isPurchased = true;
        }    
    }
    //Method to display the details of the car 
    public void display (){
        //Methods over riding of display method
        super.display();
        if (isPurchased== true){
            System.out.println("Disributor Name: " + this.distributorName);
            System.out.println("Fuel type : " + this.fuelType);
            System.out.println("Milege : " + this.mileage);
            System.out.println("numberofSeats : " + this.numberofSeats);
            System.out.println("TransmissionType : " + this.transmissionType);
            System.out.println("BookedDate : " + this.bookedDate);
            System.out.println("PurchasedDate : " + this.purchaseDate);
        }
    }
}