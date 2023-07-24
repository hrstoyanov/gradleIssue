package issue201;

import java.util.List;

public class ShoppingApp {

    public static void main(String[] args) {
         System.out.println(OrderRenderer
                .of()
                .execute(new Order("#123",
                        List.of(new Order.Item("TV Set"),
                                new Order.Item("Book")))));
    }
}
