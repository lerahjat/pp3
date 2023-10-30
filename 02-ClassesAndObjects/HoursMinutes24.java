public class HoursMinutes24 {
    public static void main(String[] args){
        int hours = 14;
        int minutes = 27;

        int min_from_m = hours*60+minutes;
        int sec_from_m = (hours*60+minutes)*60;

        System.out.println("Time: "+hours+":"+ minutes);
        System.out.println("Minutes after midnight: " + min_from_m);
        System.out.println("Seconds after midnight: " + sec_from_m);
    }
    }

