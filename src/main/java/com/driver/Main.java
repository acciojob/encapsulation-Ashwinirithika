package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        /*
         * Direct access is NOT possible because name is private.
         *
         * obj.name = "Ashwini";
         * ERROR: name has private access in RWOnly
         *
         * System.out.println(obj.name);
         * ERROR: name has private access in RWOnly
         */

        // Setting value using setter
        obj.setName("Ashwini");

        // Accessing value using getter
        System.out.println(obj.getName());
    }
}
  
