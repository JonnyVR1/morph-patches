package com.p051p1.mobile.putong.core.data;

/* JADX INFO: loaded from: classes10.dex */
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
