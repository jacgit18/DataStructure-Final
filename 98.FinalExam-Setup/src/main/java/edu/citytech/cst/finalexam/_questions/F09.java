package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F09 {	
 
	/* 
	 * What is the most expensive stock, see the price attribute?	 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();
		 long count = list.stream()
		     .filter(e -> e.getDividendFrequence().equals("Quarterly") )
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());
		    	 map.put("frequency", e.getDividendFrequence());	
		    	 return map;
		     })
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);
	 }
}
