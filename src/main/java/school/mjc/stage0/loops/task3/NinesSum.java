package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int a= 7;

        int temp = 0;
        int sum = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            temp = temp * 10 + a;
            sum = sum + temp;
        }

        System.out.println(sum);
    }
}
