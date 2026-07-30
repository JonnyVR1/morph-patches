package com.tantanapp.push.xiaomi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import java.util.Map;
import p153l.hmb0;
import p153l.k26;
import p153l.kmk0;
import p153l.tu2;
import p153l.xzv;
import p153l.zzv;

/* JADX INFO: loaded from: classes12.dex */
public class MiPushReceiver extends PushMessageReceiver {
    public static final String PUSH_NAME = "mipush";
    private C13840a controller = new C13840a();

    public static boolean shouldUseMIUIPush() {
        return MiPushClient.shouldUseMIUIPush(k26.m147943a());
    }

    public C13840a getController() {
        return this.controller;
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if ("register".equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0 && !TextUtils.isEmpty(str)) {
                this.controller.m135831h(str);
                this.controller.m135829f(true);
            } else {
                this.controller.m135829f(false);
                this.controller.m135831h(null);
                this.controller.f57022d = false;
            }
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        MiPushClient.clearNotification(context, miPushMessage.getNotifyId());
        Map<String, String> extra = miPushMessage.getExtra();
        if (NullChecker.m82487b(extra)) {
            this.controller.m135827c(extra.get("custom"), false);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        Map<String, String> extra = miPushMessage.getExtra();
        if (NullChecker.m82487b(extra)) {
            this.controller.m135827c(extra.get("custom"), false);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.push.xiaomi.MiPushReceiver$a */
    public class C13840a extends hmb0 {

        /* JADX INFO: renamed from: d */
        public boolean f57022d = false;

        public C13840a() {
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: a */
        public boolean mo82614a(Intent intent) {
            try {
                try {
                    MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra("key_message");
                    if (NullChecker.m82486a(miPushMessage)) {
                        Map<String, String> extra = miPushMessage.getExtra();
                        if (NullChecker.m82487b(extra)) {
                            return m135827c(extra.get("custom"), true);
                        }
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
                return false;
            } finally {
                MiPushClient.clearNotification(k26.m147943a());
            }
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: e */
        public String mo82615e() {
            return MiPushReceiver.PUSH_NAME;
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: i */
        public void mo82616i() {
            if (this.f57022d) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f57022d) {
                        tu2.m192703a("[common][push]", "MiPushReceiver start!");
                        MiPushClient.registerPush(k26.m147943a(), "2882303761517241939", "5271724125939");
                        this.f57022d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m135829f(true);
            if (kmk0.f127510c) {
                xzv.m213821b(k26.m147943a(), new a());
            }
        }

        /* JADX INFO: renamed from: com.tantanapp.push.xiaomi.MiPushReceiver$a$a */
        public class a implements zzv {
            public a() {
            }

            @Override // p153l.zzv
            public void log(String str, Throwable th) {
                String str2 = kmk0.f127508a;
            }

            @Override // p153l.zzv
            public void log(String str) {
                String str2 = kmk0.f127508a;
            }
        }
    }
}
