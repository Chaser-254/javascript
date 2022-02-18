public class switchDemo {
    public static void main(string[] args) {
        
        itn month = 8;
        string monthstring;
        switch (month) {
            case 1: monthstring = "January";
            break;
            case 2: monthstring = "February";
            break;
            case 3: monthstring = "March";
            break;
            case 4: monthstring = "May";
            break;
            case 5: monthstring = "April";
            break;
            case 6: monthstring = "June";
            break;
            case 7: monthstring = "July";
            break;
            case 8: monthstring = "August";
            break;
            case 9: monthstring = "September";
            break;
            case 10: monthstring = "October";
            break;
            case 11: monthstring = "November";
            break;
            case 12: monthstring = "December";
            default: monthstring = "Invalid month";
            break;
        }
        system.out.println(monthstring);
    }
}