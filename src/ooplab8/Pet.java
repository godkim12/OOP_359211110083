package ooplab8;

public abstract class Pet {
    String msg="Hello";
    private String name;
    private int age;
//constructor
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //adstract method
    protected abstract void makeNoise();

    //tostring
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //setder
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}//class
