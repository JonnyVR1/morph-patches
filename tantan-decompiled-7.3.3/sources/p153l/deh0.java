package p153l;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class deh0 {

    /* JADX INFO: renamed from: c */
    public static volatile deh0 f88031c;

    /* JADX INFO: renamed from: a */
    public byd0 f88032a = new byd0("svip_6m_double11_prom_dlg_show_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public wyd0 f88033b = new wyd0("svip_6m_double11_prom_coupon_id" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static CharSequence m115413c(PurchaseType purchaseType, boolean z) {
        String str = g6b.m129215e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), pta.m173725r() ? "自动订阅随时取消，同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效" : "自动订阅，随时取消\n同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0(str), bn60.m105334Q(z), lyh0.m156283c(g6b.m129215e(purchaseType) ? 2 : 3));
        int iIndexOf2 = str2.indexOf(str);
        spannableStringBuilderM175796b0.setSpan(new da5(bn60.f77437b).m115113b(bn60.m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf2, str.length() + iIndexOf2, 18);
        spannableStringBuilderM175796b0.setSpan(new StyleSpan(1), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: d */
    public static deh0 m115414d() {
        if (f88031c == null) {
            synchronized (deh0.class) {
                try {
                    if (f88031c == null) {
                        f88031c = new deh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f88031c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m115415f(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && v5b0.m199786l(merchandise, MonetizationPromotionsId.giftDurationSVIP);
    }

    /* JADX INFO: renamed from: e */
    public pf60<Merchandise, Coupon> m115416e() {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.ceh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            return jyb.m147494Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.giftDurationSVIP));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m115417g() {
        return NullChecker.m82486a((Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.beh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
            }
        }));
    }
}
