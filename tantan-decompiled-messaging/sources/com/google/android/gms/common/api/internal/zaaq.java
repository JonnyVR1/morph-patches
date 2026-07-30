package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zaaq extends zabg {
    final /* synthetic */ zaaw zaa;
    final /* synthetic */ com.google.android.gms.signin.internal.zak zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaq(zaar zaarVar, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabfVar);
        this.zaa = zaawVar;
        this.zab = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        zaaw.zar(this.zaa, this.zab);
    }
}
