package p153l;

import android.text.SpannableStringBuilder;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/in60;", "Ll/j2m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Ll/jn60;", "paymentHandlerData", "Ll/l5;", "paymentComponent", "", "a", "(Ll/jn60;Ll/l5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/ndb0;", "getMediator", "()Ll/ndb0;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class in60 implements j2m {

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

    public in60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m141034d(in60 in60Var, jn60 jn60Var, final AbstractC18347l5 abstractC18347l5) throws Exception {
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.CHECKED;
        ndb0 ndb0Var = in60Var.mediator;
        C8928d currentPurchaseSectionSource = jn60Var.getCurrentPurchaseSectionSource();
        if (currentPurchaseSectionSource == null) {
            currentPurchaseSectionSource = jn60Var.getCurrentPurchaseSection();
        }
        ndb0Var.m162670V(currentPurchaseSectionSource, purchaseAgreementState);
        l51.m152888H(in60Var.act, new Runnable() { // from class: l.gn60
            @Override // java.lang.Runnable
            public final void run() {
                in60.m141036f(abstractC18347l5);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: e */
    public static void m141035e(jn60 jn60Var, in60 in60Var, int i, final AbstractC18347l5 abstractC18347l5) throws Exception {
        if (jn60Var.getCurrentPurchaseSection().m54703b().m54784s().monthType()) {
            pta.m173723p();
            final boolean zM162673Y = in60Var.mediator.m162673Y(i);
            l51.m152888H(in60Var.act, new Runnable() { // from class: l.hn60
                @Override // java.lang.Runnable
                public final void run() {
                    in60.m141037g(zM162673Y, abstractC18347l5);
                }
            }, 250L);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m141036f(AbstractC18347l5 abstractC18347l5) {
        abstractC18347l5.m152879x(3);
    }

    /* JADX INFO: renamed from: g */
    public static final void m141037g(boolean z, AbstractC18347l5 abstractC18347l5) {
        if (z) {
            abstractC18347l5.m152879x(4);
        }
    }

    @Override // p153l.j2m
    /* JADX INFO: renamed from: a */
    public boolean mo117054a(@NotNull final jn60 paymentHandlerData, @NotNull final AbstractC18347l5 paymentComponent) {
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        if (!pta.m173726s("") || !wib0.m206560d(this.purchaseType)) {
            return false;
        }
        ndb0 ndb0Var = this.mediator;
        if ((ndb0Var != null ? ndb0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.UNCHECKED || !paymentHandlerData.getCurrentPurchaseSection().m54714m() || C8929e.m54833x(this.from)) {
            return false;
        }
        g6b.Companion companion = g6b.INSTANCE;
        if (!companion.m129218c(this.purchaseType) && !companion.m129216a(this.purchaseType)) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilderM173719l = pta.m173719l(paymentHandlerData.getCurrentPurchaseSection().m54703b().m54781p(), this.purchaseType);
        final int i = paymentHandlerData.getCurrentPurchaseSection().m54703b().m54784s().quantity;
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        lib0 purchaseTrack = this.mediator.getPurchaseTrack();
        pta.m173707D(act, spannableStringBuilderM173719l, purchaseType, purchaseTrack != null ? purchaseTrack.mo103692e() : null, new x20() { // from class: l.en60
            @Override // p153l.x20
            public final void call() throws Exception {
                in60.m141034d(this.f94727a, paymentHandlerData, paymentComponent);
            }
        }, new x20() { // from class: l.fn60
            @Override // p153l.x20
            public final void call() throws Exception {
                in60.m141035e(paymentHandlerData, this, i, paymentComponent);
            }
        });
        return true;
    }
}
