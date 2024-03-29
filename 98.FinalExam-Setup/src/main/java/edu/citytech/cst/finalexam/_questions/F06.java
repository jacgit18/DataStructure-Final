package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F06 {	
 
	/* 
	 * How many stocks have a net income billion dollars? 
	 * The net income field is a String, therefore search for the letter B for Billion 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();

		 long count = list.stream()
		     .filter(e -> e.getNetIncome().contains("B") )
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());
		    	 map.put("netIncome", e.getNetIncome());	
		    	 return map;
		     })
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);
	 }
}
