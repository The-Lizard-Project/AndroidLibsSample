package com.lizardproject.androidlibssample.libs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.lizardproject.androidlibssample.R;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class SampleLibsActivity extends Activity {

	@InjectView(R.id.list)
	protected ListView list;
	@InjectView(R.id.text)
	protected TextView text;

	private Bus bus = EventBusProvider.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
		ButterKnife.inject(this);

		list.setAdapter(new SampleLibsListAdapter(this, Arrays.asList("SampleText1", "SampleText2", "SampleText3")));

		getFragmentManager().beginTransaction().add(R.id.fragment, new SampleLibsFragment(), "tag").commit();
	}

	@OnClick(R.id.button)
	protected void onButtonClicked() {
		Toast.makeText(this, "OnClickListener called by Butterknife", Toast.LENGTH_SHORT).show();
	}

	@OnItemClick(R.id.list)
	protected void onListItemClicked(int position) {
		Toast.makeText(this, position + "\titem clicked - OnItemClickListener called by Butterknife", Toast.LENGTH_SHORT).show();
	}

	@Subscribe
	public void onEventReceived(SampleBusEvent event) {
		text.setText("Event received - clicked item:\t" + event.getText());
	}

	@Override
	public void onResume() {
		super.onResume();
		bus.register(this);
	}

	@Override
	public void onPause() {
		super.onPause();
		bus.unregister(this);
	}
}