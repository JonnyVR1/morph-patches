package com.vivo.push.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vivo.push.sdk.C14773a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.ContextDelegate;

/* JADX INFO: loaded from: classes2.dex */
public class CommandService extends Service {
    /* JADX INFO: renamed from: a */
    public boolean mo86120a(String str) {
        return "com.vivo.pushservice.action.RECEIVE".equals(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C14795p.m86190c("CommandService", "onBind initSuc: ");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C14795p.m86190c("CommandService", getClass().getSimpleName() + " -- oncreate " + getPackageName());
        super.onCreate();
        C14773a.m86112a().m86108a(ContextDelegate.getContext(getApplicationContext()));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C14795p.m86190c("CommandService", getClass().getSimpleName() + " -- onStartCommand " + getPackageName());
        if (intent == null) {
            stopSelf();
            return 2;
        }
        if (mo86120a(intent.getAction())) {
            try {
                C14773a.m86112a().m86118a(getClass().getName());
                C14773a.m86112a().m86117a(intent);
            } catch (Exception e) {
                C14795p.m86180a("CommandService", "onStartCommand -- error", e);
            }
            stopSelf();
            return 2;
        }
        C14795p.m86179a("CommandService", getPackageName() + " receive invalid action " + intent.getAction());
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
