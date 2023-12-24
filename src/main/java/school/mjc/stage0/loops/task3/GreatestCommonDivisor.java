package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
            if (first <= 0 || second <= 0) {
                System.out.println(second);
                return;
            }

            int gcd = calculateGCD(first, second);
            System.out.println(gcd);
        }
    private int calculateGCD(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

}
