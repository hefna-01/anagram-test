package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramService {

    public boolean anagramControl(String paramTo, String paramFrom) {
        if(paramTo.equalsIgnoreCase("") || paramFrom.equalsIgnoreCase("")){
            return false;
        }
        List<String> listParamTo = Arrays.stream(Arrays.stream(paramTo.trim().replace(" ", "").split(""))
                .filter(str -> !str.equalsIgnoreCase(""))
                .map(String::toUpperCase)
                .toArray(String[]::new)).sorted().collect(Collectors.toList());
        List<String> listParamFrom = Arrays.stream(Arrays.stream(paramFrom.trim().replace(" ", "").split(""))
                .filter(str -> !str.equalsIgnoreCase(""))
                .map(String::toUpperCase)
                .toArray(String[]::new)).sorted().collect(Collectors.toList());

        if(listParamTo.size() != listParamFrom.size()){
            return false;
        }
        return listParamTo.toString().equalsIgnoreCase(listParamFrom.toString());

    }
}
