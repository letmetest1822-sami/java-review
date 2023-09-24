import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1, "Jose_1"));
        students.add(new Student(2, "Sayed_2"));
        students.add(new Student(3, "Nick_3"));
        students.add(new Student(4, "Ronnie_4"));
        System.out.println("Printing with toString........");
        System.out.println(students);
        System.out.println();
        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("Printing with Legacy For loop........");
        for (int i = 0; i < students.size(); i++) System.out.println(students.get(i));
        System.out.println();
        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with Iterator Forward........");

        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        // Backwards Iteration
        System.out.println("Printing with Iterator Backwards........");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println();

        // for each loop
        System.out.println("Printing with For each loop........");
        for (Student student:students             ) System.out.print(student + " / ");
        System.out.println();
        //Lambda
        System.out.println("Printing with Lambda........");
        students.forEach(student -> System.out.print(student + " * "));
        System.out.println();
        System.out.println();

        // Sorting Elements in List
        System.out.println("Printing with sorted List by comp..........");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);
        System.out.println();

        System.out.println("Printing with sorted List by Name Desc..........");
        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);
        System.out.println();

    }
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}