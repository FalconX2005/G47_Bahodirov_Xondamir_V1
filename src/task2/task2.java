package task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class task2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,1,1);
        LocalDate date1 = LocalDate.of(2024,9,1);
        int time = 0;
        while(date1.isAfter(date)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if(dayOfWeek==DayOfWeek.SATURDAY){
                time+=4;
            }
            else if(dayOfWeek!=DayOfWeek.SUNDAY){
                time+=8;
            }
            date = date.plusDays(1);

        }
        System.out.println(time);

    }
}
