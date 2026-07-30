package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.n */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3668n implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3678s f12641a;

    public CallableC3668n(C3678s c3678s) {
        this.f12641a = c3678s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        C3678s c3678s = this.f12641a;
        C3634a0 c3634a0 = c3678s.f12657b;
        Context context = c3678s.f12656a;
        c3634a0.getClass();
        try {
            C3645d1 c3645d1 = new C3645d1(UpMsgType.UNREGISTER_PUSH_TOKEN, null);
            c3645d1.f12612e = C3636b.m18563a();
            C3636b.m18567a(C3692z.f12689c.m18607a(c3645d1));
            C3643d.f12592b.m18584a(context, null);
            return null;
        } catch (Exception e) {
            throw C3636b.m18566a(e);
        }
    }
}
