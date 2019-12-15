package edu.citytech.cst.finalexam.model;


public class Stock implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String symbol, name, exchange, sector;
	private float price, dividendYield, annualPayout, payoutRatio;
	private String dividendFrequence;
	private String revenueActual, netIncome;
	private String category;	

	public Stock(String symbol, String name, String exchange, String sector, float price, float dividendYield,
			float annualPayout, float payoutRatio, String dividendFrequence, String netIncome) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.sector = sector;
		this.exchange = exchange;
		this.price = price;
		this.dividendYield = dividendYield;
		this.annualPayout = annualPayout;
		this.payoutRatio = payoutRatio;
		this.dividendFrequence = dividendFrequence;
		this.netIncome = netIncome;
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRevenueActual() {
		return revenueActual;
	}

	public void setRevenueActual(String revenueActual) {
		this.revenueActual = revenueActual;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public float getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(float dividendYield) {
		this.dividendYield = dividendYield;
	}

	public float getAnnualPayout() {
		return annualPayout;
	}

	public void setAnnualPayout(float annualPayout) {
		this.annualPayout = annualPayout;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDividendFrequence() {
		return dividendFrequence;
	}

	public void setDividendFrequence(String dividendFrequence) {
		this.dividendFrequence = dividendFrequence;
	}

	public float getPayoutRatio() {
		return payoutRatio;
	}

	public void setPayoutRatio(float payoutRatio) {
		this.payoutRatio = payoutRatio;
	}

	public String getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(String netIncome) {
		this.netIncome = netIncome;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", name=" + name + ", exchange=" + exchange + ", sector=" + sector
				+ ", price=" + price + ", dividendYield=" + dividendYield + ", annualPayout=" + annualPayout
				+ ", payoutRatio=" + payoutRatio + ", dividendFrequence=" + dividendFrequence + ", revenueActual="
				+ revenueActual + ", netIncome=" + netIncome + ", category=" +  category + "]";
	}
}
