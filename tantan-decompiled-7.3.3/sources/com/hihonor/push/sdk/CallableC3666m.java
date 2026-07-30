package com.hihonor.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.DownMsgType;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.m */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3666m implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f12639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3678s f12640b;

    public CallableC3666m(C3678s c3678s, boolean z) {
        this.f12640b = c3678s;
        this.f12639a = z;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        this.f12640b.f12657b.getClass();
        try {
            C3648e1 c3648e1 = new C3648e1(UpMsgType.REQUEST_PUSH_TOKEN, null);
            c3648e1.f12612e = C3636b.m18563a();
            String pushToken = ((PushTokenResult) C3636b.m18567a(C3692z.f12689c.m18607a(c3648e1))).getPushToken();
            if (this.f12639a) {
                C3678s c3678s = this.f12640b;
                c3678s.getClass();
                if (!TextUtils.isEmpty(pushToken)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("event_type", DownMsgType.RECEIVE_TOKEN);
                    bundle.putString("push_token", pushToken);
                    ServiceConnectionC3653g0 serviceConnectionC3653g0 = new ServiceConnectionC3653g0();
                    Context context = c3678s.f12656a;
                    try {
                        Intent intent = new Intent();
                        intent.setPackage(context.getPackageName());
                        intent.setAction("com.hihonor.push.action.MESSAGING_EVENT");
                        Context applicationContext = context.getApplicationContext();
                        serviceConnectionC3653g0.f12617c = applicationContext;
                        serviceConnectionC3653g0.f12616b = bundle;
                        applicationContext.bindService(intent, serviceConnectionC3653g0, 1);
                        return pushToken;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
            return pushToken;
        } catch (Exception e2) {
            throw C3636b.m18566a(e2);
        }
    }
}
