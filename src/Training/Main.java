package Training;

public class Main {
	public static void main(String[] args) {
		Box myNewBox = new Box();

		myNewBox.width = 1;
		myNewBox.height = 2;
		myNewBox.depth = 3;

		System.out.println("Volume = " + myNewBox.width * myNewBox.height * myNewBox.depth);
	}
}