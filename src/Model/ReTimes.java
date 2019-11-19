package Model;

public class ReTimes {
	double reTime;
	double reTime2;
	double totalReTime;

	public ReTimes(double reTime, double reTime2, double totalReTime) {
		super();
		this.reTime = reTime;
		this.reTime2 = reTime2;
		this.totalReTime = totalReTime;
	}
	public double getReTime() {
		return reTime;
	}
	public void setReTime(double reTime) {
		this.reTime = reTime;
	}
	public double getReTime2() {
		return reTime2;
	}
	public void setReTime2(double reime2) {
		this.reTime2 = reime2;
	}
	public double getTotalReTime() {
		return totalReTime;
	}
	public void setTotalReTime(double totalReTime) {
		this.totalReTime = totalReTime;
	}

}
