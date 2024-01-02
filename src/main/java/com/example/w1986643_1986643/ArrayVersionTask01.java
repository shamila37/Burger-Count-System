package com.example.w1986643_1986643;
//                         ------------------------------------Import the File class------------------------------------
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class ArrayVersionTask01 {
    static int burgers = 50;                              //Burger quantity
    static Scanner myObj = new Scanner(System.in);
    static String[] Queue1 = {"X", "X"};                  //First queue array
    static String[] Queue2 = {"X", "X", "X"};             //Second queue array
    static String[] Queue3 = {"X", "X", "X", "X", "X"};   //Third queue array
    static String CustomerName = "";                      //Customer name
    static String[] Customer = {"", "", "", "", "", "", "", "", "", ""};       //Customer name array
    static int Queue1Count = 0, Queue2Count = 0, Queue3Count = 0;
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
            System.out.println("999 or EXT: Exit the Program.\n");
            if (burgers <= 10) {
                System.out.println("Warning! Stock is less than \"10\" burgers.");
            }
            System.out.println("Enter number or short name from menu : ");
            String option = myObj.nextLine();
            if        (option.equals("100") || (option.equals("VFQ"))) {
                VFQ();
            } else if (option.equals("101") || (option.equals("VEQ"))) {
                VEQ();
            } else if (option.equals("102") || (option.equals("ACQ"))) {
                ACQ();
            } else if (option.equals("103") || (option.equals("RCQ"))) {
                RCQ();
            } else if (option.equals("104") || (option.equals("PCQ"))) {
                PCQ();
            } else if (option.equals("105") || (option.equals("VCS"))) {
                VCS();
            } else if (option.equals("106") || (option.equals("SPD"))) {
                SPD();
            } else if (option.equals("107") || (option.equals("LPD"))) {
                LPD();
            } else if (option.equals("108") || (option.equals("STK"))) {
                System.out.println(burgers + " Burgers are remaining.");
            } else if (option.equals("109") || (option.equals("AFS"))) {
                System.out.println("How many burgers would you like to add  : ");
                int burgers_count = myObj.nextInt();
                burgers += burgers_count;
                System.out.println(burgers_count + " Burgers added.");
            } else if (option.equals("999") || (option.equals("EXT"))) {
                break;
            } else {
                System.out.println("Invalid option, \nPlease read the above menu...\n");
            }
        }
    }
    //                         ------------------------------------100 or VFQ: View all Queues.------------------------------------
    public static void VFQ(){
        VFQVEQ();
    }
    //                         ------------------------------------101 or VEQ: View all Empty Queues.------------------------------------
    public static void VEQ(){
        if (Queue1Count < 2) {
            if (Queue2Count < 3) {
                if (Queue3Count < 5) {
                    VFQVEQ();
                } else {
                    System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
                    System.out.println("   " + Queue1[0] + "    " + Queue2[0]);
                    System.out.println("   " + Queue1[1] + "    " + Queue2[1]);
                    System.out.println("        " + Queue2[2]);
                }
            } else {
                System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
                System.out.println("   " + Queue1[0]);
                System.out.println("   " + Queue1[1]);
            }
        } else if (Queue2Count < 3) {
            if (Queue3Count < 5) {
                System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
                System.out.println("        " + Queue2[0] + "    " + Queue3[0]);
                System.out.println("        " + Queue2[1] + "    " + Queue3[1]);
                System.out.println("        " + Queue2[2] + "    " + Queue3[2]);
                System.out.println("             " + Queue3[3]);
                System.out.println("             " + Queue3[4]);
            } else {
                System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
                System.out.println("        " + Queue2[0]);
                System.out.println("        " + Queue2[1]);
                System.out.println("        " + Queue2[2]);
            }
        } else if (Queue3Count < 5) {
            System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
            System.out.println("             " + Queue3[0]);
            System.out.println("             " + Queue3[1]);
            System.out.println("             " + Queue3[2]);
            System.out.println("             " + Queue3[3]);
            System.out.println("             " + Queue3[4]);
        } else {
            System.out.println("All the queues are occupied.");
        }
    }
    //
    public static void VFQVEQ(){
        System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
        System.out.println("   " + Queue1[0] + "    " + Queue2[0] + "    " + Queue3[0]);
        System.out.println("   " + Queue1[1] + "    " + Queue2[1] + "    " + Queue3[1]);
        System.out.println("        " + Queue2[2] + "    " + Queue3[2]);
        System.out.println("             " + Queue3[3]);
        System.out.println("             " + Queue3[4]);
    }
    //                         ------------------------------------102 or ACQ: Add customer to a Queue.------------------------------------
    public static void ACQ(){
        System.out.println("For which queue do you want to add your customer ( Queue-1, Queue-2 or Queue-3 )  : ");
        String queueNo = myObj.nextLine();
        if (queueNo.equals("1")) {
            System.out.println("Name of the customer  : ");
            String name = myObj.nextLine();
            Queue1Count += 1;
            if (Queue1[0].equals("X")) {
                Queue1[0] = "O";
                Customer[0] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 1.");
            } else if (Queue1[1].equals("X")) {
                Queue1[1] = "O";
                Customer[1] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 1.");
            } else {
                System.out.println("Queue 1 is full.Try other queues.");
            }
        } else if (queueNo.equals("2")) {
            System.out.println("Name of the customer  : ");
            String name = myObj.nextLine();
            Queue2Count += 1;
            if (Queue2[0].equals("X")) {
                Queue2[0] = "O";
                Customer[2] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 2.");
            } else if (Queue2[1].equals("X")) {
                Queue2[1] = "O";
                Customer[3] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 2.");
            } else if (Queue2[2].equals("X")) {
                Queue2[2] = "O";
                Customer[4] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 2.");
            } else {
                System.out.println("Queue 2 is full.Try other queues.");
            }
        } else if (queueNo.equals("3")) {
            System.out.println("Name of the customer  : ");
            String name = myObj.nextLine();
            Queue3Count += 1;
            if (Queue3[0].equals("X")) {
                Queue3[0] = "O";
                Customer[5] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 3.");
            } else if (Queue3[1].equals("X")) {
                Queue3[1] = "O";
                Customer[6] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 3.");
            } else if (Queue3[2].equals("X")) {
                Queue3[2] = "O";
                Customer[7] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 3.");
            } else if (Queue3[3].equals("X")) {
                Queue3[3] = "O";
                Customer[8] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 3.");
            } else if (Queue3[4].equals("X")) {
                Queue3[4] = "O";
                Customer[9] = name;
                System.out.println("Successfully \"" + name + "\" added to the queue 3.");
            } else {
                System.out.println("Queue 3 is full.Try other queues.");
            }
        } else {
            System.out.println("Invalid queue number.");
        }
    }
    //                         ------------------------------------103 or RCQ: Remove a customer from a Queue. (From a specific location)------------------------------------
    public static void RCQ(){
        System.out.println("For which queue do you want to remove your customer ( Queue-1, Queue-2 or Queue-3 )  : ");
        String queueNo = myObj.nextLine();
        if (queueNo.equals("1")) {
            System.out.println("which customer do you want to remove from queue 1 (Customer-1 or Customer-2)  : ");
            String customerNumber = myObj.nextLine();
            if (customerNumber.equals("1")) {
                if (Queue1[0].equals("O")) {
                    Queue1Count -= 1;
                    System.out.println("Successfully removed \""+Customer[0]+"\" from queue 1.");
                    if (Queue1[1].equals("O")) {
                        Queue1[1] = "X";
                        Customer[0] = Customer[1];
                        Customer[1] = "";
                    } else {
                        Queue1[0] = "X";
                        Customer[0] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("2")) {
                if (Queue1[1].equals("O")) {
                    Queue1Count -= 1;
                    System.out.println("Successfully removed \""+Customer[1]+"\" from queue 1.");
                    Queue1[1] = "X";
                    Customer[1] = "";
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else {
                System.out.println("Invalid customer number.");
            }
        } else if (queueNo.equals("2")) {
            System.out.println("which customer do you want to remove from queue 2 ( Customer-1, Customer-2 or Customer-3 )  : ");
            String customerNumber = myObj.nextLine();
            if (customerNumber.equals("1")) {
                if (Queue2[0].equals("O")) {
                    Queue2Count -= 1;
                    System.out.println("Successfully removed \""+Customer[2]+"\" from queue 2.");
                    if (Queue2[1].equals("O")) {
                        if (Queue2[2].equals("O")) {
                            Queue2[2] = "X";
                            Customer[2] = Customer[3];
                            Customer[3] = Customer[4];
                            Customer[4] = "";
                        } else {
                            Queue2[1] = "X";
                            Customer[2] = Customer[3];
                            Customer[3] = "";
                        }
                    } else {
                        Queue2[0] = "x";
                        Customer[2] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("2")) {
                if (Queue2[1].equals("O")) {
                    Queue2Count -= 1;
                    System.out.println("Successfully removed \""+Customer[3]+"\" from queue 2.");
                    if (Queue2[2].equals("O")) {
                        Queue2[2] = "X";
                        Customer[3] = Customer[4];
                        Customer[4] = "";
                    } else {
                        Queue2[1] = "X";
                        Customer[3] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("3")) {
                if (Queue2[2].equals("O")) {
                    Queue2Count -= 1;
                    System.out.println("Successfully removed \""+Customer[4]+"\" from queue 2.");
                    Queue2[2] = "X";
                    Customer[4] = "";
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else {
                System.out.println("Invalid customer number.");
            }
        } else if (queueNo.equals("3")) {
            System.out.println("Which customer do you want to remove from queue 3 ( Customer-1 ,Customer-2 ,Customer-3 ,Customer-4 or Customer-5 )  : ");
            String customerNumber = myObj.nextLine();
            if (customerNumber.equals("1")) {
                if (Queue3[0].equals("O")) {
                    Queue3Count -= 1;
                    System.out.println("Successfully removed \""+Customer[5]+"\" from queue 3.");
                    if (Queue3[1].equals("O")) {
                        if (Queue3[2].equals("O")) {
                            if (Queue3[3].equals("O")) {
                                if (Queue3[4].equals("O")) {
                                    Queue3[4] = "X";
                                    Customer[5] = Customer[6];
                                    Customer[6] = Customer[7];
                                    Customer[7] = Customer[8];
                                    Customer[8] = Customer[9];
                                    Customer[9] = "";
                                } else {
                                    Queue3[3] = "X";
                                    Customer[5] = Customer[6];
                                    Customer[6] = Customer[7];
                                    Customer[7] = Customer[8];
                                    Customer[8] = "";
                                }
                            } else {
                                Queue3[2] = "X";
                                Customer[5] = Customer[6];
                                Customer[6] = Customer[7];
                                Customer[7] = "";
                            }
                        } else {
                            Queue3[1] = "X";
                            Customer[5] = Customer[6];
                            Customer[6] = "";
                        }
                    } else {
                        Queue3[0] = "X";
                        Customer[5] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("2")) {
                if (Queue3[1].equals("O")) {
                    Queue3Count -= 1;
                    System.out.println("Successfully removed \""+Customer[6]+"\" from queue 3.");
                    if (Queue3[2].equals("O")) {
                        if (Queue3[3].equals("O")) {
                            if (Queue3[4].equals("O")) {
                                Queue3[4] = "X";
                                Customer[6] = Customer[7];
                                Customer[7] = Customer[8];
                                Customer[8] = Customer[9];
                                Customer[9] = "";
                            } else {
                                Queue3[3] = "X";
                                Customer[6] = Customer[7];
                                Customer[7] = Customer[8];
                                Customer[8] = "";
                            }
                        } else {
                            Queue3[2] = "X";
                            Customer[6] = Customer[7];
                            Customer[7] = "";
                        }
                    } else {
                        Queue3[1] = "X";
                        Customer[6] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("3")) {
                if (Queue3[2].equals("O")) {
                    Queue3Count -= 1;
                    System.out.println("Successfully removed \""+Customer[7]+"\" from queue 3.");
                    if (Queue3[3].equals("O")) {
                        if (Queue3[4].equals("O")) {
                            Queue3[4] = "X";
                            Customer[7] = Customer[8];
                            Customer[8] = Customer[9];
                            Customer[9] = "";
                        } else {
                            Queue3[3] = "X";
                            Customer[7] = Customer[8];
                            Customer[8] = "";
                        }
                    } else {
                        Queue3[2] = "X";
                        Customer[7] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("4")) {
                if (Queue3[3].equals("O")) {
                    Queue3Count -= 1;
                    System.out.println("Successfully removed \""+Customer[8]+"\" from queue 3.");
                    if (Queue3[4].equals("O")) {
                        Queue3[4] = "X";
                        Customer[8] = Customer[9];
                        Customer[9] = "";
                    } else {
                        Queue3[3] = "X";
                        Customer[8] = "";
                    }
                } else {
                    System.out.println("There aren't any customer at the selected position.");
                }
            } else if (customerNumber.equals("5")) {
                if (Queue3[4].equals("O")) {
                    Queue3Count -= 1;
                    System.out.println("Successfully removed \""+Customer[9]+"\" from queue 3.");
                    Queue3[4] = "X";
                    Customer[9] = "";
                } else {
                    System.out.println("There aren't any customer at the selected.");
                }
            } else {
                System.out.println("Invalid customer number.");
            }
        } else {
            System.out.println("Invalid queue number.");
        }
    }
    //                         ------------------------------------104 or PCQ: Remove a served customer.------------------------------------
    public static void PCQ(){
        System.out.println("From which queue do you want to remove your customer( Queue-1, Queue-2 or Queue-3 )  : ");
        String servedQueue = myObj.nextLine();
        if         (servedQueue.equals("1")) {
            if (Queue1[0].equals("O")) {
                Queue1Count -= 1;
                burgers -= 5;
                System.out.println("Successfully removed \""+Customer[0]+"\" from queue 1.");
                if (Queue1[1].equals("O")) {
                    Queue1[1] = "X";
                    Customer[0] = Customer[1];
                    Customer[1] = "";
                } else {
                    Queue1[0] = "X";
                    Customer[0] = "";
                }
            } else {
                System.out.println("Queue 1 is not occupied.");
            }
        } else if (servedQueue.equals("2")) {
            if (Queue2[0].equals("O")) {
                Queue3Count -= 1;
                burgers -= 5;
                System.out.println("Successfully removed \""+Customer[2]+"\" from queue 2.");
                if (Queue2[1].equals("O")) {
                    if (Queue2[2].equals("O")) {
                        Queue2[2] = "X";
                        Customer[2] = Customer[3];
                        Customer[3] = Customer[4];
                        Customer[4] = "";
                    } else {
                        Queue2[1] = "X";
                        Customer[2] = Customer[3];
                        Customer[3] = "";
                    }
                } else {
                    Queue2[0] = "X";
                    Customer[2] = "";
                }
            } else {
                System.out.println("Queue 2 is not occupied.");
            }
        } else if (servedQueue.equals("3")) {
            if (Queue3[0].equals("O")) {
                Queue3Count -= 1;
                burgers -= 5;
                System.out.println("Successfully removed \""+Customer[5]+"\" from queue 3.");
                if (Queue3[1].equals("O")) {
                    if (Queue3[2].equals("O")) {
                        if (Queue3[3].equals("O")) {
                            if (Queue3[4].equals("O111")) {
                                Queue3[4] = "X";
                                Customer[5] = Customer[6];
                                Customer[6] = Customer[7];
                                Customer[7] = Customer[8];
                                Customer[8] = Customer[9];
                                Customer[9] = "";
                            } else {
                                Queue3[3] = "X";
                                Customer[5] = Customer[6];
                                Customer[6] = Customer[7];
                                Customer[7] = Customer[8];
                                Customer[8] = "";
                            }
                        } else {
                            Queue3[2] = "X";
                            Customer[5] = Customer[6];
                            Customer[6] = Customer[7];
                            Customer[7] = "";
                        }
                    } else {
                        Queue3[1] = "X";
                        Customer[5] = Customer[6];
                        Customer[6] = "";
                    }
                } else {
                    Queue3[0] = "X";
                    Customer[5] = "";
                }
            } else {
                System.out.println("Queue 3 is not occupied.");
            }
        } else {
            System.out.println("invalid queue number.");
        }
    }
    //                         ------------------------------------105 or VCS: View Customers Sorted in alphabetical order.------------------------------------
    public static void VCS(){
        String[] alphabetical_order = {};

        for (int i = 0; i < Customer.length; i++) {
            CustomerName = Customer[i];
            if (CustomerName.equals("")) {
                ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(alphabetical_order));
                arrayList.add(Customer[i]);
                alphabetical_order = arrayList.toArray(alphabetical_order);
            }
        }
        for (int i = 0; i < alphabetical_order.length; i++) {
            for (int j = i + 1; j < alphabetical_order.length; j++) {
                if (alphabetical_order[i].compareTo(alphabetical_order[j]) > 0) {
                    String temp = alphabetical_order[i];
                    alphabetical_order[i] = alphabetical_order[j];
                    alphabetical_order[j] = temp;
                }
            }
        }
        for (int i = 0; i < alphabetical_order.length; i++) {
            System.out.println(alphabetical_order[i]);
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
            for (int i = 0; i < Queue1.length; i++) {
                myWriter.write(Queue1[i] + "\n");
            }
            for (int i = 0; i < Queue2.length; i++) {
                myWriter.write(Queue2[i] + "\n");
            }
            for (int i = 0; i < Queue3.length; i++) {
                myWriter.write(Queue3[i] + "\n");
            }
            for (int i = 0; i < Customer.length; i++) {
                myWriter.write(Customer[i] + "\n");
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the \"ProgramData.txt\" file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //                         ------------------------------------107 or LPD: Load Program Data from file.------------------------------------
    public static void LPD(){
        try {
            File myObj1 = new File("ProgramData.txt");
            Scanner myReader = new Scanner(myObj1);
            int loadData = myReader.nextInt();
            burgers = loadData;
            String space0 = myReader.nextLine();
            int qu1 = myReader.nextInt();
            Queue1Count = qu1;
            String space1 = myReader.nextLine();
            int qu2 = myReader.nextInt();
            Queue2Count = qu2;
            String space2 = myReader.nextLine();
            int qu3 = myReader.nextInt();
            Queue3Count = qu3;
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