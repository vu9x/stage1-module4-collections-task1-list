package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }


class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        try{
            int aNumber = myFunc(Integer.parseInt(a));
            int bNumber = myFunc(Integer.parseInt(b));

            if(aNumber > bNumber){
                return 1;
            } else if (aNumber < bNumber) {
                return -1;
            } else {
                return -1;
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        return 0;
    }

    public int myFunc(int x){
        return (5 * x * x + 3);
    }
}
}
