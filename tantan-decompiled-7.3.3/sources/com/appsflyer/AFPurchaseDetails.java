package com.appsflyer;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, m88121d2 = {"Lcom/appsflyer/AFPurchaseDetails;", "", "Lcom/appsflyer/AFPurchaseType;", "purchaseType", "", "purchaseToken", "productId", FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.CURRENCY, "<init>", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/AFPurchaseType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", Constants.COPY_TYPE, "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/AFPurchaseDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrency", "getPrice", "getProductId", "getPurchaseToken", "Lcom/appsflyer/AFPurchaseType;", "getPurchaseType"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final /* data */ class AFPurchaseDetails {

    @NotNull
    private final String currency;

    @NotNull
    private final String price;

    @NotNull
    private final String productId;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        aFPurchaseType.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
        this.price = str3;
        this.currency = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        if ((i & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        if ((i & 8) != 0) {
            str3 = aFPurchaseDetails.price;
        }
        if ((i & 16) != 0) {
            str4 = aFPurchaseDetails.currency;
        }
        String str5 = str4;
        String str6 = str2;
        return aFPurchaseDetails.copy(aFPurchaseType, str, str6, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final AFPurchaseDetails copy(@NotNull AFPurchaseType purchaseType, @NotNull String purchaseToken, @NotNull String productId, @NotNull String price, @NotNull String currency) {
        purchaseType.getClass();
        purchaseToken.getClass();
        productId.getClass();
        price.getClass();
        currency.getClass();
        return new AFPurchaseDetails(purchaseType, purchaseToken, productId, price, currency);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) other;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.m88377d(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.m88377d(this.productId, aFPurchaseDetails.productId) && Intrinsics.m88377d(this.price, aFPurchaseDetails.price) && Intrinsics.m88377d(this.currency, aFPurchaseDetails.currency);
    }

    @JvmName
    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @JvmName
    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @JvmName
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @JvmName
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @JvmName
    @NotNull
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return (((((((this.purchaseType.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.currency.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AFPurchaseDetails(purchaseType=");
        sb.append(this.purchaseType);
        sb.append(", purchaseToken=");
        sb.append(this.purchaseToken);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(')');
        return sb.toString();
    }
}
