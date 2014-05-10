package com.siristechnology.gridviewwithhorizontalscrollbardemo.app;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;

public class AppInfo {
    public Integer id;
    public String name;
    public Drawable icon;
    public int iconResourceId;
    public String packageName;
    public boolean recentlyused;
    public Integer timesUsed;

    public void launch(Context context) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        context.startActivity(launchIntent);
    }
}
