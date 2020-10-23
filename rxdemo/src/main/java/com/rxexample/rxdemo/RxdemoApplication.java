package com.rxexample.rxdemo;

import io.reactivex.Flowable;


public class RxdemoApplication {

	public static void main(String[] args) {
		 Flowable.just("Hello World!").subscribe(System.out::println);
		
	}

}
