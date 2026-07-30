package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m88121d2 = {"Ll/k2m;", "", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "b", "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "newFilterRule", "Lkotlin/Pair;", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)Lkotlin/Pair;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "c", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface k2m {
    @NotNull
    /* JADX INFO: renamed from: a */
    Pair<CharSequence, Boolean> mo136600a(@NotNull PayMethod payMethod, @NotNull C8928d section, boolean newFilterRule);

    /* JADX INFO: renamed from: b */
    boolean mo136601b(@NotNull PayMethod payMethod);

    @NotNull
    /* JADX INFO: renamed from: c */
    default C8928d.a mo136602c(@NotNull C8928d section, @NotNull PurchaseType purchaseType, @Nullable String from) {
        section.getClass();
        purchaseType.getClass();
        if (!tab0.m189811h().m189835z() || C8929e.m54833x(from)) {
            C8928d.a aVarM54703b = section.m54715n() ? section.m54703b() : section.m54705d();
            aVarM54703b.getClass();
            return aVarM54703b;
        }
        if (NullChecker.m82486a(section.m54705d())) {
            C8928d.a aVarM54705d = section.m54705d();
            aVarM54705d.getClass();
            return aVarM54705d;
        }
        C8928d.a aVarM54703b2 = section.m54703b();
        aVarM54703b2.getClass();
        return aVarM54703b2;
    }
}
