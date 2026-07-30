package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class w6h0 {

    /* JADX INFO: renamed from: c */
    public static volatile w6h0 f184844c;

    /* JADX INFO: renamed from: a */
    public zpd0 f184845a = new zpd0("svip_year_prom_dlg_show_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f184846b = new uqd0("svip_year_prom_coupon_id" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m201815c(Boolean bool) {
    }

    /* JADX INFO: renamed from: j */
    public static w6h0 m201818j() {
        if (f184844c == null) {
            synchronized (w6h0.class) {
                try {
                    if (f184844c == null) {
                        f184844c = new w6h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f184844c;
    }

    /* JADX INFO: renamed from: f */
    public void m201819f(Act act) {
        lya0.m152185U0(act, new e30() { // from class: l.v6h0
            @Override // p149l.e30
            public final void call(Object obj) {
                w6h0.m201815c((Boolean) obj);
            }
        }, (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.u6h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        }), act.pageId());
    }

    /* JADX INFO: renamed from: g */
    public CharSequence m201820g(Merchandise merchandise) {
        return m201821h(merchandise, Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m201821h(Merchandise merchandise, @ColorInt int i) {
        PurchaseType purchaseType;
        int i2;
        if (merchandise.autoRenewable()) {
            String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
            int i3 = merchandise.quantity;
            if (i3 != 3) {
                i2 = i3 != 12 ? R$string.f27123D : R$string.f27145F;
            } else {
                i2 = R$string.f27134E;
            }
            String str2 = String.format(CoreModule.f17544b.getString(R$string.f27157G0), "会员及自动续费协议", "", str, CoreModule.f17544b.getString(i2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            int iIndexOf = str2.indexOf("会员及自动续费协议");
            int i4 = iIndexOf + 9;
            spannableStringBuilder.setSpan(new c95(we60.f185908b).m105841b(i).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, i4, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i4, 18);
            return spannableStringBuilder;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_NONE;
        if (TEnum.equals(merchandise.category, ProductCategory.get("svip"))) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            purchaseType = TEnum.equals(merchandise.category, ProductCategory.get(ProductCategory.tttVip)) ? PurchaseType.TYPE_GET_VIP : purchaseType2;
        }
        if (purchaseType == purchaseType2) {
            return "";
        }
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0("会员服务协议"), i, eqh0.m117752c(3));
        int iIndexOf2 = sb.indexOf("会员服务协议");
        spannableStringBuilderM133861b0.setSpan(new c95(we60.f185909c).m105841b(i).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf2, iIndexOf2 + 6, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: i */
    public int m201822i(Merchandise merchandise, Merchandise merchandise2) {
        if (merchandise2 == null) {
            merchandise2 = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.r6h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.noneRenewable());
                }
            });
        }
        if (NullChecker.m81303a(merchandise2)) {
            return (int) (BigDecimal.valueOf(merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP).getCouponPrice()).divide(new BigDecimal(merchandise2.defaultStockKeepUnit.prices.price * 12.0d), 2, RoundingMode.HALF_DOWN).doubleValue() * 10.0d);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public j760<Merchandise, Coupon> m201823k() {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.s6h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            return vwb.m200311Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m201824l(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        return coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
    }

    /* JADX INFO: renamed from: m */
    public void m201825m() {
        f184844c = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m201826n() {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.t6h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            return (merchandise.autoRenewable() && merchandise.monthType() && xma.m210047L3() && CoreModule.m29935P().m94651a().mo33425U() && RemoteConfig.m79298x().m79330s("rev_year_prom_block_contract") && CoreModule.f17545c.f19591O0.m30079n3()) ? false : true;
        }
        return false;
    }
}
