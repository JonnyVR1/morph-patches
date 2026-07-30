package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.g6a;
import l.sab0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll/oiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "detail", "", "c", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oiy implements pwl<d.a> {
    /* JADX INFO: renamed from: b */
    public final String m19809b(Merchandise merchandise) {
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
        return rxa0.m21874k(merchandise) ? "限时1元" : "连续包月";
    }

    @Override // p009l.pwl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseS = detail.s();
        String str2 = merchandiseS.defaultStockKeepUnit.prices.currencySymbol;
        str2.getClass();
        String strM19809b = m19809b(merchandiseS);
        if (sab0.i(type) || sab0.j(type) || sab0.p(type)) {
            str = strM19809b;
        } else if (sab0.q(type) && m6h0.m18262n(merchandiseS)) {
            str = "限时1元";
        } else if ((g6a.k() && sab0.g(type) && merchandiseS.weekly() && merchandiseS.autoRenewable() && !detail.I()) || (g6a.z() && sab0.x(type) && merchandiseS.weekly() && merchandiseS.autoRenewable())) {
            str = "最受欢迎";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s%s", Arrays.copyOf(new Object[]{str2, detail.I() ? detail.u() : detail.l()}, 2));
        }
        detail.e0(str);
        detail.J(strM19809b);
    }
}
