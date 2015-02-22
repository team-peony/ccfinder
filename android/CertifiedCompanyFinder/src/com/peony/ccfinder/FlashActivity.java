package com.peony.ccfinder;

import java.util.Timer;
import java.util.TimerTask;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.content.Intent;

@EActivity(R.layout.activity_flash)
public class FlashActivity extends Activity {
	Timer timer = new Timer();
	
	
	@AfterViews
	public void onCreated() {
		startMainActivityDelayed();
	}
	
	private void startMainActivityDelayed() {
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, 3000);
	}
	
	public void onBackPressed() {
		timer.cancel();
	}
}
