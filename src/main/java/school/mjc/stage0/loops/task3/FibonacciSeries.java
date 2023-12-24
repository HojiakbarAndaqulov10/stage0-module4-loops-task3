package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.println(lastFibonacci);

        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

