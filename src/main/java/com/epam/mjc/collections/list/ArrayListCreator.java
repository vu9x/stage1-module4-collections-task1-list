package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> destinationList = new ArrayList<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if((i+1) % 3 == 0){
                Collections.addAll(destinationList, sourceList.get(i), sourceList.get(i));
            }
        }

        return destinationList;
    }
}


