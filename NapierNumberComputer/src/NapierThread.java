import java.math.BigDecimal;
import java.util.concurrent.Callable;


public class NapierThread implements Callable<BigDecimal> {
	private int from;
	private int to;
	
	public NapierThread(int from, int to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public BigDecimal call() throws Exception {
		BigDecimal result = BigDecimal.ZERO;
		for (int i = from; i <= to; i++) {
			BigDecimal additive = new BigDecimal(3 - (4*i*i)).divide(Utility.computeFactorialRecursuve(2*i + 1));
			result.add(additive);
		}
		return result;
	}
}
