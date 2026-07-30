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
    public static final /* synthetic */ int f11830c = 0;

    /* JADX INFO: renamed from: a */
    public final HandlerC3472a f11831a;

    /* JADX INFO: renamed from: b */
    public final Messenger f11832b;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.HonorMessageService$a */
    public class HandlerC3472a extends Handler {
        public HandlerC3472a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                HonorMessageService honorMessageService = HonorMessageService.this;
                int i = HonorMessageService.f11830c;
                honorMessageService.m17477a(intent);
            }
        }
    }

    public HonorMessageService() {
        HandlerC3472a handlerC3472a = new HandlerC3472a(Looper.getMainLooper());
        this.f11831a = handlerC3472a;
        this.f11832b = new Messenger(handlerC3472a);
    }

    /* JADX INFO: renamed from: a */
    public final void m17477a(Intent intent) {
        try {
            if (!TextUtils.equals(intent.getStringExtra("event_type"), DownMsgType.RECEIVE_TOKEN)) {
                C3476a1 c3476a1M17487a = C3477b.m17487a(new CallableC3516q0(intent));
                C3474a c3474a = new C3474a(this);
                c3476a1M17487a.getClass();
                c3476a1M17487a.m17480a(new C3522t0(C3512o0.f11903c.f11904a, c3474a));
                return;
            }
            String stringExtra = intent.getStringExtra("push_token");
            Context contextM17520a = C3505l.f11890e.m17520a();
            C3484d c3484d = C3484d.f11851b;
            if (!TextUtils.equals(stringExtra, c3484d.m17508b(contextM17520a))) {
                c3484d.m17507a(contextM17520a, stringExtra);
            }
            onNewToken(stringExtra);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f11832b.getBinder();
    }

    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m17477a(intent);
        return 2;
    }
}
