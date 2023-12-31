import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompt {
    private final static String PROMPT="cal> ";

    public void runPrompt() throws IOException{
        int month = 1;
        int year = 1;
        String startDay;
        //String PROMPT = "cal> ";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Calendar cal = new Calendar();

        while (month != -1) {
            System.out.println("년도를 입력하세요");
            System.out.print("YEAR> ");
            year = Integer.parseInt(bf.readLine());

            System.out.println("달을 입력하세요");
            System.out.print("MONTH> ");
            month = Integer.parseInt(bf.readLine());

            System.out.println("시작하는 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("STARTDAY> ");
            startDay = bf.readLine();
            
            if (month == -1) {
                System.out.println("Bye~");
                break;
            }

            if (month > 12 || month < 1) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요\n");
            } else {
                System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.maxDaysOfMonth(month));
                cal.printCalendar(year, month, startDay);
                System.out.println();
            }
        }
    }
}
