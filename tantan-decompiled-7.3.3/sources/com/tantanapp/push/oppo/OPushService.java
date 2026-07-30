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
import p153l.hmb0;
import p153l.k26;
import p153l.kmk0;
import p153l.tu2;

/* JADX INFO: loaded from: classes12.dex */
public class OPushService extends PushService {
    public static final String PUSH_NAME = "opush";
    public static final String TAG = "OPushService";

    /* JADX INFO: renamed from: com.tantanapp.push.oppo.OPushService$a */
    public static class C13838a extends hmb0 {

        /* JADX INFO: renamed from: d */
        public boolean f57017d = false;

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
                if (kmk0.f127509b) {
                    String.format("oppo push register info,code:%d,s:%s", Integer.valueOf(i), str);
                }
                if (i != 0 || TextUtils.isEmpty(str)) {
                    C13838a.this.m135831h(null);
                    C13838a.this.m135829f(false);
                } else {
                    C13838a.this.m135831h(str);
                    C13838a.this.m135829f(true);
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
                    C13838a.this.m135829f(false);
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

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: a */
        public boolean mo82614a(Intent intent) {
            try {
                String stringExtra = intent.getStringExtra("custom");
                if (kmk0.f127509b) {
                    Bundle extras = intent.getExtras();
                    if (NullChecker.m82486a(extras)) {
                        for (String str : extras.keySet()) {
                            Object obj = extras.get(str);
                            String.format("%s %s (%s)", str, obj.toString(), obj.getClass().getName());
                        }
                    }
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    return false;
                }
                return m135827c(stringExtra, true);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                return false;
            }
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: e */
        public String mo82615e() {
            return OPushService.PUSH_NAME;
        }

        @Override // p153l.hmb0
        /* JADX INFO: renamed from: i */
        public void mo82616i() {
            if (this.f57017d) {
                PushManager.getInstance().getRegister();
                String registerID = PushManager.getInstance().getRegisterID();
                if (TextUtils.isEmpty(registerID)) {
                    m135831h(null);
                    m135829f(false);
                    return;
                } else {
                    m135831h(registerID);
                    m135829f(true);
                    return;
                }
            }
            synchronized (this) {
                if (!this.f57017d) {
                    this.f57017d = true;
                    try {
                        tu2.m192703a("[common][push]", "OPushService start!");
                        PushManager.getInstance().register(k26.m147943a(), "L3BJpyKWYvC4wQ0DqYiFQh3X", "T8FT4Ey7vM9lprT0MqcEeGDa", new a());
                        m135829f(true);
                    } catch (Exception e) {
                        CrashHelper.m82479c(e);
                        m135831h(null);
                        m135829f(false);
                    }
                }
            }
        }
    }

    public static boolean isSupportPush() {
        return PushManager.isSupportPush(k26.m147943a());
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, AppMessage appMessage) {
        super.processMessage(context, appMessage);
        appMessage.getContent();
        String str = kmk0.f127508a;
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, SptDataMessage sptDataMessage) {
        super.processMessage(context, sptDataMessage);
        sptDataMessage.getContent();
        String str = kmk0.f127508a;
    }
}
