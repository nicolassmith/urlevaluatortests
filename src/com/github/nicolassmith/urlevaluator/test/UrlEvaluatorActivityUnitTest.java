package com.github.nicolassmith.urlevaluator.test;

import com.github.nicolassmith.urlevaluator.UrlEvaluatorActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.test.ActivityUnitTestCase;

public class UrlEvaluatorActivityUnitTest extends ActivityUnitTestCase<UrlEvaluatorActivity> {

	private static final String TEST_FLAG = "thisisonlyatest";

	private static final int SLEEP_MILLISECONDS = 100;

	private Context context;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		context = getInstrumentation().getContext();
		// make an intent with the input url
	}

	public UrlEvaluatorActivityUnitTest() {
		super(UrlEvaluatorActivity.class);
	}
	
	protected void shortUrlTest(String inputUrl,String expectedUrl) throws InterruptedException {
		startEvaluatorActivity(inputUrl);
		waitForEvaluatedActivityStart();
		// an Intent was started
		assertEvaluatedActivityUrl(expectedUrl);
	}

	private void startEvaluatorActivity(String inputUrl) {
		Intent intent = new Intent(context, UrlEvaluatorActivity.class);
		intent.setData(Uri.parse(inputUrl));
		intent.putExtra(TEST_FLAG, true);
		startActivity(intent, null, null);
	}

	private void waitForEvaluatedActivityStart() throws InterruptedException {
		while(getStartedActivityIntent()==null){
			// wait for it
			Thread.sleep(SLEEP_MILLISECONDS);
		}
	}

	private void assertEvaluatedActivityUrl(String expectedUrl) {
		Intent startedIntent = getStartedActivityIntent();
		String returnedUrl = startedIntent.getData().toString();
		
		assertEquals("wrong url returned",expectedUrl,returnedUrl);
	}

}
