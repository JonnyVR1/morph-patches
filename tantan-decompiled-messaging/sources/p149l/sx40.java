package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/sx40;", "Ll/o5;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)V", "section", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Z", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sx40 extends AbstractC18843o5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx40(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8765d> list) {
        super(purchaseType, list);
        purchaseType.getClass();
        list.getClass();
    }

    @Override // p149l.AbstractC18843o5
    /* JADX INFO: renamed from: a */
    public boolean mo116616a(@NotNull C8765d section, @Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod) {
        section.getClass();
        return p2b0.m167133h().m167157z() && sab0.m182891i(getPurchaseType()) && NullChecker.m81303a(section) && NullChecker.m81303a(section.m53520b()) && section.m53520b().m53601s().yearly();
    }
}
