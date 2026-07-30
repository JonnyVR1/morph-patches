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
import p149l.ayv;
import p149l.cyv;
import p149l.deb0;
import p149l.du2;
import p149l.edk0;
import p149l.f16;

/* JADX INFO: loaded from: classes13.dex */
public class MiPushReceiver extends PushMessageReceiver {
    public static final String PUSH_NAME = "mipush";
    private C13677a controller = new C13677a();

    public static boolean shouldUseMIUIPush() {
        return MiPushClient.shouldUseMIUIPush(f16.m119092a());
    }

    public C13677a getController() {
        return this.controller;
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if ("register".equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0 && !TextUtils.isEmpty(str)) {
                this.controller.m111186h(str);
                this.controller.m111184f(true);
            } else {
                this.controller.m111184f(false);
                this.controller.m111186h(null);
                this.controller.f56174d = false;
            }
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        MiPushClient.clearNotification(context, miPushMessage.getNotifyId());
        Map<String, String> extra = miPushMessage.getExtra();
        if (NullChecker.m81304b(extra)) {
            this.controller.m111182c(extra.get("custom"), false);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        Map<String, String> extra = miPushMessage.getExtra();
        if (NullChecker.m81304b(extra)) {
            this.controller.m111182c(extra.get("custom"), false);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.push.xiaomi.MiPushReceiver$a */
    public class C13677a extends deb0 {

        /* JADX INFO: renamed from: d */
        public boolean f56174d = false;

        public C13677a() {
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: a */
        public boolean mo81431a(Intent intent) {
            try {
                try {
                    MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra("key_message");
                    if (NullChecker.m81303a(miPushMessage)) {
                        Map<String, String> extra = miPushMessage.getExtra();
                        if (NullChecker.m81304b(extra)) {
                            return m111182c(extra.get("custom"), true);
                        }
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
                return false;
            } finally {
                MiPushClient.clearNotification(f16.m119092a());
            }
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: e */
        public String mo81432e() {
            return MiPushReceiver.PUSH_NAME;
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: i */
        public void mo81433i() {
            if (this.f56174d) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f56174d) {
                        du2.m113670a("[common][push]", "MiPushReceiver start!");
                        MiPushClient.registerPush(f16.m119092a(), "2882303761517241939", "5271724125939");
                        this.f56174d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m111184f(true);
            if (edk0.f90613c) {
                ayv.m99585b(f16.m119092a(), new a());
            }
        }

        /* JADX INFO: renamed from: com.tantanapp.push.xiaomi.MiPushReceiver$a$a */
        public class a implements cyv {
            public a() {
            }

            @Override // p149l.cyv
            public void log(String str, Throwable th) {
                String str2 = edk0.f90611a;
            }

            @Override // p149l.cyv
            public void log(String str) {
                String str2 = edk0.f90611a;
            }
        }
    }
}
