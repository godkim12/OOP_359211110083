package ooplab8;

    public class Employee extends Person {
        private String position;
        private String salary;
        public Employee(String name, String gender, String dateOfBirth, int age, String position, String salary) {
            super(name, gender, dateOfBirth, age);
            this.position = position;
            this.salary = salary;
        }
        //toString()
        @Override
        public String toString() {
            return "Employee{" +
                    "position='" + position + '\'' +
                    ", salary='" + salary + '\'' +
                    "} " + super.toString();
        }
        //getter and setter method

        public void setPosition(String position) {
            this.position = position;
        }

        public void setSalary(String salary) {
            this.salary = salary;
        }
    }//class
