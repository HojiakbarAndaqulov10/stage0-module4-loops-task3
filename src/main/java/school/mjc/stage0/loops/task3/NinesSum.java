package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int n=5;
        int sum=lengthOfLastNumber;
        for (int i = 1; i <= n; i++) {
            sum=sum*10+sum;
        }
        System.out.println(sum);
    }
}
