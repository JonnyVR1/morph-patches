package com.tantanapp.push.oppo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.callback.PushCallback;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.SptDataMessage;
import com.heytap.mcssdk.mode.SubscribeResult;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.deb0;
import p149l.du2;
import p149l.edk0;
import p149l.f16;

/* JADX INFO: loaded from: classes13.dex */
public class OPushService extends PushService {
    public static final String PUSH_NAME = "opush";
    public static final String TAG = "OPushService";

    /* JADX INFO: renamed from: com.tantanapp.push.oppo.OPushService$a */
    public static class C13675a extends deb0 {

        /* JADX INFO: renamed from: d */
        public boolean f56169d = false;

        /* JADX INFO: renamed from: com.tantanapp.push.oppo.OPushService$a$a */
        public class a implements PushCallback {
            public a() {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onGetAliases(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onGetNotificationStatus(int i, int i2) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onGetPushStatus(int i, int i2) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onGetTags(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onGetUserAccounts(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onRegister(int i, String str) {
                if (edk0.f90612b) {
                    String.format("oppo push register info,code:%d,s:%s", Integer.valueOf(i), str);
                }
                if (i != 0 || TextUtils.isEmpty(str)) {
                    C13675a.this.m111186h(null);
                    C13675a.this.m111184f(false);
                } else {
                    C13675a.this.m111186h(str);
                    C13675a.this.m111184f(true);
                }
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onSetAliases(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onSetPushTime(int i, String str) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onSetTags(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onSetUserAccounts(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onUnRegister(int i) {
                if (i == 0) {
                    C13675a.this.m111184f(false);
                }
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onUnsetAliases(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onUnsetTags(int i, List<SubscribeResult> list) {
            }

            @Override // com.heytap.mcssdk.callback.PushCallback
            public void onUnsetUserAccounts(int i, List<SubscribeResult> list) {
            }
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: a */
        public boolean mo81431a(Intent intent) {
            try {
                String stringExtra = intent.getStringExtra("custom");
                if (edk0.f90612b) {
                    Bundle extras = intent.getExtras();
                    if (NullChecker.m81303a(extras)) {
                        for (String str : extras.keySet()) {
                            Object obj = extras.get(str);
                            String.format("%s %s (%s)", str, obj.toString(), obj.getClass().getName());
                        }
                    }
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    return false;
                }
                return m111182c(stringExtra, true);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                return false;
            }
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: e */
        public String mo81432e() {
            return OPushService.PUSH_NAME;
        }

        @Override // p149l.deb0
        /* JADX INFO: renamed from: i */
        public void mo81433i() {
            if (this.f56169d) {
                PushManager.getInstance().getRegister();
                String registerID = PushManager.getInstance().getRegisterID();
                if (TextUtils.isEmpty(registerID)) {
                    m111186h(null);
                    m111184f(false);
                    return;
                } else {
                    m111186h(registerID);
                    m111184f(true);
                    return;
                }
            }
            synchronized (this) {
                if (!this.f56169d) {
                    this.f56169d = true;
                    try {
                        du2.m113670a("[common][push]", "OPushService start!");
                        PushManager.getInstance().register(f16.m119092a(), "L3BJpyKWYvC4wQ0DqYiFQh3X", "T8FT4Ey7vM9lprT0MqcEeGDa", new a());
                        m111184f(true);
                    } catch (Exception e) {
                        CrashHelper.m81296c(e);
                        m111186h(null);
                        m111184f(false);
                    }
                }
            }
        }
    }

    public static boolean isSupportPush() {
        return PushManager.isSupportPush(f16.m119092a());
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, AppMessage appMessage) {
        super.processMessage(context, appMessage);
        appMessage.getContent();
        String str = edk0.f90611a;
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, SptDataMessage sptDataMessage) {
        super.processMessage(context, sptDataMessage);
        sptDataMessage.getContent();
        String str = edk0.f90611a;
    }
}
