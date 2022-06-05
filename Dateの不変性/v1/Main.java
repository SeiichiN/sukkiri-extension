
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        
        Period p = new Period(start, end);
        System.out.println("period:" + p.start() + ":" + p.end());
        
        end.setYear(78);
        System.out.println("end:" + end);
        System.out.println("period:" + p.start() + ":" + p.end());
    }
}

// 修正時刻: Mon 2022/06/06 08:02:44
