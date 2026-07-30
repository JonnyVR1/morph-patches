package p009l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l.c95;
import l.e30;
import l.eqh0;
import l.j760;
import l.lya0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.xma;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w6h0 {

    /* JADX INFO: renamed from: c */
    public static volatile w6h0 f21919c;

    /* JADX INFO: renamed from: a */
    public zpd0 f21920a = new zpd0("svip_year_prom_dlg_show_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f21921b = new uqd0("svip_year_prom_coupon_id" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m23941c(Boolean bool) {
    }

    /* JADX INFO: renamed from: j */
    public static w6h0 m23944j() {
        if (f21919c == null) {
            synchronized (w6h0.class) {
                try {
                    if (f21919c == null) {
                        f21919c = new w6h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21919c;
    }

    /* JADX INFO: renamed from: f */
    public void m23945f(Act act) {
        lya0.U0(act, new e30() { // from class: l.v6h0
            public final void call(Object obj) {
                w6h0.m23941c((Boolean) obj);
            }
        }, (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.u6h0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m21875l((Merchandise) obj, "lowPriceFirstTime12MSVIP"));
            }
        }), act.pageId());
    }

    /* JADX INFO: renamed from: g */
    public CharSequence m23946g(Merchandise merchandise) {
        return m23947h(merchandise, Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m23947h(Merchandise merchandise, @ColorInt int i) {
        PurchaseType purchaseType;
        int i2;
        if (merchandise.autoRenewable()) {
            String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
            int i3 = merchandise.quantity;
            if (i3 != 3) {
                i2 = i3 != 12 ? R$string.f5901D : R$string.f5923F;
            } else {
                i2 = R$string.f5912E;
            }
            String str2 = String.format(CoreModule.b.getString(R$string.f5935G0), "会员及自动续费协议", "", str, CoreModule.b.getString(i2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            int iIndexOf = str2.indexOf("会员及自动续费协议");
            int i4 = iIndexOf + 9;
            spannableStringBuilder.setSpan(new c95(we60.f22068b).b(i).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, i4, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i4, 18);
            return spannableStringBuilder;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_NONE;
        if (TEnum.equals(merchandise.category, ProductCategory.get("svip"))) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            purchaseType = TEnum.equals(merchandise.category, ProductCategory.get("tttVip")) ? PurchaseType.TYPE_GET_VIP : purchaseType2;
        }
        if (purchaseType == purchaseType2) {
            return "";
        }
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(sb.toString(), vwb.f0(new String[]{"会员服务协议"}), i, eqh0.c(3));
        int iIndexOf2 = sb.indexOf("会员服务协议");
        spannableStringBuilderM16129b0.setSpan(new c95(we60.f22069c).b(i).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf2, iIndexOf2 + 6, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: i */
    public int m23948i(Merchandise merchandise, Merchandise merchandise2) {
        if (merchandise2 == null) {
            merchandise2 = (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.r6h0
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.noneRenewable());
                }
            });
        }
        if (NullChecker.a(merchandise2)) {
            return (int) (BigDecimal.valueOf(merchandise.getCouponForPromotion("lowPriceFirstTime12MSVIP").getCouponPrice()).divide(new BigDecimal(merchandise2.defaultStockKeepUnit.prices.price * 12.0d), 2, RoundingMode.HALF_DOWN).doubleValue() * 10.0d);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public j760<Merchandise, Coupon> m23949k() {
        Merchandise merchandise = (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.s6h0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m21875l((Merchandise) obj, "lowPriceFirstTime12MSVIP"));
            }
        });
        if (NullChecker.a(merchandise)) {
            return vwb.Y(merchandise, merchandise.getCouponForPromotion("lowPriceFirstTime12MSVIP"));
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m23950l(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        return coupon.isBelongPromotion("lowPriceFirstTime12MSVIP");
    }

    /* JADX INFO: renamed from: m */
    public void m23951m() {
        f21919c = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m23952n() {
        Merchandise merchandise = (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.t6h0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m21875l((Merchandise) obj, "lowPriceFirstTime12MSVIP"));
            }
        });
        if (NullChecker.a(merchandise)) {
            return (merchandise.autoRenewable() && merchandise.monthType() && xma.L3() && CoreModule.P().a().U() && RemoteConfig.m9619x().m9651s("rev_year_prom_block_contract") && CoreModule.c.O0.n3()) ? false : true;
        }
        return false;
    }
}
