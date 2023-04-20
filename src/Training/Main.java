package Training;

public class Main {
	public static void main(String[] args) {
		Box myBox = new Box();

		//add new functionality
		myBox.width = 4;
		myBox.height = 5;
		myBox.depth = 6;

		double volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Volume = " + volume);

		//only for dev
		//again commit for dev branch
	}
}