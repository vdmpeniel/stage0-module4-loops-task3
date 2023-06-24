package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public int smallest(int first, int second){
        return (first < second) ? first : second;
    }
    public void printGCD(int first, int second) {
        if (first == second) {
            System.out.println(first);
            return;
        } else if (first == 0) {
            System.out.println(second);
            return;
        } else if (second == 0) {
            System.out.println(first);
            return;
        }

        for (int i = smallest(first, second); i >= 2; i--){
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("nah");
    }
}
