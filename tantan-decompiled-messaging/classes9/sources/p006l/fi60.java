package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll/fi60;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "newFilterRule", "Lkotlin/Pair;", "", "b", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)Lkotlin/Pair;", "a", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "", "Ll/qzl;", "c", "Ljava/util/List;", "promotionTips", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fi60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<qzl> promotionTips;

    public fi60(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = str;
        ArrayList arrayList = new ArrayList();
        this.promotionTips = arrayList;
        arrayList.add(new di60(purchaseType, str));
        arrayList.add(new ci60(purchaseType, str));
        arrayList.add(new ei60(purchaseType, str));
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Pair<CharSequence, Boolean> m15350b(@NotNull PayMethod currentPayMethod, @NotNull d section, boolean newFilterRule) {
        currentPayMethod.getClass();
        section.getClass();
        for (qzl qzlVar : this.promotionTips) {
            if (qzlVar.mo13457b(currentPayMethod)) {
                return qzlVar.mo13456a(currentPayMethod, section, newFilterRule);
            }
        }
        return new Pair<>("", Boolean.FALSE);
    }
}
