package com.lizardproject.androidlibssample.libs;

import com.squareup.otto.Bus;

public class EventBusProvider {

	private static final Bus BUS = new Bus();

	private EventBusProvider() {
	}

	public static Bus getInstance() {
		return BUS;
	}
}