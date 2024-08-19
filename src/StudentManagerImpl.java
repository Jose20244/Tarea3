import java.util.ArrayList;
import java.util.*;

class StudentManagerImpl implements StudentManager {
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) {
        studentList.removeIf(student -> student.getId() == id);
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        return studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Estudiante no encontrado con ID: " + id));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}
