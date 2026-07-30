package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3647e0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ServiceConnectionC3650f0 f12599a;

    public C3647e0(ServiceConnectionC3650f0 serviceConnectionC3650f0) {
        this.f12599a = serviceConnectionC3650f0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null || message.what != 1001) {
            return false;
        }
        this.f12599a.m18589a(8002003);
        return true;
    }
}
