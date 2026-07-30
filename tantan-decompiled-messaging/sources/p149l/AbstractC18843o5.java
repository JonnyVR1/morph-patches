package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.data.PayMethod;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.o5 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/o5;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)V", "section", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "agreementState", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;Lcom/p1/mobile/putong/data/PayMethod;)Z", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractC18843o5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8765d> purchaseSections;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC18843o5(@NotNull PurchaseType purchaseType, @NotNull List<? extends C8765d> list) {
        purchaseType.getClass();
        list.getClass();
        this.purchaseType = purchaseType;
        this.purchaseSections = list;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo116616a(@NotNull C8765d section, @Nullable AgreementComponent.AgreementState agreementState, @Nullable PayMethod currentPayMethod);

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<C8765d> m162743b() {
        return this.purchaseSections;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }
}
