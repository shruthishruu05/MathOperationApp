package com.bridgelabz.mathoperationapp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
public class NumberPlayList {
	public static void main(String[] args) {
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int index=0 ; index<5 ; index++)
			myNumberList.add(index);
		//Using Iterator
		Iterator<Integer> iterator = myNumberList.iterator();
		while(iterator.hasNext()) {
			Integer eachInteger = iterator.next();
			System.out.println("Value: "+eachInteger);
		}
		//Traversing with Consumer interface 
		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Value of list using class: "+t);
			}
		}
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		//Traversing with Anonymous Consumer interface 
		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("anonymous class Implementation Value: "+t);
			}
		});
		//Explicit Lambda Function
		Consumer<Integer> myListAction = n -> {
			System.out.println("Explicit Lambda Implementation Value: "+n);
		};
		myNumberList.forEach(myListAction);
		//Implicit Lambda Function
		myNumberList.forEach(n ->{
			System.out.println("Implicit Lambda Implementation Value: "+n);
		});
		//Implicit function to print double value
		Function<Integer, Double> toDoubleFunction =Integer::doubleValue;
		myNumberList.forEach(n -> {
			System.out.println("Value :" +toDoubleFunction.apply(n));
		});
		

	}

}