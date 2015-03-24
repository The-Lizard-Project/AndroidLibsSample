package com.lizardproject.androidlibssample.normal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.lizardproject.androidlibssample.R;

import java.util.Arrays;

public class SampleNormalActivity extends Activity {

	private Button button;
	private ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);

		button = (Button) findViewById(R.id.button);
		list = (ListView) findViewById(R.id.list);

		list.setAdapter(new SampleNormalListAdapter(this, Arrays.asList("SampleText1", "SampleText2", "SampleText3")));

		getFragmentManager().beginTransaction().add(R.id.fragment, new SampleNormalFragment(), "tag").commit();
	}
}