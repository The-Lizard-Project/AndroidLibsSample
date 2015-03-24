package com.lizardproject.androidlibssample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.lizardproject.androidlibssample.libs.SampleLibsActivity;
import com.lizardproject.androidlibssample.normal.SampleNormalActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.inject(this);
	}

	@OnClick(R.id.normal_button)
	protected void onNormalButtonClicked() {
		startActivity(new Intent(getApplicationContext(), SampleNormalActivity.class));
	}

	@OnClick(R.id.libs_button)
	protected void onLibsButtonClicked() {
		startActivity(new Intent(getApplicationContext(), SampleLibsActivity.class));
	}
}