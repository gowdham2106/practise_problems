package daily_task;

import java.util.ArrayList;
import java.util.Scanner;

public class Tcktecounter_queue {
public static void main(String[] args) {
	ArrayList <String> queue=new ArrayList<>();
	Scanner ob=new Scanner(System.in);
	while(true) {
		String command=ob.nextLine().trim();
		
		if (command.startsWith("ENQUEUE")) {
			String name=command.substring(8);
			queue.add(name);
		}
		else if (command.equals("DEQUEUE")) {
			String removed=queue.removeFirst();
			System.out.println("removed :"+removed);
		}
		else if(command.equals("DISPLAY")) {
			if(queue.isEmpty()) {
				System.out.println("Empty");
			}
			else {
				System.out.println("Queue : "+queue);
			}
			
		}
	}
	
	
}
}
