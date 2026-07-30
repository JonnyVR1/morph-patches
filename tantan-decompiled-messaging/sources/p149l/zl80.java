package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zl80 {

    /* JADX INFO: renamed from: f */
    public static zl80 f203598f;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f203600b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f203601c;

    /* JADX INFO: renamed from: a */
    public boolean f203599a = false;

    /* JADX INFO: renamed from: d */
    public hpd0 f203602d = new hpd0("noti_dialog_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public zpd0 f203603e = new zpd0("show_close_day_v3_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static String m219249b(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return CoreModule.f17544b.getString(R$string.f27178I);
        }
        return !string.equals("svip") ? "" : CoreModule.f17544b.getString(R$string.f27497k0);
    }

    /* JADX INFO: renamed from: c */
    public static String m219250c(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return "vip";
        }
        return !string.equals("svip") ? "" : "svip";
    }

    /* JADX INFO: renamed from: f */
    public static String m219251f(Merchandise merchandise) {
        long jM155944o = !vwb.m200296J(merchandise.localCoupons) ? ((long) merchandise.localCoupons.get(0).endTime) - mqi0.m155944o() : 0L;
        if (jM155944o < 86400000) {
            return "0";
        }
        List<String> listM155940k = mqi0.m155940k(jM155944o);
        if (listM155940k.size() != 4) {
            return "1";
        }
        return Integer.parseInt(listM155940k.get(0)) + "";
    }

    /* JADX INFO: renamed from: g */
    public static zl80 m219252g() {
        if (f203598f == null) {
            synchronized (zl80.class) {
                try {
                    if (f203598f == null) {
                        f203598f = new zl80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203598f;
    }

    /* JADX INFO: renamed from: h */
    public static Merchandise m219253h(List<Merchandise> list) {
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
    public static String m219254i(List<Merchandise> list) {
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
    public static boolean m219255k(Merchandise merchandise) {
        if (!CoreModule.m29935P().m94651a().mo33489e2() && TEnum.equals(merchandise.category, ProductCategory.tttSeeWhoLikedMe)) {
            return true;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() && TEnum.equals(merchandise.category, ProductCategory.tttVip)) {
            return true;
        }
        if (TEnum.equals(merchandise.category, "quickchatMembership") && CoreModule.m29935P().m94651a().mo33634z9()) {
            return true;
        }
        return !xma.m210071e4() && TEnum.equals(merchandise.category, "svip");
    }

    /* JADX INFO: renamed from: a */
    public void m219256a() {
        this.f203602d.put(Boolean.FALSE);
        this.f203603e.put(0L);
    }

    /* JADX INFO: renamed from: d */
    public List<Merchandise> m219257d(boolean z) {
        if (m219252g().m219259j() || vwb.m200296J(this.f203600b)) {
            return null;
        }
        if (z) {
            return this.f203601c;
        }
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : this.f203600b) {
            if (rxa0.m181491l(merchandise, MonetizationPromotionsId.lowPriceCallback3VIP) || rxa0.m181491l(merchandise, MonetizationPromotionsId.lowPriceCallback3SVIP)) {
                arrayList.add(merchandise);
            }
        }
        this.f203601c = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<Merchandise> m219258e(ProductCategory productCategory) {
        List<Merchandise> listM219257d = m219257d(false);
        if (!vwb.m200296J(listM219257d) && TEnum.equals(listM219257d.get(0).category, productCategory)) {
            return listM219257d;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m219259j() {
        return this.f203599a;
    }

    /* JADX INFO: renamed from: l */
    public void m219260l() {
        this.f203599a = true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m219261m() {
        if (mqi0.m155929D(this.f203603e.get().longValue())) {
            return false;
        }
        this.f203603e.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }
}
