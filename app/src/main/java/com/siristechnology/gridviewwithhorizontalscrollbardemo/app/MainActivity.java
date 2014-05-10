package com.siristechnology.gridviewwithhorizontalscrollbardemo.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

public class MainActivity extends Activity implements FetchInstalledAppsTask.FetchInstalledAppsTaskListener {
    private List<AppInfo> apps;
    protected GridView aGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiateInstalledAppsFetch();
    }

    private void initiateInstalledAppsFetch() {
        FetchInstalledAppsTask fetchTask = new FetchInstalledAppsTask(this);
        fetchTask.execute(1);
    }

    public void handleInstalledAppsFetch(List<AppInfo> apps) {
        this.apps = apps;

        setUpGridView();
    }

    public void setUpGridView() {
        aGridView = (GridView) this.findViewById(R.id.app_gridview);

        aGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                AppInfo selectedApp = apps.get(position);
                selectedApp.launch(getApplicationContext());
            }
        });

        GridArrayAdapter gAdapter = new GridArrayAdapter(this, apps);
        aGridView.setAdapter(gAdapter);

        int cols = (int) Math.ceil((double) this.apps.size() / 3);
        aGridView.setNumColumns(cols);
    }
}
