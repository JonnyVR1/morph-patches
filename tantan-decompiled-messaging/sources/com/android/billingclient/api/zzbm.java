package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;
import p149l.j10;
import p149l.lx2;
import p149l.qcb0;
import p149l.rcb0;
import p149l.tz5;

/* JADX INFO: loaded from: classes.dex */
final class zzbm implements j10, lx2, tz5, qcb0, rcb0 {
    private final long zza = 0;

    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // p149l.lx2
    /* JADX INFO: renamed from: a */
    public final void mo5066a(C0871d c0871d) {
        nativeOnBillingSetupFinished(c0871d.m4966b(), c0871d.m4965a(), this.zza);
    }

    @Override // p149l.qcb0
    /* JADX INFO: renamed from: b */
    public final void mo5067b(C0871d c0871d, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(c0871d.m4966b(), c0871d.m4965a(), (Purchase[]) list.toArray(new Purchase[list.size()]), this.zza);
    }

    @Override // p149l.lx2
    /* JADX INFO: renamed from: c */
    public final void mo5068c() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // p149l.rcb0
    /* JADX INFO: renamed from: d */
    public final void mo5069d(C0871d c0871d, List<Purchase> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnPurchasesUpdated(c0871d.m4966b(), c0871d.m4965a(), (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // p149l.j10
    /* JADX INFO: renamed from: e */
    public final void mo5070e(C0871d c0871d) {
        nativeOnAcknowledgePurchaseResponse(c0871d.m4966b(), c0871d.m4965a(), this.zza);
    }

    @Override // p149l.tz5
    /* JADX INFO: renamed from: f */
    public final void mo5071f(C0871d c0871d, String str) {
        nativeOnConsumePurchaseResponse(c0871d.m4966b(), c0871d.m4965a(), str, this.zza);
    }
}
