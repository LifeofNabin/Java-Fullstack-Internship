import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class FoodStall {

    String dish;
    String customerName;

    // Constructor (Order = customer + dish)
    public FoodStall(String dish, String customerName) {
        this.dish = dish;
        this.customerName = customerName;
    }

    public static void main(String[] args) {

        // 1️⃣ Store food stalls (ArrayList)
        ArrayList<String> stalls = new ArrayList<>();
        stalls.add("Momo Stall");
        stalls.add("Chowmin Stall");
        stalls.add("Pizza Stall");

        System.out.println("Food Stalls: " + stalls);

        // 2️⃣ Customers place orders (Queue)
        Queue<FoodStall> customerQueue = new LinkedList<>();
        customerQueue.add(new FoodStall("Pizza", "Ram"));
        customerQueue.add(new FoodStall("Momos", "Shyam"));
        customerQueue.add(new FoodStall("Burger", "Hari"));

        // 3️⃣ Chef stores prepared dishes (Vector)
        Vector<String> preparedDishes = new Vector<>();

        // 4️⃣ Daily customer history (LinkedList)
        LinkedList<String> history = new LinkedList<>();

        // 5️⃣ Forgot customers (Stack)
        Stack<String> forgotStack = new Stack<>();

        // 6️⃣ Serve customers
        while (!customerQueue.isEmpty()) {
            FoodStall order = customerQueue.poll();

            System.out.println("\nCustomer: " + order.customerName);
            System.out.println("Ordered: " + order.dish);

            // Chef prepares dish
            preparedDishes.add(order.dish);
            System.out.println("Chef prepared: " + order.dish);

            // Add to history
            history.add(order.customerName);

            // Example: Ram forgot something
            if (order.customerName.equals("Ram")) {
                forgotStack.push(order.customerName);
                System.out.println(order.customerName + " forgot something!");
            }
        }

        // 7️⃣ Serve returning customers
        while (!forgotStack.isEmpty()) {
            String cust = forgotStack.pop();
            System.out.println("\nServing returning customer: " + cust);
            history.add(cust);
        }

        // 8️⃣ Final summary
        System.out.println("\nPrepared Dishes: " + preparedDishes);
        System.out.println("Daily History: " + history);
    }
}
