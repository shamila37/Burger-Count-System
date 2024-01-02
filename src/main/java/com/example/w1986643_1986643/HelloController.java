package com.example.w1986643_1986643;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import static com.example.w1986643_1986643.ClassesVersionTask02.*;

public class HelloController {

    @FXML
    private Label CustomerOrderedBurgerQuantity;

    @FXML
    private Label CustomersName;

    @FXML
    private Label NameOfTheCustomer;

    @FXML
    private Label QuantityOfTheBurger;

    @FXML
    private Label Queue1customer1;

    @FXML
    private Label Queue1customer2;

    @FXML
    private Label Queue2customer1;

    @FXML
    private Label Queue2customer2;

    @FXML
    private Label Queue2customer3;

    @FXML
    private Label Queue3customer1;

    @FXML
    private Label Queue3customer2;

    @FXML
    private Label Queue3customer3;

    @FXML
    private Label Queue3customer4;

    @FXML
    private Label Queue3customer5;

    @FXML
    private Label WaitingQueueCustomer1;

    @FXML
    private Label WaitingQueueCustomer2;

    @FXML
    private Label WaitingQueueCustomer3;

    @FXML
    private Label WaitingQueueCustomer4;

    @FXML
    private Label WaitingQueueCustomer5;


    //    Queue 1 Click
    @FXML
    void Queue1customer1Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(1,1)");
        QuantityOfTheBurger.setText("Burger qty(1,1)");
        if (Queue1[0].equals("O")) {
            CustomersName.setText(Customer[0]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[0]);
        }else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue1customer2Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(1,2)");
        QuantityOfTheBurger.setText("Burger qty(1,2)");
        if (Queue1[1].equals("O")) {
            CustomersName.setText(Customer[1]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[1]);
        }else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }


    //    Queue 2 Click
    @FXML
    void Queue2customer1Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(2,1)");
        QuantityOfTheBurger.setText("Burger qty(2,1)");
        if (Queue2[0].equals("O")){
            CustomersName.setText(Customer[2]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[2]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue2customer2Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(2,2)");
        QuantityOfTheBurger.setText("Burger qty(2,2)");
        if (Queue2[1].equals("O")) {
            CustomersName.setText(Customer[3]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[3]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue2customer3Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(2,3)");
        QuantityOfTheBurger.setText("Burger qty(2,3)");
        if (Queue2[2].equals("O")) {
            CustomersName.setText(Customer[4]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[4]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }


    //    Queue 3 Click
    @FXML
    void Queue3customer1Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(3,1)");
        QuantityOfTheBurger.setText("Burger qty(3,1)");
        if (Queue3[0].equals("O")) {
            CustomersName.setText(Customer[5]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[5]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue3customer2Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(3,2)");
        QuantityOfTheBurger.setText("Burger qty(3,2)");
        if (Queue3[1].equals("O")) {
            CustomersName.setText(Customer[6]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[6]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue3customer3Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(3,3)");
        QuantityOfTheBurger.setText("Burger qty(3,3)");
        if (Queue3[2].equals("O")) {
            CustomersName.setText(Customer[7]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[7]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue3customer4Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(3,4)");
        QuantityOfTheBurger.setText("Burger qty(3,4)");
        if (Queue3[3].equals("O")) {
            CustomersName.setText(Customer[8]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[8]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void Queue3customer5Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(3,5)");
        QuantityOfTheBurger.setText("Burger qty(3,5)");
        if (Queue3[4].equals("O")) {
            CustomersName.setText(Customer[9]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[9]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    //    Waiting List Click
    @FXML
    void WaitingQueueCustomer1Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(4,1)");
        QuantityOfTheBurger.setText("Burger qty(4,1)");
        if (WaitingListQueue[0].equals("O")) {
            CustomersName.setText(Customer[10]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[10]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void WaitingQueueCustomer2Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(4,2)");
        QuantityOfTheBurger.setText("Burger qty(4,2)");
        if (WaitingListQueue[1].equals("O")) {
            CustomersName.setText(Customer[11]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[11]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void WaitingQueueCustomer3Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(4,3)");
        QuantityOfTheBurger.setText("Burger qty(4,3)");
        if (WaitingListQueue[2].equals("O")) {
            CustomersName.setText(Customer[12]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[12]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void WaitingQueueCustomer4Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(4,4)");
        QuantityOfTheBurger.setText("Burger qty(4,4)");
        if (WaitingListQueue[3].equals("O")) {
            CustomersName.setText(Customer[13]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[13]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }

    @FXML
    void WaitingQueueCustomer5Click(MouseEvent event) {
        NameOfTheCustomer.setText("Customer name(4,5)");
        QuantityOfTheBurger.setText("Burger qty(4,5)");
        if (WaitingListQueue[4].equals("O")) {
            CustomersName.setText(Customer[14]);
            CustomerOrderedBurgerQuantity.setText(burgerCount[14]);
        } else {
            CustomersName.setText("Selected position is empty.");
            CustomerOrderedBurgerQuantity.setText("No any purchase burgers.");
        }
    }



    // This is updating the gui
    public void initialize() {
        Queue1customer1.setText(Queue1[0]);
        Queue1customer2.setText(Queue1[1]);
        Queue2customer1.setText(Queue2[0]);
        Queue2customer2.setText(Queue2[1]);
        Queue2customer3.setText(Queue2[2]);
        Queue3customer1.setText(Queue3[0]);
        Queue3customer2.setText(Queue3[1]);
        Queue3customer3.setText(Queue3[2]);
        Queue3customer4.setText(Queue3[3]);
        Queue3customer5.setText(Queue3[4]);
        WaitingQueueCustomer1.setText(WaitingListQueue[0]);
        WaitingQueueCustomer2.setText(WaitingListQueue[1]);
        WaitingQueueCustomer3.setText(WaitingListQueue[2]);
        WaitingQueueCustomer4.setText(WaitingListQueue[3]);
        WaitingQueueCustomer5.setText(WaitingListQueue[4]);
    }
}

//20223147_w1986643
