package p006l;

import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b!\u0010$R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"Ll/fd0;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "purchasePageType", "isInNewMyTab", "privilegeStyle", "vipFrag", "<init>", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "b", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "c", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/data/PayMethod;", "()Lcom/p1/mobile/putong/data/PayMethod;", "d", "Z", "e", "()Z", "g", "isInNewMyTab$annotations", "()V", "f", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class fd0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final d.a detail;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Merchandise merchandise;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final PayMethod currentPayMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean purchasePageType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isInNewMyTab;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean privilegeStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean vipFrag;

    public /* synthetic */ fd0(d.a aVar, Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, merchandise, payMethod, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PayMethod getCurrentPayMethod() {
        return this.currentPayMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d.a getDetail() {
        return this.detail;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Merchandise getMerchandise() {
        return this.merchandise;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPrivilegeStyle() {
        return this.privilegeStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPurchasePageType() {
        return this.purchasePageType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) other;
        return Intrinsics.d(this.detail, fd0Var.detail) && Intrinsics.d(this.merchandise, fd0Var.merchandise) && Intrinsics.d(this.currentPayMethod, fd0Var.currentPayMethod) && this.purchasePageType == fd0Var.purchasePageType && this.isInNewMyTab == fd0Var.isInNewMyTab && this.privilegeStyle == fd0Var.privilegeStyle && this.vipFrag == fd0Var.vipFrag;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getVipFrag() {
        return this.vipFrag;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsInNewMyTab() {
        return this.isInNewMyTab;
    }

    public int hashCode() {
        int iHashCode = ((this.detail.hashCode() * 31) + this.merchandise.hashCode()) * 31;
        PayMethod payMethod = this.currentPayMethod;
        return ((((((((iHashCode + (payMethod == null ? 0 : payMethod.hashCode())) * 31) + Boolean.hashCode(this.purchasePageType)) * 31) + Boolean.hashCode(this.isInNewMyTab)) * 31) + Boolean.hashCode(this.privilegeStyle)) * 31) + Boolean.hashCode(this.vipFrag);
    }

    @NotNull
    public String toString() {
        return "AgreementTextRequestData(detail=" + this.detail + ", merchandise=" + this.merchandise + ", currentPayMethod=" + this.currentPayMethod + ", purchasePageType=" + this.purchasePageType + ", isInNewMyTab=" + this.isInNewMyTab + ", privilegeStyle=" + this.privilegeStyle + ", vipFrag=" + this.vipFrag + ")";
    }

    public fd0(@NotNull d.a aVar, @NotNull Merchandise merchandise, @Nullable PayMethod payMethod, boolean z, boolean z2, boolean z3, boolean z4) {
        aVar.getClass();
        merchandise.getClass();
        this.detail = aVar;
        this.merchandise = merchandise;
        this.currentPayMethod = payMethod;
        this.purchasePageType = z;
        this.isInNewMyTab = z2;
        this.privilegeStyle = z3;
        this.vipFrag = z4;
    }
}
