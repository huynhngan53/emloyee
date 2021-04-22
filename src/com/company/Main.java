package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Map<String, String> mapEmployee = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String ID, Name;
        mapEmployee.put("a1234","Steve Jobs");
        mapEmployee.put("a1235","Scott McNealy");
        mapEmployee.put("a1236","Jeff Bezos");
        mapEmployee.put("a1237","Larry Ellison");
        mapEmployee.put("a1238","Bill Gates");
        Set<String> keySet=mapEmployee.keySet();
        System.out.println("Nhap ID");
        ID= scanner.nextLine();
        if (ID==mapEmployee.get(keySet)){
           // String values = null;
           // System.out.println("ten la:"+mapEmployee.get());
        }
        else
            System.out.println("NHAP SAI ID");

        //System.out.println(mapEmployee.get("A1234"));
       // System.out.println(mapEmployee.get("a1235"));
        //System.out.println(mapEmployee.get("a1236"));
        //System.out.println(mapEmployee.get("a1237"));
        //System.out.println(mapEmployee.get("a1238"));





    }

}
