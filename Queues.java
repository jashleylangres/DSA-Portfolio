import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println("Binary representations of numbers in the queue (1-10):");
        for (int number : queue) {
            System.out.println(getBinaryRepresentation(number));
        }
    }

    
    private static String getBinaryRepresentation(int number) {
        String binary = Integer.toBinaryString(number);
        
        while (binary.length() < 4) {
            binary = "0" + binary;
        }
        return binary;
    }
}