package p149l;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class v5h0 {

    /* JADX INFO: renamed from: c */
    public static volatile v5h0 f180049c;

    /* JADX INFO: renamed from: a */
    public zpd0 f180050a = new zpd0("svip_6m_double11_prom_dlg_show_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f180051b = new uqd0("svip_6m_double11_prom_coupon_id" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static CharSequence m197113c(PurchaseType purchaseType, boolean z) {
        String str = t4b.m187164e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), dsa.m113445r() ? "自动订阅随时取消，同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效" : "自动订阅，随时取消\n同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0(str), we60.m202852Q(z), eqh0.m117752c(t4b.m187164e(purchaseType) ? 2 : 3));
        int iIndexOf2 = str2.indexOf(str);
        spannableStringBuilderM133861b0.setSpan(new c95(we60.f185908b).m105841b(we60.m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf2, str.length() + iIndexOf2, 18);
        spannableStringBuilderM133861b0.setSpan(new StyleSpan(1), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: d */
    public static v5h0 m197114d() {
        if (f180049c == null) {
            synchronized (v5h0.class) {
                try {
                    if (f180049c == null) {
                        f180049c = new v5h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f180049c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m197115f(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && rxa0.m181491l(merchandise, MonetizationPromotionsId.giftDurationSVIP);
    }

    /* JADX INFO: renamed from: e */
    public j760<Merchandise, Coupon> m197116e() {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.u5h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            return vwb.m200311Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.giftDurationSVIP));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m197117g() {
        return NullChecker.m81303a((Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.t5h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
            }
        }));
    }
}
