package com.espety.utils;

public class Convert {

    public static String ageRange(String type) {
        String value = null;
        switch (type) {
            case "7 to 11 Years":
                value = "1";
                break;
            case "12 to 17 Years":
                value = "2";
                break;
            case "18 to 60 Years":
                value = "3";
                break;
            case "60 years and up":
                value = "4";
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        return value;
    }
}
