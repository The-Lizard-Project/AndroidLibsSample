package com.lizardproject.androidlibssample.normal;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lizardproject.androidlibssample.R;

public class SampleNormalFragment extends Fragment {

	private TextView text;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_sample, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		text = (TextView) getActivity().findViewById(R.id.text);
		text.setText("Sample text in Fragment");
	}
}