package week1.day6.assignment3;

public class BinaryFinder {
	private int[] list;
	
	public BinaryFinder(int[] list) {
		this.list = list;
	}
	
	public void find (int target) {
		int found = -1;
		
		// Start and end of range of indices we have checked
		int startingIndex = -1;
		int endingIndex = list.length;
		
		int next = -2;
		
		while (true) {
			if (endingIndex - startingIndex <= 1)
				break;
			
			next = (endingIndex + startingIndex + 1) / 2;
			
			if (list[next] == target) {
				found = next;
				break;
			}
			else if (list[next] < target)
				startingIndex = next;
			
			else // list[next] > target
				endingIndex = next;
		}
		if (found == -1)
			System.out.println("Integer not found");
		else
			System.out.println("Integer found at index " + found);
	}
}
