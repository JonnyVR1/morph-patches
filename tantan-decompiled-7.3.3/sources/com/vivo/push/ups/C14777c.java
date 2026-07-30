package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14777c implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSTurnCallback f61938a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61939b;

    public C14777c(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f61939b = vUpsManager;
        this.f61938a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61938a.onResult(new CodeResult(i));
    }
}
