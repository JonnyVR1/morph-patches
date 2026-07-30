package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;
import p153l.cjj;
import p153l.fo0;
import p153l.joa;
import p153l.jyb;
import p153l.lc9;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.t7a;
import p153l.v5b0;
import p153l.zry;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.e */
/* JADX INFO: loaded from: classes4.dex */
public class C8929e {

    /* JADX INFO: renamed from: a */
    public static NumberFormat f35428a = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ pf60 m54812c(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22421c m54816g(Context context, pf60 pf60Var) {
        boolean zM147479J = jyb.m147479J((Collection) pf60Var.f152157b);
        F f = pf60Var.f152156a;
        return zM147479J ? cjj.m110205M(context, (List) f).map(new qcj() { // from class: l.mjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54824o((List) obj);
            }
        }) : psd0.m173625r(cjj.m110205M(context, (List) f), cjj.m110205M(context, (List) pf60Var.f152157b), new rcj() { // from class: l.njb0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return C8929e.m54818i((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ pf60 m54817h(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ pf60 m54818i(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C22421c m54819j(boolean z, PurchaseType purchaseType, ProductCategory productCategory) {
        if (z) {
            lc9 lc9Var = CoreModule.f18264c.f20311G2;
            if (lc9Var.f131283R != null && lc9Var.m153654l3(purchaseType)) {
                return psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(purchaseType.productCategory()), CoreModule.f18264c.f20396j0.m31647y5(CoreModule.f18264c.f20311G2.m153651i3()), new rcj() { // from class: l.ljb0
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return C8929e.m54817h((List) obj, (List) obj2);
                    }
                });
            }
        }
        return CoreModule.f18264c.f20396j0.m31647y5(purchaseType.productCategory()).map(new qcj() { // from class: l.kjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54812c((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C8928d m54820k(Context context, PurchaseType purchaseType, pf60 pf60Var) {
        if (!jyb.m147479J((Collection) pf60Var.f152157b)) {
            ProductCategory productCategoryM153651i3 = CoreModule.f18264c.f20311G2.m153651i3();
            return m54830u(zry.m221275z(productCategoryM153651i3).mo147671a(context, purchaseType, productCategoryM153651i3, (List) pf60Var.f152157b));
        }
        List<C8928d> listMo147671a = zry.m221275z(purchaseType.productCategory()).mo147671a(context, purchaseType, purchaseType.productCategory(), (List) pf60Var.f152156a);
        for (C8928d c8928d : listMo147671a) {
            C8928d.a aVarM54703b = c8928d.m54703b();
            if (aVarM54703b == null) {
                aVarM54703b = c8928d.m54705d();
            }
            if (aVarM54703b != null && NullChecker.m82486a(aVarM54703b.m54784s()) && aVarM54703b.m54784s().weekly()) {
                return c8928d;
            }
        }
        return m54830u(listMo147671a);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ pf60 m54824o(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: q */
    public static String m54826q(C8928d.a aVar) {
        boolean zM199788n;
        double firstCouponPrice;
        if (aVar == null) {
            return "";
        }
        f35428a.setMinimumFractionDigits(2);
        f35428a.setMaximumFractionDigits(2);
        if (!NullChecker.m82486a(aVar.m54784s())) {
            return "";
        }
        Merchandise merchandiseM54784s = aVar.m54784s();
        double d = merchandiseM54784s.defaultStockKeepUnit.prices.price;
        String string = merchandiseM54784s.category.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip) || string.equals(ProductCategory.tttSeeWhoLikedMe)) {
            zM199788n = v5b0.m199788n(merchandiseM54784s);
            firstCouponPrice = merchandiseM54784s.getFirstCouponPrice();
        } else {
            zM199788n = false;
            firstCouponPrice = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(merchandiseM54784s.defaultStockKeepUnit.prices.currencySymbol);
        NumberFormat numberFormat = f35428a;
        if (zM199788n) {
            d = firstCouponPrice;
        }
        sb.append(numberFormat.format(d));
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<C8928d> m54827r(@NonNull final Context context, final PurchaseType purchaseType) {
        final boolean z = false;
        if (t7a.m189547c() && (!joa.m146401n4() || !joa.m146392i4())) {
            z = true;
        }
        return C22421c.just(purchaseType.productCategory()).flatMap(new qcj() { // from class: l.qjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54819j(z, purchaseType, (ProductCategory) obj);
            }
        }).take(1).filter(new qcj() { // from class: l.rjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).flatMap(new qcj() { // from class: l.sjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54816g(context, (pf60) obj);
            }
        }).take(1).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.tjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).map(new qcj() { // from class: l.ujb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54820k(context, purchaseType, (pf60) obj);
            }
        }).filter(new qcj() { // from class: l.vjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((C8928d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<List<Merchandise>> m54828s(ProductCategory productCategory) {
        return CoreModule.f18264c.f20396j0.m31647y5(productCategory).filter(new qcj() { // from class: l.jjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static C22421c<List<C8928d>> m54829t(final Context context, final PurchaseType purchaseType) {
        final ProductCategory productCategory = purchaseType.productCategory();
        return m54828s(productCategory).flatMap(new qcj() { // from class: l.wjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18273l.m143405a().mo34507g5(context, (List) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ijb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                ProductCategory productCategory2 = productCategory;
                return zry.m221275z(productCategory2).mo147671a(context, purchaseType, productCategory2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C8928d m54830u(List<C8928d> list) {
        C8928d c8928d = null;
        int iM54788w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (C8928d c8928d2 : list) {
            C8928d.a aVarM54703b = c8928d2.m54703b();
            if (aVarM54703b != null || (aVarM54703b = c8928d2.m54705d()) != null) {
                if (aVarM54703b.m54788w() == 1 && aVarM54703b.m54784s().monthType()) {
                    return c8928d2;
                }
                if (iM54788w > aVarM54703b.m54788w()) {
                    iM54788w = aVarM54703b.m54788w();
                    c8928d = c8928d2;
                }
            }
        }
        return c8928d;
    }

    /* JADX INFO: renamed from: v */
    public static C22421c<C8928d> m54831v(@NonNull Context context, PurchaseType purchaseType) {
        return m54829t(context, purchaseType).filter(new qcj() { // from class: l.hjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).map(new qcj() { // from class: l.ojb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8929e.m54830u((List) obj);
            }
        }).filter(new qcj() { // from class: l.pjb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((C8928d) obj));
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static String m54832w(C8928d.a aVar) {
        if (aVar == null) {
            return "";
        }
        byte b = 2;
        f35428a.setMinimumFractionDigits(2);
        f35428a.setMaximumFractionDigits(2);
        if (NullChecker.m82486a(aVar.m54784s())) {
            Merchandise merchandiseM54784s = aVar.m54784s();
            double firstCouponPrice = merchandiseM54784s.defaultStockKeepUnit.prices.price;
            String string = merchandiseM54784s.category.toString();
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
                    double d = (Double.parseDouble(aVar.m54772k()) * ((double) aVar.m54788w())) - aVar.m54785t();
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return aVar.m54766h() + f35428a.format(d);
                    }
                    break;
                case 1:
                case 2:
                    firstCouponPrice = merchandiseM54784s.getFirstCouponPrice();
                default:
                    double d2 = (((double) merchandiseM54784s.quantity) * merchandiseM54784s.defaultStockKeepUnit.prices.originalUnitPrice) - firstCouponPrice;
                    if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return merchandiseM54784s.defaultStockKeepUnit.prices.currencySymbol + f35428a.format(d2);
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public static boolean m54833x(String str) {
        return "p_home,upgrade_svip".equals(str) || "p_home,upgrade_odiamond".equals(str);
    }
}
