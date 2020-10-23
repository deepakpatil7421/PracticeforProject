package com.rxexample.rxdemo;

import java.util.concurrent.TimeUnit;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ObservableTester {

	public static void main(String[] args) throws InterruptedException {
		Single<String> testSingle = Single.just("Hello world");

		Disposable disposable = testSingle.delay(2, TimeUnit.SECONDS, Schedulers.io())
				.subscribeWith(new DisposableSingleObserver<String>() {

					@Override
					public void onError(Throwable e) {
						e.printStackTrace();
					}

					@Override
					public void onSuccess(String value) {
						System.out.println(value);
					}
				});
		Thread.sleep(3000);
		// start observing
		disposable.dispose();
	}
}
