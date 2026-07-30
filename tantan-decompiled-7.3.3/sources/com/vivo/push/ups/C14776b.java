package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14776b implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSRegisterCallback f61936a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61937b;

    public C14776b(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.f61937b = vUpsManager;
        this.f61936a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61936a.onResult(new TokenResult(i, ""));
    }
}
