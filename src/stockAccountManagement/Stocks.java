package stockAccountManagement;

public class Stocks {
	String stockName;
	int numberOfShare;
	double sharePrice;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stocks [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}

}
