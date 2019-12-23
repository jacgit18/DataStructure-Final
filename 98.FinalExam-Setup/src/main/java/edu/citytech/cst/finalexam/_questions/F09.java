package edu.citytech.cst.finalexam._questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F09 {	
 
	/* 
	 * What is the most expensive stock, see the price attribute?	 
	 * */
	 public static void main(String[] args) {		 
//		 List<Stock> list = new StockDAO().findAll();
//		Predicate<Stock> SymEx = e ->  e.compareTo(e) >= 0;
//
//		 long count = list.stream()
////		     .filter(SymEx).max(Comparator.comparing(float::getPrice))
//		     .map( e -> {
////		    	 Map<String,float> map = new HashMap<>();
//		    	 Map<String,String> map = new HashMap<>();
////		    	 map.put("price", e.getPrice());	
//		    	 return map;
//		     })
//		     .peek(System.out::println)
//		     .count();
//		 
//		 System.out.println("count: " + count);
		 
 List<Stock> list = new StockDAO().findAll();
		 
		 
//       list.stream()
//         .filter(SymEx)
//         .sorted()
//         .limit(1)		     .forEach(System.out::println);

		 	

		 
	 }
}
