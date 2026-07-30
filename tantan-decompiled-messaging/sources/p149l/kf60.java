package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Ll/kf60;", "Ll/pzl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/ef60;", "paymentHandlerData", "Ll/n5;", "paymentComponent", "", "a", "(Ll/ef60;Ll/n5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kf60 implements pzl {

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

    public kf60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final void m145827e(kf60 kf60Var, Merchandise merchandise, final AbstractC18623n5 abstractC18623n5) throws Exception {
        j5b0 j5b0Var = kf60Var.mediator;
        if (j5b0Var != null) {
            j5b0Var.m139828X(merchandise.quantity);
        }
        e51.m114743H(kf60Var.act, new Runnable() { // from class: l.jf60
            @Override // java.lang.Runnable
            public final void run() {
                kf60.m145828f(abstractC18623n5);
            }
        }, 250L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m145828f(AbstractC18623n5 abstractC18623n5) {
        abstractC18623n5.m157957x(2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m145829g(kf60 kf60Var, ef60 ef60Var, AbstractC18623n5 abstractC18623n5) {
        hab0 purchaseTrack;
        j5b0 j5b0Var = kf60Var.mediator;
        if (j5b0Var != null && (purchaseTrack = j5b0Var.getPurchaseTrack()) != null) {
            purchaseTrack.m130121t(ef60Var, kf60Var.purchaseType, false);
        }
        abstractC18623n5.m157932D(ef60Var.getCurrentPayMethod());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @Override // p149l.pzl
    /* JADX INFO: renamed from: a */
    public boolean mo111438a(@NotNull final ef60 paymentHandlerData, @NotNull final AbstractC18623n5 paymentComponent) {
        C8765d c8765dM139830Z;
        hab0 purchaseTrack;
        l3b0 purchaseExtra;
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        boolean zM113438k = dsa.m113438k();
        if (p2b0.m167133h().m167157z() && !C8766e.m53650x(this.from)) {
            t4b.Companion companion = t4b.INSTANCE;
            if (!companion.m187167c(this.purchaseType) && (!companion.m187165a(this.purchaseType) || !zM113438k)) {
                C8765d currentPurchaseSection = paymentHandlerData.getCurrentPurchaseSection();
                final Merchandise merchandiseM53601s = (currentPurchaseSection.m53532n() ? currentPurchaseSection.m53520b() : currentPurchaseSection.m53522d()).m53601s();
                boolean z = (sab0.m182891i(this.purchaseType) || sab0.m182892j(this.purchaseType)) && TextUtils.equals(this.from, wek0.f185947a);
                boolean z2 = TEnum.equals(merchandiseM53601s.category, "svip") && merchandiseM53601s.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
                if (merchandiseM53601s.noneRenewable() && !z && (!merchandiseM53601s.yearly() || (merchandiseM53601s.yearly() && TEnum.equals(paymentHandlerData.getCurrentPayMethod(), "alipay") && !z2))) {
                    j5b0 j5b0Var = this.mediator;
                    JSONObject jSONObjectMo130106e = null;
                    if (j5b0Var == null || (purchaseExtra = j5b0Var.getPurchaseExtra()) == null || !purchaseExtra.getIsExtraSelected()) {
                        j5b0 j5b0Var2 = this.mediator;
                        if (j5b0Var2 != null) {
                            c8765dM139830Z = j5b0Var2.m139830Z(merchandiseM53601s.quantity);
                        } else {
                            c8765dM139830Z = null;
                        }
                    } else {
                        l3b0 purchaseExtra2 = this.mediator.getPurchaseExtra();
                        if (purchaseExtra2 != null) {
                            c8765dM139830Z = purchaseExtra2.m148379h(merchandiseM53601s.quantity);
                        } else {
                            c8765dM139830Z = null;
                        }
                    }
                    if (c8765dM139830Z != null) {
                        int iM53598p = c8765dM139830Z.m53520b().m53598p();
                        Act act = this.act;
                        CharSequence charSequenceM202851P = we60.m202851P(act, iM53598p, this.purchaseType);
                        j5b0 j5b0Var3 = this.mediator;
                        if (j5b0Var3 != null && (purchaseTrack = j5b0Var3.getPurchaseTrack()) != null) {
                            jSONObjectMo130106e = purchaseTrack.mo130106e();
                        }
                        we60.m202858W(act, charSequenceM202851P, jSONObjectMo130106e, new d30() { // from class: l.hf60
                            @Override // p149l.d30
                            public final void call() throws Exception {
                                kf60.m145827e(this.f107453a, merchandiseM53601s, paymentComponent);
                            }
                        }, new d30() { // from class: l.if60
                            @Override // p149l.d30
                            public final void call() {
                                kf60.m145829g(this.f112960a, paymentHandlerData, paymentComponent);
                            }
                        });
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
