package com.demo.wsclient;

public class Main {

	public static void main(String[] args) {
		QqOnlineWebService service = new QqOnlineWebService();
		System.out.println(service.getQqOnlineWebServiceSoap().qqCheckOnline("54242714"));
	}

}
