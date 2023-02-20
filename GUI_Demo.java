
/**
 * Write a description of class GUI_Demo here.
 *
 * @author (21039900 Nischal Acharya)
 * @version (1.0.0)
 */
//Importing all the required packages for the class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
public class GUI_Demo implements ActionListener 

{
    //Declaring a frame
    private JFrame mainFrame;

    //Declaring two panels
    private JPanel panelFuelCar;
    private JPanel panelElectricCar;

    //Defining all the attributes for fuel car
    private JLabel fuelCarTitle;

    //Defining attributes to add a fuel car
    private JLabel carID1;
    private JLabel carName1;
    private JLabel carBrand1; 
    private JLabel mileage; 
    private JLabel carPrice1; 
    private JLabel fuelType; 
    private JLabel numberOfSeats;
    private JTextField carID1TextField; 
    private JTextField carName1TextField; 
    private JTextField carBrand1TextField;
    private JTextField mileageTextField;

    private JTextField carPrice1TextField;
    private JTextField fuelTypeTextField;
    private JTextField numberOfSeatsTextField;

    private JButton fuelCarAddButton;

    //Defining attributes to purchase for Fuel car
    private JLabel carID2; 
    private JLabel carName2;
    private JLabel carBrand2;
    private JLabel carColor1;
    private JLabel transmissionType;
    private JLabel distributorName;
    private JLabel purchaseDate1;
    private JLabel bookDate;

    private JTextField carID2TextField;
    private JTextField carName2TextField;
    private JTextField carBrand2TextField;
    private JTextField carColor1TextField;
    private JTextField transmissionTypeTextField;
    private JTextField distributorNameTextField;

    private JComboBox purchaseDate1DayComboBox;
    private JComboBox purchaseDate1MonthComboBox;
    private JComboBox purchaseDate1YearComboBox;

    private JComboBox bookedDate1DayComboBox;
    private JComboBox bookedDate1MonthComboBox;
    private JComboBox bookedDate1YearComboBox;

    //Declaring all the Buttons required for the frame
    private JButton fuelCarPurchaseButton;
    private JButton fuelCarClearButton;
    private JButton fuelCarDisplayButton;

    //Defining all the attributes for Electric Car
    private JLabel electricCarTitle;
    private JLabel carID3;
    private JLabel carName3;
    private JLabel carBrand3;
    private JLabel carPrice2;
    private JLabel batteryCapacity;

    private JTextField carID3TextField;
    private JTextField carName3TextField;
    private JTextField carBrand3TextField;
    private JTextField carPrice2TextField;
    private JTextField batteryCapacityTextField;

    private JButton electricCarAddButton;

    //Defining all the attributes for Buy Electric Car
    private JLabel carID4;
    private JLabel carName4;
    private JLabel carBrand4;
    private JLabel carPrice3;
    private JLabel carColor3;
    private JLabel customerName;
    private JLabel batteryWarranty;
    private JLabel range;
    private JLabel rechargeTime;
    private JLabel purchaseDate2;

    private JTextField carID4TextField;
    private JTextField carName4TextField;
    private JTextField carBrand4TextField;
    private JTextField carPrice3TextField;
    private JTextField carColor3TextField;
    private JTextField customerNameTextField;
    private JTextField batteryWarrantyTextField;
    private JTextField rangeTextField;
    private JTextField rechargeTimeTextField;
    private JComboBox purchaseDate2DayComboBox;
    private JComboBox purchaseDate2MonthComboBox;
    private JComboBox purchaseDate2YearComboBox;

    //Declaring all the Buttons required for the frame
    private JButton electricCarBuyButton;
    private JButton electricCarSellButton;
    private JButton electricCarClear1Button;
    private JButton electricCarDisplay1Button;

    //Declaring a tabbed pane
    private JTabbedPane fuelCarTabbedPane;
    private JTabbedPane electricCarTabbedPane;
    
    public GUI_Demo(){
        gui_Demo();
    }

    //Declaring Combo Box
    String [] comboBoxYears = {"2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
    String [] comboBoxMonths = {"January", "February", "March", "April","May","June","July", "August","September","October","November","December"};
    String [] comboBoxDays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};

    //Defining Array Lists which are derived from Car Class
    ArrayList <Car> carArrayList = new ArrayList <>();
    public void gui_Demo() {
        //Initialization and Setting of Bounds for JFrame and JPanel
        mainFrame = new JFrame("Car Transaction");
        mainFrame.setSize(980, 770);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelFuelCar = new JPanel();
        panelFuelCar.setSize(980, 770);
        panelFuelCar.setLayout(null);

        panelElectricCar = new JPanel();
        panelElectricCar.setSize(980, 770);
        panelElectricCar.setLayout(null);

        fuelCarTabbedPane = new JTabbedPane();
        fuelCarTabbedPane.add("Fuel Car", panelFuelCar);
        fuelCarTabbedPane.add("Electric Car", panelElectricCar);       

        mainFrame.add(fuelCarTabbedPane);

        //Declaring different fonts used for the GUI
        Font font1 = new Font("Franklin Gothic Book", Font.BOLD, 25);
        Font font2 = new Font("Franklin Gothic Book", Font.PLAIN, 17);
        Font font3 = new Font("Lucid Sans", Font.BOLD, 13);
        Font font4 = new Font("Arial", Font.BOLD, 14);

        //Initialization, Setting Bounds, Addition of Fonts to all the Components of Fuel Car and finally adding them to the panel
        fuelCarTitle = new JLabel("Fuel Car");
        fuelCarTitle.setBounds(440, 50, 100, 35);
        fuelCarTitle.setFont(font1);
        panelFuelCar.add(fuelCarTitle);

        carID1 = new JLabel("Car ID");
        carID1.setBounds(80, 120, 50, 30);
        carID1.setFont(font2);
        panelFuelCar.add(carID1);

        carID1TextField = new JTextField();
        carID1TextField.setBounds(180, 115, 225, 30);
        carID1TextField.setFont(font4);
        panelFuelCar.add(carID1TextField);

        carName1 = new JLabel("Car Name");
        carName1.setBounds(80, 179, 78,24);
        carName1.setFont(font2);
        panelFuelCar.add(carName1);

        carName1TextField = new JTextField();
        carName1TextField.setBounds(180, 174, 225, 29);
        carName1TextField.setFont(font4);
        panelFuelCar.add(carName1TextField);

        carBrand1 = new JLabel("Car Brand");
        carBrand1.setBounds(80, 238, 78,24 );
        carBrand1.setFont(font2);
        panelFuelCar.add(carBrand1);

        carBrand1TextField = new JTextField();
        carBrand1TextField.setBounds(180, 233, 225, 29);
        carBrand1TextField.setFont(font4);
        panelFuelCar.add(carBrand1TextField);

        carPrice1 = new JLabel("Car Price");
        carPrice1.setBounds(80, 297, 71, 24);
        carPrice1.setFont(font2);
        panelFuelCar.add(carPrice1);

        carPrice1TextField = new JTextField();
        carPrice1TextField.setBounds(180, 292, 225, 29);
        carPrice1TextField.setFont(font4);
        panelFuelCar.add(carPrice1TextField);

        mileage = new JLabel("Mileage");
        mileage.setBounds(485, 120, 60,24);
        mileage.setFont(font2);
        panelFuelCar.add(mileage);

        mileageTextField = new JTextField();
        mileageTextField.setBounds(645, 120, 225, 29);
        mileageTextField.setFont(font4);
        panelFuelCar.add(mileageTextField);

        fuelType = new JLabel("Fuel Type");
        fuelType.setBounds(485,179,75,24 );
        fuelType.setFont(font2);
        panelFuelCar.add(fuelType);

        fuelTypeTextField = new JTextField();
        fuelTypeTextField.setBounds(645,174,225,29);
        fuelTypeTextField.setFont(font4);
        panelFuelCar.add(fuelTypeTextField);

        numberOfSeats = new JLabel("Number of Seats");
        numberOfSeats.setBounds(485,238,128,24);
        numberOfSeats.setFont(font2);
        panelFuelCar.add(numberOfSeats);

        numberOfSeatsTextField = new JTextField();
        numberOfSeatsTextField.setBounds(645,233,225,29);
        numberOfSeatsTextField.setFont(font4);
        panelFuelCar.add(numberOfSeatsTextField);    

        fuelCarAddButton = new JButton("Add");
        fuelCarAddButton.setBounds(757, 292, 113, 29);
        fuelCarAddButton.setFont(font2);
        panelFuelCar.add(fuelCarAddButton);

        carID2 = new JLabel("Car ID");
        carID2.setBounds(80, 377, 49, 24);
        carID2.setFont(font2);
        panelFuelCar.add(carID2);

        carID2TextField = new JTextField();
        carID2TextField.setBounds(180, 372, 225, 29);
        carID2TextField.setFont(font4);
        panelFuelCar.add(carID2TextField);

        carName2 = new JLabel("Car Name");
        carName2.setBounds(80,436,78,24);
        carName2.setFont(font2);
        panelFuelCar.add(carName2);

        carName2TextField = new JTextField();
        carName2TextField.setBounds(180,431,225,29);
        carName2TextField.setFont(font4);
        panelFuelCar.add(carName2TextField);

        carColor1 = new JLabel("Car Color");
        carColor1.setBounds(80,554,73,24);
        carColor1.setFont(font2);
        panelFuelCar.add(carColor1);

        carColor1TextField = new JTextField();
        carColor1TextField.setBounds(180,549,225,29);
        carColor1TextField.setFont(font4);
        panelFuelCar.add(carColor1TextField);

        carBrand2 = new JLabel("Car Brand");
        carBrand2.setBounds(80,495,78,24);
        carBrand2.setFont(font2);
        panelFuelCar.add(carBrand2);

        carBrand2TextField = new JTextField();
        carBrand2TextField.setBounds(180,490,225,29);
        carBrand2TextField.setFont(font4);
        panelFuelCar.add(carBrand2TextField);

        transmissionType = new JLabel("Transmission Type");
        transmissionType.setBounds(485,377,142,24);
        transmissionType.setFont(font2);
        panelFuelCar.add(transmissionType);

        transmissionTypeTextField = new JTextField();
        transmissionTypeTextField.setBounds(645,377,225,29);
        transmissionTypeTextField.setFont(font4);
        panelFuelCar.add( transmissionTypeTextField);

        distributorName = new JLabel("Distributor Name");
        distributorName.setBounds(485,436,128,24);
        distributorName.setFont(font2);
        panelFuelCar.add(distributorName);

        distributorNameTextField = new JTextField();
        distributorNameTextField.setBounds(645,431,225,29);
        distributorNameTextField.setFont(font4);
        panelFuelCar.add( distributorNameTextField);

        purchaseDate1 = new JLabel("Purchase Date");
        purchaseDate1.setBounds(485,495,122,24);
        purchaseDate1.setFont(font2);
        panelFuelCar.add( purchaseDate1);

        purchaseDate1DayComboBox = new JComboBox(comboBoxDays);
        purchaseDate1DayComboBox.setBounds(645,490,50,29);
        panelFuelCar.add(purchaseDate1DayComboBox);

        purchaseDate1MonthComboBox = new JComboBox(comboBoxMonths);
        purchaseDate1MonthComboBox.setBounds(700,490,90,29);
        panelFuelCar.add(purchaseDate1MonthComboBox);

        purchaseDate1YearComboBox = new JComboBox(comboBoxYears);
        purchaseDate1YearComboBox.setBounds(805,490,70,29);
        panelFuelCar.add(purchaseDate1YearComboBox);

        bookDate = new JLabel("Booked Date");
        bookDate.setBounds(485,554,98,24);
        bookDate.setFont(font2);
        panelFuelCar.add( bookDate);

        bookedDate1DayComboBox = new JComboBox(comboBoxDays);
        bookedDate1DayComboBox.setBounds(645,550,50,29);
        panelFuelCar.add(bookedDate1DayComboBox);

        bookedDate1MonthComboBox = new JComboBox(comboBoxMonths);
        bookedDate1MonthComboBox.setBounds(700,550,90,29);
        panelFuelCar.add(bookedDate1MonthComboBox);

        bookedDate1YearComboBox = new JComboBox(comboBoxYears);
        bookedDate1YearComboBox.setBounds(805,550,70,29);
        panelFuelCar.add(bookedDate1YearComboBox);

        fuelCarPurchaseButton = new JButton("Purchase");
        fuelCarPurchaseButton.setBounds(757,608,113,29);
        panelFuelCar.add(fuelCarPurchaseButton);

        fuelCarClearButton = new JButton("Clear");
        fuelCarClearButton.setBounds(757,657,113,29);
        panelFuelCar.add(fuelCarClearButton);

        fuelCarDisplayButton = new JButton("Display");
        fuelCarDisplayButton.setBounds(645,658,106,29);
        panelFuelCar.add(fuelCarDisplayButton);    

        //Start of Electric Car
        electricCarTitle = new JLabel("Electric Car");
        electricCarTitle.setBounds(421, 50, 140, 35);
        electricCarTitle.setFont(font1);
        panelElectricCar.add(electricCarTitle);

        //Initialization, Setting Bounds, Addition of Fonts to all the Components of an Electric Car and finally adding them to the panel

        carID3 = new JLabel("Car ID");
        carID3.setBounds(80, 120, 50, 30);
        carID3.setFont(font2);
        panelElectricCar.add(carID3);

        carID3TextField = new JTextField();
        carID3TextField.setBounds(180, 115, 225, 30);
        carID3TextField.setFont(font4);
        panelElectricCar.add(carID3TextField);

        carName3 = new JLabel("Car Name");
        carName3.setBounds(80, 179, 78,24);
        carName3.setFont(font2);
        panelElectricCar.add(carName3);

        carName3TextField = new JTextField();
        carName3TextField.setBounds(180, 174, 225, 29);
        carName3TextField.setFont(font4);
        panelElectricCar.add(carName3TextField);

        carBrand3 = new JLabel("Car Brand");
        carBrand3.setBounds(80, 238, 78,24 );
        carBrand3.setFont(font2);
        panelElectricCar.add(carBrand3);

        carBrand3TextField = new JTextField();
        carBrand3TextField.setBounds(180, 233, 225, 29);
        carBrand3TextField.setFont(font4);
        panelElectricCar.add(carBrand3TextField);

        carPrice2 = new JLabel("Car Price");
        carPrice2.setBounds(485,120,71,24 );
        carPrice2.setFont(font2);
        panelElectricCar.add(carPrice2);

        carPrice2TextField = new JTextField();
        carPrice2TextField.setBounds(645,120,225,29);
        carPrice2TextField.setFont(font4);
        panelElectricCar.add(carPrice2TextField);

        batteryCapacity = new JLabel("Battery Capacity");
        batteryCapacity.setBounds(485,179,125,24 );
        batteryCapacity.setFont(font2);
        panelElectricCar.add(batteryCapacity);

        batteryCapacityTextField = new JTextField();
        batteryCapacityTextField.setBounds(645,174,225,29);
        batteryCapacityTextField.setFont(font4);
        panelElectricCar.add(batteryCapacityTextField);

        electricCarAddButton = new JButton("Add");
        electricCarAddButton.setBounds(757,228,113,29);
        electricCarAddButton.setFont(font2);
        panelElectricCar.add(electricCarAddButton);

        carID4 = new JLabel("Car ID");
        carID4.setBounds(80, 328,49,24);
        carID4.setFont(font2);
        panelElectricCar.add(carID4);

        carID4TextField = new JTextField();
        carID4TextField.setBounds(180,323,225,29);
        carID4TextField.setFont(font4);
        panelElectricCar.add(carID4TextField);

        carName4 = new JLabel("Car Name");
        carName4.setBounds(80,387,78,24);
        carName4.setFont(font2);
        panelElectricCar.add(carName4);

        carName4TextField = new JTextField();
        carName4TextField.setBounds(180,382,225,29);
        carName4TextField.setFont(font4);
        panelElectricCar.add(carName4TextField);

        carBrand3 = new JLabel("Car Brand");
        carBrand3.setBounds(80,446,78,24 );
        carBrand3.setFont(font2);
        panelElectricCar.add(carBrand3);

        carBrand4TextField = new JTextField();
        carBrand4TextField.setBounds(180,441,225,29);
        carBrand4TextField.setFont(font4);
        panelElectricCar.add(carBrand4TextField);

        carPrice3 = new JLabel("Car Price");
        carPrice3.setBounds(80,505,71,24 );
        carPrice3.setFont(font2);
        panelElectricCar.add(carPrice3);

        carPrice3TextField = new JTextField();
        carPrice3TextField.setBounds(180,500,225,29);
        carPrice3TextField.setFont(font4);
        panelElectricCar.add(carPrice3TextField);

        carColor3 = new JLabel("Car Color");
        carColor3.setBounds(80,559,73,24 );
        carColor3.setFont(font2);
        panelElectricCar.add(carColor3);

        carColor3TextField = new JTextField();
        carColor3TextField.setBounds(180,559,225,29);
        carColor3TextField.setFont(font4);
        panelElectricCar.add(carColor3TextField);

        range = new JLabel("Range");
        range.setBounds(485,328,50,24 );
        range.setFont(font2);
        panelElectricCar.add(range);

        rangeTextField = new JTextField();
        rangeTextField.setBounds(645,328,225,29);
        rangeTextField.setFont(font4);
        panelElectricCar.add(rangeTextField);

        customerName = new JLabel("Customer Name");
        customerName.setBounds(485,387,124,24 );
        customerName.setFont(font2);
        panelElectricCar.add(customerName);

        customerNameTextField = new JTextField();
        customerNameTextField.setBounds(645,382,225,29);
        customerNameTextField.setFont(font4);
        panelElectricCar.add(customerNameTextField);

        batteryWarranty = new JLabel("Battery Warranty");
        batteryWarranty.setBounds(485,446,127,24 );
        batteryWarranty.setFont(font2);
        panelElectricCar.add(batteryWarranty);

        batteryWarrantyTextField = new JTextField();
        batteryWarrantyTextField.setBounds(645,441,225,29);
        batteryWarrantyTextField.setFont(font4);
        panelElectricCar.add(batteryWarrantyTextField);

        rechargeTime = new JLabel("Recharge Time");
        rechargeTime.setBounds(485,505,116,24 );
        rechargeTime.setFont(font2);
        panelElectricCar.add(rechargeTime);

        rechargeTimeTextField = new JTextField();
        rechargeTimeTextField.setBounds(645,500,225,29);
        rechargeTimeTextField.setFont(font4);
        panelElectricCar.add(rechargeTimeTextField);

        purchaseDate2 = new JLabel("Purchase Date");
        purchaseDate2.setBounds(485, 559, 225, 30);
        purchaseDate2.setFont(font2);
        panelElectricCar.add(purchaseDate2);

        purchaseDate2DayComboBox = new JComboBox(comboBoxDays);
        purchaseDate2DayComboBox.setBounds(645,550,50,29);
        panelElectricCar.add(purchaseDate2DayComboBox);

        purchaseDate2MonthComboBox = new JComboBox(comboBoxMonths);
        purchaseDate2MonthComboBox.setBounds(700,550,90,29);
        panelElectricCar.add(purchaseDate2MonthComboBox);

        purchaseDate2YearComboBox = new JComboBox(comboBoxYears);
        purchaseDate2YearComboBox.setBounds(805,550,70,29);
        panelElectricCar.add(purchaseDate2YearComboBox);

        electricCarBuyButton = new JButton("Buy");
        electricCarBuyButton.setBounds(757,608,113,29);
        panelElectricCar.add(electricCarBuyButton);  

        electricCarSellButton = new JButton("Sell");
        electricCarSellButton.setBounds(645,609,106,29);
        panelElectricCar.add(electricCarSellButton);

        electricCarDisplay1Button = new JButton("Display");
        electricCarDisplay1Button.setBounds(180,609,106,29);
        panelElectricCar.add(electricCarDisplay1Button);

        electricCarClear1Button = new JButton("Clear");
        electricCarClear1Button.setBounds(300,609,106,29);
        panelElectricCar.add(electricCarClear1Button);

        fuelCarAddButton.addActionListener(this);
        fuelCarPurchaseButton.addActionListener(this);
        fuelCarClearButton.addActionListener(this);
        fuelCarDisplayButton.addActionListener(this);
        electricCarAddButton.addActionListener(this);
        electricCarBuyButton.addActionListener(this);
        electricCarSellButton.addActionListener(this);
        electricCarClear1Button.addActionListener(this);
        electricCarDisplay1Button.addActionListener(this);
    }
    //Event Handling and Exception Handling
    //Overriding the actionPerformed method
    public void actionPerformed(ActionEvent e){
        //For clearing the text fields of Fuel Car
        if(e.getSource() == fuelCarClearButton  ) {
            carID1TextField.setText(""); 
            carName1TextField.setText("");
            carBrand1TextField.setText("");
            mileageTextField.setText("");
            carPrice1TextField.setText("");
            fuelTypeTextField.setText("");
            numberOfSeatsTextField.setText("");
            carID2TextField.setText("");
            carName2TextField.setText("");
            carBrand2TextField.setText("");
            carColor1TextField.setText("");
            transmissionTypeTextField.setText("");
            distributorNameTextField.setText("");
        }
        //For clearing the text fields of an Electric Car
        else if (e.getSource()== electricCarClear1Button){
            carID3TextField.setText("");
            carName3TextField.setText("");
            carBrand3TextField.setText("");
            carPrice2TextField.setText("");
            batteryCapacityTextField.setText("");
            carID4TextField.setText("");
            carName4TextField.setText("");
            carBrand4TextField.setText("");
            carPrice3TextField.setText("");
            carColor3TextField.setText("");
            customerNameTextField.setText("");
            batteryWarrantyTextField.setText("");
            rangeTextField.setText("");
            rechargeTimeTextField.setText("");
            //Extracting of all required texts from their respective text fields
        }else if (e.getSource() == fuelCarAddButton){
            String carID = carID1TextField.getText();
            String carName = carName1TextField.getText();
            String carBrand = carBrand1TextField.getText();
            String mileage = mileageTextField.getText();
            String carPrice = carPrice1TextField.getText();
            String fuelType = fuelTypeTextField.getText();
            String numberOfSeats = numberOfSeatsTextField.getText();
            //Examination of duplicate values
            boolean isAdded = false;
            //Executing the try and catch block commands for exception handling
            try{
                //Checking for an empty text field
                if (carID.isEmpty() || carName.isEmpty() || carBrand.isEmpty() || mileage.isEmpty() || carPrice.isEmpty() || fuelType.isEmpty() ||
                numberOfSeats.isEmpty()){
                    throw new Exception();
                }
                else{
                    int carIdValue = Integer.parseInt(carID);
                    int mileageValue = Integer.parseInt(mileage);
                    int numberOfSeat = Integer.parseInt(numberOfSeats);
                    if(fuelType.matches(".*\\d.*")){
                        JOptionPane.showMessageDialog(mainFrame, "Only Albhabetical character are allowed");
                    }
                    else{
                        for(Car carList: carArrayList){
                            if (carList instanceof FuelCar){
                                FuelCar fuel_Car = (FuelCar) carList;
                                if((fuel_Car.getCarId())==(carIdValue)){
                                    isAdded = true;
                                }
                            }
                        }
                        if(isAdded == true){
                            JOptionPane.showMessageDialog(mainFrame, "A  Fuel Car with ID" + carIdValue+" has already been added.");
                        }
                        else{
                            FuelCar fuelCar = new FuelCar(carIdValue, carName, carBrand, carPrice, fuelType, numberOfSeat, mileageValue);
                            carArrayList.add(fuelCar);
                            JOptionPane.showMessageDialog(mainFrame, "A  Fuel Car with ID" + carIdValue+" is successfully added.");
                        }
                    }                    
                }
            }

            //Catching of Exception during the block of code
            catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(mainFrame, "Please Enter Only Numerical Value For Car ID, Mileage and Number Of Seats");
            }

            //Catching of Exception during the block of code
            catch(Exception ex){
                JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty");
            }
        }
        //For Adding the text fields of an Electric Car
        else if (e.getSource() == electricCarAddButton){
            String carID1 = carID3TextField.getText();
            String carName = carName3TextField.getText();
            String carBrand = carBrand3TextField.getText();
            String carPrice = carPrice2TextField.getText();
            String batteryCapacity = batteryCapacityTextField.getText();
            //Examination of duplicate values
            boolean isAdded = false;
            //Executing the try and catch block commands for exception handling
            try{
                //Checking for an empty text field
                if (carID1.isEmpty() || carName.isEmpty() || carBrand.isEmpty() || carPrice.isEmpty() || batteryCapacity.isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty.");
                }
                else{
                    int carIdValue = Integer.parseInt(carID1);
                    int priceIdValue = Integer.parseInt(carPrice);
                    int batteryCapacityValue = Integer.parseInt(batteryCapacity);
                    for(Car carList: carArrayList){
                        if (carList instanceof ElectricCar){
                            ElectricCar electric_Car = (ElectricCar) carList;
                            if((electric_Car.getCarId()) == (carIdValue)){
                                isAdded = true;
                            }
                        }
                    }
                    if(isAdded == true){
                        JOptionPane.showMessageDialog(mainFrame, "An  Electric Car with ID" + carIdValue+" has already been added.");
                    }
                    else{
                        ElectricCar electricCar = new ElectricCar(carIdValue, carName, carBrand, carPrice, batteryCapacityValue);
                        carArrayList.add(electricCar);
                        JOptionPane.showMessageDialog(mainFrame, "A Electric Car with ID" + carIdValue+" is successfully added.");
                    }
                }
            }

            //Catching of Exception during the block of code
            catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(mainFrame, "Please Enter Only Numerical Value For Car ID, Car Price and Battery Capacity");
            }
        }
        else if(e.getSource()== fuelCarPurchaseButton ){
            String carId = carID2TextField.getText();
            String carName = carName2TextField.getText();
            String carBrand = carBrand2TextField.getText();
            String carColor =  carColor1TextField.getText();
            String transmissionType = transmissionTypeTextField.getText();
            String distributorName = distributorNameTextField.getText();
            String purchaseDateDay = (String) purchaseDate1DayComboBox.getSelectedItem();
            String purchaseDateMonth = (String) purchaseDate1MonthComboBox.getSelectedItem();
            String purchaseDateYear = (String) purchaseDate1YearComboBox.getSelectedItem();
            String purchaseDate = purchaseDateDay + " " + purchaseDateMonth + " " + purchaseDateYear; 
            String bookedDateDay = (String) bookedDate1DayComboBox.getSelectedItem();
            String bookedDateMonth = (String) bookedDate1MonthComboBox.getSelectedItem();
            String bookedDateYear = (String) bookedDate1YearComboBox.getSelectedItem();
            String bookedDate = bookedDateDay + " " + bookedDateMonth + " " + bookedDateYear;

            //Examination of duplicate values
            boolean isAdded = false;
            //Executing the try and catch block commands for exception handling
            try{
                //Checking for an empty text field
                if (carId.isEmpty() || carName.isEmpty() || carBrand.isEmpty ()|| carColor.isEmpty () || transmissionType.isEmpty()|| distributorName.isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty.");
                }
                else{
                    int carIdValue = Integer.parseInt(carId);
                    if (carColor.matches(".*\\d.*")){
                        JOptionPane.showMessageDialog(mainFrame, "Only Albhabetical character are allowed");
                    }
                    else {
                        for(int i = 0; i < carArrayList.size();i++){
                            if ((carArrayList.get(i).getCarId())==carIdValue){
                                isAdded = true;
                            }
                        }
                        if (isAdded == true){
                            for (Car carList: carArrayList){
                                if (carList instanceof FuelCar){
                                    FuelCar fuel_Car = (FuelCar) carList;
                                    if(fuel_Car.getCarId()== carIdValue ){
                                        if(fuel_Car.getIsPurchased()== true){
                                            JOptionPane.showMessageDialog(mainFrame, "A  Fuel Car with ID" + carIdValue+" has already been purchased.");   
                                        }
                                        else{
                                            fuel_Car.purchase(purchaseDate, bookedDate);
                                            JOptionPane.showMessageDialog(mainFrame, "A  Fuel Car with ID" + carIdValue+" has been purchased.");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(mainFrame, "A  Fuel Car with ID" + carIdValue+" has not been added.");   
                        }
                    }
                }
            }

            //Catching of Exception during the block of code
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(mainFrame, "Please enter numerical value for the required field.");
            }
        }
        //For Buying of an Electric Car
        else if(e.getSource()== electricCarBuyButton ){
            String carId = carID4TextField.getText();
            String range = rangeTextField.getText();
            String carName = carName4TextField.getText();
            String customerName = customerNameTextField.getText();
            String carBrand = carBrand4TextField.getText();
            String batteryWarranty =batteryWarrantyTextField.getText();
            String carPrice = carPrice3TextField.getText();
            String rechargeTime =rechargeTimeTextField.getText();
            String carColor = carColor3TextField.getText();
            String purchaseDateDay = (String) purchaseDate2DayComboBox.getSelectedItem();
            String purchaseDateMonth = (String) purchaseDate2MonthComboBox.getSelectedItem();
            String purchaseDateYear = (String) purchaseDate2YearComboBox.getSelectedItem();
            String purchaseDate = purchaseDateDay + " " + purchaseDateMonth + " " + purchaseDateYear; 
            //Examination of duplicate values
            boolean isAdded = false;
            //Executing the try and catch block commands for exception handling
            try{
                //Checking for an empty text field
                if (carId.isEmpty() || range.isEmpty() || carName.isEmpty ()|| customerName.isEmpty () || carBrand.isEmpty()|| batteryWarranty.isEmpty()|| carPrice.isEmpty()|| rechargeTime.isEmpty() ||carColor.isEmpty()||purchaseDate.isEmpty()){
                    throw new Exception();
                }
                else{
                    int carIdValue = Integer.parseInt(carId);
                    int batteryWarrantyValue = Integer.parseInt(batteryWarranty);
                    int rechargeTimeValue = Integer.parseInt(rechargeTime);
                    if (carColor.matches(".*\\d.*")){
                        JOptionPane.showMessageDialog(mainFrame, "Only Albhabetical character are allowed");
                    }
                    else {
                        for(int i = 0; i < carArrayList.size();i++){
                            if ((carArrayList.get(i).getCarId())==carIdValue){
                                isAdded = true;
                            }
                        }
                        if (isAdded == true){
                            for (Car carList: carArrayList){
                                if (carList instanceof ElectricCar){
                                    ElectricCar electric_Car = (ElectricCar) carList;
                                    if(electric_Car.getCarId()== carIdValue ){
                                        if(electric_Car.getIsBought()== true){
                                            JOptionPane.showMessageDialog(mainFrame, "An Electric Car with ID" + carIdValue+" has already been bought.");   
                                        }
                                        else{
                                            electric_Car.buy(customerName,batteryWarrantyValue,purchaseDate,range,rechargeTimeValue);
                                            JOptionPane.showMessageDialog(mainFrame, "A  Electric Car with ID" + carIdValue+" has been bought.");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(mainFrame, "An  Electric Car with ID" + carIdValue+" has not been added.");   
                        }
                    }
                }
            }

            //Catching of Exception during the block of code
            catch(NumberFormatException numexc){
                JOptionPane.showMessageDialog(mainFrame,"Please enter numeric values for ID, battery warranty and recharge time.");
            }

            //Catching of Exception during the block of code
            catch(Exception ex){
                JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty");
            }
        }
        //for Selling of an Electric Car
        else if(e.getSource()== electricCarSellButton ){
            String carId = carID4TextField.getText();
            String range = rangeTextField.getText();
            String carName = carName4TextField.getText();
            String customerName = customerNameTextField.getText();
            String carBrand = carBrand4TextField.getText();
            String batteryWarranty =batteryWarrantyTextField.getText();
            String carPrice = carPrice3TextField.getText();
            String rechargeTime =rechargeTimeTextField.getText();
            String carColor = carColor3TextField.getText();
            String purchaseDateDay = (String) purchaseDate2DayComboBox.getSelectedItem();
            String purchaseDateMonth = (String) purchaseDate2MonthComboBox.getSelectedItem();
            String purchaseDateYear = (String) purchaseDate2YearComboBox.getSelectedItem();
            String purchaseDate = purchaseDateDay + " " + purchaseDateMonth + " " + purchaseDateYear; 
            //Examination of duplicate values
            boolean isAdded = false;
            //Executing the try and catch block commands for exception handling
            try{
                //Checking for an empty text field
                if (carId.isEmpty() || range.isEmpty() || carName.isEmpty ()|| customerName.isEmpty () || carBrand.isEmpty()|| batteryWarranty.isEmpty()|| carPrice.isEmpty()|| rechargeTime.isEmpty() ||carColor.isEmpty()||purchaseDate.isEmpty()){
                    throw new Exception();
                }
                else{
                    int carIdValue = Integer.parseInt(carId);
                    int batteryWarrantyValue = Integer.parseInt(batteryWarranty);
                    int rechargeTimeValue = Integer.parseInt(rechargeTime);
                    if (carColor.matches(".*\\d.*")){
                        JOptionPane.showMessageDialog(mainFrame, "Only Albhabetical character are allowed");
                    }
                    else {
                        for(int i = 0; i < carArrayList.size();i++){
                            if ((carArrayList.get(i).getCarId())==carIdValue){
                                isAdded = true;
                            }
                        }
                        if (isAdded == true){
                            for (Car carList: carArrayList){
                                if (carList instanceof ElectricCar){
                                    ElectricCar electric_Car = (ElectricCar) carList;
                                    if(electric_Car.getCarId()== carIdValue ){
                                        if(electric_Car.getIsSold()== true){
                                            JOptionPane.showMessageDialog(mainFrame, "An Electric Car with ID" + carIdValue+" has already been Sold.");   
                                        }
                                        else{
                                            electric_Car.sell(customerName);
                                            JOptionPane.showMessageDialog(mainFrame, "A  Electric Car with ID" + carIdValue+" has been sold.");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(mainFrame, "An Electric Car with ID" + carIdValue+" has not been added.");   
                        }
                    }
                }
            }

            //Catching of Exception during the block of code
            catch(NumberFormatException numexc){
                JOptionPane.showMessageDialog(mainFrame,"Please enter numeric values for ID, battery warranty and recharge time.");
            }

            //Catching of Exception during the block of code
            catch(Exception ex){
                JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty");
            }
        }
        else if(e.getSource()==fuelCarDisplayButton){
            if(carArrayList.size()==0){
                JOptionPane.showMessageDialog(mainFrame, "The ArrayList is Empty");
            }
            //Display of Fuel Car
            else{
                for (Car carList: carArrayList){
                    if (carList instanceof FuelCar){
                        FuelCar fuel_Car = (FuelCar) carList;
                        fuel_Car.display();
                    }
                }
            }
            //Display of an Electric Car
        }else if(e.getSource()==electricCarDisplay1Button){
            if(carArrayList.size()==0){
                JOptionPane.showMessageDialog(mainFrame, "The ArrayList is Empty");
            }    
            else{
                for (Car carList: carArrayList){
                    if (carList instanceof ElectricCar){
                        ElectricCar electric_Car = (ElectricCar) carList;
                        electric_Car.display();
                    }
                }
            }
        }
    }

    public static void main (String []args){
        new GUI_Demo();
    }
}