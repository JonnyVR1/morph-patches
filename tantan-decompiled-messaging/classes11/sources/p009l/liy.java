package p009l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.p2b0;
import l.t0g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/liy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class liy extends fiy {
    @Override // p009l.fiy, p009l.pwl
    /* JADX INFO: renamed from: g */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        String string;
        String str;
        String string2;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo13950a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseS = detail.s();
        merchandiseS.category.getClass();
        boolean zF = detail.F();
        boolean zE = detail.E();
        boolean zM21865b = detail.E() ? rxa0.m21865b(merchandiseS) : false;
        String string3 = null;
        if (zF && !zE) {
            if (merchandiseS.noneRenewable()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
            } else {
                string2 = resources.getString(R$string.f6165aa, getCurrencySymbol(), detail.I() ? detail.u() : detail.l());
                string3 = resources.getString(R$string.f6224f9, getCurrencySymbol(), t0g0.e((detail.I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
            }
            String string4 = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
            detail.l0(string2);
            detail.O(string4);
            detail.M(string3);
            detail.S(zM21865b);
            return;
        }
        if (zM21865b) {
            if (merchandiseS.autoRenewable()) {
                string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
            } else if (!detail.I() || TextUtils.isEmpty(detail.u())) {
                string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
            } else {
                string = resources.getString(R$string.f6411v9, getCurrencySymbol(), t0g0.e(getPromotionPrice() / ((double) detail.w())));
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), Integer.valueOf((int) getPromotionPrice())}, 2));
            }
        } else if (merchandiseS.weekly()) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m()}, 2));
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
        } else {
            string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
        }
        if (merchandiseS.autoRenewable() && !zE) {
            string3 = resources.getString(R$string.f6224f9, getCurrencySymbol(), t0g0.e((detail.I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
        }
        detail.l0(string);
        detail.O(str);
        detail.M(string3);
        detail.S(zM21865b);
    }
}
