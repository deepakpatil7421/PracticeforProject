package com.rxexample.rxdemo;

import io.reactivex.Observable;

public class SubscribeDemo {
	public static void main(String[] args) {    
	      String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
	      final StringBuilder result = new StringBuilder();
	      Observable<String> observable = Observable.fromArray(letters);
	      observable.subscribe( letter -> result.append(letter));
	      System.out.println(result);
	   }

}
