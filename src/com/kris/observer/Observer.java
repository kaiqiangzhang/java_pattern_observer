package com.kris.observer;

import com.kris.subject.Subject;

public interface Observer {
	/**
	 * 更新接口
	 * @param subject 传入目标对象，方便获取相应的目标对象的状态
	 */
	void update(Subject subject);
}
