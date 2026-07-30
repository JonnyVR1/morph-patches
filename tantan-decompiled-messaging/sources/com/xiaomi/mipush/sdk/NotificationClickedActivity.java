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
import p149l.ilq0;
import p149l.vvq0;
import p149l.zmq0;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationClickedActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private Handler f61542a;

    /* JADX INFO: renamed from: b */
    private BroadcastReceiver f61543b;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.NotificationClickedActivity$a */
    public class RunnableC14714a implements Runnable {
        public RunnableC14714a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ilq0.m137027D("clicked activity finish by timeout.");
            NotificationClickedActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m85285a(Intent intent) {
        try {
            if (intent == null) {
                ilq0.m137026C("PushClickedActivity", "clicked activity start service, missing intent");
                return;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
            if (intent2 == null) {
                ilq0.m137026C("PushClickedActivity", "clicked activity start service, newIntent is null");
                return;
            }
            intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent2.putExtra("is_clicked_activity_call", true);
            ilq0.m137041n("PushClickedActivity", "clicked activity start service.");
            startService(intent2);
        } catch (Exception e) {
            ilq0.m137044q(e);
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
        this.f61542a = handler;
        handler.postDelayed(new RunnableC14714a(), 3000L);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.mipush.sdk.NotificationClickedActivity.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ilq0.m137050w("clicked activity finish by normal.");
                NotificationClickedActivity.this.finish();
            }
        };
        this.f61543b = broadcastReceiver;
        try {
            vvq0.m200202d(this, broadcastReceiver, intentFilter, zmq0.m219366a(this), null, 4);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f61542a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.f61543b);
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
        m85285a(getIntent());
    }
}
