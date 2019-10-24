package task3;

public class ConverterTest {
    public static void main(String[] args) {
        CalandarConverter calandarConverter = new CalandarConverter();
        for(int i = 1; i<=7; i++){
            System.out.println(i + " dzień tygodania to " + calandarConverter.convertDayToString(i));
        }

    }
}
