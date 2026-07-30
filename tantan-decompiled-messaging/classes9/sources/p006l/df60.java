package p006l;

import android.text.SpannableStringBuilder;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import kotlin.Metadata;
import l.d30;
import l.e51;
import l.sab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll/df60;", "Ll/pzl;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/ef60;", "paymentHandlerData", "Ll/n5;", "paymentComponent", "", "a", "(Ll/ef60;Ll/n5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "d", "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class df60 implements pzl {

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

    public df60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m14015d(df60 df60Var, ef60 ef60Var, final AbstractC1040n5 abstractC1040n5) {
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.CHECKED;
        j5b0 j5b0Var = df60Var.mediator;
        d currentPurchaseSectionSource = ef60Var.getCurrentPurchaseSectionSource();
        if (currentPurchaseSectionSource == null) {
            currentPurchaseSectionSource = ef60Var.getCurrentPurchaseSection();
        }
        j5b0Var.m17272V(currentPurchaseSectionSource, purchaseAgreementState);
        e51.H(df60Var.act, new Runnable() { // from class: l.bf60
            @Override // java.lang.Runnable
            public final void run() {
                df60.m14017f(abstractC1040n5);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m14016e(ef60 ef60Var, df60 df60Var, int i, final AbstractC1040n5 abstractC1040n5) {
        if (ef60Var.getCurrentPurchaseSection().b().s().monthType()) {
            dsa.m14208p();
            final boolean zM17275Y = df60Var.mediator.m17275Y(i);
            e51.H(df60Var.act, new Runnable() { // from class: l.cf60
                @Override // java.lang.Runnable
                public final void run() {
                    df60.m14018g(zM17275Y, abstractC1040n5);
                }
            }, 250L);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m14017f(AbstractC1040n5 abstractC1040n5) {
        abstractC1040n5.m19684x(3);
    }

    /* JADX INFO: renamed from: g */
    public static final void m14018g(boolean z, AbstractC1040n5 abstractC1040n5) {
        if (z) {
            abstractC1040n5.m19684x(4);
        }
    }

    @Override // p006l.pzl
    /* JADX INFO: renamed from: a */
    public boolean mo14019a(@NotNull final ef60 paymentHandlerData, @NotNull final AbstractC1040n5 paymentComponent) {
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        if (!dsa.m14211s("") || !sab0.d(this.purchaseType)) {
            return false;
        }
        j5b0 j5b0Var = this.mediator;
        if ((j5b0Var != null ? j5b0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.UNCHECKED || !paymentHandlerData.getCurrentPurchaseSection().m() || e.x(this.from)) {
            return false;
        }
        t4b.Companion companion = t4b.INSTANCE;
        if (!companion.m24458c(this.purchaseType) && !companion.m24456a(this.purchaseType)) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilderM14204l = dsa.m14204l(paymentHandlerData.getCurrentPurchaseSection().b().p(), this.purchaseType);
        final int i = paymentHandlerData.getCurrentPurchaseSection().b().s().quantity;
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        hab0 purchaseTrack = this.mediator.getPurchaseTrack();
        dsa.m14192D(act, spannableStringBuilderM14204l, purchaseType, purchaseTrack != null ? purchaseTrack.mo16113e() : null, new d30() { // from class: l.ze60
            public final void call() {
                df60.m14015d(this.f28722a, paymentHandlerData, paymentComponent);
            }
        }, new d30() { // from class: l.af60
            public final void call() {
                df60.m14016e(paymentHandlerData, this, i, paymentComponent);
            }
        });
        return true;
    }
}
