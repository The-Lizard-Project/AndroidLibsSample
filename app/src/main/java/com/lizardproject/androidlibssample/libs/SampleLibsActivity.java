package com.lizardproject.androidlibssample.libs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.lizardproject.androidlibssample.R;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SampleLibsActivity extends Activity {

	@InjectView(R.id.button)
	protected Button button;
	@InjectView(R.id.list)
	protected ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
		ButterKnife.inject(this);

		list.setAdapter(new SampleLibsListAdapter(this, Arrays.asList("SampleText1", "SampleText2", "SampleText3")));

		getFragmentManager().beginTransaction().add(R.id.fragment, new SampleLibsFragment(), "tag").commit();
	}
}