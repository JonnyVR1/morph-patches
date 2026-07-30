package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0191e;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import l.cb9;
import l.cjy;
import l.h6a;
import l.igj;
import l.j760;
import l.jo0;
import l.mkd0;
import l.rxa0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0191e {

    /* JADX INFO: renamed from: a */
    public static NumberFormat f2402a = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m4195c(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ c m4199g(Context context, j760 j760Var) {
        boolean zJ = vwb.J((Collection) j760Var.b);
        Object obj = j760Var.a;
        return zJ ? igj.M(context, (List) obj).map(new w9j() { // from class: l.ibb0
            public final Object call(Object obj2) {
                return C0191e.m4207o((List) obj2);
            }
        }) : mkd0.r(igj.M(context, (List) obj), igj.M(context, (List) j760Var.b), new x9j() { // from class: l.jbb0
            public final Object call(Object obj2, Object obj3) {
                return C0191e.m4201i((List) obj2, (List) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ j760 m4200h(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ j760 m4201i(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ c m4202j(boolean z, PurchaseType purchaseType, ProductCategory productCategory) {
        if (z) {
            cb9 cb9Var = CoreModule.c.G2;
            if (cb9Var.R != null && cb9Var.l3(purchaseType)) {
                return mkd0.r(CoreModule.c.j0.y5(purchaseType.productCategory()), CoreModule.c.j0.y5(CoreModule.c.G2.i3()), new x9j() { // from class: l.hbb0
                    public final Object call(Object obj, Object obj2) {
                        return C0191e.m4200h((List) obj, (List) obj2);
                    }
                });
            }
        }
        return CoreModule.c.j0.y5(purchaseType.productCategory()).map(new w9j() { // from class: l.gbb0
            public final Object call(Object obj) {
                return C0191e.m4195c((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0190d m4203k(Context context, PurchaseType purchaseType, j760 j760Var) {
        if (!vwb.J((Collection) j760Var.b)) {
            ProductCategory productCategoryI3 = CoreModule.c.G2.i3();
            return m4213u(cjy.z(productCategoryI3).a(context, purchaseType, productCategoryI3, (List) j760Var.b));
        }
        List<C0190d> listA = cjy.z(purchaseType.productCategory()).a(context, purchaseType, purchaseType.productCategory(), (List) j760Var.a);
        for (C0190d c0190d : listA) {
            C0190d.a aVarM4086b = c0190d.m4086b();
            if (aVarM4086b == null) {
                aVarM4086b = c0190d.m4088d();
            }
            if (aVarM4086b != null && NullChecker.a(aVarM4086b.m4167s()) && aVarM4086b.m4167s().weekly()) {
                return c0190d;
            }
        }
        return m4213u(listA);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ j760 m4207o(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: q */
    public static String m4209q(C0190d.a aVar) {
        boolean zN;
        double firstCouponPrice;
        if (aVar == null) {
            return "";
        }
        f2402a.setMinimumFractionDigits(2);
        f2402a.setMaximumFractionDigits(2);
        if (!NullChecker.a(aVar.m4167s())) {
            return "";
        }
        Merchandise merchandiseM4167s = aVar.m4167s();
        double d = merchandiseM4167s.defaultStockKeepUnit.prices.price;
        String string = merchandiseM4167s.category.toString();
        string.getClass();
        if (string.equals("tttVip") || string.equals("tttSeeWhoLikedMe")) {
            zN = rxa0.n(merchandiseM4167s);
            firstCouponPrice = merchandiseM4167s.getFirstCouponPrice();
        } else {
            zN = false;
            firstCouponPrice = 0.0d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(merchandiseM4167s.defaultStockKeepUnit.prices.currencySymbol);
        NumberFormat numberFormat = f2402a;
        if (zN) {
            d = firstCouponPrice;
        }
        sb.append(numberFormat.format(d));
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static c<C0190d> m4210r(@NonNull final Context context, final PurchaseType purchaseType) {
        final boolean z = false;
        if (h6a.c() && (!xma.m4() || !xma.h4())) {
            z = true;
        }
        return c.just(purchaseType.productCategory()).flatMap(new w9j() { // from class: l.mbb0
            public final Object call(Object obj) {
                return C0191e.m4202j(z, purchaseType, (ProductCategory) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.nbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).flatMap(new w9j() { // from class: l.obb0
            public final Object call(Object obj) {
                return C0191e.m4199g(context, (j760) obj);
            }
        }).take(1).observeOn(jo0.a()).filter(new w9j() { // from class: l.pbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).map(new w9j() { // from class: l.qbb0
            public final Object call(Object obj) {
                return C0191e.m4203k(context, purchaseType, (j760) obj);
            }
        }).filter(new w9j() { // from class: l.rbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((C0190d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static c<List<Merchandise>> m4211s(ProductCategory productCategory) {
        return CoreModule.c.j0.y5(productCategory).filter(new w9j() { // from class: l.fbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static c<List<C0190d>> m4212t(final Context context, final PurchaseType purchaseType) {
        final ProductCategory productCategory = purchaseType.productCategory();
        return m4211s(productCategory).flatMap(new w9j() { // from class: l.sbb0
            public final Object call(Object obj) {
                return CoreModule.l.a().g5(context, (List) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ebb0
            public final Object call(Object obj) {
                ProductCategory productCategory2 = productCategory;
                return cjy.z(productCategory2).a(context, purchaseType, productCategory2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C0190d m4213u(List<C0190d> list) {
        C0190d c0190d = null;
        int iM4171w = Integer.MAX_VALUE;
        for (C0190d c0190d2 : list) {
            C0190d.a aVarM4086b = c0190d2.m4086b();
            if (aVarM4086b != null || (aVarM4086b = c0190d2.m4088d()) != null) {
                if (aVarM4086b.m4171w() == 1 && aVarM4086b.m4167s().monthType()) {
                    return c0190d2;
                }
                if (iM4171w > aVarM4086b.m4171w()) {
                    iM4171w = aVarM4086b.m4171w();
                    c0190d = c0190d2;
                }
            }
        }
        return c0190d;
    }

    /* JADX INFO: renamed from: v */
    public static c<C0190d> m4214v(@NonNull Context context, PurchaseType purchaseType) {
        return m4212t(context, purchaseType).filter(new w9j() { // from class: l.dbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).map(new w9j() { // from class: l.kbb0
            public final Object call(Object obj) {
                return C0191e.m4213u((List) obj);
            }
        }).filter(new w9j() { // from class: l.lbb0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((C0190d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static String m4215w(C0190d.a aVar) {
        if (aVar == null) {
            return "";
        }
        byte b = 2;
        f2402a.setMinimumFractionDigits(2);
        f2402a.setMaximumFractionDigits(2);
        if (NullChecker.a(aVar.m4167s())) {
            Merchandise merchandiseM4167s = aVar.m4167s();
            double firstCouponPrice = merchandiseM4167s.defaultStockKeepUnit.prices.price;
            String string = merchandiseM4167s.category.toString();
            string.getClass();
            switch (string.hashCode()) {
                case -1301121252:
                    b = !string.equals("Promo_premiumUpgradeToUltra") ? (byte) -1 : (byte) 0;
                    break;
                case -863315575:
                    b = !string.equals("tttVip") ? (byte) -1 : (byte) 1;
                    break;
                case 449746854:
                    if (!string.equals("tttSeeWhoLikedMe")) {
                        b = -1;
                    }
                    break;
                case 1654011977:
                    b = !string.equals("tttVipUpgradeToPremium") ? (byte) -1 : (byte) 3;
                    break;
                case 1879244927:
                    b = !string.equals("tttSeeUpgradeToPremium") ? (byte) -1 : (byte) 4;
                    break;
                case 1916885208:
                    b = !string.equals("tttPremiumUpgradeToUltra") ? (byte) -1 : (byte) 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 3:
                case 4:
                case 5:
                    double d = (Double.parseDouble(aVar.m4155k()) * ((double) aVar.m4171w())) - aVar.m4168t();
                    if (d > 0.0d) {
                        return aVar.m4149h() + f2402a.format(d);
                    }
                    break;
                case 1:
                case 2:
                    firstCouponPrice = merchandiseM4167s.getFirstCouponPrice();
                default:
                    double d2 = (((double) merchandiseM4167s.quantity) * merchandiseM4167s.defaultStockKeepUnit.prices.originalUnitPrice) - firstCouponPrice;
                    if (d2 > 0.0d) {
                        return merchandiseM4167s.defaultStockKeepUnit.prices.currencySymbol + f2402a.format(d2);
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4216x(String str) {
        return "p_home,upgrade_svip".equals(str) || "p_home,upgrade_odiamond".equals(str);
    }
}
