public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
}
