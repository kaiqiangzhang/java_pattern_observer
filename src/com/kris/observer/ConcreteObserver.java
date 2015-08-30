package com.kris.observer;

import com.kris.subject.ConcreteSubject;
import com.kris.subject.Subject;

public class ConcreteObserver implements Observer {

	/**
	 * 观察者的状态
	 * 拉模型
	 */
	private String observerState;
	@Override
	public void update(Subject subject) {
		observerState=((ConcreteSubject)subject).getSubjectState();
		System.out.println("观察者："+this.hashCode()+"收到目标（"+subject.hashCode()+")的状态为："+observerState);
	}
}
