package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F07 {	
 
	/*
	 * How many stocks have a yield greater than 5%?
	 * The answer is 41
	 * 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();
		 long count = list.stream()
		     .filter(e -> e.getDividendYield() > .05 )
		     .map( e -> {
		    	 Map<String,Object> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());
		    	 map.put("frequency", e.getDividendFrequence());
		    	 map.put("dividendYield", e.getDividendYield());	
		    	 return map;
		     })
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);
	 }
}
