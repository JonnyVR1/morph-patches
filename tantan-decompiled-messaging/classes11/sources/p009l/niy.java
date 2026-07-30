package p009l;

import android.content.Context;
import android.content.res.Resources;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.sab0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll/niy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "h", "(Landroid/content/Context;I)Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class niy extends fiy {
    @Override // p009l.fiy, p009l.pwl
    /* JADX INFO: renamed from: g */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        int iM20798e;
        String string;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo13950a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseS = detail.s();
        boolean zI = detail.I();
        boolean zM21865b = (detail.E() && merchandiseS.autoRenewable()) ? rxa0.m21865b(merchandiseS) : false;
        if (sab0.g(type) || sab0.x(type)) {
            q1e q1eVar = q1e.INSTANCE;
            merchandiseS.getClass();
            iM20798e = q1eVar.m20798e(merchandiseS, detail.I());
        } else {
            q1e q1eVar2 = q1e.INSTANCE;
            merchandiseS.getClass();
            iM20798e = q1eVar2.m20795b(merchandiseS, detail.d(), detail.I());
        }
        String strM18878h = (!merchandiseS.monthly() || !merchandiseS.noneRenewable() || TEnum.equals(merchandiseS.category, "femaleVip") || TEnum.equals(merchandiseS.category, "youthVip")) ? m18878h(context, iM20798e) : "";
        if (TEnum.equals(merchandiseS.category, "femaleVip") || TEnum.equals(merchandiseS.category, "youthVip")) {
            String strM = merchandiseS.autoRenewable() ? detail.m() : detail.k();
            if (merchandiseS.weekly()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), strM}, 2));
            } else {
                string = resources.getString(R$string.f6411v9, getCurrencySymbol(), strM);
                string.getClass();
            }
        } else if (merchandiseS.weekly()) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m()}, 2));
        } else if (zI) {
            string = resources.getString(R$string.f6411v9, getCurrencySymbol(), getNumberFormat().format(getPromotionPrice() / ((double) merchandiseS.quantity)));
            string.getClass();
        } else {
            string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
            string.getClass();
        }
        detail.n0(strM18878h);
        detail.m0(string);
        detail.S(zM21865b);
    }

    /* JADX INFO: renamed from: h */
    public final String m18878h(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f5946H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }
}
