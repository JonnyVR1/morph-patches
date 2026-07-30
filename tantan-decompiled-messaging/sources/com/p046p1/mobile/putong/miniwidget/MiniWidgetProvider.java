package com.p046p1.mobile.putong.miniwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.tantanapp.common.utils.CrashHelper;
import p149l.qib0;
import p149l.y8i0;
import p149l.yl5;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MiniWidgetProvider extends AppWidgetProvider {
    public static final String KEY_TYPE = "type";
    public static final String TYPE_UPDATE = "update";
    public static final String UPDATE_ACTION = "android.appwidget.action.APPWIDGET_UPDATE";
    public static boolean isAutoAddWidget = false;

    private void onWidgetUpdate(Context context) {
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) MiniWidgetProvider.class)).length <= 0) {
            return;
        }
        yl5 yl5Var = qib0.f154714c0;
        if (yl5Var == null || !yl5Var.signedIn_()) {
            MiniWidgetService.updateViewsNotLogin(context);
            return;
        }
        try {
            JobIntentService.enqueueWork(context, (Class<?>) MiniWidgetService.class, 100, new Intent(context, (Class<?>) MiniWidgetService.class));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        y8i0.m213379a("android.appwidget.action.APPWIDGET_UPDATE onReceive");
        if (UPDATE_ACTION.equals(intent.getAction()) && "update".equals(intent.getStringExtra("type"))) {
            onWidgetUpdate(context);
        }
        if (isAutoAddWidget && (intent.getAction().equals("android.appwidget.action.APPWIDGET_ENABLED") || intent.getAction().equals(UPDATE_ACTION))) {
            isAutoAddWidget = false;
            zvf0.m220396r("e_widget_add_alert_confirm", "p_widget_add_alert");
        }
        y8i0.m213380b();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        y8i0.m213379a("android.appwidget.action.APPWIDGET_UPDATE onUpdate");
        onWidgetUpdate(context);
        y8i0.m213380b();
    }
}
