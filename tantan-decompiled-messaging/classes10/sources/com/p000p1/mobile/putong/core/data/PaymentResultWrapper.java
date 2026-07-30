package com.p000p1.mobile.putong.core.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PaymentResultWrapper {
    public boolean fromSign;
    public PurchaseType purchaseType;
    public Object tag;

    public PaymentResultWrapper(PurchaseType purchaseType, Object obj) {
        this.purchaseType = purchaseType;
        this.tag = obj;
    }

    public PaymentResultWrapper(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }
}
