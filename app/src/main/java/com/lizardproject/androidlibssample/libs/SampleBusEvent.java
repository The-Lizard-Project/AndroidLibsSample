package com.lizardproject.androidlibssample.libs;

public class SampleBusEvent {

	private final String text;

	public SampleBusEvent(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}