package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.Pair;
import l.p2b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Ll/qzl;", "", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "b", "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "newFilterRule", "Lkotlin/Pair;", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)Lkotlin/Pair;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "c", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface qzl {
    @NotNull
    /* JADX INFO: renamed from: a */
    Pair<CharSequence, Boolean> mo13456a(@NotNull PayMethod payMethod, @NotNull d section, boolean newFilterRule);

    /* JADX INFO: renamed from: b */
    boolean mo13457b(@NotNull PayMethod payMethod);

    @NotNull
    /* JADX INFO: renamed from: c */
    default d.a mo13458c(@NotNull d section, @NotNull PurchaseType purchaseType, @Nullable String from) {
        section.getClass();
        purchaseType.getClass();
        if (!p2b0.h().z() || e.x(from)) {
            d.a aVarB = section.n() ? section.b() : section.d();
            aVarB.getClass();
            return aVarB;
        }
        if (NullChecker.a(section.d())) {
            d.a aVarD = section.d();
            aVarD.getClass();
            return aVarD;
        }
        d.a aVarB2 = section.b();
        aVarB2.getClass();
        return aVarB2;
    }
}
