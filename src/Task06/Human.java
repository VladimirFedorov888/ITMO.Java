package Task06;


    ///////////////////////////////////////// Ex01


    abstract class Human {
        private String name;
        private String LastName;
        public Human(String name, String LastName) {
            this.name = name;
            this.LastName = LastName;
        }
        public String getName() {
            return name;
        }
        public String getLastName() {
            return LastName;
        }
        public abstract void getInfo();
    }

    class Client extends Human {
        private String BankName;
        public Client(String name, String LastName, String BankName) {
            super(name, LastName);
            this.BankName = BankName;
        }
        public void getInfo() {
            System.out.println("Клиент: " + getName() + " " + getLastName() + ", банк: " + BankName);
        }
    }

    class Bankir extends Human {
        private String BankName;
        public Bankir(String name, String LastName, String BankName) {
            super(name, LastName);
            this.BankName = BankName;
        }

        public void getInfo() {
            System.out.println("Банкир: " + getName() + " " + getLastName() + ", банк: " + BankName);
        }
    }




