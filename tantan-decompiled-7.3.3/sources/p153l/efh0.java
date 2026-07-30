package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class efh0 {

    /* JADX INFO: renamed from: c */
    public static volatile efh0 f93786c;

    /* JADX INFO: renamed from: a */
    public byd0 f93787a = new byd0("svip_year_prom_dlg_show_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public wyd0 f93788b = new wyd0("svip_year_prom_coupon_id" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m120689c(Boolean bool) {
    }

    /* JADX INFO: renamed from: j */
    public static efh0 m120692j() {
        if (f93786c == null) {
            synchronized (efh0.class) {
                try {
                    if (f93786c == null) {
                        f93786c = new efh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f93786c;
    }

    /* JADX INFO: renamed from: f */
    public void m120693f(Act act) {
        p6b0.m170801U0(act, new y20() { // from class: l.dfh0
            @Override // p153l.y20
            public final void call(Object obj) {
                efh0.m120689c((Boolean) obj);
            }
        }, (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.cfh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        }), act.pageId());
    }

    /* JADX INFO: renamed from: g */
    public CharSequence m120694g(Merchandise merchandise) {
        return m120695h(merchandise, Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m120695h(Merchandise merchandise, @ColorInt int i) {
        PurchaseType purchaseType;
        int i2;
        if (merchandise.autoRenewable()) {
            String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
            int i3 = merchandise.quantity;
            if (i3 != 3) {
                i2 = i3 != 12 ? R$string.f27971D : R$string.f27993F;
            } else {
                i2 = R$string.f27982E;
            }
            String str2 = String.format(CoreModule.f18263b.getString(R$string.f28005G0), "会员及自动续费协议", "", str, CoreModule.f18263b.getString(i2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            int iIndexOf = str2.indexOf("会员及自动续费协议");
            int i4 = iIndexOf + 9;
            spannableStringBuilder.setSpan(new da5(bn60.f77437b).m115113b(i).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, i4, 18);
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
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0("会员服务协议"), i, lyh0.m156283c(3));
        int iIndexOf2 = sb.indexOf("会员服务协议");
        spannableStringBuilderM175796b0.setSpan(new da5(bn60.f77438c).m115113b(i).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf2, iIndexOf2 + 6, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: i */
    public int m120696i(Merchandise merchandise, Merchandise merchandise2) {
        if (merchandise2 == null) {
            merchandise2 = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.zeh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.noneRenewable());
                }
            });
        }
        if (NullChecker.m82486a(merchandise2)) {
            return (int) (BigDecimal.valueOf(merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP).getCouponPrice()).divide(new BigDecimal(merchandise2.defaultStockKeepUnit.prices.price * 12.0d), 2, RoundingMode.HALF_DOWN).doubleValue() * 10.0d);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public pf60<Merchandise, Coupon> m120697k() {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.afh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            return jyb.m147494Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m120698l(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        return coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
    }

    /* JADX INFO: renamed from: m */
    public void m120699m() {
        f93786c = null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m120700n() {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.bfh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.lowPriceFirstTime12MSVIP));
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            return (merchandise.autoRenewable() && merchandise.monthType() && joa.m146361M3() && CoreModule.m30933P().m143405a().mo34428U() && RemoteConfig.m80481x().m80513s("rev_year_prom_block_contract") && CoreModule.f18264c.f20333O0.m31077n3()) ? false : true;
        }
        return false;
    }
}
