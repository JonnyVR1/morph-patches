package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zas {
    final /* synthetic */ BasePendingResult zaa;

    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    public final void finalize() throws Throwable {
        BasePendingResult.zal(this.zaa.zaj);
        super.finalize();
    }
}
