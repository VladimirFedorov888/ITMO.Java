package Task06;

public class Main {

    public static void main(String[] args) {
        intNumber.SubClass obj = new intNumber.SubClass(10);
        obj.printNumber();
        Age.SubClass2 obj2 = new Age.SubClass2(25, "Иван");
        System.out.println(obj2.getAge());
        System.out.println(obj2);
    }

}
