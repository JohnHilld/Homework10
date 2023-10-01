package package1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }

    //Task №1
    private static int countOccurance(List<String> list, String str) {
        int k = 0;
        if (list == null) {
            return k;
        }
        for (String s : list) {
            if (s == str) k++;
        }
        return k;
    }

    //Task №2
    private static List<Integer> toList(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        return list;
    }
}


