package p006l;

import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b%\u0010)R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Ll/ef60;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "currentPurchaseSectionSource", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "refundAmount", "Ll/bi60;", "paymentTextResponseData", "", "paymentTrackSource", "Ll/e30;", "dialogStateAction", "<init>", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;DLl/bi60;Ljava/lang/Integer;Ll/e30;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "b", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "c", "Lcom/p1/mobile/putong/data/PayMethod;", "()Lcom/p1/mobile/putong/data/PayMethod;", "d", "D", "f", "()D", "e", "Ll/bi60;", "()Ll/bi60;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "Ll/e30;", "getDialogStateAction", "()Ll/e30;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ef60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final d currentPurchaseSection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final d currentPurchaseSectionSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PayMethod currentPayMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final double refundAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final bi60 paymentTextResponseData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Integer paymentTrackSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final e30<Integer> dialogStateAction;

    public ef60(@NotNull d dVar, @Nullable d dVar2, @NotNull PayMethod payMethod, double d, @Nullable bi60 bi60Var, @Nullable Integer num, @Nullable e30<Integer> e30Var) {
        dVar.getClass();
        payMethod.getClass();
        this.currentPurchaseSection = dVar;
        this.currentPurchaseSectionSource = dVar2;
        this.currentPayMethod = payMethod;
        this.refundAmount = d;
        this.paymentTextResponseData = bi60Var;
        this.paymentTrackSource = num;
        this.dialogStateAction = e30Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PayMethod getCurrentPayMethod() {
        return this.currentPayMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getCurrentPurchaseSectionSource() {
        return this.currentPurchaseSectionSource;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final bi60 getPaymentTextResponseData() {
        return this.paymentTextResponseData;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getPaymentTrackSource() {
        return this.paymentTrackSource;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ef60)) {
            return false;
        }
        ef60 ef60Var = (ef60) other;
        return Intrinsics.d(this.currentPurchaseSection, ef60Var.currentPurchaseSection) && Intrinsics.d(this.currentPurchaseSectionSource, ef60Var.currentPurchaseSectionSource) && Intrinsics.d(this.currentPayMethod, ef60Var.currentPayMethod) && Double.compare(this.refundAmount, ef60Var.refundAmount) == 0 && Intrinsics.d(this.paymentTextResponseData, ef60Var.paymentTextResponseData) && Intrinsics.d(this.paymentTrackSource, ef60Var.paymentTrackSource) && Intrinsics.d(this.dialogStateAction, ef60Var.dialogStateAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getRefundAmount() {
        return this.refundAmount;
    }

    public int hashCode() {
        int iHashCode = this.currentPurchaseSection.hashCode() * 31;
        d dVar = this.currentPurchaseSectionSource;
        int iHashCode2 = (((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.currentPayMethod.hashCode()) * 31) + Double.hashCode(this.refundAmount)) * 31;
        bi60 bi60Var = this.paymentTextResponseData;
        int iHashCode3 = (iHashCode2 + (bi60Var == null ? 0 : bi60Var.hashCode())) * 31;
        Integer num = this.paymentTrackSource;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        e30<Integer> e30Var = this.dialogStateAction;
        return iHashCode4 + (e30Var != null ? e30Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentHandlerData(currentPurchaseSection=" + this.currentPurchaseSection + ", currentPurchaseSectionSource=" + this.currentPurchaseSectionSource + ", currentPayMethod=" + this.currentPayMethod + ", refundAmount=" + this.refundAmount + ", paymentTextResponseData=" + this.paymentTextResponseData + ", paymentTrackSource=" + this.paymentTrackSource + ", dialogStateAction=" + this.dialogStateAction + ")";
    }
}
