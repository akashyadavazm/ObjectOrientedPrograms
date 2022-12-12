package stockAccountManagement;

import java.util.*;

public class StockPortfolio {

	static Scanner sc = new Scanner(System.in);
	ArrayList<Stocks> portfolio = new ArrayList<Stocks>();

	private void addStock() {
		System.out.println("Enter the number of Stocks");
		int n = sc.nextInt();
		double totalvalue = 0;
		double value = 0;

		List<Stocks> temp = StockList.getList();
		for (int i = 0; i < n; i++) {
			Stocks stock = new Stocks();
			System.out.println("Enter the name of share :");
			stock.setStockName(sc.next());

			System.out.println("Enter the number of Share : ");
			stock.setNumberOfShare(sc.nextInt());

			System.out.println("Enter the Share Price");
			stock.setSharePrice(sc.nextDouble());

			value = stock.getNumberOfShare() * stock.getSharePrice();

			StockList.setTotalvalue(value);

			StockList.setList(temp);

			totalvalue = totalvalue + value;

			portfolio.add(stock);
			System.out.println(portfolio);
			System.out.println("Stock Added Successfully ");
		}

		StockList.setTotalvalue(totalvalue);

	}

	public void printStock() {
		List<Stocks> temp = StockList.getList();
		for (Stocks stocks : temp) {
			System.out.println(stocks);
		}
		System.out.println("Total value of stock : " + StockList.getTotalvalue());
	}

	public static void main(String[] args) {
		StockPortfolio sp = new StockPortfolio();
		int choice = 0;
		while (choice < 3) {
			System.out.println("Enter your choice \\n 1: Add Stock \\n 2: Add Total Value Of the Stocks");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sp.addStock();
				break;
			case 2:
				sp.printStock();
				break;
			default:
				break;
			}
		}

	}

}
