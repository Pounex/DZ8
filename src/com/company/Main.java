package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person pr1 = new Person("Harry", "Potter", new Address("Minsk", "Leonida Bedy", 10));
        Person pr2 = new Person("Anna", "Vorobyova", new Address("Minsk", "Leonida Bedy", 5));
        Person pr3 = new Person("Alex", "Makarenko", new Address("Slonim", "Bedy", 6));
        Person pr4 = new Person(null, "Makarenko", new Address("Slonim", "Bedy", 6));
        Person pr5 = new Person("Alex", null, new Address("Slonim", "Bedy", 6));
        Person pr6 = new Person("Alex", "Makarenko", null);

        List<Person> list1 = new ArrayList<>();
        list1.add(pr1);
        list1.add(pr2);
        list1.add(pr3);
        list1.add(pr4);
        list1.add(pr5);
        list1.add(pr6);


        List<String> list2 = list1.stream()
                .filter(line -> (line.getFirstName() != null))
                .filter(line -> (line.getLastName() != null))
                .filter(line -> (line.getAddress() != null))
                .sorted((a1, a2) -> a1.getAddress().getNumber() - a2.getAddress().getNumber() )
                .map(line-> line.toString())
                .collect(Collectors.toList());
        System.out.println(list2);



    }
}
