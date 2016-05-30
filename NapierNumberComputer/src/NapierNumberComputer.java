import java.math.BigDecimal;

public class NapierNumberComputer {
	static int numberOfThreads;
	static int numberOfAdditives;
	static String outputFileName = "result.txt";
	static boolean quiet = false;
	//static Threads[] array;
    static BigDecimal sum;
	static boolean gui = false;
    static String input;
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		System.out.println(Utility.computeFactorialRecursuve(10));
		long t2 = System.currentTimeMillis() - t1;
		System.out.println(t2);
	}
}
