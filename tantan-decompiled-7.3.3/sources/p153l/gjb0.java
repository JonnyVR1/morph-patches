package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/gjb0;", "Ll/ndb0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", "h0", "(Ljava/util/List;)V", "w", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "agreementState", "e", "(Ljava/util/List;Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "section", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", ResourceDirection.f39656v, "Ljava/util/List;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gjb0 extends ndb0 {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final List<Merchandise> merchandises;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(act, purchaseType, str);
        act.getClass();
        purchaseType.getClass();
        this.merchandises = new ArrayList();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a
    /* JADX INFO: renamed from: e */
    public void mo55205e(@NotNull List<? extends C8928d> sections, @NotNull PayMethod payMethod, @NotNull PurchaseAgreementState agreementState) {
        sections.getClass();
        payMethod.getClass();
        agreementState.getClass();
        if (!pta.m173727t(null, 1, null)) {
            super.mo55205e(sections, payMethod, agreementState);
            return;
        }
        for (C8928d c8928d : sections) {
            c8928d.m54724w(m55203R(c8928d, payMethod));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a
    /* JADX INFO: renamed from: f */
    public void mo55206f(@NotNull C8928d section, @NotNull PurchaseAgreementState agreementState) {
        section.getClass();
        agreementState.getClass();
        if (pta.m173727t(null, 1, null)) {
            section.m54724w(true);
        } else {
            super.mo55206f(section, agreementState);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m130466h0(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        this.merchandises.clear();
        this.merchandises.addAll(merchandises);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a
    @NotNull
    /* JADX INFO: renamed from: t */
    public PurchaseAgreementState mo55220t() {
        return pta.m173727t(null, 1, null) ? PurchaseAgreementState.UNCHECKED : super.mo55220t();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a
    /* JADX INFO: renamed from: w */
    public void mo55223w() throws Exception {
        m55196K();
        m55200O(new ory(getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPurchaseType()).m168947d().m168946c(this.merchandises));
        m55222v();
        m55197L();
    }
}
