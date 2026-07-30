package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.n */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3509n implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3519s f11900a;

    public CallableC3509n(C3519s c3519s) {
        this.f11900a = c3519s;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        C3519s c3519s = this.f11900a;
        C3475a0 c3475a0 = c3519s.f11916b;
        Context context = c3519s.f11915a;
        c3475a0.getClass();
        try {
            C3486d1 c3486d1 = new C3486d1(UpMsgType.UNREGISTER_PUSH_TOKEN, null);
            c3486d1.f11871e = C3477b.m17486a();
            C3477b.m17490a(C3533z.f11948c.m17530a(c3486d1));
            C3484d.f11851b.m17507a(context, null);
            return null;
        } catch (Exception e) {
            throw C3477b.m17489a(e);
        }
    }
}
