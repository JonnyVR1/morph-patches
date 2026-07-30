package p153l;

import android.content.Context;
import android.content.res.Resources;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/kry;", "Ll/cry;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "h", "(Landroid/content/Context;I)Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kry extends cry {
    @Override // p153l.cry, p153l.hzl
    /* JADX INFO: renamed from: g */
    public void mo106190a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8928d.a detail) {
        int iM119280e;
        String string;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo106190a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseM54784s = detail.m54784s();
        boolean zM54736I = detail.m54736I();
        boolean zM199776b = (detail.m54732E() && merchandiseM54784s.autoRenewable()) ? v5b0.m199776b(merchandiseM54784s) : false;
        if (wib0.m206563g(type) || wib0.m206580x(type)) {
            e3e e3eVar = e3e.INSTANCE;
            merchandiseM54784s.getClass();
            iM119280e = e3eVar.m119280e(merchandiseM54784s, detail.m54736I());
        } else {
            e3e e3eVar2 = e3e.INSTANCE;
            merchandiseM54784s.getClass();
            iM119280e = e3eVar2.m119277b(merchandiseM54784s, detail.m54758d(), detail.m54736I());
        }
        String strM151128h = (!merchandiseM54784s.monthly() || !merchandiseM54784s.noneRenewable() || TEnum.equals(merchandiseM54784s.category, "femaleVip") || TEnum.equals(merchandiseM54784s.category, "youthVip")) ? m151128h(context, iM119280e) : "";
        if (TEnum.equals(merchandiseM54784s.category, "femaleVip") || TEnum.equals(merchandiseM54784s.category, "youthVip")) {
            String strM54776m = merchandiseM54784s.autoRenewable() ? detail.m54776m() : detail.m54772k();
            if (merchandiseM54784s.weekly()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), strM54776m}, 2));
            } else {
                string = resources.getString(R$string.f28481v9, getCurrencySymbol(), strM54776m);
                string.getClass();
            }
        } else if (merchandiseM54784s.weekly()) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m54776m()}, 2));
        } else if (zM54736I) {
            string = resources.getString(R$string.f28481v9, getCurrencySymbol(), getNumberFormat().format(getPromotionPrice() / ((double) merchandiseM54784s.quantity)));
            string.getClass();
        } else {
            string = resources.getString(R$string.f28481v9, getCurrencySymbol(), detail.m54776m());
            string.getClass();
        }
        detail.m54779n0(strM151128h);
        detail.m54777m0(string);
        detail.m54746S(zM199776b);
    }

    /* JADX INFO: renamed from: h */
    public final String m151128h(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f28016H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }
}
