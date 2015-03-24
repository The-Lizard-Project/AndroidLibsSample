package com.lizardproject.androidlibssample.normal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

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

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(SampleNormalActivity.this, "Normal OnClickListener", Toast.LENGTH_SHORT).show();
			}
		});

		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(SampleNormalActivity.this, position + "\titem clicked", Toast.LENGTH_SHORT).show();
			}
		});
	}
}