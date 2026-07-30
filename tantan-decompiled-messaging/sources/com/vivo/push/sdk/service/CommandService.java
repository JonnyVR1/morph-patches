package com.vivo.push.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vivo.push.sdk.C14625a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.ContextDelegate;

/* JADX INFO: loaded from: classes2.dex */
public class CommandService extends Service {
    /* JADX INFO: renamed from: a */
    public boolean mo84949a(String str) {
        return "com.vivo.pushservice.action.RECEIVE".equals(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C14647p.m85019c("CommandService", "onBind initSuc: ");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C14647p.m85019c("CommandService", getClass().getSimpleName() + " -- oncreate " + getPackageName());
        super.onCreate();
        C14625a.m84941a().m84937a(ContextDelegate.getContext(getApplicationContext()));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C14647p.m85019c("CommandService", getClass().getSimpleName() + " -- onStartCommand " + getPackageName());
        if (intent == null) {
            stopSelf();
            return 2;
        }
        if (mo84949a(intent.getAction())) {
            try {
                C14625a.m84941a().m84947a(getClass().getName());
                C14625a.m84941a().m84946a(intent);
            } catch (Exception e) {
                C14647p.m85009a("CommandService", "onStartCommand -- error", e);
            }
            stopSelf();
            return 2;
        }
        C14647p.m85008a("CommandService", getPackageName() + " receive invalid action " + intent.getAction());
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
