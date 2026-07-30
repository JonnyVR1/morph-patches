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
import p149l.deb0;
import p149l.du2;
import p149l.f16;

/* JADX INFO: loaded from: classes13.dex */
public class ViVoPushReceiver extends OpenClientPushMessageReceiver {
    public static final String PUSH_NAME = "vivopush";
    private C13676a controller = new C13676a();

    /* JADX INFO: renamed from: com.tantanapp.push.vivo.ViVoPushReceiver$a */
    public class C13676a extends deb0 {

        /* JADX INFO: renamed from: d */
        public boolean f56171d = false;

        /* JADX INFO: renamed from: com.tantanapp.push.vivo.ViVoPushReceiver$a$a */
        public class a implements IPushActionListener {
            public a() {
            }

            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                C13676a.this.m81435m(i);
            }
        }

        public C13676a() {
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: a */
        public boolean mo81431a(Intent intent) {
            if (intent == null || !intent.hasExtra("vivo_push_messageId") || intent.getLongExtra("vivo_push_messageId", 0L) == 0 || !intent.hasExtra("custom")) {
                return false;
            }
            String stringExtra = intent.getStringExtra("custom");
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            return ViVoPushReceiver.this.controller.m111182c(stringExtra, true);
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: e */
        public String mo81432e() {
            return ViVoPushReceiver.PUSH_NAME;
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: i */
        public void mo81433i() {
            if (!this.f56171d) {
                synchronized (this) {
                    if (!this.f56171d) {
                        try {
                            PushClient.getInstance(f16.m119092a()).initialize();
                            this.f56171d = true;
                        } catch (VivoPushException e) {
                            CrashHelper.m81296c(e);
                            du2.m113670a("[common][push]", "ViVoPushReceiver initialize error!");
                            return;
                        }
                    }
                }
            }
            du2.m113670a("[common][push]", "ViVoPushReceiver start!");
            PushClient.getInstance(f16.m119092a()).turnOnPush(new a());
            String regId = PushClient.getInstance(f16.m119092a()).getRegId();
            if (TextUtils.isEmpty(regId)) {
                return;
            }
            ViVoPushReceiver.this.controller.m111184f(true);
            ViVoPushReceiver.this.controller.m111186h(regId);
        }

        /* JADX INFO: renamed from: m */
        public final void m81435m(int i) {
            if (i == 1 || i == 0) {
                String regId = PushClient.getInstance(f16.m119092a()).getRegId();
                if (TextUtils.isEmpty(regId)) {
                    return;
                }
                ViVoPushReceiver.this.controller.m111184f(true);
                ViVoPushReceiver.this.controller.m111186h(regId);
            }
        }
    }

    public static boolean shouldApplyVivoPush() {
        return Build.BRAND.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO) && PushClient.getInstance(f16.m119092a()).isSupport();
    }

    public C13676a getController() {
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
        this.controller.m111184f(true);
        this.controller.m111186h(str);
    }
}
