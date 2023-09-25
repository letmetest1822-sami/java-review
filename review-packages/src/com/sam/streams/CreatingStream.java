package com.sam.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //Creating  stream from an Array
        String [] courses = {"Java", "JS", "TS", "API", "SELENIUM"};
        Stream<String> coursesStream = Arrays.stream(courses);

        //Creating a Stream from a Collection
        Stream<Role> roleStream = ArrayLists.createRoleList().stream();  //coming from the ArrayLists class

        //Creating a Stream from specified values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);



    }
}
