import java.util.*;

public class ArrayListCase {

    public static void main(String[] args) {

        // 1️⃣ Store food stalls
        ArrayList<String> foodStalls = new ArrayList<>();
        foodStalls.add("Momo Stall");
        foodStalls.add("Pizza Stall");
        foodStalls.add("Burger Stall");

        System.out.println("Food Stalls: " + foodStalls);

        // 2️⃣ Chefs updating dishes (Vector)
        Vector<String> dishes = new Vector<>();
        dishes.add("Chicken Momo");
        dishes.add("Veg Pizza");
        dishes.add("Cheese Burger");

        System.out.println("Available Dishes: " + dishes);

        // 3️⃣ Customers standing in line (Queue)
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Ram");
        customerQueue.add("Sita");
        customerQueue.add("Hari");

        System.out.println("\nServing Customers:");
        while (!customerQueue.isEmpty()) {
            System.out.println("Serving: " + customerQueue.poll());
        }

        // 4️⃣ Customer goes back (Stack)
        Stack<String> revisitStack = new Stack<>();
        revisitStack.push("Momo Stall");
        revisitStack.push("Pizza Stall");

        System.out.println("\nLast Visited Stall: " + revisitStack.pop());

        // 5️⃣ Daily festival history (LinkedList)
        LinkedList<String> dailyHistory = new LinkedList<>();
        dailyHistory.add("Ram visited Momo Stall");
        dailyHistory.add("Sita visited Pizza Stall");
        dailyHistory.add("Hari visited Burger Stall");

        System.out.println("\nDaily Festival History:");
        for (String record : dailyHistory) {
            System.out.println(record);
        }
    }
}
