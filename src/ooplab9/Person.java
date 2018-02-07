package ooplab9;

public class Person {
  private String personId;
  private String name;
  private Address address;
  private Job job;

  // toString

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    //setter and getter
    public String getPersonId() {
        return personId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    //constructro
    public Person(String personId, String name, Address address, Job job) {
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.job = job;
    }
}

