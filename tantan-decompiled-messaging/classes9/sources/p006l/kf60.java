package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import l.d30;
import l.e51;
import l.p2b0;
import l.sab0;
import l.we60;
import l.wek0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll/kf60;", "Ll/pzl;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/ef60;", "paymentHandlerData", "Ll/n5;", "paymentComponent", "", "a", "(Ll/ef60;Ll/n5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "d", "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final void m18120e(kf60 kf60Var, Merchandise merchandise, final AbstractC1040n5 abstractC1040n5) {
        j5b0 j5b0Var = kf60Var.mediator;
        if (j5b0Var != null) {
            j5b0Var.m17274X(merchandise.quantity);
        }
        e51.H(kf60Var.act, new Runnable() { // from class: l.jf60
            @Override // java.lang.Runnable
            public final void run() {
                kf60.m18121f(abstractC1040n5);
            }
        }, 250L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m18121f(AbstractC1040n5 abstractC1040n5) {
        abstractC1040n5.m19684x(2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m18122g(kf60 kf60Var, ef60 ef60Var, AbstractC1040n5 abstractC1040n5) {
        hab0 purchaseTrack;
        j5b0 j5b0Var = kf60Var.mediator;
        if (j5b0Var != null && (purchaseTrack = j5b0Var.getPurchaseTrack()) != null) {
            purchaseTrack.m16128t(ef60Var, kf60Var.purchaseType, false);
        }
        abstractC1040n5.m19659D(ef60Var.getCurrentPayMethod());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    @Override // p006l.pzl
    /* JADX INFO: renamed from: a */
    public boolean mo14019a(@NotNull final ef60 paymentHandlerData, @NotNull final AbstractC1040n5 paymentComponent) {
        d dVarM17276Z;
        hab0 purchaseTrack;
        l3b0 purchaseExtra;
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        boolean zM14203k = dsa.m14203k();
        if (p2b0.h().z() && !e.x(this.from)) {
            t4b.Companion companion = t4b.INSTANCE;
            if (!companion.m24458c(this.purchaseType) && (!companion.m24456a(this.purchaseType) || !zM14203k)) {
                d currentPurchaseSection = paymentHandlerData.getCurrentPurchaseSection();
                final Merchandise merchandiseS = (currentPurchaseSection.n() ? currentPurchaseSection.b() : currentPurchaseSection.d()).s();
                boolean z = (sab0.i(this.purchaseType) || sab0.j(this.purchaseType)) && TextUtils.equals(this.from, wek0.a);
                boolean z2 = TEnum.equals(merchandiseS.category, "svip") && merchandiseS.isBelongPromotion("lowPriceFirstTime12MSVIP");
                if (merchandiseS.noneRenewable() && !z && (!merchandiseS.yearly() || (merchandiseS.yearly() && TEnum.equals(paymentHandlerData.getCurrentPayMethod(), "alipay") && !z2))) {
                    j5b0 j5b0Var = this.mediator;
                    JSONObject jSONObjectMo16113e = null;
                    if (j5b0Var == null || (purchaseExtra = j5b0Var.getPurchaseExtra()) == null || !purchaseExtra.getIsExtraSelected()) {
                        j5b0 j5b0Var2 = this.mediator;
                        if (j5b0Var2 != null) {
                            dVarM17276Z = j5b0Var2.m17276Z(merchandiseS.quantity);
                        } else {
                            dVarM17276Z = null;
                        }
                    } else {
                        l3b0 purchaseExtra2 = this.mediator.getPurchaseExtra();
                        if (purchaseExtra2 != null) {
                            dVarM17276Z = purchaseExtra2.m18553h(merchandiseS.quantity);
                        } else {
                            dVarM17276Z = null;
                        }
                    }
                    if (dVarM17276Z != null) {
                        int iP = dVarM17276Z.b().p();
                        Act act = this.act;
                        CharSequence charSequenceP = we60.P(act, iP, this.purchaseType);
                        j5b0 j5b0Var3 = this.mediator;
                        if (j5b0Var3 != null && (purchaseTrack = j5b0Var3.getPurchaseTrack()) != null) {
                            jSONObjectMo16113e = purchaseTrack.mo16113e();
                        }
                        we60.W(act, charSequenceP, jSONObjectMo16113e, new d30() { // from class: l.hf60
                            public final void call() {
                                kf60.m18120e(this.f13857a, merchandiseS, paymentComponent);
                            }
                        }, new d30() { // from class: l.if60
                            public final void call() {
                                kf60.m18122g(this.f14420a, paymentHandlerData, paymentComponent);
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
