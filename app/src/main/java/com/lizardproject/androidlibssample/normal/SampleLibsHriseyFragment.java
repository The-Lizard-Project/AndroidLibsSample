package com.lizardproject.androidlibssample.normal;

import android.app.Fragment;
import android.os.Bundle;

import java.util.ArrayList;

public class SampleLibsHriseyFragment extends Fragment {

	private static final String INT_KEY = "sampleInt";
	private static final String PARCELABLE_KEY = "myParcelable";
	private static final String STRINGS_KEY = "myStrings";

	private int sampleInt;
	private SampleNormalParcelableModel sampleParcelable;
	private ArrayList<String> sampleStrings;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null) {
			sampleInt = savedInstanceState.getInt(INT_KEY);
			sampleParcelable = savedInstanceState.getParcelable(PARCELABLE_KEY);
			sampleStrings = savedInstanceState.getStringArrayList(STRINGS_KEY);
		}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(INT_KEY, sampleInt);
		outState.putParcelable(PARCELABLE_KEY, sampleParcelable);
		outState.putStringArrayList(STRINGS_KEY, sampleStrings);
	}
}