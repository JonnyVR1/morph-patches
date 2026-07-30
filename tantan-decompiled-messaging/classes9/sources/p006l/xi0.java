package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll/xi0;", "Ll/o5;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)V", "section", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Z", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xi0 extends AbstractC1073o5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(@NotNull PurchaseType purchaseType, @NotNull List<? extends d> list) {
        super(purchaseType, list);
        purchaseType.getClass();
        list.getClass();
    }

    @Override // p006l.AbstractC1073o5
    /* JADX INFO: renamed from: a */
    public boolean mo14551a(@NotNull d section, @Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        section.getClass();
        return false;
    }
}
