package com.lizardproject.androidlibssample.libs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.lizardproject.androidlibssample.R;
import com.squareup.otto.Bus;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;

public class SampleLibsFragment extends Fragment {

	@InjectView(R.id.text)
	protected TextView text;
	@InjectView(R.id.list)
	protected ListView list;

	private Bus bus = EventBusProvider.getInstance();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_sample, container, false);
		ButterKnife.inject(this, view);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		text.setText("Sample text in Fragment");

		list.setAdapter(new SampleLibsListAdapter(getActivity(), Arrays.asList("Item1", "Item2", "Item3")));
	}

	@OnItemClick(R.id.list)
	protected void onListItemClicked(int position) {
		String text = ((SampleLibsListAdapter) list.getAdapter()).getItem(position);
		bus.post(new SampleBusEvent(text));
	}
}