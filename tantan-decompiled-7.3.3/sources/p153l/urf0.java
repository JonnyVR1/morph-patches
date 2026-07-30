package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\f¨\u0006\u001b"}, m88121d2 = {"Ll/urf0;", "", "", FirebaseAnalytics.Param.QUANTITY, "", "totalPrice", "unitPrice", "", "currencySymbol", "<init>", "(IDDLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "c", "()D", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class urf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int quantity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double totalPrice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final double unitPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String currencySymbol;

    public urf0(int i, double d, double d2, @NotNull String str) {
        str.getClass();
        this.quantity = i;
        this.totalPrice = d;
        this.unitPrice = d2;
        this.currencySymbol = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getUnitPrice() {
        return this.unitPrice;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof urf0)) {
            return false;
        }
        urf0 urf0Var = (urf0) other;
        return this.quantity == urf0Var.quantity && Double.compare(this.totalPrice, urf0Var.totalPrice) == 0 && Double.compare(this.unitPrice, urf0Var.unitPrice) == 0 && Intrinsics.m88377d(this.currencySymbol, urf0Var.currencySymbol);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.quantity) * 31) + Double.hashCode(this.totalPrice)) * 31) + Double.hashCode(this.unitPrice)) * 31) + this.currencySymbol.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkuInfo(quantity=" + this.quantity + ", totalPrice=" + this.totalPrice + ", unitPrice=" + this.unitPrice + ", currencySymbol=" + this.currencySymbol + ")";
    }
}
