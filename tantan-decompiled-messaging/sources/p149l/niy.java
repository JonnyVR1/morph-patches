package p149l;

import android.content.Context;
import android.content.res.Resources;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/niy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "h", "(Landroid/content/Context;I)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class niy extends fiy {
    @Override // p149l.fiy, p149l.pwl
    /* JADX INFO: renamed from: g */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        int iM172390e;
        String string;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo116746a(context, type, detail);
        Resources resources = context.getResources();
        Merchandise merchandiseM53601s = detail.m53601s();
        boolean zM53553I = detail.m53553I();
        boolean zM181481b = (detail.m53549E() && merchandiseM53601s.autoRenewable()) ? rxa0.m181481b(merchandiseM53601s) : false;
        if (sab0.m182889g(type) || sab0.m182906x(type)) {
            q1e q1eVar = q1e.INSTANCE;
            merchandiseM53601s.getClass();
            iM172390e = q1eVar.m172390e(merchandiseM53601s, detail.m53553I());
        } else {
            q1e q1eVar2 = q1e.INSTANCE;
            merchandiseM53601s.getClass();
            iM172390e = q1eVar2.m172387b(merchandiseM53601s, detail.m53575d(), detail.m53553I());
        }
        String strM159580h = (!merchandiseM53601s.monthly() || !merchandiseM53601s.noneRenewable() || TEnum.equals(merchandiseM53601s.category, "femaleVip") || TEnum.equals(merchandiseM53601s.category, "youthVip")) ? m159580h(context, iM172390e) : "";
        if (TEnum.equals(merchandiseM53601s.category, "femaleVip") || TEnum.equals(merchandiseM53601s.category, "youthVip")) {
            String strM53593m = merchandiseM53601s.autoRenewable() ? detail.m53593m() : detail.m53589k();
            if (merchandiseM53601s.weekly()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), strM53593m}, 2));
            } else {
                string = resources.getString(R$string.f27633v9, getCurrencySymbol(), strM53593m);
                string.getClass();
            }
        } else if (merchandiseM53601s.weekly()) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            string = String.format("%1$s %2$s /周", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53593m()}, 2));
        } else if (zM53553I) {
            string = resources.getString(R$string.f27633v9, getCurrencySymbol(), getNumberFormat().format(getPromotionPrice() / ((double) merchandiseM53601s.quantity)));
            string.getClass();
        } else {
            string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
            string.getClass();
        }
        detail.m53596n0(strM159580h);
        detail.m53594m0(string);
        detail.m53563S(zM181481b);
    }

    /* JADX INFO: renamed from: h */
    public final String m159580h(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f27168H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }
}
