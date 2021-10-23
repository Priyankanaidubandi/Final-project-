package com.PostalService.adapterPattern;

public class PostalServiceMain {
	public static void main(String[] args) {
		PostalConcrete post = new PostalConcrete();

		post.orderName("LETTER");
		post.orderName("TRANSRIPTS");
		post.orderName("ELECTRICITYBILL");
		post.orderName("IPHONE50");
	}
}
