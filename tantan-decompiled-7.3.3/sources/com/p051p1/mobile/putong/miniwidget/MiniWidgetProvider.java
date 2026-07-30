package com.p051p1.mobile.putong.miniwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.tantanapp.common.utils.CrashHelper;
import p153l.bn5;
import p153l.i4g0;
import p153l.uqb0;
import p153l.yhi0;

/* JADX INFO: loaded from: classes10.dex */
public class MiniWidgetProvider extends AppWidgetProvider {
    public static final String KEY_TYPE = "type";
    public static final String TYPE_UPDATE = "update";
    public static final String UPDATE_ACTION = "android.appwidget.action.APPWIDGET_UPDATE";
    public static boolean isAutoAddWidget = false;

    private void onWidgetUpdate(Context context) {
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) MiniWidgetProvider.class)).length <= 0) {
            return;
        }
        bn5 bn5Var = uqb0.f180397c0;
        if (bn5Var == null || !bn5Var.signedIn_()) {
            MiniWidgetService.updateViewsNotLogin(context);
            return;
        }
        try {
            JobIntentService.enqueueWork(context, (Class<?>) MiniWidgetService.class, 100, new Intent(context, (Class<?>) MiniWidgetService.class));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        yhi0.m215967a("android.appwidget.action.APPWIDGET_UPDATE onReceive");
        if (UPDATE_ACTION.equals(intent.getAction()) && "update".equals(intent.getStringExtra("type"))) {
            onWidgetUpdate(context);
        }
        if (isAutoAddWidget && (intent.getAction().equals("android.appwidget.action.APPWIDGET_ENABLED") || intent.getAction().equals(UPDATE_ACTION))) {
            isAutoAddWidget = false;
            i4g0.m138520r("e_widget_add_alert_confirm", "p_widget_add_alert");
        }
        yhi0.m215968b();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        yhi0.m215967a("android.appwidget.action.APPWIDGET_UPDATE onUpdate");
        onWidgetUpdate(context);
        yhi0.m215968b();
    }
}
