import java.util.ArrayList;

public class Main {

    public static class Customer {

        private String firstName;
        private String lastName;
       private String userName;
       private int id;

        public Customer(String firstName, String lastName, String userName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getUserName() {
            return userName;
        }

        public int getId() {
            return id;
        }
        public String toString(){
            return firstName +" "+ lastName +" "+ userName;
        }
        static ArrayList<Customer> customers = new ArrayList<Customer>();
        static Customer c1 = new Customer("Simon","Dillermand","SimonGaming");
        static Customer c2 = new Customer("Rasmus","Dillermand","RasmusGaming");
        static Customer c3 = new Customer("Christian","Dillermand","ChrisGaming");
        static Customer c4 = new Customer("Dorrit","Dillermand","DorritGaming");
        static Customer c5 = new Customer("Rene","Dillermand","ReneGaming");
        static Customer c6 = new Customer("Malou","Dillermand","MalouGaming");

       public static void printCustomers()
       {
           for (Customer a : customers) {
               System.out.println(a);
           }
       }

        public static void main(String[] args) {

            customers.add(c1);
            customers.add(c2);
            customers.add(c3);
            customers.add(c4);
            customers.add(c5);
            customers.add(c6);
            printCustomers();

        }
    }
    }
