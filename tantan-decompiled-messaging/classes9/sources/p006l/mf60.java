package p006l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import l.lsi0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll/mf60;", "Ll/pzl;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/ef60;", "paymentHandlerData", "Ll/n5;", "paymentComponent", "", "a", "(Ll/ef60;Ll/n5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "d", "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mf60 implements pzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final j5b0 mediator;

    public mf60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    @Override // p006l.pzl
    /* JADX INFO: renamed from: a */
    public boolean mo14019a(@NotNull ef60 paymentHandlerData, @NotNull AbstractC1040n5 paymentComponent) {
        hab0 purchaseTrack;
        String purchaseTrackId;
        hab0 purchaseTrack2;
        String purchaseTrackId2;
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        d currentPurchaseSection = paymentHandlerData.getCurrentPurchaseSection();
        d.a aVarB = currentPurchaseSection.n() ? currentPurchaseSection.b() : currentPurchaseSection.d();
        Merchandise merchandiseS = aVarB.s();
        double d = merchandiseS.defaultStockKeepUnit.prices.price;
        if (merchandiseS.yearly() || !TEnum.equals(aVarB.f(), "svip") || d > paymentHandlerData.getRefundAmount()) {
            return false;
        }
        lsi0.w(R.string.v1);
        boolean zEquals = TEnum.equals(paymentHandlerData.getCurrentPayMethod(), "wechat");
        j5b0 j5b0Var = this.mediator;
        if (zEquals) {
            if (j5b0Var == null || (purchaseTrack2 = j5b0Var.getPurchaseTrack()) == null || (purchaseTrackId2 = purchaseTrack2.getPurchaseTrackId()) == null) {
                return true;
            }
            hab0.Companion companion = hab0.INSTANCE;
            String str = merchandiseS.defaultStockKeepUnit.id;
            str.getClass();
            companion.m16140g(purchaseTrackId2, str, "refund more");
            return true;
        }
        if (j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null || (purchaseTrackId = purchaseTrack.getPurchaseTrackId()) == null) {
            return true;
        }
        hab0.Companion companion2 = hab0.INSTANCE;
        String str2 = merchandiseS.defaultStockKeepUnit.id;
        str2.getClass();
        companion2.m16134a(purchaseTrackId, str2, "refund more");
        return true;
    }
}
