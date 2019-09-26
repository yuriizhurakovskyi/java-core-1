package lgscourse.javacore.lesson01;

public class Example {
	public static void main(String[] args) {
		// Завдання 1
		int x = 3543;
		float y = 1.45f;
		double z = 8.4335;
		short v = -35;
		byte w = 14;
		boolean b = true;
		long l = 123456789000L;
		char c = 'є';
		// Завдання 2
		System.out.println("Integer Max Value " + Integer.MAX_VALUE);
		System.out.println("Integer Min Value " + Integer.MIN_VALUE);
		System.out.println("Float Max Value " + Float.MAX_VALUE);
		System.out.println("Float Min Value " + Float.MIN_VALUE);
		System.out.println("Double Max Value " + Double.MAX_VALUE);
		System.out.println("Double Min Value " + Double.MIN_VALUE);
		System.out.println("Short Max Value " + Short.MAX_VALUE);
		System.out.println("Short Min Value " + Short.MIN_VALUE);
		System.out.println("Byte Max Value " + Byte.MAX_VALUE);
		System.out.println("Byte Min Value " + Byte.MIN_VALUE);
		System.out.println("Long Max Value " + Long.MAX_VALUE);
		System.out.println("Long Min Value " + Long.MIN_VALUE);
		System.out.println("Character Max Value \'" + Character.MAX_VALUE + "\'");
		System.out.println("Character Min Value \'" + Character.MIN_VALUE + "\'");

		// Завдання 3
		int[] array = { -34, 2, 0, 8, 1, -4, 45, 112, 340, -19 };
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
			if (max < array[i])
				max = array[i];
		}
		System.out.println("min = " + min + ", max = " + max);

		// Сортування бульбашкою, min і max
		for (int k = array.length - 1; k > 0; k--) {
			for (int p = 0; p < k; p++) {
				if (array[p] > array[p + 1]) {
					int tmp = array[p];
					array[p] = array[p + 1];
					array[p + 1] = tmp;
				}
			}
		}
		System.out.println("min = " + array[0] + ", max = " + array[array.length-1]);
		
		//first commit for gitHub
	}
}
