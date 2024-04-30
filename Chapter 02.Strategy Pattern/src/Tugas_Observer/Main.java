package Tugas_Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(123, "nia", "Moon Coklat kacang");
        order.registerObserver(new Customer("nia", "niaimas9@gmail.com"));
        order.registerObserver(new LogisticsSystem());

        order.updateStatus(OrderStatus.PROCESSING);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
    }
}
