package ch.zhaw.bait17.audio_signal_processing_toolbox.ui.custom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Arrays;

import ch.zhaw.bait17.audio_signal_processing_toolbox.ApplicationContext;
import ch.zhaw.bait17.audio_signal_processing_toolbox.R;

/**
 * @author georgrem, stockan1
 */

public class ViewAdapter extends BaseAdapter {

    private String[] viewNames;
    private LayoutInflater inflater;

    public ViewAdapter(String[] viewNames) {
        this.viewNames = Arrays.copyOf(viewNames, viewNames.length);
        inflater = LayoutInflater.from(ApplicationContext.getAppContext());
    }

    @Override
    public int getCount() {
        return viewNames.length;
    }

    @Override
    public Object getItem(int position) {
        return viewNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.view_spinner_items, null);
        TextView names = (TextView) view.findViewById(R.id.textView_name);
        names.setText(viewNames[position]);
        return view;
    }
}