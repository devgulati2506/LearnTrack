package entities;

import util.IdGenerator;

import java.util.List;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String batch;

    public void setActive(boolean active) {
        isActive = active;
    }

    private boolean isActive;

    public Student(String firstName,String lastName,String email,String batch,boolean isActive){
        this.firstName=firstName;
        this.lastName=lastName;
        this.batch=batch;
        this.email=email;
        this.isActive=isActive;
        this.id= IdGenerator.getNextStudentId();
    }
  public Student(String firstName,String lastName,String batch,boolean isActive){
        this.firstName=firstName;
        this.lastName=lastName;
        this.batch=batch;
        this.isActive=isActive;
      this.id= IdGenerator.getNextStudentId();
    }

    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }


    public boolean isActive() {
        return isActive;
    }


    public String getBatch() {
        return batch;
    }
    @Override
    public String toString() {
        return "[name:\"" + firstName + "\", lastName:\"" + lastName +
                "\", id:\"" + id +
                "\", email:\"" + email + "\", batch:\"" + batch +
                "\", isActive:" + isActive + "]";
    }
}
