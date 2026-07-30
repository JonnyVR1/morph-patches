package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.d */
/* JADX INFO: loaded from: classes2.dex */
final class C14630d implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSTurnCallback f61093a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61094b;

    public C14630d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f61094b = vUpsManager;
        this.f61093a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61093a.onResult(new CodeResult(i));
    }
}
