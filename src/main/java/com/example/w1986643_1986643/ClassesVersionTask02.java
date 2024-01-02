package com.example.w1986643_1986643;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassesVersionTask02 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClassesVersionTask02.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(" Foodie Fave queue management system");
        stage.setScene(scene);
        stage.show();
    }
    static int newBurgers = 50;
    static int burgers = 50;                              //Burger quantity
    static Scanner myObj = new Scanner(System.in);
    static String[] Queue1 = {"X", "X"};                  //First queue array
    static String[] Queue2 = {"X", "X", "X"};             //Second queue array
    static String[] Queue3 = {"X", "X", "X", "X", "X"};   //Third queue array
    static String[] WaitingListQueue = {"X", "X", "X", "X", "X"};   //Waiting List queue array
    static String CustomerName = "";                      //Customer name
    static String[] Customer = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};       //Customer name array
    static String[] burgerCount = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};    //Burger count array
    static int Queue1Count = 0, Queue2Count = 0, Queue3Count = 0, WaitingQueueCount = 0;
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n100 or VFQ: View all Queues.");
            System.out.println("101 or VEQ: View all Empty Queues.");
            System.out.println("102 or ACQ: Add customer to a Queue.");
            System.out.println("103 or RCQ: Remove a customer from a Queue. (From a specific location)");
            System.out.println("104 or PCQ: Remove a served customer.");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order.");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or STK: View Remaining burgers Stock.");
            System.out.println("109 or AFS: Add burgers to Stock.");
            System.out.println("110 or IFQ: Print the income of each queue.");       //    Added in task2
            System.out.println("112 or GUI: Display the JavaFx GUI.");               //    Added in task2
            System.out.println("999 or EXT: Exit the Program.\n");
            if (burgers == 10 ) {
                System.out.println("Warning! Stock is less than \"10\" burgers.");
            } else if (burgers ==0) {
                System.out.println("Warning! Stock is finished.\nPlease add burgers to stock.\n");
            }
            System.out.println("Enter number or short name from menu : ");
            String option = myObj.nextLine();
            switch (option) {
                case "100", "VFQ" -> {
                    FoodQueue object1 = new FoodQueue();
                    object1.VFQ();
                }
                case "101", "VEQ" -> {
                    FoodQueue object1 = new FoodQueue();
                    object1.VEQ();
                }
                case "102", "ACQ" -> {
                    FoodQueue object1 = new FoodQueue();
                    object1.ACQ();
                }
                case "103", "RCQ" -> {
                    FoodQueue object1 = new FoodQueue();
                    object1.RCQ();
                }
                case "104", "PCQ" -> {
                    FoodQueue object1 = new FoodQueue();
                    object1.PCQ();
                }
                case "105", "VCS" -> {
                    Customer object2 = new Customer();
                    object2.VCS();
                }
                case "106", "SPD" -> {
                    Customer object2 = new Customer();
                    object2.SPD();
                }
                case "107", "LPD" -> {
                    Customer object2 = new Customer();
                    object2.LPD();
                }
                case "108", "STK" -> STK();
                case "109", "AFS" -> AFS();
                case "110", "IFQ" -> IFQ();
                case "112", "GUI" -> {
                    System.out.println("Opening the GUI..");
                    try {
                        launch();
                    }catch (Exception e){
                        System.out.println("\nOnly one time you can watch it.");
                    }
                }
                case "999", "EXT" -> {
                    System.out.println("Exit the program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option, \nPlease read the above menu...\n");
            }
        }
    }
    //                         ------------------------------------108 or STK: View Remaining burgers Stock.------------------------------------
    public static void STK(){
        System.out.println(burgers + " Burgers are remaining.");
    }
    //                         ------------------------------------109 or AFS: Add burgers to Stock.------------------------------------
    public static void AFS(){
        System.out.println("How many burgers would you like to add  : ");
        int burgers_count = myObj.nextInt();
        burgers += burgers_count;
        System.out.println(burgers_count + " Burgers added.");
        System.out.println("Now have " + burgers + " burgers in stock.");
    }
    //                         ------------------------------------110 or IFQ: Print the income of each queue.------------------------------------
    public static void IFQ(){
//        int fullBurgersCount = Arrays.stream(burgerCount).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
//        System.out.println("Income :-   Rs: " + fullBurgersCount*650);
        System.out.println("Income :-   Rs: " + (newBurgers - burgers)*650);
    }
}

//20223147_w1986643
