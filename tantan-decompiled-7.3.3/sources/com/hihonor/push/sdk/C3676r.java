package com.hihonor.push.sdk;

import java.util.List;

/* JADX INFO: renamed from: com.hihonor.push.sdk.r */
/* JADX INFO: loaded from: classes7.dex */
public class C3676r implements InterfaceC3663k0<List<HonorPushDataMsg>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f12651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3678s f12652b;

    public C3676r(C3678s c3678s, HonorPushCallback honorPushCallback) {
        this.f12652b = c3678s;
        this.f12651a = honorPushCallback;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3663k0
    /* JADX INFO: renamed from: a */
    public void mo18555a(C3635a1 c3635a1) {
        if (!c3635a1.m18562e()) {
            C3678s.m18602a(this.f12652b, this.f12651a, -1, c3635a1.m18559b().toString());
            return;
        }
        C3678s c3678s = this.f12652b;
        HonorPushCallback honorPushCallback = this.f12651a;
        Object objM18560c = c3635a1.m18560c();
        c3678s.getClass();
        C3638b1.m18577a(new RunnableC3680t(c3678s, honorPushCallback, objM18560c));
    }
}
