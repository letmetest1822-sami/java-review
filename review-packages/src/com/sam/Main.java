package com.sam;

import com.sam.arraylist.ArrayList;
import com.sam.core.Loops;
import com.sam.core.Methods;
import com.sam.core.SelectionStatements;
import com.sam.enums.Gender;
import com.sam.enums.Status;
import com.sam.oop.abstraction.implementation.UserServiceImplementation;
import com.sam.oop.abstraction.service.UserService;
import com.sam.oop.encapsulation.Role;
import com.sam.oop.encapsulation.User;
import com.sam.oop.inheritance.BaseEntity;
import com.sam.oop.inheritance.Project;
import com.sam.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("**************CORE******************");
        Methods methods = new Methods();   //class is in different package so it is imported
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());   //if return type is String --> print it
        methods.methodB(5);

        Methods.methodC();     //static method can be called by ClassName


        Loops loops = new Loops();  // NO need to create object for calling  static methods
        Loops.demoForEach();
        Loops.demoForIterator();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        System.out.println("**************OOP - Encapsulation******************");

        //create a user object
        User user = new User("Sam", "Kar", new Role(2, "Manager"), Gender.MALE);     //new keyword invokes the constructor. Which one ? ***add parameters to constructor

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());


        System.out.println("*************OOP - Inheritance *********************");

        //create Project Object

        Project project = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5), 1, "PRJ001", "Human Resource CRM",
                new User("Mike", "Smith", new Role(1, "Manager"), Gender.MALE),
                LocalDate.now(), LocalDate.now().plusMonths(6), Status.IN_PROGRESS, "HCRM Detail Information");

        System.out.println(project.toString());

        System.out.println("*************OOP - Interface *********************");

        UserServiceImplementation userServiceImplementation = new UserService();
        System.out.println(userServiceImplementation.userByFirstName("Mike").getLastName());


        System.out.println("*************OOP - Polymorphism *********************");
        Employee employee = new Employee();         //  Tightly coupled
        BaseEntity employee2 = new Employee();      //  Loosly coupled, polymorphic way   Left interface, right side class

        UserServiceImplementation userServiceImplementation1 = new UserService();

        employee.getEmployeeHours();
        //employee2.getEmployeeHours();  Need down casting. Parent (Reference type) side decides which methods can be used
        ((Employee) employee2).getEmployeeHours();


        System.out.println("************* ENUM *********************");

        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue()); //will return String.
        System.out.println(Status.IN_PROGRESS.getValue().charAt(3)); //you can use string manipulation
        System.out.println("Status.valueOf(\"OPEN\") = " + Status.valueOf("OPEN"));
        System.out.println("Status.values() = " + Status.values());

        System.out.println("************ Collections *********************");

        ArrayLists arrayLists = new ArrayLists();









    }

}
