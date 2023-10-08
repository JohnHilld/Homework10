package package1;

import phonebook.Record;
import phonebook.Telephonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("-------------------Task №1-------------------");
        List<String> strings = new ArrayList<>(
                List.of("Lorem", "ipsum", "dolor", "sitamet", "consectetur",
                        "adipiscing", "elit", "sed", "do", "eiusmod", "tempor",
                        "incididunt", "ut", "labore", "et", "dolor", "magna", "aliqua"));
        System.out.println(countOccurance(strings, "dolor"));

        System.out.println("-------------------Task №2-------------------");
        Integer[] str = new Integer[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println(toList(str));

        System.out.println("-------------------Task №3-------------------");
        List<Integer> list3 = new ArrayList<Integer>(List.of(1, 5, 4, 7, 5, 10, 20, 4));
        System.out.println("Input:" + list3);
        System.out.println("Output:" + findUnique(list3));

        System.out.println("-------------------Task №4-------------------");
        calcOccurance(strings);

        System.out.println("-------------------Task №4*-------------------");
        System.out.println(findOccurance(strings));

        System.out.println("-------------------Task №5-------------------");
        Telephonebook book = new Telephonebook();
        book.add("Alex", "011-111-11-11");
        book.add("Bob", "011-222-22-22");
        book.add("Connor", "011-333-33-33");
        book.add("Alex", "011-444-44-44");
        book.add("Diego", "011-555-55-55");
        book.add("Alex", "011-666-66-66");
        book.add("Edward", "011-777-77-77");

        String name = "Diego";
        System.out.println("Search for " + name + "\nFound:\nName: " + book.find(name).getName() +
                "; Phone number: " + book.find(name).getPhoneNumber());

        name = "Alex";
        System.out.println("\nSearch for all records by name " + name+ "\nFound");
        List<Record> listOfRecords = book.findAll(name);
        for (Record rec: listOfRecords) {
            System.out.println("Name: " + rec.getName() +
                    "; Phone number: " + rec.getPhoneNumber());
        }
    }

    //Task №1
    private static int countOccurance(List<String> list, String str) {
        int k = 0;

        for (String s : list) {
            if (Objects.equals(s, str)) k++;
        }

        return k;
    }

    //Task №2
    private static List<Integer> toList(Integer[] intArr) {
        List<Integer> list = Arrays.asList(intArr);
        return list;
    }

    //Task №3
    private static List<Integer> findUnique(List<Integer> intList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            int value = intList.get(i);
            if(!uniqueList.contains((value))) {
                uniqueList.add(value);
            }
        }

        return uniqueList;
    }

    //Task №4
    private static void calcOccurance(List<String> stringLst) {
        List<String> uniqueList = new ArrayList<>();

        for (int i = 0; i < stringLst.size(); i++) {
            String value = stringLst.get(i);
            if(!uniqueList.contains((value))) {
                uniqueList.add(value);
            }
        }

        for (int i = 0; i < uniqueList.size(); i++) {
            int k;
            String uniqueValue = uniqueList.get(i);
            k = countOccurance(stringLst, uniqueValue);
            System.out.println(uniqueValue + ": " + k);
        }
    }

    //Task №4*
    private static List<String> findOccurance(List<String> stringLst) {
        List<String> uniqueList = new ArrayList<>();

        for (int i = 0; i < stringLst.size(); i++) {
            String value = stringLst.get(i);
            if(!uniqueList.contains((value))) {
                uniqueList.add(value);
            }
        }

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < uniqueList.size(); i++) {
            int k;
            String uniqueValue = uniqueList.get(i);
            k = countOccurance(stringLst, uniqueValue);
            outputList.add("{name: \"" + uniqueValue + "\", occurrence: " + k + "}");
        }

        return outputList;
    }
}