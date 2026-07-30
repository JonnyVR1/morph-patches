package com.hihonor.push.sdk;

import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.hihonor.push.sdk.d0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3485d0 implements InterfaceC3478b0 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f11852a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public volatile IPushInvoke f11853b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3478b0.a f11854c;

    /* JADX INFO: renamed from: d */
    public ServiceConnectionC3491f0 f11855d;

    public C3485d0(InterfaceC3478b0.a aVar) {
        this.f11854c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m17509a(int i) {
        InterfaceC3478b0.a aVar = this.f11854c;
        if (aVar != null) {
            C3533z.a aVar2 = (C3533z.a) aVar;
            if (Looper.myLooper() == C3533z.this.f11949a.getLooper()) {
                aVar2.m17533a(HonorPushErrorEnum.fromCode(i));
            } else {
                C3533z.this.f11949a.post(new RunnableC3531y(aVar2, i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m17510a() {
        return this.f11852a.get() == 3 || this.f11852a.get() == 4;
    }
}
