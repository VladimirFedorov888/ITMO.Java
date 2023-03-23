package Task03;

public class Main {
        public static void main(String[] args) {
            Study myStudy = new Study("Изучение Java - это просто!");
            System.out.println(myStudy.printCourse());

            Car car1 = new Car();
            car1.setName("BMW X6M");
            car1.setColor("Blue");
            car1.setWeight(2000.0);
            Car car2 = new Car("Red", "Ferrari F8 Spider", 1500.0);
            car1.printCarInfo();
            car2.printCarInfo();


            House myHouse = new House();
            myHouse.setValues(163, 2010, "Burj Khalifa");
            myHouse.printValues();
            System.out.println("Years since built: " + myHouse.getYearsSinceBuilt());

            Tree tree1 = new Tree(10, "Bereza");
            Tree tree2 = new Tree(5, true, "Topol");
            Tree tree3 = new Tree();

            System.out.println(tree1.getAge() + " " + tree1.getName());
            System.out.println(tree2.getAge() + " " + tree2.isAlive() + " " + tree2.getName());
        }




}
