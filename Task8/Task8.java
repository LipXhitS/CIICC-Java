public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Task8 task = new Task8();
        System.out.println("Cumulative Sum: " + task.cumulativeSum(numbers));
    }

    private int cumulativeSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        }
        return sum;
    }
}