package task3;

public class CalandarConverter {

    public final static int MONDAY = 1;
    public final static int TUESDAY = 2;
    public final static int WEDNESDAY = 3;
    public final static int THURSDAY = 4;
    public final static int FRIDAY = 5;
    public final static int SATURDAY = 6;
    public final static int SUNDAY = 7;

    String convertDayToString(int dayNumber) {
        String day = "";
        switch (dayNumber){
            case MONDAY:
                day = "Poniedziałek";
                break;
            case TUESDAY:
                day = "Wtorek";
                break;
            case WEDNESDAY:
                day = "Sroda";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piątek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
            default:
                day = "dzień nieznany";
                break;
        }
        return day;
    }

}
