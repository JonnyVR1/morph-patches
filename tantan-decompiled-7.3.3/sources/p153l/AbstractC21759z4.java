package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.z4 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/z4;", "Ll/w3m;", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "c", "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "currentAgreementState", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class AbstractC21759z4 implements w3m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public PurchaseAgreementState currentAgreementState;

    @Override // p153l.w3m
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo152867b() {
        super.mo152867b();
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PurchaseAgreementState getCurrentAgreementState() {
        return this.currentAgreementState;
    }

    /* JADX INFO: renamed from: d */
    public final void m218525d(@Nullable PurchaseAgreementState purchaseAgreementState) {
        this.currentAgreementState = purchaseAgreementState;
    }
}
