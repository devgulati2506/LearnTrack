package entities;

import enums.EnrollmentStatus;

import java.util.Scanner;

public class Enrollment {

    private  int studentID;
    private int courseID;
    private EnrollmentStatus enrollmentStatus;
    public Enrollment(int studentID,int courseID,EnrollmentStatus enrollmentStatus){
        this.studentID=studentID;
        this.courseID=courseID;
        this.enrollmentStatus=enrollmentStatus;
    }
    public long getStudentID() {
        return studentID;
    }

    public long getCourseID() {
        return courseID;
    }

    public EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }
    @Override
    public String toString() {
        return "[studentID:\"" + studentID + "\", courseID:\"" + courseID +
                "\", enrollmentStatus:\"" + enrollmentStatus + "]";
    }
}
