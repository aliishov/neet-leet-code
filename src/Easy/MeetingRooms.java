package Easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
	public boolean canAttendMeetings(List<Interval> intervals) {
		intervals.sort(Comparator.comparingInt(i -> i.start));
		for(int i = 1; i < intervals.size(); i++)
			if (intervals.get(i - 1).end > intervals.get(i).start)
				return false;

		return true;
	}
}

class Interval {
    public int start, end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}