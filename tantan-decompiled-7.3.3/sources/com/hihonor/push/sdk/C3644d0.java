package com.hihonor.push.sdk;

import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.hihonor.push.sdk.d0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3644d0 implements InterfaceC3637b0 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f12593a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public volatile IPushInvoke f12594b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3637b0.a f12595c;

    /* JADX INFO: renamed from: d */
    public ServiceConnectionC3650f0 f12596d;

    public C3644d0(InterfaceC3637b0.a aVar) {
        this.f12595c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m18586a(int i) {
        InterfaceC3637b0.a aVar = this.f12595c;
        if (aVar != null) {
            C3692z.a aVar2 = (C3692z.a) aVar;
            if (Looper.myLooper() == C3692z.this.f12690a.getLooper()) {
                aVar2.m18610a(HonorPushErrorEnum.fromCode(i));
            } else {
                C3692z.this.f12690a.post(new RunnableC3690y(aVar2, i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m18587a() {
        return this.f12593a.get() == 3 || this.f12593a.get() == 4;
    }
}
