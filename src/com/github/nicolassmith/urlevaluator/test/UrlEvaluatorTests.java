package com.github.nicolassmith.urlevaluator.test;

public class UrlEvaluatorTests extends UrlEvaluatorActivityUnitTest {
	public void testYOUTUBE() throws Exception{
		shortUrlTest(
				"http://youtu.be/I4cSVnqGmOc",
				"http://www.youtube.com/watch?v=I4cSVnqGmOc&feature=youtu.be");		
	}
	
	public void testTCO() throws Exception{
		shortUrlTest(
				"http://t.co/iEguCemYmH",
				"http://n.pr/1csD42c");		
	}
	
	public void testNPR() throws Exception{
		shortUrlTest(
				"http://n.pr/1csD42c",
				"http://www.npr.org/2014/01/04/259659117/npr-music-looks-ahead-to-2014?sc=tw&cc=share");
	}
	
	public void testTHNDRIT() throws Exception{
		shortUrlTest(
				"http://thndr.it/1aj3y76",
				"http://www.mozilla.org/firefox/os?utm_source=mozilla&utm_medium=Thunderclap&utm_campaign=Firefox_OS_Thunderclap");
	}
	
	public void testTINYURL() throws Exception{
		shortUrlTest(
				"http://tinyurl.com/ow8c8gk",
				"http://www.yelp.com/biz/food-4-less-los-angeles-7");
	}
	
	public void testOTHERTINYURL() throws Exception{
		shortUrlTest(
				"http://tinyurl.com/8wufanv",
				"https://bitly.com/shorten/");
	}
	
	public void testSGOOGL() throws Exception{
		shortUrlTest(
				"https://goo.gl/maps/C1IEt",
				"https://www.google.com/maps/preview#!q=bonneville+belgium&data=!1m4!1m3!1d16902!2d5.0382403!3d50.4746591!4m15!2m14!1m13!1s0x47c1a3f3c3fe4a41%3A0xa26cdfa81ada2117!3m8!1m3!1d26427!2d-118.1905105!3d34.1123925!3m2!1i1024!2i768!4f13.1!4m2!3d50.4719693!4d5.0369958");
	}
	
	public void testGOOGL() throws Exception{
		shortUrlTest(
				"http://goo.gl/K5ILw",
				"http://www.example.com/");
	}
	
	public void testBITLY() throws Exception{
		shortUrlTest(
				"http://bit.ly/W0Etsu",
				"https://maps.google.com/maps?q=Cayucos,+San+Luis+Obispo,+California&hl=en&sll=37.0625,-95.677068&sspn=52.418008,78.574219&geocode=FT_QHAIdI1XL-A&hnear=Cayucos,+San+Luis+Obispo,+California&t=m&z=13");
	}
	
	public void testGITIO() throws Exception{
		shortUrlTest(
				"http://git.io/lNEtmA", 
				"https://github.com/nicolassmith/urlevaluator/issues/9");
	}
	
}
