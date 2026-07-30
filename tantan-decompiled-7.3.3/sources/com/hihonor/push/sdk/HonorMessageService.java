package com.hihonor.push.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.hihonor.push.sdk.common.data.DownMsgType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HonorMessageService extends Service {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f12571c = 0;

    /* JADX INFO: renamed from: a */
    public final HandlerC3631a f12572a;

    /* JADX INFO: renamed from: b */
    public final Messenger f12573b;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.HonorMessageService$a */
    public class HandlerC3631a extends Handler {
        public HandlerC3631a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                HonorMessageService honorMessageService = HonorMessageService.this;
                int i = HonorMessageService.f12571c;
                honorMessageService.m18554a(intent);
            }
        }
    }

    public HonorMessageService() {
        HandlerC3631a handlerC3631a = new HandlerC3631a(Looper.getMainLooper());
        this.f12572a = handlerC3631a;
        this.f12573b = new Messenger(handlerC3631a);
    }

    /* JADX INFO: renamed from: a */
    public final void m18554a(Intent intent) {
        try {
            if (!TextUtils.equals(intent.getStringExtra("event_type"), DownMsgType.RECEIVE_TOKEN)) {
                C3635a1 c3635a1M18564a = C3636b.m18564a(new CallableC3675q0(intent));
                C3633a c3633a = new C3633a(this);
                c3635a1M18564a.getClass();
                c3635a1M18564a.m18557a(new C3681t0(C3671o0.f12644c.f12645a, c3633a));
                return;
            }
            String stringExtra = intent.getStringExtra("push_token");
            Context contextM18597a = C3664l.f12631e.m18597a();
            C3643d c3643d = C3643d.f12592b;
            if (!TextUtils.equals(stringExtra, c3643d.m18585b(contextM18597a))) {
                c3643d.m18584a(contextM18597a, stringExtra);
            }
            onNewToken(stringExtra);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f12573b.getBinder();
    }

    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m18554a(intent);
        return 2;
    }
}
