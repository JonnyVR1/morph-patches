package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import java.lang.ref.WeakReference;
import p149l.zxq0;

/* JADX INFO: loaded from: classes6.dex */
final class zaar extends zxq0 {
    private final WeakReference zaa;

    public zaar(zaaw zaawVar) {
        this.zaa = new WeakReference(zaawVar);
    }

    @Override // p149l.zxq0, p149l.jyq0
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.zaa.zal(new zaaq(this, zaawVar, zaawVar, zakVar));
    }
}
