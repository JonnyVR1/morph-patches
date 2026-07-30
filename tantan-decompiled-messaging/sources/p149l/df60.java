package p149l;

import android.text.SpannableStringBuilder;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Ll/df60;", "Ll/pzl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/ef60;", "paymentHandlerData", "Ll/n5;", "paymentComponent", "", "a", "(Ll/ef60;Ll/n5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/j5b0;", "getMediator", "()Ll/j5b0;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m111434d(df60 df60Var, ef60 ef60Var, final AbstractC18623n5 abstractC18623n5) throws Exception {
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.CHECKED;
        j5b0 j5b0Var = df60Var.mediator;
        C8765d currentPurchaseSectionSource = ef60Var.getCurrentPurchaseSectionSource();
        if (currentPurchaseSectionSource == null) {
            currentPurchaseSectionSource = ef60Var.getCurrentPurchaseSection();
        }
        j5b0Var.m139826V(currentPurchaseSectionSource, purchaseAgreementState);
        e51.m114743H(df60Var.act, new Runnable() { // from class: l.bf60
            @Override // java.lang.Runnable
            public final void run() {
                df60.m111436f(abstractC18623n5);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m111435e(ef60 ef60Var, df60 df60Var, int i, final AbstractC18623n5 abstractC18623n5) throws Exception {
        if (ef60Var.getCurrentPurchaseSection().m53520b().m53601s().monthType()) {
            dsa.m113443p();
            final boolean zM139829Y = df60Var.mediator.m139829Y(i);
            e51.m114743H(df60Var.act, new Runnable() { // from class: l.cf60
                @Override // java.lang.Runnable
                public final void run() {
                    df60.m111437g(zM139829Y, abstractC18623n5);
                }
            }, 250L);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m111436f(AbstractC18623n5 abstractC18623n5) {
        abstractC18623n5.m157957x(3);
    }

    /* JADX INFO: renamed from: g */
    public static final void m111437g(boolean z, AbstractC18623n5 abstractC18623n5) {
        if (z) {
            abstractC18623n5.m157957x(4);
        }
    }

    @Override // p149l.pzl
    /* JADX INFO: renamed from: a */
    public boolean mo111438a(@NotNull final ef60 paymentHandlerData, @NotNull final AbstractC18623n5 paymentComponent) {
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        if (!dsa.m113446s("") || !sab0.m182886d(this.purchaseType)) {
            return false;
        }
        j5b0 j5b0Var = this.mediator;
        if ((j5b0Var != null ? j5b0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.UNCHECKED || !paymentHandlerData.getCurrentPurchaseSection().m53531m() || C8766e.m53650x(this.from)) {
            return false;
        }
        t4b.Companion companion = t4b.INSTANCE;
        if (!companion.m187167c(this.purchaseType) && !companion.m187165a(this.purchaseType)) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilderM113439l = dsa.m113439l(paymentHandlerData.getCurrentPurchaseSection().m53520b().m53598p(), this.purchaseType);
        final int i = paymentHandlerData.getCurrentPurchaseSection().m53520b().m53601s().quantity;
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        hab0 purchaseTrack = this.mediator.getPurchaseTrack();
        dsa.m113427D(act, spannableStringBuilderM113439l, purchaseType, purchaseTrack != null ? purchaseTrack.mo130106e() : null, new d30() { // from class: l.ze60
            @Override // p149l.d30
            public final void call() throws Exception {
                df60.m111434d(this.f202782a, paymentHandlerData, paymentComponent);
            }
        }, new d30() { // from class: l.af60
            @Override // p149l.d30
            public final void call() throws Exception {
                df60.m111435e(paymentHandlerData, this, i, paymentComponent);
            }
        });
        return true;
    }
}
