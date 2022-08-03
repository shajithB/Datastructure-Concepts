import java.util.LinkedList;
import java.util.Queue;
public class Que {
public static void main(String[] args) {
        		Queue<String> locationsQueue = new LinkedList<String>();
                locationsQueue.add("chennai");
        		locationsQueue.add("bangalore");
        		locationsQueue.add("mumbai");
        		locationsQueue.add("kerala");
        		locationsQueue.add("ooty");
        		System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}

}