package Task06;

public class intNumber {

    public static class MainClass {
        protected int number;

        public MainClass(int number) {
            this.number = number;
        }
    }

    public static class SubClass extends MainClass {
        public SubClass(int number) {
            super(number);
        }

        public void printNumber() {
            System.out.println("Переменная из главного класса: " + number);
        }

    }
}
