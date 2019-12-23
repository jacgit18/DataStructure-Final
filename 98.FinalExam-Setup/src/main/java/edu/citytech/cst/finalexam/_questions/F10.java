package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F10 {	
 
	/* 
	 * How Many Stocks are in this list?	 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();

		 long count = list.stream().distinct()
		  
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);
		 
		 

	 }
}
