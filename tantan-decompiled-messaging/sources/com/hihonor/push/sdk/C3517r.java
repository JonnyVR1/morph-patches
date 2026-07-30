package com.hihonor.push.sdk;

import java.util.List;

/* JADX INFO: renamed from: com.hihonor.push.sdk.r */
/* JADX INFO: loaded from: classes7.dex */
public class C3517r implements InterfaceC3504k0<List<HonorPushDataMsg>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorPushCallback f11910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3519s f11911b;

    public C3517r(C3519s c3519s, HonorPushCallback honorPushCallback) {
        this.f11911b = c3519s;
        this.f11910a = honorPushCallback;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3504k0
    /* JADX INFO: renamed from: a */
    public void mo17478a(C3476a1 c3476a1) {
        if (!c3476a1.m17485e()) {
            C3519s.m17525a(this.f11911b, this.f11910a, -1, c3476a1.m17482b().toString());
            return;
        }
        C3519s c3519s = this.f11911b;
        HonorPushCallback honorPushCallback = this.f11910a;
        Object objM17483c = c3476a1.m17483c();
        c3519s.getClass();
        C3479b1.m17500a(new RunnableC3521t(c3519s, honorPushCallback, objM17483c));
    }
}
