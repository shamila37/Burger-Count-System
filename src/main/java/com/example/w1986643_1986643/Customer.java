package com.example.w1986643_1986643;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static com.example.w1986643_1986643.ClassesVersionTask02.*;


public class Customer {
    //                         ------------------------------------105 or VCS: View Customers Sorted in alphabetical order.------------------------------------
    public static void VCS(){
        List<String> list = new ArrayList<String>();
        for (String value : Customer){
            CustomerName = value ;
            if (!CustomerName.equals("")){
                list.add(value);
            }
        }
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }
    }
    //                         ------------------------------------106 or SPD: Store Program Data into file.------------------------------------
    public static void SPD(){
        try {
            File myObj2 = new File("ProgramData.txt");
            if (myObj2.createNewFile()) {
                System.out.println("File created : " + myObj2.getName());
            }
            FileWriter myWriter = new FileWriter("ProgramData.txt");
            myWriter.write(burgers + "\n");          //Show burger quantity
            myWriter.write(Queue1Count + "\n");      //Number of people in queue 1
            myWriter.write(Queue2Count + "\n");      //Number of people in queue 2
            myWriter.write(Queue3Count + "\n");      //Number of people in queue 3
            for (String s : Queue1) {
                myWriter.write(s + "\n");
            }
            for (String s : Queue2) {
                myWriter.write(s + "\n");
            }
            for (String s : Queue3) {
                myWriter.write(s + "\n");
            }
            for (String s : Customer) {
                myWriter.write(s + "\n");
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the \"ProgramData.txt\" file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //                         ------------------------------------107 or LPD: Load Program Data from file.------------------------------------
    public static void LPD() {
        try {
            File myObj1 = new File("ProgramData.txt");
            Scanner myReader = new Scanner(myObj1);
            burgers = myReader.nextInt();
            String space0 = myReader.nextLine();
            Queue1Count = myReader.nextInt();
            String space1 = myReader.nextLine();
            Queue2Count = myReader.nextInt();
            String space2 = myReader.nextLine();
            Queue3Count = myReader.nextInt();
            String space3 = myReader.nextLine();
            for (int i = 0; i < Queue1.length; i++) {
                String Qu1 = myReader.nextLine();
                Queue1[i] = Qu1;
            }
            for (int i = 0; i < Queue2.length; i++) {
                String Qu2 = myReader.nextLine();
                Queue2[i] = Qu2;
            }
            for (int i = 0; i < Queue3.length; i++) {
                String Qu3 = myReader.nextLine();
                Queue3[i] = Qu3;
            }
            for (int i = 0; i < Customer.length; i++) {
                String customerQueue = myReader.nextLine();
                Customer[i] = customerQueue;
            }
            myReader.close();
            System.out.println("Successfully loaded data saved to the \"ProgramData.txt\" file.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

//20223147_w1986643
