import java.util.List;

interface StudentManager {
    void addStudent(Student student);
    void removeStudent(int id);
    Student findStudent(int id) throws StudentNotFoundException;
    List<Student> getAllStudents();
}