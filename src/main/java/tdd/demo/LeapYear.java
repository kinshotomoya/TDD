package tdd.demo;

public class LeapYear {

    public static boolean isLeep(int year) {
        boolean result = false;
        if(year % 4 != 0) {
            result = false;
        } else {
            if(year % 100 != 0) {
                result = true;
            } else {
                if(year % 400 != 0) {
                    result = false;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }
}
