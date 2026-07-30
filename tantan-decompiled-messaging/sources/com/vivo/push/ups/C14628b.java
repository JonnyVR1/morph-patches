package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14628b implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSRegisterCallback f61089a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61090b;

    public C14628b(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.f61090b = vUpsManager;
        this.f61089a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61089a.onResult(new TokenResult(i, ""));
    }
}
