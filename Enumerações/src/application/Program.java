package application;

import entities.Order;
import java.util.Date;
import entities.Status;

public class Program {
    public static void main(String[] args) throws Exception {
        Order order = new Order(1080, new Date(), Status.PENDING_PAYMENT); 

        System.out.println(order);

        Status os1 = Status.DELIVERED;

        Status os2 = Status.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
