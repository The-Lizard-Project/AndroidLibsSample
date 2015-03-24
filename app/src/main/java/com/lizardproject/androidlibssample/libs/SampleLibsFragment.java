package com.lizardproject.androidlibssample.libs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lizardproject.androidlibssample.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SampleLibsFragment extends Fragment {

	@InjectView(R.id.text)
	protected TextView text;

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
	}
}