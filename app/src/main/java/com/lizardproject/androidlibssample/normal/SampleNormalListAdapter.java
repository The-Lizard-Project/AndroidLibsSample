package com.lizardproject.androidlibssample.normal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lizardproject.androidlibssample.R;

import java.util.List;

public class SampleNormalListAdapter extends BaseAdapter {

	private final List<String> data;
	private final LayoutInflater inflater;

	public SampleNormalListAdapter(Context context, List<String> data) {
		this.data = data;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public String getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vh;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_sample_list, parent, false);
			vh = new ViewHolder(convertView);
			convertView.setTag(vh);
		} else {
			vh = (ViewHolder) convertView.getTag();
		}

		vh.text.setText(getItem(position));

		return convertView;
	}

	protected class ViewHolder {

		private TextView text;

		protected ViewHolder(View rootView) {
			text = (TextView) rootView.findViewById(R.id.text);
		}
	}
}