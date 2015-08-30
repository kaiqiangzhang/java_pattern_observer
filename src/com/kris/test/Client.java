package com.kris.test;

import com.kris.observer.ConcreteObserver;
import com.kris.observer.Observer;
import com.kris.pattern.innerjava.NewsPaper;
import com.kris.pattern.innerjava.Reader;
import com.kris.subject.ConcreteSubject;

public class Client {

	/**
	 * 1.目标和观察者之间的关系
	 *     一对多
	 *  2.单向依赖
	 *      只有观察者依赖与目标，目标不会依赖于观察者
	 * @param args
	 */
	public static void main(String[] args) {

		Observer observer=new ConcreteObserver();
		Observer observer2=new ConcreteObserver();
		
		ConcreteSubject subject=new ConcreteSubject();
		//ConcreteSubject subject2=new ConcreteSubject();
		subject.attach(observer);
		subject.attach(observer2);
		//subject2.attach(observer);
		
		//subject.attach(observer2);
		subject.setSubjectState("开始下载!");
		//subject2.setSubjectState("开始下载!");
		
		System.out.println("测试java自带的观察者模式");
		//创建一个报纸，作为被观察者
		NewsPaper subjectNew=new NewsPaper();
		//创建阅读者，也就是观察者
		Reader observer1=new Reader();
		observer1.setName("zkq");
		Reader observer22=new Reader();
		observer22.setName("kris");
		
		subjectNew.addObserver(observer1);
		subjectNew.addObserver(observer22);
		
		//出版报纸
		subjectNew.setContent("头条：2015年9月3号 首都大阅兵");
	}

}
