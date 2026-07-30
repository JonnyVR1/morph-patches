package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.badge.BadgeDrawable;
import p153l.b5r0;
import p153l.fwq0;
import p153l.ouq0;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationClickedActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private Handler f62389a;

    /* JADX INFO: renamed from: b */
    private BroadcastReceiver f62390b;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.NotificationClickedActivity$a */
    public class RunnableC14862a implements Runnable {
        public RunnableC14862a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ouq0.m169380D("clicked activity finish by timeout.");
            NotificationClickedActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86456a(Intent intent) {
        try {
            if (intent == null) {
                ouq0.m169379C("PushClickedActivity", "clicked activity start service, missing intent");
                return;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
            if (intent2 == null) {
                ouq0.m169379C("PushClickedActivity", "clicked activity start service, newIntent is null");
                return;
            }
            intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent2.putExtra("is_clicked_activity_call", true);
            ouq0.m169394n("PushClickedActivity", "clicked activity start service.");
            startService(intent2);
        } catch (Exception e) {
            ouq0.m169397q(e);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = BadgeDrawable.TOP_START;
        window.setAttributes(attributes);
        Handler handler = new Handler();
        this.f62389a = handler;
        handler.postDelayed(new RunnableC14862a(), 3000L);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.mipush.sdk.NotificationClickedActivity.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ouq0.m169403w("clicked activity finish by normal.");
                NotificationClickedActivity.this.finish();
            }
        };
        this.f62390b = broadcastReceiver;
        try {
            b5r0.m102624d(this, broadcastReceiver, intentFilter, fwq0.m127842a(this), null, 4);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f62389a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.f62390b);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        m86456a(getIntent());
    }
}
