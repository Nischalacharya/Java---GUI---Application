


/**
  *
 * @author (21039900 Nischal Acharya)
 * @version (1.0.0)
 */
public class Car                                
{
    //Declaring the variables
    private int carId;
    private String carName;
    private String carBrand;
    private String carPrice;
    private String carColor;
    //Initialization of the constructor and passing the required parameters
    public Car(int carId, String carName, String carBrand, String carPrice){
        //Assigning the parameterized values to the declared variables
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = "";
    }
    //Accesors methods for CarId
    public int getCarId(){
        return this.carId;
    }
    //Accesors Methods for CarName
    public String getCarName(){
        return this.carName;
    }
    //Accessors Methods for CarBrand
    public String getCarBrand(){
        return this.carBrand;
    }
    //Accesors Methods for CarPrice
    public String getCarPrice(){
        return this.carPrice;
    }
    //Accesors Methods for CarColor
    public String getCarColor(){
        return this.carColor;
    }
    //Setters method for setting the car color
    public void setCarColor(String carColor){
        this.carColor= carColor;
    }
    public void display (){
        //methods to display all the details of the car
        System.out.println("The ID of the car is " + this.carId);
        System.out.println("The name of the car is " + this.carName);
        System.out.println("The brand of the car is " + this.carBrand);
        System.out.println("The price of the car is " + this.carPrice);
        // Examining for empty value of carColor
        if (this.carColor == ""){
        System.out.println("The color of the car is " + this.carColor);
        }
        else {
        System.out.println("The car color is not identified");
        }
    }
}
