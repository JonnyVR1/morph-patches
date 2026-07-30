package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/lry;", "Ll/hzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "c", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lry implements hzl<C8928d.a> {
    /* JADX INFO: renamed from: b */
    public final String m155668b(Merchandise merchandise) {
        if (!merchandise.autoRenewable()) {
            return "";
        }
        if (merchandise.yearly()) {
            return "连续包年";
        }
        if (merchandise.semiAnnual()) {
            return "人气之选";
        }
        if (merchandise.quarterly()) {
            return "连续包季";
        }
        if (merchandise.weekly()) {
            return "周会员";
        }
        return v5b0.m199785k(merchandise) ? "限时1元" : "连续包月";
    }

    @Override // p153l.hzl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo106190a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8928d.a detail) {
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM54784s = detail.m54784s();
        String str2 = merchandiseM54784s.defaultStockKeepUnit.prices.currencySymbol;
        str2.getClass();
        String strM155668b = m155668b(merchandiseM54784s);
        if (wib0.m206565i(type) || wib0.m206566j(type) || wib0.m206572p(type)) {
            str = strM155668b;
        } else if (wib0.m206573q(type) && ueh0.m195760n(merchandiseM54784s)) {
            str = "限时1元";
        } else if ((s7a.m184982k() && wib0.m206563g(type) && merchandiseM54784s.weekly() && merchandiseM54784s.autoRenewable() && !detail.m54736I()) || (s7a.m184997z() && wib0.m206580x(type) && merchandiseM54784s.weekly() && merchandiseM54784s.autoRenewable())) {
            str = "最受欢迎";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s%s", Arrays.copyOf(new Object[]{str2, detail.m54736I() ? detail.m54786u() : detail.m54774l()}, 2));
        }
        detail.m54761e0(str);
        detail.m54737J(strM155668b);
    }
}
