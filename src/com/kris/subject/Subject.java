package com.kris.subject;

import java.util.ArrayList;
import java.util.List;

import com.kris.observer.Observer;

/**
 *被观察的目标对象 提供注册和解注册方法
 * @author kris
 * 2015-08-25 23:38:51
 */
public class Subject {
	/**
	 * 用来保存注册的观察者对象
	 */
	private List<Observer> observers=new ArrayList<Observer>();
	/**
	 * 注册观察者对象
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	/**
	 * 删除观察者对象
	 * @param observer
	 */
	public void detach(Observer observer){
		observers.remove(observer);
	}

	public void notifyObservers(){
		for(Observer observer:observers){
			observer.update(this);
		}
	}
}
