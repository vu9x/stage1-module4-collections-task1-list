package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public static LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        // Нечетное то с начала списка. Четное то с конца списка
        LinkedList<Integer>  destinationList = new LinkedList<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if(sourceList.get(i) % 2 == 0){
                destinationList.addLast(sourceList.get(i));
            } else {
                destinationList.addFirst(sourceList.get(i));
            }
        }
        return destinationList;
    }

    public static void main(String[] args) {
        System.out.println(createLinkedList(List.of(47, 3, 12, 25, 44, 80, 13, 2, 7, 52)).toString());
    }
}
