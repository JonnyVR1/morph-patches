package p009l;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.c95;
import l.dsa;
import l.eqh0;
import l.j760;
import l.sab0;
import l.t4b;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v5h0 {

    /* JADX INFO: renamed from: c */
    public static volatile v5h0 f21455c;

    /* JADX INFO: renamed from: a */
    public zpd0 f21456a = new zpd0("svip_6m_double11_prom_dlg_show_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f21457b = new uqd0("svip_6m_double11_prom_coupon_id" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static CharSequence m23306c(PurchaseType purchaseType, boolean z) {
        String str = t4b.e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), dsa.r() ? "自动订阅随时取消，同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效" : "自动订阅，随时取消\n同意%1$s最高享%2$s，取消自动续费时，赠送的3个月将失效", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{str}), we60.m24155Q(z), eqh0.c(t4b.e(purchaseType) ? 2 : 3));
        int iIndexOf2 = str2.indexOf(str);
        spannableStringBuilderM16129b0.setSpan(new c95(we60.f22068b).b(we60.m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf2, str.length() + iIndexOf2, 18);
        spannableStringBuilderM16129b0.setSpan(new StyleSpan(1), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: d */
    public static v5h0 m23307d() {
        if (f21455c == null) {
            synchronized (v5h0.class) {
                try {
                    if (f21455c == null) {
                        f21455c = new v5h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21455c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m23308f(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && rxa0.m21875l(merchandise, "giftDurationSVIP");
    }

    /* JADX INFO: renamed from: e */
    public j760<Merchandise, Coupon> m23309e() {
        Merchandise merchandise = (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.u5h0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m21875l((Merchandise) obj, "giftDurationSVIP"));
            }
        });
        if (NullChecker.a(merchandise)) {
            return vwb.Y(merchandise, merchandise.getCouponForPromotion("giftDurationSVIP"));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23310g() {
        return NullChecker.a((Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.t5h0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m21875l((Merchandise) obj, "giftDurationSVIP"));
            }
        }));
    }
}
