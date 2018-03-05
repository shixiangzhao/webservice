package com.shixzh.webservice.service;

import javax.jws.WebMethod;

/**
 * 简单来说,webservice就是远程调用技术,也叫XML Web Service
 * WebService是一种可以接收从Internet或者Intranet上的其它系统中传递过来的请求，轻量级的独立的通讯技术。通过SOAP在Web上提供的软件服务，使用WSDL文件进行说明，并通过UDDI进行注册。
 * 
 * XML：(Extensible Markup Language)扩展型可标记语言。面向短期的临时数据处理、面向万维网络，是Soap的基础。
 * 
 * Soap：(Simple Object Access Protocol)简单对象存取协议。是XML Web Service
 * 的通信协议。当用户通过UDDI找到你的WSDL描述文档后，他通过可以SOAP调用你建立的Web服务中的一个或多个操作。SOAP是XML文档形式的调用方法的规范，它可以支持不同的底层接口，像HTTP(S)或者SMTP。
 * 
 * WSDL：(Web Services Description Language) WSDL 文件是一个 XML 文档，用于说明一组 SOAP
 * 消息以及如何交换这些消息。大多数情况下由软件自动生成和使用。
 * 
 * @author Shixiang
 *
 */
@javax.jws.WebService
public interface WebService {

	@WebMethod
	String sayHello(String name);
}
