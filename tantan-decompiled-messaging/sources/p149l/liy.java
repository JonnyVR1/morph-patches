package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/liy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class liy extends fiy {
    @Override // p149l.fiy, p149l.pwl
    /* JADX INFO: renamed from: g */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        String string;
        String str;
        String string2;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo116746a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseM53601s = detail.m53601s();
        merchandiseM53601s.category.getClass();
        boolean zM53550F = detail.m53550F();
        boolean zM53549E = detail.m53549E();
        boolean zM181481b = detail.m53549E() ? rxa0.m181481b(merchandiseM53601s) : false;
        String string3 = null;
        if (zM53550F && !zM53549E) {
            if (merchandiseM53601s.noneRenewable()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
            } else {
                string2 = resources.getString(R$string.f27387aa, getCurrencySymbol(), detail.m53553I() ? detail.m53603u() : detail.m53591l());
                string3 = resources.getString(R$string.f27446f9, getCurrencySymbol(), t0g0.m186864e((detail.m53553I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
            }
            String string4 = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
            detail.m53592l0(string2);
            detail.m53559O(string4);
            detail.m53557M(string3);
            detail.m53563S(zM181481b);
            return;
        }
        if (zM181481b) {
            if (merchandiseM53601s.autoRenewable()) {
                string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
            } else if (!detail.m53553I() || TextUtils.isEmpty(detail.m53603u())) {
                string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
            } else {
                string = resources.getString(R$string.f27633v9, getCurrencySymbol(), t0g0.m186864e(getPromotionPrice() / ((double) detail.m53605w())));
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), Integer.valueOf((int) getPromotionPrice())}, 2));
            }
        } else if (merchandiseM53601s.weekly()) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53593m()}, 2));
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
        } else {
            string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
        }
        if (merchandiseM53601s.autoRenewable() && !zM53549E) {
            string3 = resources.getString(R$string.f27446f9, getCurrencySymbol(), t0g0.m186864e((detail.m53553I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
        }
        detail.m53592l0(string);
        detail.m53559O(str);
        detail.m53557M(string3);
        detail.m53563S(zM181481b);
    }
}
