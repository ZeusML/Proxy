package cglib.lazyload;

import java.util.Date;

public class Schedule {

    private String courseName;

    private Date courseTime;

    public Schedule() {
    }

    public Schedule(String courseName, Date courseTime) {
        this.courseName = courseName;
        this.courseTime = courseTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }
}