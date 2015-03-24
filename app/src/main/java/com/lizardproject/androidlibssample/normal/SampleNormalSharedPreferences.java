package com.lizardproject.androidlibssample.normal;

import android.content.SharedPreferences;

public class SampleNormalSharedPreferences {

	private static final String FLOAT_KEY = "myFloat";
	private static final String INT_KEY = "myInt";

	private final SharedPreferences sharedPreferences;

	public SampleNormalSharedPreferences(SharedPreferences sharedPreferences) {
		this.sharedPreferences = sharedPreferences;
	}

	public float getFloat() {
		return sharedPreferences.getFloat(FLOAT_KEY, 0.0f);
	}

	public void setFloat(float myFloat) {
		sharedPreferences.edit().putFloat(FLOAT_KEY, myFloat).apply();
	}

	public boolean containsFloat() {
		return sharedPreferences.contains(FLOAT_KEY);
	}

	public void removeFloat() {
		sharedPreferences.edit().remove(FLOAT_KEY).apply();
	}

	public int getInt() {
		return sharedPreferences.getInt(INT_KEY, 1000);
	}

	public void setInt(int myInt) {
		sharedPreferences.edit().putInt(INT_KEY, myInt).apply();
	}

	public boolean containsInt() {
		return sharedPreferences.contains(INT_KEY);
	}

	public void removeInt() {
		sharedPreferences.edit().remove(INT_KEY).apply();
	}
}