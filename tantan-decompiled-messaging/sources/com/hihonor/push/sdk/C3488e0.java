package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3488e0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ServiceConnectionC3491f0 f11858a;

    public C3488e0(ServiceConnectionC3491f0 serviceConnectionC3491f0) {
        this.f11858a = serviceConnectionC3491f0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null || message.what != 1001) {
            return false;
        }
        this.f11858a.m17512a(8002003);
        return true;
    }
}
