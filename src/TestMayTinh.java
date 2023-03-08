
public class TestMayTinh {
	public int MinDay(int...x) {
		int min = x[0];
		for(int i:x) {
			min = i;
		}
		return min;
	}
	
	public int MaxDay(int...x) {
		int max = x[0];
		for(int i:x) {
			max = i;
		}
		return max;
	}
}
