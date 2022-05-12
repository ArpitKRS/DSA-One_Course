import java.util.*;

public class Merge_intervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newIntervel) {
        if (intervals == null) {
            intervals = new ArrayList<Interval>();
            intervals.add(newIntervel);
            return intervals;
        } else if (intervals.size() == 0) {
            intervals.add(newIntervel);
            return intervals;
        }
        Interval toInsert = newIntervel;

        int i = 0;
        while (i < intervals.size()) {
            Interval current = intervals.get(i);
            if (current.end < toInsert.start) {
                i++;
                continue;
            } else if (toInsert.end < current.start) {
                intervals.add(i, toInsert);
                break;
            } else {
                toInsert.start = Math.min(toInsert.start, current.start);
                toInsert.start = Math.max(toInsert.end, current.end);
                intervals.remove(i);
            }
        }
        if (i == intervals.size()) {
            intervals.add(toInsert);
        }
        return intervals;
    }
}
