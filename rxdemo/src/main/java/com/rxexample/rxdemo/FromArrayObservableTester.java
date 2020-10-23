package com.rxexample.rxdemo;

import io.reactivex.Observable;

public class FromArrayObservableTester {
	public static void main(String[] args) { 
	      String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
	      final StringBuilder result = new StringBuilder();
	      Observable<String> observable = Observable.fromArray(letters);
	      observable
	         .map(String::toUpperCase)
	         .subscribe( letter -> result.append(letter));
	      System.out.println(result);
	      Observable<String> observable2 = Observable.fromArray(letters);
	      observable
	         .take(2)
	         .subscribe( letter -> result.append(letter));
	      System.out.println(result);
	      
	   }
}
