package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/pd80;", "Ll/m5;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)V", "section", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pd80 extends AbstractC18548m5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd80(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8928d> list) {
        super(purchaseType, list);
        purchaseType.getClass();
        list.getClass();
    }

    @Override // p153l.AbstractC18548m5
    /* JADX INFO: renamed from: a */
    public boolean mo97946a(@NotNull C8928d section, @Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        section.getClass();
        return tab0.m189811h().m189835z() && wib0.m206571o(getPurchaseType()) && NullChecker.m82486a(section) && NullChecker.m82486a(section.m54703b()) && section.m54703b().m54784s().yearly();
    }
}
