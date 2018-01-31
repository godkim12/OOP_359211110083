package ooplab8;

public class cat {
    public class Cat extends Pet{

        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeNoise() {
            System.out.println("Box Box !!!");
        }
}//calss
