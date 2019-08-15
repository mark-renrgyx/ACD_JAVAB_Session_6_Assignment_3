package week1.day6.assignment3;

public class FinderMain {

	public static void main(String[] args) {
		int [] list = {0, 1, 2, 3, 4};
		
		BinaryFinder finder = new BinaryFinder(list);
		
		finder.find(-45);
		finder.find(-1);
		finder.find(0);
		finder.find(1);
		finder.find(2);
		finder.find(3);
		finder.find(4);
		finder.find(5);
		finder.find(1005);
	}
}
