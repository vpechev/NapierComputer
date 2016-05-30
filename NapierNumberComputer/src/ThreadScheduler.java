import java.math.BigDecimal;

public class ThreadScheduler {
		private volatile BigDecimal result;
		public BigDecimal scheduleAndCompute(int numberOfThreads, int k) throws Exception {
			BigDecimal result = BigDecimal.ZERO;
			for (int i = 0; i < numberOfThreads; i++) {
				int from = 0; 
				int to = 0;
				result.add(new NapierThread(from, to).call());
			}
			return result;
		}
}
