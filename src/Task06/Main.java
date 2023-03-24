package Task06;

public class Main {
///////////////////////////////////////// Ex05

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
    ///////////////////////////////////////// Ex06
    public static class MainClass2 {
        private int age;

        public MainClass2(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static class SubClass2 extends MainClass2 {
        private String name;

        public SubClass2(int age, String name) {
            super(age);
            this.name = name;
        }

        @Override
        public String toString() {
            return "Имя пользователя: " + name;
        }
    }


    public static void main(String[] args) {
        SubClass obj = new SubClass(10);
        obj.printNumber();
        SubClass2 obj2 = new SubClass2(25, "Иван");
        System.out.println(obj2.getAge());
        System.out.println(obj2);
    }

}
