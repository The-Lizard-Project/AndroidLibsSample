package com.lizardproject.androidlibssample.normal;

import android.os.Parcel;
import android.os.Parcelable;

public class SampleNormalParcelableModel implements Parcelable {

	private double sampleDouble;
	private int sampleInt;

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeDouble(this.sampleDouble);
		dest.writeInt(this.sampleInt);
	}

	public SampleNormalParcelableModel(Parcel source) {
		this.sampleDouble = source.readDouble();
		this.sampleInt = source.readInt();
	}

	public static final Parcelable.Creator<SampleNormalParcelableModel> CREATOR
			= new Parcelable.Creator<SampleNormalParcelableModel>() {

		@Override
		public SampleNormalParcelableModel createFromParcel(Parcel source) {
			return new SampleNormalParcelableModel(source);
		}

		@Override
		public SampleNormalParcelableModel[] newArray(int size) {
			return new SampleNormalParcelableModel[size];
		}
	};
}