package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/oiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "c", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class oiy implements pwl<C8765d.a> {
    /* JADX INFO: renamed from: b */
    public final String m164581b(Merchandise merchandise) {
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
        return rxa0.m181490k(merchandise) ? "限时1元" : "连续包月";
    }

    @Override // p149l.pwl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM53601s = detail.m53601s();
        String str2 = merchandiseM53601s.defaultStockKeepUnit.prices.currencySymbol;
        str2.getClass();
        String strM164581b = m164581b(merchandiseM53601s);
        if (sab0.m182891i(type) || sab0.m182892j(type) || sab0.m182898p(type)) {
            str = strM164581b;
        } else if (sab0.m182899q(type) && m6h0.m153228n(merchandiseM53601s)) {
            str = "限时1元";
        } else if ((g6a.m124562k() && sab0.m182889g(type) && merchandiseM53601s.weekly() && merchandiseM53601s.autoRenewable() && !detail.m53553I()) || (g6a.m124577z() && sab0.m182906x(type) && merchandiseM53601s.weekly() && merchandiseM53601s.autoRenewable())) {
            str = "最受欢迎";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s%s", Arrays.copyOf(new Object[]{str2, detail.m53553I() ? detail.m53603u() : detail.m53591l()}, 2));
        }
        detail.m53578e0(str);
        detail.m53554J(strM164581b);
    }
}
