public class Main {
    public static void main (String[] args) {
        long balance = 100;
        long income = 100;
        balance = balance + income;
        if (income > 1000) {
            long bonus = income / 100;
            balance = balance + bonus;
        }
        System.out.println(balance);
    }
}