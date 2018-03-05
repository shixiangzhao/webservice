package com.shixzh.webservice.service;

import javax.xml.ws.Endpoint;

public class WebServicePublish {

	//浏览器输入address?wsdl即可查看
	//wsimport -s  D:\workspace\2017\client11\src -keep http://localhost:8989/WS_Server/WebService?wsdl 
	//根据服务端生成的WSDL文件创建客户端支持代码
	public static void main(String[] args) {
		String address = "http://localhost:8989/WS_Server/WebService";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("Publish webservice success!");
	}
}
