package Task06;

public class Age {

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


}
