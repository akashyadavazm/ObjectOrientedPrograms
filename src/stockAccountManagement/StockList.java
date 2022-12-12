package stockAccountManagement;

import java.util.*;

public class StockList {
	private static List<Stocks> list = new ArrayList<Stocks>();
	private static double totalvalue;

	public static List<Stocks> getList() {
		return list;
	}

	public static void setList(List<Stocks> list) {
		StockList.list = list;
	}

	public static double getTotalvalue() {
		return totalvalue;
	}

	public static void setTotalvalue(double totalvalue) {
		StockList.totalvalue = totalvalue;
	}

}
