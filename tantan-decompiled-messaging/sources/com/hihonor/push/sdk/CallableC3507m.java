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
public class CallableC3507m implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f11898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3519s f11899b;

    public CallableC3507m(C3519s c3519s, boolean z) {
        this.f11899b = c3519s;
        this.f11898a = z;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        this.f11899b.f11916b.getClass();
        try {
            C3489e1 c3489e1 = new C3489e1(UpMsgType.REQUEST_PUSH_TOKEN, null);
            c3489e1.f11871e = C3477b.m17486a();
            String pushToken = ((PushTokenResult) C3477b.m17490a(C3533z.f11948c.m17530a(c3489e1))).getPushToken();
            if (this.f11898a) {
                C3519s c3519s = this.f11899b;
                c3519s.getClass();
                if (!TextUtils.isEmpty(pushToken)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("event_type", DownMsgType.RECEIVE_TOKEN);
                    bundle.putString("push_token", pushToken);
                    ServiceConnectionC3494g0 serviceConnectionC3494g0 = new ServiceConnectionC3494g0();
                    Context context = c3519s.f11915a;
                    try {
                        Intent intent = new Intent();
                        intent.setPackage(context.getPackageName());
                        intent.setAction("com.hihonor.push.action.MESSAGING_EVENT");
                        Context applicationContext = context.getApplicationContext();
                        serviceConnectionC3494g0.f11876c = applicationContext;
                        serviceConnectionC3494g0.f11875b = bundle;
                        applicationContext.bindService(intent, serviceConnectionC3494g0, 1);
                        return pushToken;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
            return pushToken;
        } catch (Exception e2) {
            throw C3477b.m17489a(e2);
        }
    }
}
