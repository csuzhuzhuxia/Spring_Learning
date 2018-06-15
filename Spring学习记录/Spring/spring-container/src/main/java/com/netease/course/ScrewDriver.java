package com.netease.course;

import javax.annotation.Resource;

public class ScrewDriver {
	@Resource
	private Header header;
	
	public void use() {
		System.out.println("Use header: " + header.getInfo());
		header.doWork();
	}
}
