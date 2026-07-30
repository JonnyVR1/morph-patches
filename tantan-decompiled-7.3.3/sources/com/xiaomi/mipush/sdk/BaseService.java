package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;
import p153l.l4r0;
import p153l.ouq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseService extends Service {

    /* JADX INFO: renamed from: a */
    private HandlerC14844a f62369a;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.BaseService$a */
    public static class HandlerC14844a extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<BaseService> f62370a;

        public HandlerC14844a(WeakReference<BaseService> weakReference) {
            this.f62370a = weakReference;
        }

        /* JADX INFO: renamed from: a */
        public void m86434a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what != 1001 || (weakReference = this.f62370a) == null || (baseService = weakReference.get()) == null) {
                return;
            }
            ouq0.m169406z("TimeoutHandler " + baseService.toString() + " kill self");
            if (!baseService.mo86433a()) {
                baseService.stopSelf();
            } else {
                ouq0.m169406z("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo86433a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f62369a == null) {
            this.f62369a = new HandlerC14844a(new WeakReference(this));
        }
        this.f62369a.m86434a();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        if (l4r0.m152825j(this)) {
            return iOnStartCommand;
        }
        return 2;
    }
}
