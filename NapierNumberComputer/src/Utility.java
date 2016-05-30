import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Utility {
	public void printMessage(String message, boolean quietMode){
		if(!quietMode)
			System.out.println(message);
	}
	
	public static void writeToFile(String fileName, BigDecimal value){
    	try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
    		fileWriter.append(value.toString());
        } catch (FileNotFoundException fnf) {
            System.out.println(fileName + " was not found.");
        } catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public static long computeFactorialIterative(long n){
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static BigDecimal computeFactorialRecursuve(long n){
		if(n <= 1){
			return BigDecimal.ONE;
		}
		
		return new BigDecimal(String.valueOf(n)).multiply(computeFactorialRecursuve(--n));  		
	}
}
