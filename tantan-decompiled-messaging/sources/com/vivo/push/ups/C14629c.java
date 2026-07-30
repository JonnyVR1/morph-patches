package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: renamed from: com.vivo.push.ups.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14629c implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSTurnCallback f61091a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ VUpsManager f61092b;

    public C14629c(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f61092b = vUpsManager;
        this.f61091a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61091a.onResult(new CodeResult(i));
    }
}
