import java.util.Random;

public class RemainderDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = Math.abs(rand.nextInt());
        System.out.println("Original number: " + randNum);
        System.out.println("Remainder after divided by 100: " + randNum % 100);
        System.out.println("Radix Sort Calculation: " + (randNum / 1) % 10);
        System.out.println("Radix Sort Calculation: " + (randNum / 10) % 10);
        System.out.println("Radix Sort Calculation: " + (randNum / 100) % 10);
    }
}
