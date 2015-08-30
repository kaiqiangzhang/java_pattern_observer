package com.kris.pattern.innerjava;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer{
	
	/**
	 * 读者的姓名
	 */
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void update(Observable o, Object arg) {

		//用推的方式获取数据
		System.out.println(name+"收到推过来的报纸内容"+arg);
		//用拉得方式获取数据
		System.out.println(name+"收到拉过来的报纸内容"+((NewsPaper)o).getContent());
	}

}
