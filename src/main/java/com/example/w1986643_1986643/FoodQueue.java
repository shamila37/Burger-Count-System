package com.example.w1986643_1986643;

import static com.example.w1986643_1986643.ClassesVersionTask02.*;

public class FoodQueue {
    //                         ------------------------------------100 or VFQ: View all Queues.------------------------------------
    public static void VFQ(){
        System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
        System.out.println("   " + Queue1[0] + "    " + Queue2[0] + "    " + Queue3[0]);
        System.out.println("   " + Queue1[1] + "    " + Queue2[1] + "    " + Queue3[1]);
        System.out.println("        " + Queue2[2] + "    " + Queue3[2]);
        System.out.println("             " + Queue3[3]);
        System.out.println("             " + Queue3[4]);
    }
    //                         ------------------------------------101 or VEQ: View all Empty Queues.------------------------------------
    public static void VEQ(){
        if (Queue1Count < 2) {
            if (Queue2Count < 3) {
                if (Queue3Count < 5) {
                    System.out.println("*****************\n"+"*   Cashiers    *\n"+"*****************");
                    System.out.println("   " + Queue1[0] + "    " + Queue2[0] + "    " + Queue3[0]);
                    System.out.println("   " + Queue1[1] + "    " + Queue2[1] + "    " + Queue3[1]);
                    System.out.println("        " + Queue2[2] + "    " + Queue3[2]);
                    System.out.println("             " + Queue3[3]);
                    System.out.println("             " + Queue3[4]);
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
    //                         ------------------------------------102 or ACQ: Add customer to a Queue.------------------------------------
    public static void ACQ(){
        System.out.println("For which queue do you want to add your customer ( Queue-1, Queue-2, Queue-3 or Waiting List Queue)  : ");
        String queueNo = myObj.nextLine();
        switch (queueNo) {
            case "1" -> {
                System.out.println("First name of the customer  : ");
                String name = myObj.nextLine();
                System.out.println("Second name of the customer  : ");
                String surname = myObj.nextLine();
                System.out.println("How many burgers do you want : ");
                String yourBurgerCount = myObj.nextLine();
                Queue1Count += 1;
                if (Queue1[0].equals("X")) {
                    Queue1[0] = "O";
                    Customer[0] = name + " " + surname;
                    burgerCount[0] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue1[1].equals("X")) {
                    Queue1[1] = "O";
                    Customer[1] = name + " " + surname;
                    burgerCount[1] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else {
                    System.out.println("Queue 1 is full.Try other two queues");
                }
            }
            case "2" -> {
                System.out.println("First name of the customer  : ");
                String name = myObj.nextLine();
                System.out.println("Second name of the customer  : ");
                String surname = myObj.nextLine();
                System.out.println("How many burgers do you want : ");
                String yourBurgerCount = myObj.nextLine();
                Queue2Count += 1;
                if (Queue2[0].equals("X")) {
                    Queue2[0] = "O";
                    Customer[2] = name + " " + surname;
                    burgerCount[2] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 2.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue2[1].equals("X")) {
                    Queue2[1] = "O";
                    Customer[3] = name + " " + surname;
                    burgerCount[3] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 2.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue2[2].equals("X")) {
                    Queue2[2] = "O";
                    Customer[4] = name + " " + surname;
                    burgerCount[4] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 2.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else {
                    System.out.println("Queue 2 is full.Try other queues.");
                }
            }
            case "3" -> {
                System.out.println("First name of the customer  : ");
                String name = myObj.nextLine();
                System.out.println("Second name of the customer  : ");
                String surname = myObj.nextLine();
                System.out.println("How many burgers do you want : ");
                String yourBurgerCount = myObj.nextLine();
                Queue3Count += 1;
                if (Queue3[0].equals("X")) {
                    Queue3[0] = "O";
                    Customer[5] = name + " " + surname;
                    burgerCount[5] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 3.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue3[1].equals("X")) {
                    Queue3[1] = "O";
                    Customer[6] = name + " " + surname;
                    burgerCount[6] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 3.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue3[2].equals("X")) {
                    Queue3[2] = "O";
                    Customer[7] = name + " " + surname;
                    burgerCount[7] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 3.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue3[3].equals("X")) {
                    Queue3[3] = "O";
                    Customer[8] = name + " " + surname;
                    burgerCount[8] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 3.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else if (Queue3[4].equals("X")) {
                    Queue3[4] = "O";
                    Customer[9] = name + " " + surname;
                    burgerCount[9] = yourBurgerCount;
                    System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 3.\nAnd ordered " + yourBurgerCount + " burgers.");
                } else {
                    System.out.println("Queue 3 is full.Try other queues.");
                }
            }
            case "4" -> {
                    System.out.println("All the queues are full.\nDo you want to add next customers to the Waiting List Queue.\nPress \"y\" to add next customers to the Waiting List Queue.\nPress \"n\" to go to the main menu.");
                    String nextCustomerChoice = myObj.next();
                    if (nextCustomerChoice.equals("y")) {
                        System.out.println("First name of the customer  : ");
                        String name = myObj.nextLine();
                        System.out.println("Second name of the customer  : ");
                        String surname = myObj.nextLine();
                        System.out.println("How many burgers do you want : ");
                        String yourBurgerCount = myObj.nextLine();
                        WaitingQueueCount += 1;
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[10] = name + " " + surname;
                            burgerCount[10] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[11] = name + " " + surname;
                            burgerCount[11] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[12] = name + " " + surname;
                            burgerCount[12] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[13] = name + " " + surname;
                            burgerCount[13] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[14] = name + " " + surname;
                            burgerCount[14] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                        if (WaitingListQueue[0].equals("X")) {
                            WaitingListQueue[0] = "O";
                            Customer[15] = name + " " + surname;
                            burgerCount[15] = yourBurgerCount;
                            System.out.println("Successfully \"" + name + " " + surname + "\" added to the queue 1.\nAnd ordered " + yourBurgerCount + " burgers.");
                        }
                    } else {
                        System.out.println("You choose \"n\"");
                    }
            }
            default -> System.out.println("Invalid queue number.");
        }
    }
    //                         ------------------------------------103 or RCQ: Remove a customer from a Queue. (From a specific location)------------------------------------
    public static void RCQ(){
        System.out.println("For which queue do you want to remove your customer ( Queue-1, Queue-2 or Queue-3 )  : ");
        String queueNo = myObj.nextLine();
        switch (queueNo) {
            case "1" -> {
                System.out.println("which customer do you want to remove from queue 1 (Customer-1 or Customer-2)  : ");
                String customerNumber = myObj.nextLine();
                if (customerNumber.equals("1")) {
                    if (Queue1[0].equals("O")) {
                        Queue1Count -= 1;
                        System.out.println("Successfully removed \"" + Customer[0] + "\" from queue 1.");
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
                        System.out.println("Successfully removed \"" + Customer[1] + "\" from queue 1.");
                        Queue1[1] = "X";
                        Customer[1] = "";
                    } else {
                        System.out.println("There aren't any customer at the selected position.");
                    }
                } else {
                    System.out.println("Invalid customer number.");
                }
            }
            case "2" -> {
                System.out.println("which customer do you want to remove from queue 2 ( Customer-1, Customer-2 or Customer-3 )  : ");
                String customerNumber = myObj.nextLine();
                switch (customerNumber) {
                    case "1" -> {
                        if (Queue2[0].equals("O")) {
                            Queue2Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[2] + "\" from queue 2.");
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
                    }
                    case "2" -> {
                        if (Queue2[1].equals("O")) {
                            Queue2Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[3] + "\" from queue 2.");
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
                    }
                    case "3" -> {
                        if (Queue2[2].equals("O")) {
                            Queue2Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[4] + "\" from queue 2.");
                            Queue2[2] = "X";
                            Customer[4] = "";
                        } else {
                            System.out.println("There aren't any customer at the selected position.");
                        }
                    }
                    default -> System.out.println("Invalid customer number.");
                }
            }
            case "3" -> {
                System.out.println("Which customer do you want to remove from queue 3 ( Customer-1 ,Customer-2 ,Customer-3 ,Customer-4 or Customer-5 )  : ");
                String customerNumber = myObj.nextLine();
                switch (customerNumber) {
                    case "1" -> {
                        if (Queue3[0].equals("O")) {
                            Queue3Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[5] + "\" from queue 3.");
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
                    }
                    case "2" -> {
                        if (Queue3[1].equals("O")) {
                            Queue3Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[6] + "\" from queue 3.");
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
                    }
                    case "3" -> {
                        if (Queue3[2].equals("O")) {
                            Queue3Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[7] + "\" from queue 3.");
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
                    }
                    case "4" -> {
                        if (Queue3[3].equals("O")) {
                            Queue3Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[8] + "\" from queue 3.");
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
                    }
                    case "5" -> {
                        if (Queue3[4].equals("O")) {
                            Queue3Count -= 1;
                            System.out.println("Successfully removed \"" + Customer[9] + "\" from queue 3.");
                            Queue3[4] = "X";
                            Customer[9] = "";
                        } else {
                            System.out.println("There aren't any customer at the selected.");
                        }
                    }
                    default -> System.out.println("Invalid customer number.");
                }
            }
            default -> System.out.println("Invalid queue number.");
        }
    }
    //                         ------------------------------------104 or PCQ: Remove a served customer.------------------------------------
    public static void PCQ(){
        System.out.println("From which queue do you want to remove your customer( Queue-1, Queue-2 or Queue-3 )  : ");
        String servedQueue = myObj.nextLine();
        switch (servedQueue) {
            case "1" -> {
                if (Queue1[0].equals("O")) {
                    Queue1Count -= 1;
                    burgers -= Integer.parseInt(burgerCount[0]);
                    System.out.println("Successfully removed \"" + Customer[0] + "\" from queue 1.");
                    if (Queue1[1].equals("O")) {
                        Queue1[1] = "X";
                        Customer[0] = Customer[1];
                        Customer[1] = "";
                        burgerCount[0] = burgerCount[1];
                        burgerCount[1] = "";
                    } else {
                        Queue1[0] = "X";
                        Customer[0] = "";
                        burgerCount[0] = "";
                    }
                } else {
                    System.out.println("Queue 1 is not occupied.");
                }
            }
            case "2" -> {
                if (Queue2[0].equals("O")) {
                    Queue3Count -= 1;
                    burgers -= Integer.parseInt(burgerCount[2]);
                    System.out.println("Successfully removed \"" + Customer[2] + "\" from queue 2.");
                    if (Queue2[1].equals("O")) {
                        if (Queue2[2].equals("O")) {
                            Queue2[2] = "X";
                            Customer[2] = Customer[3];
                            Customer[3] = Customer[4];
                            Customer[4] = "";
                            burgerCount[2] = burgerCount[3];
                            burgerCount[3] = burgerCount[4];
                            burgerCount[4] = "";
                        } else {
                            Queue2[1] = "X";
                            Customer[2] = Customer[3];
                            Customer[3] = "";
                            burgerCount[2] = burgerCount[3];
                            burgerCount[3] = "";
                        }
                    } else {
                        Queue2[0] = "X";
                        Customer[2] = "";
                        burgerCount[2] = "";
                    }
                } else {
                    System.out.println("Queue 2 is not occupied.");
                }
            }
            case "3" -> {
                if (Queue3[0].equals("O")) {
                    Queue3Count -= 1;
                    burgers -= Integer.parseInt(burgerCount[5]);
                    System.out.println("Successfully removed \"" + Customer[5] + "\" from queue 3.");
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
                                    burgerCount[5] = burgerCount[6];
                                    burgerCount[6] = burgerCount[7];
                                    burgerCount[7] = burgerCount[8];
                                    burgerCount[8] = burgerCount[9];
                                    burgerCount[9] = "";
                                } else {
                                    Queue3[3] = "X";
                                    Customer[5] = Customer[6];
                                    Customer[6] = Customer[7];
                                    Customer[7] = Customer[8];
                                    Customer[8] = "";
                                    burgerCount[5] = burgerCount[6];
                                    burgerCount[6] = burgerCount[7];
                                    burgerCount[7] = burgerCount[8];
                                    burgerCount[8] = "";
                                }
                            } else {
                                Queue3[2] = "X";
                                Customer[5] = Customer[6];
                                Customer[6] = Customer[7];
                                Customer[7] = "";
                                burgerCount[5] = burgerCount[6];
                                burgerCount[6] = burgerCount[7];
                                burgerCount[7] = "";
                            }
                        } else {
                            Queue3[1] = "X";
                            Customer[5] = Customer[6];
                            Customer[6] = "";
                            burgerCount[5] = burgerCount[6];
                            burgerCount[6] = "";
                        }
                    } else {
                        Queue3[0] = "X";
                        Customer[5] = "";
                        burgerCount[5] = "";
                    }
                } else {
                    System.out.println("Queue 3 is not occupied.");
                }
            }
            default -> System.out.println("invalid queue number.");
        }
    }
}

//20223147_w1986643