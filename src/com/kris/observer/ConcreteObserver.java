package com.kris.observer;

import com.kris.subject.ConcreteSubject;
import com.kris.subject.Subject;

public class ConcreteObserver implements Observer {

	/**
	 * 观察者的状态
	 */
	private String observerState;
	@Override
	public void update(Subject subject) {
		observerState=((ConcreteSubject)subject).getSubjectState();
		System.out.println("目标"+subject.hashCode()+":"+observerState);
	}
}
