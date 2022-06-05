import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        
        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException
                (this.start + " after " + this.end);
        }
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}


// 修正時刻: Mon 2022/06/06 07:52:28
