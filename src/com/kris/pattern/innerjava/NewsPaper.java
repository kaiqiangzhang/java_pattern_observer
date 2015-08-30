package com.kris.pattern.innerjava;

import java.util.Observable;

public class NewsPaper extends Observable{
	/**
	 * 报纸的具体内容
	 */
	private String content;

	/**
	 * 获取报纸具体内容
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 有新报纸出版
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
		//在java自带的观察者模式中，此代码不可缺少
		this.setChanged();
		//主动通知
		this.notifyObservers(this.content);//推的方式
		this.notifyObservers();//拉得方式
	}
	

}
