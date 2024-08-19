import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();

        // Agregar estudiantes
        studentManager.addStudent(new Student(1, "Massiel", 20));
        studentManager.addStudent(new Student(2, "Pineda", 22));
        studentManager.addStudent(new Student(3, "Xiomara", 35));
        studentManager.addStudent(new Student(5, "Walter", 25));
        studentManager.addStudent(new Student(7, "Allan", 40));

        // Filtrar estudiantes mayores de 21 años
        List<Student> olderStudents = studentManager.getAllStudents().stream()
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toList());

        // Ordenar estudiantes por nombre
        List<Student> sortedStudents = studentManager.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        // Mostrar resultados
        System.out.print("Estudiantes mayores de 21 años: " + olderStudents);
        System.out.print("Estudiantes ordenados por nombre: " + sortedStudents);
        List<Student> allStudents = studentManager.getAllStudents();


        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {


            System.out.println("-------------Gestión de Estudiantes---------------");
            System.out.println("1.Estudiantes Mayores de 21");
            System.out.println("2.Todos los estudiantes");
            System.out.println("3.Estudiantes ordenados por nombre");
            System.out.println("4.Salir");
            System.out.println("Digite una opcion");

            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.print("Estudiantes mayores de 21 años: " + olderStudents);


                    break;
                case 2:
                    System.out.println("Lista completa de estudiantes:");
                    for (Student student : allStudents) {
                        System.out.println(student);
                    }

                    break;
                case 3:
                    System.out.println("Estudiantes ordenados por nombre: " );
                    System.out.println(sortedStudents);
                    break;

                case 4:

                    System.out.println("Adios");
                    break;
            }
        }while (opcion != 4) ;

    }
}

