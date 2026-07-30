package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/iry;", "Ll/cry;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iry extends cry {
    @Override // p153l.cry, p153l.hzl
    /* JADX INFO: renamed from: g */
    public void mo106190a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8928d.a detail) {
        String string;
        String str;
        String string2;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo106190a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseM54784s = detail.m54784s();
        merchandiseM54784s.category.getClass();
        boolean zM54733F = detail.m54733F();
        boolean zM54732E = detail.m54732E();
        boolean zM199776b = detail.m54732E() ? v5b0.m199776b(merchandiseM54784s) : false;
        String string3 = null;
        if (zM54733F && !zM54732E) {
            if (merchandiseM54784s.noneRenewable()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54774l()}, 2));
            } else {
                string2 = resources.getString(R$string.f28235aa, getCurrencySymbol(), detail.m54736I() ? detail.m54786u() : detail.m54774l());
                string3 = resources.getString(R$string.f28294f9, getCurrencySymbol(), a9g0.m96570e((detail.m54736I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
            }
            String string4 = resources.getString(R$string.f28481v9, getCurrencySymbol(), detail.m54776m());
            detail.m54775l0(string2);
            detail.m54742O(string4);
            detail.m54740M(string3);
            detail.m54746S(zM199776b);
            return;
        }
        if (zM199776b) {
            if (merchandiseM54784s.autoRenewable()) {
                string = tab0.m189811h().m189829t(merchandiseM54784s, merchandiseM54784s.quantity);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m54786u(), getCurrencySymbol() + detail.m54774l()}, 2));
            } else if (!detail.m54736I() || TextUtils.isEmpty(detail.m54786u())) {
                string = resources.getString(R$string.f28481v9, getCurrencySymbol(), detail.m54776m());
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54774l()}, 2));
            } else {
                string = resources.getString(R$string.f28481v9, getCurrencySymbol(), a9g0.m96570e(getPromotionPrice() / ((double) detail.m54788w())));
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), Integer.valueOf((int) getPromotionPrice())}, 2));
            }
        } else if (merchandiseM54784s.weekly()) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54776m()}, 2));
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54774l()}, 2));
        } else {
            string = resources.getString(R$string.f28481v9, getCurrencySymbol(), detail.m54776m());
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54774l()}, 2));
        }
        if (merchandiseM54784s.autoRenewable() && !zM54732E) {
            string3 = resources.getString(R$string.f28294f9, getCurrencySymbol(), a9g0.m96570e((detail.m54736I() ? getPromotionPrice() : getUnitPrice()) / 30.0d));
        }
        detail.m54775l0(string);
        detail.m54742O(str);
        detail.m54740M(string3);
        detail.m54746S(zM199776b);
    }
}
