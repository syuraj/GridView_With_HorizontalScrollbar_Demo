package com.siristechnology.gridviewwithhorizontalscrollbardemo.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class GridArrayAdapter extends ArrayAdapter<AppInfo> {
    private final Context context;
    List<AppInfo> items;

    public GridArrayAdapter(Context context, List<AppInfo> items) {
        super(context, R.layout.app_grid_item, items);

        this.context = context;
        this.items = items;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View appView = inflater.inflate(R.layout.app_grid_item, parent, false);

        AppInfo app = this.getItem(position);
        ((ImageView) appView.findViewById(R.id.app_icon)).setImageDrawable(app.icon);
        ((TextView) appView.findViewById(R.id.app_name)).setText(app.name);

        return appView;
    }
}
