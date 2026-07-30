package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.d */
/* JADX INFO: loaded from: classes2.dex */
final class C14778d implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSTurnCallback f61940a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61941b;

    public C14778d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f61941b = vUpsManager;
        this.f61940a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61940a.onResult(new CodeResult(i));
    }
}
