
public class writeNums {
	public static void main(String[] args) throws IllegalArgumentException {
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
	}

	public static void writeNums(int numero) {
		if (numero == 1) {
			System.out.print("1");

		} else {
			writeNums(numero - 1);
			System.out.print(", " + numero);

		}
	}
}
