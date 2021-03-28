import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    
    Queue <Integer> bridge = new LinkedList<>();

    Scanner sc = new Scanner(System.in);
    int carsWeight = 0;
    int temp;
    int weightLimit = sc.nextInt();
    int carsAmount = sc.nextInt();
    int maxCars = 0;

    for (int i = 0; i < carsAmount; i++) {
      temp = sc.nextInt();
      if (bridge.size() == 4){
        carsWeight -= bridge.peek();
        bridge.remove();
      }
      bridge.add(temp);
      carsWeight += temp;
      if (carsWeight > weightLimit){
        break;
      }
      else {
        maxCars++;
      }
    }
    System.out.println(maxCars);
  }
}