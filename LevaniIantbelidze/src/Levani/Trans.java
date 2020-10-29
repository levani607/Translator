package Levani;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trans {

   String satargmni;

    public Trans(String satargmni){
        Map<String,String> myMap=new HashMap<>();
        myMap.put("book","წიგნი");
        myMap.put("dog","ძაღლი");
        Set<String> bla = myMap.keySet();

        String TranslatedWord = myMap.get(satargmni);

        System.out.println(TranslatedWord);

    }




}
