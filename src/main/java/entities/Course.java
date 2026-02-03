package entities;

public class Course {
    public Long getId() {
        return id;
    }

    // Fields: id, courseName, description, durationInWeeks, active
    private Long id;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    private  String courseName;
    private  String desc;
    private int durationInWeeks;
    private boolean isActive;

    public Course(String courseName, String desc, int durationInWeeks, boolean isActive){
        this.courseName=courseName;
        this.desc=desc;
        this.durationInWeeks=durationInWeeks;
        this.isActive=isActive;
    }

}
