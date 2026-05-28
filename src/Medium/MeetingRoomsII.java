package Medium;

import java.util.Arrays;
import java.util.List;

public class MeetingRoomsII {
	public int minMeetingRooms(List<Interval> intervals) {
		int start[] = new int[intervals.size()];
		int end[] = new int[intervals.size()];

		for(int i = 0; i < intervals.size(); i++) {
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}

		Arrays.sort(start);
		Arrays.sort(end);

		int s = 0;
		int e = 0;
		int count = 0;
		int result = 0;

		while(s < intervals.size()) {
			if (start[s] < end[e]) {
				s++;
				count++;
			} else {
				e++;
				count--;
			}

			result = Math.max(result, count);
		}

		return result;
	}
}

class Interval {
	public int start, end;
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}