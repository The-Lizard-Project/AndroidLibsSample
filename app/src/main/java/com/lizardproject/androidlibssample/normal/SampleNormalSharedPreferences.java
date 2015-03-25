package com.lizardproject.androidlibssample.normal;

import android.content.SharedPreferences;

public class SampleNormalSharedPreferences {

	private static final String FLOAT_KEY = "floatKey";
	private static final String INT_KEY = "intKey";

	private final SharedPreferences sharedPreferences;

	public SampleNormalSharedPreferences(SharedPreferences sharedPreferences) {
		this.sharedPreferences = sharedPreferences;
	}

	public float getFloat() {
		return sharedPreferences.getFloat(FLOAT_KEY, 0.0f);
	}

	public void setFloat(float floatToSave) {
		sharedPreferences.edit().putFloat(FLOAT_KEY, floatToSave).apply();
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

	public void setInt(int intToSave) {
		sharedPreferences.edit().putInt(INT_KEY, intToSave).apply();
	}

	public boolean containsInt() {
		return sharedPreferences.contains(INT_KEY);
	}

	public void removeInt() {
		sharedPreferences.edit().remove(INT_KEY).apply();
	}
}