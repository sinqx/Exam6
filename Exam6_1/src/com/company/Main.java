package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Student Tom = new Student(1, "Tom", 4, 18, 'm');
        Student Kate = new Student(2, "Kate", 3, 19, 'f');
        Student Sam = new Student(3, "San", 5, 17, 'm');
        Student Nick = new Student(4, "Nick", 4, 20, 'm');
        Student Lol = new Student(5, "Lol", 2, 16, 'm');

        ArrayList<Student> people = new ArrayList<>(Arrays.asList(Tom, Kate, Sam, Nick, Lol));

        System.out.println(getNamesList(people));
        System.out.println(getNamesListByAge(people, 18));
        printAnonymously(people);
        System.out.println(getNamesFirstLetterList(people));
    }

    public static List<String> getNamesList(ArrayList<Student> students){
        return students.stream().map(x -> x.getName()).collect(Collectors.toList());
    }

    public static List<String> getNamesListByAge(ArrayList<Student> students, int minAge){
        return students.stream().filter(x -> x.getAge() >= minAge).map(x -> x.getName()).collect(Collectors.toList());
    }

    public static void printAnonymously(ArrayList<Student> students) {
        List<String> studentsMarks = students.stream().map(x -> "ID: " + x.getId() + ", сред оценка: " + x.getAvgMark()).collect(Collectors.toList());
        System.out.println(studentsMarks);
    }

    public static List<String> getNamesFirstLetterList(ArrayList<Student> students){
        return students.stream().map(x -> x.getName() + " -> " + x.getName().charAt(0) + x.getName().length()).collect(Collectors.toList());
    }
}
