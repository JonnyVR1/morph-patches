package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class du80 {

    /* JADX INFO: renamed from: f */
    public static du80 f90771f;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f90773b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f90774c;

    /* JADX INFO: renamed from: a */
    public boolean f90772a = false;

    /* JADX INFO: renamed from: d */
    public jxd0 f90775d = new jxd0("noti_dialog_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public byd0 f90776e = new byd0("show_close_day_v3_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static String m118103b(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return CoreModule.f18263b.getString(R$string.f28026I);
        }
        return !string.equals("svip") ? "" : CoreModule.f18263b.getString(R$string.f28345k0);
    }

    /* JADX INFO: renamed from: c */
    public static String m118104c(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return "vip";
        }
        return !string.equals("svip") ? "" : "svip";
    }

    /* JADX INFO: renamed from: f */
    public static String m118105f(Merchandise merchandise) {
        long jM174454o = !jyb.m147479J(merchandise.localCoupons) ? ((long) merchandise.localCoupons.get(0).endTime) - pzi0.m174454o() : 0L;
        if (jM174454o < 86400000) {
            return "0";
        }
        List<String> listM174450k = pzi0.m174450k(jM174454o);
        if (listM174450k.size() != 4) {
            return "1";
        }
        return Integer.parseInt(listM174450k.get(0)) + "";
    }

    /* JADX INFO: renamed from: g */
    public static du80 m118106g() {
        if (f90771f == null) {
            synchronized (du80.class) {
                try {
                    if (f90771f == null) {
                        f90771f = new du80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f90771f;
    }

    /* JADX INFO: renamed from: h */
    public static Merchandise m118107h(List<Merchandise> list) {
        int i = 0;
        Merchandise merchandise = null;
        for (Merchandise merchandise2 : list) {
            int firstCouponPrice = (int) (merchandise2.defaultStockKeepUnit.prices.price - merchandise2.getFirstCouponPrice());
            if (i < firstCouponPrice) {
                merchandise = merchandise2;
                i = firstCouponPrice;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: i */
    public static String m118108i(List<Merchandise> list) {
        if (list.size() == 1) {
            if (list.get(0).quarterly()) {
                return "3m";
            }
            return list.get(0).semiAnnual() ? "6m" : "12m";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).quantity);
            if (i < list.size() - 1) {
                sb.append("and");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m118109k(Merchandise merchandise) {
        if (!CoreModule.m30933P().m143405a().mo34492e2() && TEnum.equals(merchandise.category, ProductCategory.tttSeeWhoLikedMe)) {
            return true;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() && TEnum.equals(merchandise.category, ProductCategory.tttVip)) {
            return true;
        }
        if (TEnum.equals(merchandise.category, "quickchatMembership") && CoreModule.m30933P().m143405a().mo34637z9()) {
            return true;
        }
        return !joa.m146386f4() && TEnum.equals(merchandise.category, "svip");
    }

    /* JADX INFO: renamed from: a */
    public void m118110a() {
        this.f90775d.put(Boolean.FALSE);
        this.f90776e.put(0L);
    }

    /* JADX INFO: renamed from: d */
    public List<Merchandise> m118111d(boolean z) {
        if (m118106g().m118113j() || jyb.m147479J(this.f90773b)) {
            return null;
        }
        if (z) {
            return this.f90774c;
        }
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : this.f90773b) {
            if (v5b0.m199786l(merchandise, MonetizationPromotionsId.lowPriceCallback3VIP) || v5b0.m199786l(merchandise, MonetizationPromotionsId.lowPriceCallback3SVIP)) {
                arrayList.add(merchandise);
            }
        }
        this.f90774c = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<Merchandise> m118112e(ProductCategory productCategory) {
        List<Merchandise> listM118111d = m118111d(false);
        if (!jyb.m147479J(listM118111d) && TEnum.equals(listM118111d.get(0).category, productCategory)) {
            return listM118111d;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m118113j() {
        return this.f90772a;
    }

    /* JADX INFO: renamed from: l */
    public void m118114l() {
        this.f90772a = true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m118115m() {
        if (pzi0.m174439D(this.f90776e.get().longValue())) {
            return false;
        }
        this.f90776e.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }
}
