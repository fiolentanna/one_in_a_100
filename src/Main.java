public class Main {
    public static void main (String[] args) {
        long balance = 100;
        long income = 1100;
        long bonus = income / 100;
        if (income > 1000) {
             bonus = income / 100;
        } else {
            bonus = 0;
        }
        long amount = balance + bonus;
        System.out.println(amount);

    }

}