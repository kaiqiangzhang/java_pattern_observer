package com.kris.subject;

public class ConcreteSubject extends Subject{
	/**
	 * 存储目标对象的状态
	 */
	private String subjectState;
	public void setSubjectState(String subjectState){
		this.subjectState=subjectState;
		//当自己的状态发生了变化通知各个观察者
		this.notifyObservers();
	}
	
	public String getSubjectState(){
		return this.subjectState;
	}

}
