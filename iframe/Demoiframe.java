package com.tka.iframe;

import com.tka.config.Config;

public class Demoiframe {

	public static void main(String[] args) {
		
		Config obj = new Config();
		obj.browsersetting("https://www.qa.jbktest.com/");
		obj.accessiFrame();

	}

}
