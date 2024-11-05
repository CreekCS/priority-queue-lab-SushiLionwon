import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueLab {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        String filename = "RandIntegers.txt";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                try {
                    int number = Integer.parseInt(scanner.nextLine().trim());
                    priorityQueue.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Non-integer value found and ignored.");
                }
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
            e.printStackTrace();
        }

        System.out.println("Priority Queue contents:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
