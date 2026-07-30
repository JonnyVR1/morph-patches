package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;
import p149l.fvq0;
import p149l.ilq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseService extends Service {

    /* JADX INFO: renamed from: a */
    private HandlerC14696a f61522a;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.BaseService$a */
    public static class HandlerC14696a extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<BaseService> f61523a;

        public HandlerC14696a(WeakReference<BaseService> weakReference) {
            this.f61523a = weakReference;
        }

        /* JADX INFO: renamed from: a */
        public void m85263a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what != 1001 || (weakReference = this.f61523a) == null || (baseService = weakReference.get()) == null) {
                return;
            }
            ilq0.m137053z("TimeoutHandler " + baseService.toString() + " kill self");
            if (!baseService.mo85262a()) {
                baseService.stopSelf();
            } else {
                ilq0.m137053z("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo85262a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f61522a == null) {
            this.f61522a = new HandlerC14696a(new WeakReference(this));
        }
        this.f61522a.m85263a();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        if (fvq0.m123356j(this)) {
            return iOnStartCommand;
        }
        return 2;
    }
}
