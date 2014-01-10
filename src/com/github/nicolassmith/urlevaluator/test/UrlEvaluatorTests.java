package com.github.nicolassmith.urlevaluator.test;

public class UrlEvaluatorTests extends UrlEvaluatorActivityUnitTest {
	public void testYOUTUBE() throws Exception{
		shortUrlTest("http://youtu.be/I4cSVnqGmOc","http://www.youtube.com/watch?v=I4cSVnqGmOc&feature=youtu.be");		
	}
	
	public void testTCO() throws Exception{
		shortUrlTest("http://t.co/iEguCemYmH","http://n.pr/1csD42c");		
	}
}
