package Netology.Java_Core.Streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Нужно создать копию ArrayList - иначе при попытке модификации списка
        // вылетает ошибка UnsupportedOperationException
        // Насколько я понимаю, это особенность метода Arrays.asList:
        // https://stackoverflow.com/questions/28112309/unsupportedoperationexception-when-using-iterator-remove

        ArrayList<Integer> newIntList = new ArrayList<>(intList);

        newIntList.removeIf(nextInt -> nextInt <= 0 || nextInt % 2 != 0);
        Collections.sort(newIntList);
        System.out.println(newIntList);
    }
}