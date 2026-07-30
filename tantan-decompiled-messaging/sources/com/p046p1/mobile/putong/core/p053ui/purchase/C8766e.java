package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;
import p149l.cb9;
import p149l.cjy;
import p149l.h6a;
import p149l.igj;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.rxa0;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.e */
/* JADX INFO: loaded from: classes4.dex */
public class C8766e {

    /* JADX INFO: renamed from: a */
    public static NumberFormat f34580a = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m53629c(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22306c m53633g(Context context, j760 j760Var) {
        boolean zM200296J = vwb.m200296J((Collection) j760Var.f116565b);
        F f = j760Var.f116564a;
        return zM200296J ? igj.m136009M(context, (List) f).map(new w9j() { // from class: l.ibb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53641o((List) obj);
            }
        }) : mkd0.m154984r(igj.m136009M(context, (List) f), igj.m136009M(context, (List) j760Var.f116565b), new x9j() { // from class: l.jbb0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return C8766e.m53635i((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ j760 m53634h(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ j760 m53635i(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C22306c m53636j(boolean z, PurchaseType purchaseType, ProductCategory productCategory) {
        if (z) {
            cb9 cb9Var = CoreModule.f17545c.f19569G2;
            if (cb9Var.f80117R != null && cb9Var.m105984l3(purchaseType)) {
                return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(purchaseType.productCategory()), CoreModule.f17545c.f19654j0.m30644y5(CoreModule.f17545c.f19569G2.m105981i3()), new x9j() { // from class: l.hbb0
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return C8766e.m53634h((List) obj, (List) obj2);
                    }
                });
            }
        }
        return CoreModule.f17545c.f19654j0.m30644y5(purchaseType.productCategory()).map(new w9j() { // from class: l.gbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53629c((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C8765d m53637k(Context context, PurchaseType purchaseType, j760 j760Var) {
        if (!vwb.m200296J((Collection) j760Var.f116565b)) {
            ProductCategory productCategoryM105981i3 = CoreModule.f17545c.f19569G2.m105981i3();
            return m53647u(cjy.m107330z(productCategoryM105981i3).mo107333a(context, purchaseType, productCategoryM105981i3, (List) j760Var.f116565b));
        }
        List<C8765d> listMo107333a = cjy.m107330z(purchaseType.productCategory()).mo107333a(context, purchaseType, purchaseType.productCategory(), (List) j760Var.f116564a);
        for (C8765d c8765d : listMo107333a) {
            C8765d.a aVarM53520b = c8765d.m53520b();
            if (aVarM53520b == null) {
                aVarM53520b = c8765d.m53522d();
            }
            if (aVarM53520b != null && NullChecker.m81303a(aVarM53520b.m53601s()) && aVarM53520b.m53601s().weekly()) {
                return c8765d;
            }
        }
        return m53647u(listMo107333a);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ j760 m53641o(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: q */
    public static String m53643q(C8765d.a aVar) {
        boolean zM181493n;
        double firstCouponPrice;
        if (aVar == null) {
            return "";
        }
        f34580a.setMinimumFractionDigits(2);
        f34580a.setMaximumFractionDigits(2);
        if (!NullChecker.m81303a(aVar.m53601s())) {
            return "";
        }
        Merchandise merchandiseM53601s = aVar.m53601s();
        double d = merchandiseM53601s.defaultStockKeepUnit.prices.price;
        String string = merchandiseM53601s.category.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip) || string.equals(ProductCategory.tttSeeWhoLikedMe)) {
            zM181493n = rxa0.m181493n(merchandiseM53601s);
            firstCouponPrice = merchandiseM53601s.getFirstCouponPrice();
        } else {
            zM181493n = false;
            firstCouponPrice = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(merchandiseM53601s.defaultStockKeepUnit.prices.currencySymbol);
        NumberFormat numberFormat = f34580a;
        if (zM181493n) {
            d = firstCouponPrice;
        }
        sb.append(numberFormat.format(d));
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<C8765d> m53644r(@NonNull final Context context, final PurchaseType purchaseType) {
        final boolean z = false;
        if (h6a.m129470c() && (!xma.m210087m4() || !xma.m210077h4())) {
            z = true;
        }
        return C22306c.just(purchaseType.productCategory()).flatMap(new w9j() { // from class: l.mbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53636j(z, purchaseType, (ProductCategory) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.nbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).flatMap(new w9j() { // from class: l.obb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53633g(context, (j760) obj);
            }
        }).take(1).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.pbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).map(new w9j() { // from class: l.qbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53637k(context, purchaseType, (j760) obj);
            }
        }).filter(new w9j() { // from class: l.rbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((C8765d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<List<Merchandise>> m53645s(ProductCategory productCategory) {
        return CoreModule.f17545c.f19654j0.m30644y5(productCategory).filter(new w9j() { // from class: l.fbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static C22306c<List<C8765d>> m53646t(final Context context, final PurchaseType purchaseType) {
        final ProductCategory productCategory = purchaseType.productCategory();
        return m53645s(productCategory).flatMap(new w9j() { // from class: l.sbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17554l.m94651a().mo33504g5(context, (List) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ebb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ProductCategory productCategory2 = productCategory;
                return cjy.m107330z(productCategory2).mo107333a(context, purchaseType, productCategory2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C8765d m53647u(List<C8765d> list) {
        C8765d c8765d = null;
        int iM53605w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (C8765d c8765d2 : list) {
            C8765d.a aVarM53520b = c8765d2.m53520b();
            if (aVarM53520b != null || (aVarM53520b = c8765d2.m53522d()) != null) {
                if (aVarM53520b.m53605w() == 1 && aVarM53520b.m53601s().monthType()) {
                    return c8765d2;
                }
                if (iM53605w > aVarM53520b.m53605w()) {
                    iM53605w = aVarM53520b.m53605w();
                    c8765d = c8765d2;
                }
            }
        }
        return c8765d;
    }

    /* JADX INFO: renamed from: v */
    public static C22306c<C8765d> m53648v(@NonNull Context context, PurchaseType purchaseType) {
        return m53646t(context, purchaseType).filter(new w9j() { // from class: l.dbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).map(new w9j() { // from class: l.kbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8766e.m53647u((List) obj);
            }
        }).filter(new w9j() { // from class: l.lbb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((C8765d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static String m53649w(C8765d.a aVar) {
        if (aVar == null) {
            return "";
        }
        byte b = 2;
        f34580a.setMinimumFractionDigits(2);
        f34580a.setMaximumFractionDigits(2);
        if (NullChecker.m81303a(aVar.m53601s())) {
            Merchandise merchandiseM53601s = aVar.m53601s();
            double firstCouponPrice = merchandiseM53601s.defaultStockKeepUnit.prices.price;
            String string = merchandiseM53601s.category.toString();
            string.getClass();
            switch (string.hashCode()) {
                case -1301121252:
                    b = !string.equals(ProductCategory.Promo_premiumUpgradeToUltra) ? (byte) -1 : (byte) 0;
                    break;
                case -863315575:
                    b = !string.equals(ProductCategory.tttVip) ? (byte) -1 : (byte) 1;
                    break;
                case 449746854:
                    if (!string.equals(ProductCategory.tttSeeWhoLikedMe)) {
                        b = -1;
                    }
                    break;
                case 1654011977:
                    b = !string.equals(ProductCategory.tttVipUpgradeToPremium) ? (byte) -1 : (byte) 3;
                    break;
                case 1879244927:
                    b = !string.equals(ProductCategory.tttSeeUpgradeToPremium) ? (byte) -1 : (byte) 4;
                    break;
                case 1916885208:
                    b = !string.equals(ProductCategory.tttPremiumUpgradeToUltra) ? (byte) -1 : (byte) 5;
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
                    double d = (Double.parseDouble(aVar.m53589k()) * ((double) aVar.m53605w())) - aVar.m53602t();
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return aVar.m53583h() + f34580a.format(d);
                    }
                    break;
                case 1:
                case 2:
                    firstCouponPrice = merchandiseM53601s.getFirstCouponPrice();
                default:
                    double d2 = (((double) merchandiseM53601s.quantity) * merchandiseM53601s.defaultStockKeepUnit.prices.originalUnitPrice) - firstCouponPrice;
                    if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return merchandiseM53601s.defaultStockKeepUnit.prices.currencySymbol + f34580a.format(d2);
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public static boolean m53650x(String str) {
        return "p_home,upgrade_svip".equals(str) || "p_home,upgrade_odiamond".equals(str);
    }
}
