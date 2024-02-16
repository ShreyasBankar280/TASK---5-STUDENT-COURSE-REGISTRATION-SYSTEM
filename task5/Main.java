import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private List<String> schedule;
    private List<String> enrolledStudents;

    public Course(String courseCode, String title, String description, int capacity, List<String> schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters and setters
    // Add methods for enrolling and dropping students
}

public class Student {
    private int studentID;
    private String name;
    private List<String> registeredCourses;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Getters and setters
    // Add methods for registering and dropping courses
}

public class CourseRegistrationSystem {
    private List<Course> courses;
    private List<Student> students;

    public CourseRegistrationSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Methods to manage courses and students
    // Display available courses with details and available slots
    // Allow students to register for courses from available options
    // Enable students to drop courses they have registered for
}