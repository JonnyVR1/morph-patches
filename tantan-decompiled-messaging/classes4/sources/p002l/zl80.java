package p002l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.hpd0;
import l.mqi0;
import l.rxa0;
import l.vwb;
import l.xma;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zl80 {

    /* JADX INFO: renamed from: f */
    public static zl80 f23485f;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f23487b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f23488c;

    /* JADX INFO: renamed from: a */
    public boolean f23486a = false;

    /* JADX INFO: renamed from: d */
    public hpd0 f23489d = new hpd0("noti_dialog_shown_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public zpd0 f23490e = new zpd0("show_close_day_v3_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static String m27409b(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals("tttVip")) {
            return CoreModule.b.getString(R.string.I);
        }
        return !string.equals("svip") ? "" : CoreModule.b.getString(R.string.k0);
    }

    /* JADX INFO: renamed from: c */
    public static String m27410c(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals("tttVip")) {
            return "vip";
        }
        return !string.equals("svip") ? "" : "svip";
    }

    /* JADX INFO: renamed from: f */
    public static String m27411f(Merchandise merchandise) {
        long jO = !vwb.J(merchandise.localCoupons) ? ((long) ((Coupon) merchandise.localCoupons.get(0)).endTime) - mqi0.o() : 0L;
        if (jO < 86400000) {
            return "0";
        }
        List listK = mqi0.k(jO);
        if (listK.size() != 4) {
            return "1";
        }
        return Integer.parseInt((String) listK.get(0)) + "";
    }

    /* JADX INFO: renamed from: g */
    public static zl80 m27412g() {
        if (f23485f == null) {
            synchronized (zl80.class) {
                try {
                    if (f23485f == null) {
                        f23485f = new zl80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23485f;
    }

    /* JADX INFO: renamed from: h */
    public static Merchandise m27413h(List<Merchandise> list) {
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
    public static String m27414i(List<Merchandise> list) {
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
    public static boolean m27415k(Merchandise merchandise) {
        if (!CoreModule.P().a().e2() && TEnum.equals(merchandise.category, "tttSeeWhoLikedMe")) {
            return true;
        }
        if (CoreModule.c.e0.p9().isVIP() && TEnum.equals(merchandise.category, "tttVip")) {
            return true;
        }
        if (TEnum.equals(merchandise.category, "quickchatMembership") && CoreModule.P().a().z9()) {
            return true;
        }
        return !xma.e4() && TEnum.equals(merchandise.category, "svip");
    }

    /* JADX INFO: renamed from: a */
    public void m27416a() {
        this.f23489d.put(Boolean.FALSE);
        this.f23490e.put(0L);
    }

    /* JADX INFO: renamed from: d */
    public List<Merchandise> m27417d(boolean z) {
        if (m27412g().m27419j() || vwb.J(this.f23487b)) {
            return null;
        }
        if (z) {
            return this.f23488c;
        }
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : this.f23487b) {
            if (rxa0.l(merchandise, "lowPriceCallback3VIP") || rxa0.l(merchandise, "lowPriceCallback3SVIP")) {
                arrayList.add(merchandise);
            }
        }
        this.f23488c = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<Merchandise> m27418e(ProductCategory productCategory) {
        List<Merchandise> listM27417d = m27417d(false);
        if (!vwb.J(listM27417d) && TEnum.equals(listM27417d.get(0).category, productCategory)) {
            return listM27417d;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m27419j() {
        return this.f23486a;
    }

    /* JADX INFO: renamed from: l */
    public void m27420l() {
        this.f23486a = true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m27421m() {
        if (mqi0.D(((Long) this.f23490e.get()).longValue())) {
            return false;
        }
        this.f23490e.put(Long.valueOf(mqi0.o()));
        return true;
    }
}
