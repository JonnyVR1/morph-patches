package com.tantanapp.push.vivo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import com.vivo.push.util.VivoPushException;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p153l.hmb0;
import p153l.k26;
import p153l.tu2;

/* JADX INFO: loaded from: classes12.dex */
public class ViVoPushReceiver extends OpenClientPushMessageReceiver {
    public static final String PUSH_NAME = "vivopush";
    private C13839a controller = new C13839a();

    /* JADX INFO: renamed from: com.tantanapp.push.vivo.ViVoPushReceiver$a */
    public class C13839a extends hmb0 {

        /* JADX INFO: renamed from: d */
        public boolean f57019d = false;

        /* JADX INFO: renamed from: com.tantanapp.push.vivo.ViVoPushReceiver$a$a */
        public class a implements IPushActionListener {
            public a() {
            }

            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                C13839a.this.m82618m(i);
            }
        }

        public C13839a() {
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: a */
        public boolean mo82614a(Intent intent) {
            if (intent == null || !intent.hasExtra("vivo_push_messageId") || intent.getLongExtra("vivo_push_messageId", 0L) == 0 || !intent.hasExtra("custom")) {
                return false;
            }
            String stringExtra = intent.getStringExtra("custom");
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            return ViVoPushReceiver.this.controller.m135827c(stringExtra, true);
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: e */
        public String mo82615e() {
            return ViVoPushReceiver.PUSH_NAME;
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: i */
        public void mo82616i() {
            if (!this.f57019d) {
                synchronized (this) {
                    if (!this.f57019d) {
                        try {
                            PushClient.getInstance(k26.m147943a()).initialize();
                            this.f57019d = true;
                        } catch (VivoPushException e) {
                            CrashHelper.m82479c(e);
                            tu2.m192703a("[common][push]", "ViVoPushReceiver initialize error!");
                            return;
                        }
                    }
                }
            }
            tu2.m192703a("[common][push]", "ViVoPushReceiver start!");
            PushClient.getInstance(k26.m147943a()).turnOnPush(new a());
            String regId = PushClient.getInstance(k26.m147943a()).getRegId();
            if (TextUtils.isEmpty(regId)) {
                return;
            }
            ViVoPushReceiver.this.controller.m135829f(true);
            ViVoPushReceiver.this.controller.m135831h(regId);
        }

        /* JADX INFO: renamed from: m */
        public final void m82618m(int i) {
            if (i == 1 || i == 0) {
                String regId = PushClient.getInstance(k26.m147943a()).getRegId();
                if (TextUtils.isEmpty(regId)) {
                    return;
                }
                ViVoPushReceiver.this.controller.m135829f(true);
                ViVoPushReceiver.this.controller.m135831h(regId);
            }
        }
    }

    public static boolean shouldApplyVivoPush() {
        return Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO) && PushClient.getInstance(k26.m147943a()).isSupport();
    }

    public C13839a getController() {
        return this.controller;
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.controller.m135829f(true);
        this.controller.m135831h(str);
    }
}
