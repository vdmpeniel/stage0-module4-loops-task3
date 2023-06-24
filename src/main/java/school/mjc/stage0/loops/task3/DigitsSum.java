package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        int length = String.valueOf(t).length();

        int sum = 0;
        for(int i = length; i > 0; i--){
            int digit = (int) (t / Math.pow(10, i - 1));
            sum += digit;
            t -= digit * Math.pow(10, i - 1);
        }
        System.out.println(sum);
    }
}
