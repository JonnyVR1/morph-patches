package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/pn60;", "Ll/j2m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Ll/jn60;", "paymentHandlerData", "Ll/l5;", "paymentComponent", "", "a", "(Ll/jn60;Ll/l5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/ndb0;", "getMediator", "()Ll/ndb0;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pn60 implements j2m {

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
    public final ndb0 mediator;

    public pn60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final void m173035e(pn60 pn60Var, Merchandise merchandise, final AbstractC18347l5 abstractC18347l5) throws Exception {
        ndb0 ndb0Var = pn60Var.mediator;
        if (ndb0Var != null) {
            ndb0Var.m162672X(merchandise.quantity);
        }
        l51.m152888H(pn60Var.act, new Runnable() { // from class: l.on60
            @Override // java.lang.Runnable
            public final void run() {
                pn60.m173036f(abstractC18347l5);
            }
        }, 250L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m173036f(AbstractC18347l5 abstractC18347l5) {
        abstractC18347l5.m152879x(2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m173037g(pn60 pn60Var, jn60 jn60Var, AbstractC18347l5 abstractC18347l5) {
        lib0 purchaseTrack;
        ndb0 ndb0Var = pn60Var.mediator;
        if (ndb0Var != null && (purchaseTrack = ndb0Var.getPurchaseTrack()) != null) {
            purchaseTrack.m154343t(jn60Var, pn60Var.purchaseType, false);
        }
        abstractC18347l5.m152853D(jn60Var.getCurrentPayMethod());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @Override // p153l.j2m
    /* JADX INFO: renamed from: a */
    public boolean mo117054a(@NotNull final jn60 paymentHandlerData, @NotNull final AbstractC18347l5 paymentComponent) {
        C8928d c8928dM162674Z;
        lib0 purchaseTrack;
        pbb0 purchaseExtra;
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        boolean zM173718k = pta.m173718k();
        if (tab0.m189811h().m189835z() && !C8929e.m54833x(this.from)) {
            g6b.Companion companion = g6b.INSTANCE;
            if (!companion.m129218c(this.purchaseType) && (!companion.m129216a(this.purchaseType) || !zM173718k)) {
                C8928d currentPurchaseSection = paymentHandlerData.getCurrentPurchaseSection();
                final Merchandise merchandiseM54784s = (currentPurchaseSection.m54715n() ? currentPurchaseSection.m54703b() : currentPurchaseSection.m54705d()).m54784s();
                boolean z = (wib0.m206565i(this.purchaseType) || wib0.m206566j(this.purchaseType)) && TextUtils.equals(this.from, cok0.f82895a);
                boolean z2 = TEnum.equals(merchandiseM54784s.category, "svip") && merchandiseM54784s.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
                if (merchandiseM54784s.noneRenewable() && !z && (!merchandiseM54784s.yearly() || (merchandiseM54784s.yearly() && TEnum.equals(paymentHandlerData.getCurrentPayMethod(), "alipay") && !z2))) {
                    ndb0 ndb0Var = this.mediator;
                    JSONObject jSONObjectMo103692e = null;
                    if (ndb0Var == null || (purchaseExtra = ndb0Var.getPurchaseExtra()) == null || !purchaseExtra.getIsExtraSelected()) {
                        ndb0 ndb0Var2 = this.mediator;
                        if (ndb0Var2 != null) {
                            c8928dM162674Z = ndb0Var2.m162674Z(merchandiseM54784s.quantity);
                        } else {
                            c8928dM162674Z = null;
                        }
                    } else {
                        pbb0 purchaseExtra2 = this.mediator.getPurchaseExtra();
                        if (purchaseExtra2 != null) {
                            c8928dM162674Z = purchaseExtra2.m171500h(merchandiseM54784s.quantity);
                        } else {
                            c8928dM162674Z = null;
                        }
                    }
                    if (c8928dM162674Z != null) {
                        int iM54781p = c8928dM162674Z.m54703b().m54781p();
                        Act act = this.act;
                        CharSequence charSequenceM105333P = bn60.m105333P(act, iM54781p, this.purchaseType);
                        ndb0 ndb0Var3 = this.mediator;
                        if (ndb0Var3 != null && (purchaseTrack = ndb0Var3.getPurchaseTrack()) != null) {
                            jSONObjectMo103692e = purchaseTrack.mo103692e();
                        }
                        bn60.m105340W(act, charSequenceM105333P, jSONObjectMo103692e, new x20() { // from class: l.mn60
                            @Override // p153l.x20
                            public final void call() throws Exception {
                                pn60.m173035e(this.f137649a, merchandiseM54784s, paymentComponent);
                            }
                        }, new x20() { // from class: l.nn60
                            @Override // p153l.x20
                            public final void call() {
                                pn60.m173037g(this.f142759a, paymentHandlerData, paymentComponent);
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
