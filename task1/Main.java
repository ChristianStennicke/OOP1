package task1;

public class Main {

    public static class Driver {
        private String name;
        private int age;

        //Constructor
        public Driver(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "is driven by " + name;

        }


        public static class Car {
            private String make;
            private String model;
            private int year;
            private String bodyStyle;
            private String driver;


            //Constructor
            public Car(String make, String model, int year, String bodyStyle) {
                this.make = make;
                this.model = model;
                this.year = year;
                this.bodyStyle = bodyStyle;
            }

            //Getter
            public String getMake() {
                return make;
            }


            //Getter
            public String getModel() {
                return model;
            }

            //Getter
            public int getYear() {
                return year;
            }

            //Getter
            public String getBodyStyle() {
                return bodyStyle;

            }

            //Getter
            public String getDriver() {
                return driver;
            }

            public void setDriver(String driver) {
                this.driver = driver;
            }


            //toString method
            @Override
            public String toString() {
                return "make:" + make + ".Model:" + model + "(" + year + "),BodyStyle:" + bodyStyle;

            }
            public static void main(String[] args) {
            Driver d1 = new Driver("Christian",21);
            Car c1 = new Car("BMW","500 series",2020,"Sport");
            c1.setDriver(d1.getName());
                System.out.println(c1.toString());
                System.out.println(d1.toString());
            Car c2 = new Car("Hyuandai","i10",2021,"Advanced");
            c2.setDriver(d1.getName());
                System.out.println(c2.toString());
                System.out.println(d1.toString());
            }
        }
    }
}


