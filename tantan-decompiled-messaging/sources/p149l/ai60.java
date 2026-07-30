package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.PayMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m87232d2 = {"Ll/ai60;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "refundAmount", "", "showSticker", "<init>", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/data/PayMethod;DZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "b", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "Lcom/p1/mobile/putong/data/PayMethod;", "()Lcom/p1/mobile/putong/data/PayMethod;", "c", "D", "()D", Constants.INAPP_DATA_TAG, "Z", "()Z", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class ai60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C8765d purchaseSection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PayMethod payMethod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final double refundAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean showSticker;

    public /* synthetic */ ai60(C8765d c8765d, PayMethod payMethod, double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c8765d, payMethod, (i & 4) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d, (i & 8) != 0 ? true : z);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PayMethod getPayMethod() {
        return this.payMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C8765d getPurchaseSection() {
        return this.purchaseSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowSticker() {
        return this.showSticker;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ai60)) {
            return false;
        }
        ai60 ai60Var = (ai60) other;
        return Intrinsics.m87488d(this.purchaseSection, ai60Var.purchaseSection) && Intrinsics.m87488d(this.payMethod, ai60Var.payMethod) && Double.compare(this.refundAmount, ai60Var.refundAmount) == 0 && this.showSticker == ai60Var.showSticker;
    }

    public int hashCode() {
        return (((((this.purchaseSection.hashCode() * 31) + this.payMethod.hashCode()) * 31) + Double.hashCode(this.refundAmount)) * 31) + Boolean.hashCode(this.showSticker);
    }

    @NotNull
    public String toString() {
        return "PaymentTextRequestData(purchaseSection=" + this.purchaseSection + ", payMethod=" + this.payMethod + ", refundAmount=" + this.refundAmount + ", showSticker=" + this.showSticker + ")";
    }

    public ai60(@NotNull C8765d c8765d, @NotNull PayMethod payMethod, double d, boolean z) {
        c8765d.getClass();
        payMethod.getClass();
        this.purchaseSection = c8765d;
        this.payMethod = payMethod;
        this.refundAmount = d;
        this.showSticker = z;
    }
}
