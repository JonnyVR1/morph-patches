package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;
import p153l.ay2;
import p153l.d10;
import p153l.ukb0;
import p153l.vkb0;
import p153l.y06;

/* JADX INFO: loaded from: classes.dex */
final class zzbm implements d10, ay2, y06, ukb0, vkb0 {
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

    @Override // p153l.ay2
    /* JADX INFO: renamed from: a */
    public final void mo5076a(C0875d c0875d) {
        nativeOnBillingSetupFinished(c0875d.m4976b(), c0875d.m4975a(), this.zza);
    }

    @Override // p153l.ukb0
    /* JADX INFO: renamed from: b */
    public final void mo5077b(C0875d c0875d, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(c0875d.m4976b(), c0875d.m4975a(), (Purchase[]) list.toArray(new Purchase[list.size()]), this.zza);
    }

    @Override // p153l.ay2
    /* JADX INFO: renamed from: c */
    public final void mo5078c() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // p153l.vkb0
    /* JADX INFO: renamed from: d */
    public final void mo5079d(C0875d c0875d, List<Purchase> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnPurchasesUpdated(c0875d.m4976b(), c0875d.m4975a(), (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // p153l.d10
    /* JADX INFO: renamed from: e */
    public final void mo5080e(C0875d c0875d) {
        nativeOnAcknowledgePurchaseResponse(c0875d.m4976b(), c0875d.m4975a(), this.zza);
    }

    @Override // p153l.y06
    /* JADX INFO: renamed from: f */
    public final void mo5081f(C0875d c0875d, String str) {
        nativeOnConsumePurchaseResponse(c0875d.m4976b(), c0875d.m4975a(), str, this.zza);
    }
}
