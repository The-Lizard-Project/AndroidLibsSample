package com.lizardproject.androidlibssample.libs;

import android.app.Fragment;

import java.util.ArrayList;

import hrisey.InstanceState;

public class SampleLibsHriseyFragment extends Fragment {

	@InstanceState
	private int sampleInt;
	@InstanceState
	private SampleLibsParcelableModel sampleParcelable;
	@InstanceState
	private ArrayList<String> sampleStrings;
}