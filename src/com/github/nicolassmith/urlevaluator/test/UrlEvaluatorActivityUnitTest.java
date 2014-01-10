package com.github.nicolassmith.urlevaluator.test;

import com.github.nicolassmith.urlevaluator.UrlEvaluatorActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.test.ActivityUnitTestCase;

public class UrlEvaluatorActivityUnitTest extends ActivityUnitTestCase<UrlEvaluatorActivity> {

	private static final int SLEEP_MILLISECONDS = 100;

	private Context context;

	String inputTestUrl = "http://youtu.be/I4cSVnqGmOc";
	String expectedResultUrl = "http://www.youtube.com/watch?v=I4cSVnqGmOc&feature=youtu.be";
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		context = getInstrumentation().getContext();
		// make an intent with the input url
	}

	public UrlEvaluatorActivityUnitTest() {
		super(UrlEvaluatorActivity.class);
	}
	
	public void testShortUrls() throws Exception{
		
		
		startEvaluatorActivity(inputTestUrl);
		
		while(getStartedActivityIntent()==null){
			// wait for it
			Thread.sleep(SLEEP_MILLISECONDS);
		}
		
		// an Intent was started
		assertStartedActivityUrl(expectedResultUrl);
	}

	private void assertStartedActivityUrl(String expectedUrl) {
		Intent startedIntent = getStartedActivityIntent();
		String returnedUrl = startedIntent.getData().toString();
		
		assertEquals("wrong url returned",expectedUrl,returnedUrl);
	}

	private void startEvaluatorActivity(String inputUrl) {
		Intent intent = new Intent(context, UrlEvaluatorActivity.class);
		intent.setData(Uri.parse(inputUrl));
		intent.putExtra("thisisonlyatest", true);
		startActivity(intent, null, null);
	}

}
