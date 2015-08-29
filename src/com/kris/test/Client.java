package com.kris.test;

import com.kris.observer.ConcreteObserver;
import com.kris.observer.Observer;
import com.kris.subject.ConcreteSubject;

public class Client {

	public static void main(String[] args) {

		Observer observer=new ConcreteObserver();
		ConcreteSubject subject=new ConcreteSubject();
		ConcreteSubject subject2=new ConcreteSubject();
		subject.attach(observer);
		subject2.attach(observer);
		
		//subject.attach(observer2);
		subject.setSubjectState("开始下载!");
		subject2.setSubjectState("开始下载!");
	}

}
