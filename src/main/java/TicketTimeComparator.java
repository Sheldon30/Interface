import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket t1, Ticket t2) {
        int differTime1 = t1.getTimeTo() - t1.getTimeFrom();
        int differTime2 = t2.getTimeTo() - t2.getTimeFrom();
        if (differTime1 < differTime2) {
            return -1;
        } else if (differTime1 > differTime2) {
            return 1;
        } else {
            return 0;
        }

    }
}
