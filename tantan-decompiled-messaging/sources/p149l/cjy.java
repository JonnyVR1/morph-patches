package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.GPContract;
import com.p046p1.mobile.putong.data.GPSkuDetails;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class cjy {

    /* JADX INFO: renamed from: a */
    public static int f81259a = 30;

    /* JADX INFO: renamed from: b */
    public static NumberFormat f81260b = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static NumberFormat f81261c = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: d */
    public static double f81262d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: e */
    public static double f81263e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l.cjy$a */
    public static class C16172a implements rwl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m107331b(int i, boolean z, boolean z2, Merchandise merchandise) {
            boolean z3 = false;
            boolean z4 = merchandise.quantity == i;
            boolean zNoneRenewable = z ? merchandise.noneRenewable() : merchandise.autoRenewable();
            boolean zWeekly = z2 ? merchandise.weekly() : merchandise.monthType();
            if (z4 && zNoneRenewable && zWeekly) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0012  */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Boolean m107332c(Merchandise merchandise) {
            boolean z;
            if (merchandise.autoRenewable() && merchandise.weekly()) {
                z = merchandise.quantity == 1;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: Code duplicated, block: B:183:0x01e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:29:0x00be  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:39:0x0102  */
        /* JADX WARN: Code duplicated, block: B:45:0x011f A[PHI: r5
          0x011f: PHI (r5v20 boolean) = (r5v19 boolean), (r5v19 boolean), (r5v21 boolean), (r5v21 boolean) binds: [B:67:0x016f, B:60:0x015a, B:51:0x0133, B:44:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x0121  */
        /* JADX WARN: Code duplicated, block: B:53:0x0136  */
        /* JADX WARN: Code duplicated, block: B:55:0x013f  */
        /* JADX WARN: Code duplicated, block: B:62:0x015d  */
        /* JADX WARN: Code duplicated, block: B:69:0x0172  */
        /* JADX WARN: Code duplicated, block: B:73:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0190  */
        /* JADX WARN: Code duplicated, block: B:78:0x019e  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:95:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:96:0x01d8  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v33 */
        /* JADX WARN: Type inference failed for: r7v34 */
        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            Merchandise merchandiseM53601s;
            Merchandise merchandiseM53601s2;
            int i;
            final int i2;
            final boolean z;
            final boolean z2;
            List<String> list2;
            C8765d.a aVarM107303I;
            C8765d c8765dM53519a;
            boolean z3;
            boolean z4;
            int i3;
            ?? r7;
            boolean z5;
            String strSubstring;
            ProductCategory productCategory2 = productCategory;
            ArrayList<C8765d> arrayList = new ArrayList();
            boolean zM107321q = cjy.m107321q(list);
            List<String> listM167153v = p2b0.m167133h().m167153v(productCategory2);
            String strM167144m = p2b0.m167133h().m167144m(productCategory2);
            ArrayList arrayListM107297C = cjy.m107297C(ProductCategory.tttVip);
            ArrayList arrayListM107297C2 = cjy.m107297C(ProductCategory.tttSeeWhoLikedMe);
            ArrayList arrayListM107297C3 = cjy.m107297C("svip");
            int i4 = 0;
            boolean z6 = false;
            while (i4 < listM167153v.size()) {
                String str = listM167153v.get(i4);
                if (str.startsWith("-")) {
                    String strSubstring2 = str.substring(1);
                    if (strSubstring2.endsWith("w")) {
                        i2 = Integer.parseInt(strSubstring2.substring(0, strSubstring2.length() - 1));
                        z2 = true;
                    } else {
                        i2 = Integer.parseInt(strSubstring2);
                        z2 = false;
                    }
                    z = true;
                } else if (str.endsWith("w")) {
                    i2 = Integer.parseInt(str.substring(0, str.length() - 1));
                    z2 = true;
                    z = false;
                } else {
                    i2 = Integer.parseInt(str);
                    z = false;
                    z2 = false;
                }
                Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ajy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return cjy.C16172a.m107331b(i2, z, z2, (Merchandise) obj);
                    }
                });
                boolean z7 = TEnum.equals(productCategory2, ProductCategory.tttUltraPremium) || sab0.m182904v(purchaseType);
                if (z2 && z7) {
                    boolean zM210040C3 = xma.m210040C3();
                    if (NullChecker.m81303a(merchandise) && zM210040C3) {
                        list2 = listM167153v;
                    } else if (NullChecker.m81303a(merchandise)) {
                        list2 = listM167153v;
                        aVarM107303I = cjy.m107303I(context, purchaseType, i4, productCategory2, merchandise, null, zM107321q, false);
                        if (NullChecker.m81303a(aVarM107303I)) {
                            c8765dM53519a = C8765d.m53519a(aVarM107303I, null, false);
                            c8765dM53519a.m53538t(rxa0.m181493n(merchandise));
                            if (TextUtils.isEmpty(strM167144m)) {
                                z3 = true;
                            } else {
                                if (strM167144m.startsWith("-")) {
                                    z3 = true;
                                    strSubstring = strM167144m.substring(1);
                                    if (strSubstring.endsWith("w")) {
                                        int i5 = Integer.parseInt(strSubstring.substring(0, strSubstring.length() - 1));
                                        if (!merchandise.noneRenewable()) {
                                        }
                                    } else {
                                        int i6 = Integer.parseInt(strSubstring);
                                        if (!merchandise.noneRenewable()) {
                                        }
                                    }
                                } else {
                                    z3 = true;
                                    if (strM167144m.endsWith("w")) {
                                        int i7 = Integer.parseInt(strM167144m.substring(0, strM167144m.length() - 1));
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    } else {
                                        int i8 = Integer.parseInt(strM167144m);
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    }
                                }
                                c8765dM53519a.m53540v(z4);
                                c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                                if (z4) {
                                    z6 = z3;
                                }
                                if (CoreModule.m29932K().me_().isVIP()) {
                                    i3 = merchandise.quantity;
                                    if (cjy.m107304J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    c8765dM53519a.m53540v(z5);
                                    c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                                } else {
                                    i3 = merchandise.quantity;
                                    if (cjy.m107304J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    c8765dM53519a.m53540v(z5);
                                    c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                                }
                                arrayList.add(c8765dM53519a);
                            }
                            z4 = false;
                            c8765dM53519a.m53540v(z4);
                            c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (CoreModule.m29932K().me_().isVIP()) {
                                i3 = merchandise.quantity;
                                if (cjy.m107304J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8765dM53519a.m53540v(z5);
                                c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                            } else {
                                i3 = merchandise.quantity;
                                if (cjy.m107304J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8765dM53519a.m53540v(z5);
                                c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                            }
                            arrayList.add(c8765dM53519a);
                        }
                    } else {
                        list2 = listM167153v;
                    }
                } else if (NullChecker.m81303a(merchandise)) {
                    list2 = listM167153v;
                    aVarM107303I = cjy.m107303I(context, purchaseType, i4, productCategory2, merchandise, null, zM107321q, false);
                    if (NullChecker.m81303a(aVarM107303I)) {
                        c8765dM53519a = C8765d.m53519a(aVarM107303I, null, false);
                        c8765dM53519a.m53538t(rxa0.m181493n(merchandise));
                        if (TextUtils.isEmpty(strM167144m)) {
                            if (strM167144m.startsWith("-")) {
                                z3 = true;
                                strSubstring = strM167144m.substring(1);
                                if (strSubstring.endsWith("w")) {
                                    int i9 = Integer.parseInt(strSubstring.substring(0, strSubstring.length() - 1));
                                    if (!merchandise.noneRenewable() && merchandise.weekly() && merchandise.quantity == i9) {
                                        z4 = z3;
                                    }
                                } else {
                                    int i10 = Integer.parseInt(strSubstring);
                                    if (!merchandise.noneRenewable() && merchandise.monthType() && merchandise.quantity == i10) {
                                        z4 = z3;
                                    }
                                }
                            } else {
                                z3 = true;
                                if (strM167144m.endsWith("w")) {
                                    int i11 = Integer.parseInt(strM167144m.substring(0, strM167144m.length() - 1));
                                    if (!merchandise.autoRenewable() && merchandise.weekly() && merchandise.quantity == i11) {
                                        z4 = z3;
                                    }
                                } else {
                                    int i12 = Integer.parseInt(strM167144m);
                                    if (!merchandise.autoRenewable() && merchandise.monthType() && merchandise.quantity == i12) {
                                        z4 = z3;
                                    }
                                }
                            }
                            c8765dM53519a.m53540v(z4);
                            c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (((CoreModule.m29932K().me_().isVIP() && CoreModule.m29935P().m94651a().mo33489e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ((arrayListM107297C.isEmpty() && arrayListM107297C2.isEmpty()) || (CoreModule.m29932K().me_().isSVIP() && arrayListM107297C3.isEmpty()))) && cjy.m107324t(purchaseType, context)) {
                                i3 = merchandise.quantity;
                                if (cjy.m107304J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8765dM53519a.m53540v(z5);
                                c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                            }
                            arrayList.add(c8765dM53519a);
                        } else {
                            z3 = true;
                        }
                        z4 = false;
                        c8765dM53519a.m53540v(z4);
                        c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                        if (z4) {
                            z6 = z3;
                        }
                        if (CoreModule.m29932K().me_().isVIP()) {
                            i3 = merchandise.quantity;
                            if (cjy.m107304J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            c8765dM53519a.m53540v(z5);
                            c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                        } else {
                            i3 = merchandise.quantity;
                            if (cjy.m107304J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            c8765dM53519a.m53540v(z5);
                            c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                        }
                        arrayList.add(c8765dM53519a);
                    }
                } else {
                    list2 = listM167153v;
                }
                i4++;
                productCategory2 = productCategory;
                listM167153v = list2;
            }
            C8765d.a aVar = null;
            if (!z6 && !arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    ((C8765d) arrayList.get(1)).m53540v(true);
                    ((C8765d) arrayList.get(1)).m53536r(true);
                } else {
                    ((C8765d) arrayList.get(0)).m53540v(true);
                    ((C8765d) arrayList.get(0)).m53536r(true);
                }
            }
            if (CoreModule.f17545c.f19654j0.m30608T4()) {
                for (C8765d c8765d : arrayList) {
                    if (cjy.m107302H(c8765d.m53521c())) {
                        c8765d.m53536r(cjy.m107302H(c8765d.m53521c()));
                    }
                }
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f17545c.f19696x0.m30188P3()) {
                for (C8765d c8765d2 : arrayList) {
                    if (CoreModule.f17545c.f19696x0.m30204m4(c8765d2.m53521c())) {
                        c8765d2.m53536r(true);
                        c8765d2.m53540v(true);
                    } else {
                        c8765d2.m53540v(false);
                    }
                }
            }
            if (CoreModule.m29935P().m94651a().mo33442Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                cjy.m107296B(context, list);
            }
            int i13 = -1;
            for (C8765d c8765d3 : arrayList) {
                C8765d.a aVarM53522d = c8765d3.m53522d() != null ? c8765d3.m53522d() : c8765d3.m53520b();
                if (aVarM53522d != null && (merchandiseM53601s2 = aVarM53522d.m53601s()) != null && !merchandiseM53601s2.weekly() && (i = merchandiseM53601s2.quantity) > i13) {
                    aVar = aVarM53522d;
                    i13 = i;
                }
            }
            if (aVar != null) {
                aVar.m53556L(true);
            }
            Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.bjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return cjy.C16172a.m107332c((Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                double d = merchandise2.defaultStockKeepUnit.prices.price;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    cjy.f81260b.setMaximumFractionDigits(2);
                    for (C8765d c8765d4 : arrayList) {
                        C8765d.a aVarM53522d2 = c8765d4.m53522d() != null ? c8765d4.m53522d() : c8765d4.m53520b();
                        if (aVarM53522d2 != null && (merchandiseM53601s = aVarM53522d2.m53601s()) != null && !merchandiseM53601s.weekly()) {
                            double d2 = (merchandiseM53601s.defaultStockKeepUnit.prices.price * 12.0d) / (((double) merchandiseM53601s.quantity) * 52.0d);
                            double d3 = d2 / d;
                            int iCeil = (int) Math.ceil((1.0d - d3) * 100.0d);
                            if (!cjy.m107298D(context, purchaseType, merchandiseM53601s)) {
                                if (iCeil > 0) {
                                    aVarM53522d2.m53578e0(IntlCountryCodeController.m28125u() ? context.getString(R$string.f27422d9, String.valueOf((int) Math.floor(d3 * 100.0d))) : context.getString(R$string.f27410c9, String.valueOf(iCeil)));
                                } else {
                                    aVarM53522d2.m53578e0("");
                                }
                            }
                            aVarM53522d2.m53592l0(context.getString(R$string.f27097A6, merchandiseM53601s.defaultStockKeepUnit.prices.currencySymbol, String.format(Locale.US, "%.2f", Double.valueOf(d2))));
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$b */
    public static class C16173b implements rwl {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Boolean m107335c(String str, Merchandise merchandise) {
            boolean z = false;
            if (str.startsWith("-")) {
                if (TextUtils.equals(String.valueOf(merchandise.quantity * (-1)), str) && merchandise.noneRenewable()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.autoRenewable()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m107336d(context, purchaseType, productCategory, list, null);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX INFO: renamed from: d */
        public List<C8765d> m107336d(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            C8765d c8765dM53519a;
            ProductCategory productCategory2 = productCategory;
            boolean zM107321q = cjy.m107321q(list);
            boolean zM107320p = cjy.m107320p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.djy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            String strM167144m = p2b0.m167133h().m167144m(productCategory2);
            int i = 0;
            for (final String str : p2b0.m167133h().m167153v(productCategory2)) {
                Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ejy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return cjy.C16173b.m107335c(str, (Merchandise) obj);
                    }
                });
                if (NullChecker.m81303a(merchandise2)) {
                    C8765d.a aVarM107303I = cjy.m107303I(context, purchaseType, i, productCategory2, merchandise2, merchandise, zM107321q, zM107320p);
                    if (NullChecker.m81303a(aVarM107303I)) {
                        boolean z = true;
                        aVarM107303I.m53574c0(true);
                        boolean zM181493n = rxa0.m181493n(merchandise2);
                        if (merchandise2.autoRenewable()) {
                            if (!zM181493n) {
                                aVarM107303I.m53578e0(merchandise2.yearly() ? "连续包年" : merchandise2.quarterly() ? "连续包季" : "连续包月");
                            }
                            c8765dM53519a = C8765d.m53519a(null, aVarM107303I, true);
                            c8765dM53519a.m53537s(zM181493n);
                        } else {
                            c8765dM53519a = C8765d.m53519a(aVarM107303I, null, false);
                            c8765dM53519a.m53538t(zM181493n);
                        }
                        if (strM167144m.startsWith("-")) {
                            if (merchandise2.noneRenewable()) {
                                if (!TextUtils.equals(strM167144m, "-" + merchandise2.quantity)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        } else if (!merchandise2.autoRenewable() || !TextUtils.equals(strM167144m, String.valueOf(merchandise2.quantity))) {
                            z = false;
                        }
                        c8765dM53519a.m53540v(z);
                        arrayList.add(c8765dM53519a);
                        i++;
                    }
                }
                productCategory2 = productCategory;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$c */
    public static class C16174c implements rwl {
        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM107321q = cjy.m107321q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                Merchandise merchandise = list.get(i);
                C8765d c8765d = new C8765d();
                boolean z = true;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                ProductCategory productCategory2 = productCategory;
                C8765d.a aVarM107303I = cjy.m107303I(context2, purchaseType2, i, productCategory2, merchandise, list.get(list.size() - 1), zM107321q, false);
                if (merchandise.autoRenewable()) {
                    c8765d.m53533o(aVarM107303I);
                } else {
                    c8765d.m53539u(aVarM107303I);
                }
                if (((int) Math.floor(list.size() / 2.0f)) != i) {
                    z = false;
                }
                c8765d.m53540v(z);
                c8765d.m53536r(z);
                c8765d.m53541w(z);
                c8765d.m53523e();
                arrayList.add(c8765d);
                i++;
                context = context2;
                purchaseType = purchaseType2;
                productCategory = productCategory2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$d */
    public static class C16175d implements rwl {
        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m107343h(context, purchaseType, productCategory, list, null);
        }

        /* JADX INFO: renamed from: h */
        public List<C8765d> m107343h(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            boolean zM107321q = cjy.m107321q(list);
            boolean zM107320p = cjy.m107320p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.fjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            C8765d.a aVarM107303I = cjy.m107303I(context, purchaseType, 0, productCategory, merchandise, merchandise, zM107321q, zM107320p);
            Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.gjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
                }
            });
            C8765d.a aVarM107303I2 = cjy.m107303I(context, purchaseType, 0, productCategory, merchandise2, merchandise2, zM107321q, zM107320p);
            if (NullChecker.m81303a(aVarM107303I) && NullChecker.m81303a(aVarM107303I2)) {
                C8765d c8765dM53519a = C8765d.m53519a(aVarM107303I, aVarM107303I2, true);
                c8765dM53519a.m53537s(rxa0.m181493n(merchandise2));
                c8765dM53519a.m53538t(rxa0.m181493n(merchandise));
                c8765dM53519a.m53540v(false);
                arrayList.add(c8765dM53519a);
            }
            Merchandise merchandise3 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.hjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise4 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise4.quarterly() && merchandise4.noneRenewable());
                }
            });
            C8765d.a aVarM107303I3 = cjy.m107303I(context, purchaseType, 1, productCategory, merchandise3, merchandise, zM107321q, zM107320p);
            Merchandise merchandise4 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ijy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise5 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise5.quarterly() && merchandise5.autoRenewable());
                }
            });
            C8765d.a aVarM107303I4 = cjy.m107303I(context, purchaseType, 1, productCategory, merchandise4, merchandise2, zM107321q, zM107320p);
            if (NullChecker.m81303a(aVarM107303I3) && NullChecker.m81303a(aVarM107303I4)) {
                C8765d c8765dM53519a2 = C8765d.m53519a(aVarM107303I3, aVarM107303I4, true);
                c8765dM53519a2.m53537s(rxa0.m181493n(merchandise4));
                c8765dM53519a2.m53538t(rxa0.m181493n(merchandise3));
                c8765dM53519a2.m53540v(true);
                c8765dM53519a2.m53536r(true);
                arrayList.add(c8765dM53519a2);
            }
            Merchandise merchandise5 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.jjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise6 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise6.yearly() && merchandise6.noneRenewable());
                }
            });
            C8765d.a aVarM107303I5 = cjy.m107303I(context, purchaseType, 2, productCategory, merchandise5, merchandise, zM107321q, zM107320p);
            Merchandise merchandise6 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.kjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise7 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise7.yearly() && merchandise7.autoRenewable());
                }
            });
            C8765d.a aVarM107303I6 = cjy.m107303I(context, purchaseType, 2, productCategory, merchandise6, merchandise2, zM107321q, zM107320p);
            if (NullChecker.m81303a(aVarM107303I5) && NullChecker.m81303a(aVarM107303I6)) {
                C8765d c8765dM53519a3 = C8765d.m53519a(aVarM107303I5, aVarM107303I6, true);
                c8765dM53519a3.m53537s(rxa0.m181493n(merchandise6));
                c8765dM53519a3.m53538t(rxa0.m181493n(merchandise5));
                c8765dM53519a3.m53540v(false);
                c8765dM53519a3.m53536r(false);
                arrayList.add(c8765dM53519a3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$e */
    public static class C16176e implements rwl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m107344b(String str, Merchandise merchandise) {
            boolean z = false;
            if (str.startsWith("-")) {
                if (TextUtils.equals(String.valueOf(merchandise.quantity * (-1)), str) && merchandise.noneRenewable()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.autoRenewable()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM107321q = cjy.m107321q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (final String str : p2b0.m167133h().m167153v(productCategory)) {
                w9j<Merchandise, Boolean> w9jVar = new w9j() { // from class: l.ljy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return cjy.C16176e.m107344b(str, (Merchandise) obj);
                    }
                };
                C16176e c16176e = this;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                List<Merchandise> list2 = list;
                C8765d c8765dM107346d = c16176e.m107346d(context2, purchaseType2, list2, zM107321q, i, w9jVar);
                if (NullChecker.m81303a(c8765dM107346d)) {
                    i++;
                    arrayList.add(c8765dM107346d);
                }
                this = c16176e;
                context = context2;
                purchaseType = purchaseType2;
                list = list2;
            }
            C16176e c16176e2 = this;
            String strM167144m = p2b0.m167133h().m167144m(productCategory);
            for (C8765d c8765d : arrayList) {
                C8765d.a aVarM53522d = c8765d.m53522d();
                if (aVarM53522d == null) {
                    aVarM53522d = c8765d.m53520b();
                }
                if (TextUtils.equals(String.valueOf(NullChecker.m81304b(aVarM53522d) ? aVarM53522d.m53601s().quantity : 0), strM167144m)) {
                    c8765d.m53540v(true);
                    return arrayList;
                }
            }
            c16176e2.m107347e(arrayList);
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final C8765d m107346d(Context context, PurchaseType purchaseType, List<Merchandise> list, boolean z, int i, final w9j<Merchandise, Boolean> w9jVar) {
            C8765d c8765dM53519a;
            Objects.requireNonNull(w9jVar);
            final Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.mjy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return (Boolean) w9jVar.call((Merchandise) obj);
                }
            });
            if (!NullChecker.m81304b(merchandise)) {
                return null;
            }
            final boolean zNoneRenewable = merchandise.noneRenewable();
            boolean zM107320p = cjy.m107320p(list);
            Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.njy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise.quantity == merchandise3.quantity && (!zNoneRenewable ? merchandise3.noneRenewable() : merchandise3.autoRenewable()));
                }
            });
            C8765d.a aVarM107303I = cjy.m107303I(context, purchaseType, i, merchandise.category, merchandise, merchandise2, z, zM107320p);
            C8765d.a aVarM107303I2 = cjy.m107303I(context, purchaseType, i, merchandise.category, merchandise2, merchandise, z, zM107320p);
            if (!NullChecker.m81303a(aVarM107303I) || !NullChecker.m81303a(aVarM107303I2)) {
                return null;
            }
            if (zNoneRenewable) {
                c8765dM53519a = C8765d.m53519a(aVarM107303I, aVarM107303I2, true);
                c8765dM53519a.m53537s(rxa0.m181493n(merchandise2));
                c8765dM53519a.m53538t(rxa0.m181493n(merchandise));
            } else {
                c8765dM53519a = C8765d.m53519a(aVarM107303I2, aVarM107303I, true);
                c8765dM53519a.m53537s(rxa0.m181493n(merchandise));
                c8765dM53519a.m53538t(rxa0.m181493n(merchandise2));
            }
            c8765dM53519a.m53540v(false);
            return c8765dM53519a;
        }

        /* JADX INFO: renamed from: e */
        public final void m107347e(List<C8765d> list) {
            for (C8765d c8765d : list) {
                if ((c8765d.m53520b() == null ? c8765d.m53522d() : c8765d.m53520b()).m53601s().quarterly()) {
                    c8765d.m53540v(true);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.cjy$f */
    public static class C16177f implements rwl {
        @Override // p149l.rwl
        /* JADX INFO: renamed from: a */
        public List<C8765d> mo107333a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            int size;
            boolean zM107321q = cjy.m107321q(list);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Merchandise merchandise : list) {
                if (!arrayList2.contains(Integer.valueOf(merchandise.quantity))) {
                    arrayList2.add(Integer.valueOf(merchandise.quantity));
                }
            }
            if (h6a.m129476i()) {
                Collections.sort(arrayList2, new Comparator() { // from class: l.ojy
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Integer) obj).compareTo((Integer) obj2);
                    }
                });
            } else {
                Collections.sort(arrayList2, new Comparator() { // from class: l.pjy
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Integer) obj2).compareTo((Integer) obj);
                    }
                });
            }
            ArrayList arrayListM107297C = cjy.m107297C(ProductCategory.tttVip);
            ArrayList arrayListM107297C2 = cjy.m107297C(ProductCategory.tttSeeWhoLikedMe);
            ArrayList arrayListM107297C3 = cjy.m107297C("svip");
            int i = 0;
            boolean z = false;
            while (i < arrayList2.size()) {
                final int iIntValue = ((Integer) arrayList2.get(i)).intValue();
                Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.qjy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Merchandise merchandise3 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise3.quantity == iIntValue && merchandise3.noneRenewable());
                    }
                });
                C8765d.a aVarM107303I = cjy.m107303I(context, purchaseType, 1, productCategory, merchandise2, null, zM107321q, false);
                Merchandise merchandise3 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.rjy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Merchandise merchandise4 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise4.quantity == iIntValue && merchandise4.autoRenewable());
                    }
                });
                C8765d.a aVarM107303I2 = cjy.m107303I(context, purchaseType, (arrayList2.size() - 1) - i, productCategory, merchandise3, null, zM107321q, false);
                if (NullChecker.m81303a(aVarM107303I) || NullChecker.m81303a(aVarM107303I2)) {
                    C8765d c8765dM53519a = C8765d.m53519a(aVarM107303I, aVarM107303I2, true);
                    c8765dM53519a.m53537s(rxa0.m181493n(merchandise3));
                    c8765dM53519a.m53538t(rxa0.m181493n(merchandise2));
                    if ((!CoreModule.m29932K().me_().isVIP() && CoreModule.m29935P().m94651a().mo33489e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        c8765dM53519a.m53540v(i == (cjy.m107324t(purchaseType, context) ? cjy.m107304J(purchaseType, context) ? 0 : 2 : 1));
                        c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                    } else if ((arrayListM107297C.isEmpty() && arrayListM107297C2.isEmpty()) || (CoreModule.m29932K().me_().isSVIP() && arrayListM107297C3.isEmpty())) {
                        c8765dM53519a.m53540v(i == (cjy.m107324t(purchaseType, context) ? cjy.m107304J(purchaseType, context) ? 0 : 2 : 1));
                        c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                    }
                    if (sab0.m182904v(purchaseType) && arrayList2.size() < 3) {
                        c8765dM53519a.m53540v(i == 0);
                    }
                    if (h6a.m129476i()) {
                        c8765dM53519a.m53540v(i == 0);
                    }
                    if (c8765dM53519a.m53530l()) {
                        z = true;
                    }
                    c8765dM53519a.m53536r(c8765dM53519a.m53530l());
                    arrayList.add(c8765dM53519a);
                }
                i++;
            }
            if (!z && (size = arrayList.size() / 2) < arrayList.size()) {
                ((C8765d) arrayList.get(size)).m53540v(true);
                ((C8765d) arrayList.get(size)).m53536r(true);
            }
            if (CoreModule.m29935P().m94651a().mo33442Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                cjy.m107296B(context, list);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m107295A(int i) {
        if (i == 300) {
            return 1;
        }
        if (i == 1800) {
            return 12;
        }
        if (i != 2678400) {
            return i != 31622400 ? 3 : 12;
        }
        return 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m107296B(Context context, final List<Merchandise> list) {
        final long vipToExpireTimeInMill = CoreModule.f17545c.f19639e0.m169527p9().getVipToExpireTimeInMill();
        final long jMo33623ws = CoreModule.m29935P().m94651a().mo33623ws();
        ArrayList<String> arrayListM107297C = m107297C(ProductCategory.tttVip);
        ArrayList<String> arrayListM107297C2 = m107297C(ProductCategory.tttSeeWhoLikedMe);
        ArrayList<String> arrayListM107297C3 = m107297C("svip");
        ogj.m164200c().f143866c.put("");
        ogj.m164200c().f143867d.put("");
        if (!arrayListM107297C3.isEmpty() && CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            f81263e = -1.0d;
            CoreModule.m29935P().m94651a().mo33408Sm(context, arrayListM107297C3, true, 500L).subscribe(mkd0.m154955G(new e30() { // from class: l.wiy
                @Override // p149l.e30
                public final void call(Object obj) {
                    cjy.m107305a((Optional) obj);
                }
            }));
        } else if (!arrayListM107297C2.isEmpty() && !CoreModule.m29935P().m94651a().mo33489e2()) {
            f81263e = -1.0d;
            CoreModule.m29935P().m94651a().mo33408Sm(context, arrayListM107297C2, true, 500L).subscribe(mkd0.m154955G(new e30() { // from class: l.xiy
                @Override // p149l.e30
                public final void call(Object obj) {
                    cjy.m107307c(list, jMo33623ws, (Optional) obj);
                }
            }));
        } else {
            if (arrayListM107297C.isEmpty() || !CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                return;
            }
            f81262d = -1.0d;
            CoreModule.m29935P().m94651a().mo33408Sm(context, arrayListM107297C, true, 500L).subscribe(mkd0.m154955G(new e30() { // from class: l.yiy
                @Override // p149l.e30
                public final void call(Object obj) {
                    cjy.m107308d(list, vipToExpireTimeInMill, (Optional) obj);
                }
            }));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static ArrayList<String> m107297C(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        List<GPContract> listM221515e = Collections.EMPTY_LIST;
        str.getClass();
        switch (str) {
            case "tttVip":
                listM221515e = CoreModule.f17545c.f19654j0.f19280S.m221515e();
                break;
            case "svip":
                listM221515e = CoreModule.f17545c.f19654j0.f19281T.m221515e();
                break;
            case "tttSeeWhoLikedMe":
                listM221515e = CoreModule.f17545c.f19654j0.f19282U.m221515e();
                break;
        }
        if (listM221515e != null && !listM221515e.isEmpty()) {
            arrayList.add(listM221515e.get(0).iapProductID);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m107298D(Context context, PurchaseType purchaseType, Merchandise merchandise) {
        if (merchandise == null) {
            return false;
        }
        if (m107302H(merchandise) || CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
            return true;
        }
        if (m107324t(purchaseType, context)) {
            if (merchandise.quantity == (m107304J(purchaseType, context) ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m107299E(PurchaseType purchaseType, Merchandise merchandise) {
        return merchandise.autoRenewable() && sab0.m182895m(purchaseType) && rxa0.m181500u(merchandise) && CoreModule.m29935P().m94651a().mo33529k();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m107300F() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 != null) {
            return qqi0.m175940h(mqi0.m155944o(), (long) userM169527p9.createdTime, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m107301G(String str) {
        return CoreModule.f17545c.f19654j0.m30608T4() && CoreModule.f17545c.f19696x0.m30188P3() && !TextUtils.isEmpty(CoreModule.f17545c.f19654j0.m30576C4().skuId) && TextUtils.equals(ProductCategory.tttSvipGoogleplay, str) && !m107300F();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m107302H(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (CoreModule.f17545c.f19654j0.m30608T4() && CoreModule.f17545c.f19696x0.m30188P3() && merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && stockKeepUnit.affiliateProducts != null && CoreModule.f17545c.f19654j0.m30576C4() != null) {
            String str = merchandise.defaultStockKeepUnit.affiliateProducts.googleplay;
            String str2 = CoreModule.f17545c.f19654j0.m30576C4().skuId;
            if (NullChecker.m81303a(str) && NullChecker.m81303a(str2) && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0513  */
    /* JADX WARN: Code duplicated, block: B:258:0x0519  */
    /* JADX WARN: Code duplicated, block: B:260:0x0531  */
    /* JADX WARN: Code duplicated, block: B:261:0x0542  */
    /* JADX WARN: Code duplicated, block: B:264:0x054a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0551  */
    /* JADX WARN: Code duplicated, block: B:267:0x055b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0565  */
    /* JADX WARN: Code duplicated, block: B:270:0x056c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0573  */
    /* JADX WARN: Code duplicated, block: B:273:0x057b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0581  */
    /* JADX WARN: Code duplicated, block: B:276:0x0584  */
    /* JADX WARN: Code duplicated, block: B:278:0x0587 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x0589  */
    /* JADX WARN: Code duplicated, block: B:280:0x058c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: I */
    public static C8765d.a m107303I(Context context, PurchaseType purchaseType, int i, ProductCategory productCategory, Merchandise merchandise, Merchandise merchandise2, boolean z, boolean z2) {
        boolean zM181493n;
        double firstCouponPrice;
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        int iM107322r;
        String string4;
        String str3;
        String strM107319o;
        String str4;
        String string5;
        String string6;
        String string7;
        String str5;
        String string8;
        String string9;
        String strM107318n;
        int i2;
        Context context2;
        boolean zM107304J;
        int i3;
        int i4;
        Context context3;
        String string10;
        if (merchandise == null) {
            return null;
        }
        f81260b.setMaximumFractionDigits(2);
        double d = merchandise.defaultStockKeepUnit.prices.price;
        String str6 = f81260b.format(d);
        double d2 = merchandise.defaultStockKeepUnit.prices.unitPrice;
        String str7 = f81260b.format(d2);
        f81260b.format(merchandise.defaultStockKeepUnit.prices.originalPrice);
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        double d3 = prices.originalUnitPrice;
        String str8 = prices.currencySymbol;
        String str9 = null;
        String string11 = productCategory.toString();
        string11.getClass();
        byte b = 3;
        switch (string11) {
            case "tttVip":
            case "svipPicksMembership":
            case "svip":
            case "tttSeeWhoLikedMe":
                zM181493n = rxa0.m181493n(merchandise);
                firstCouponPrice = merchandise.getFirstCouponPrice();
                break;
            default:
                firstCouponPrice = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                zM181493n = false;
                break;
        }
        double d4 = firstCouponPrice;
        double d5 = d;
        String str10 = f81260b.format(d4);
        boolean z3 = zM181493n;
        Resources resources = context.getResources();
        double d6 = d4;
        int i5 = merchandise.quantity;
        boolean zM107299E = m107299E(purchaseType, merchandise);
        String string12 = productCategory.toString();
        string12.getClass();
        switch (string12.hashCode()) {
            case -1403004683:
                b = !string12.equals(ProductCategory.noneLiveCoin) ? (byte) -1 : (byte) 0;
                break;
            case -1338150991:
                b = !string12.equals(ProductCategory.tttLiveCoin) ? (byte) -1 : (byte) 1;
                break;
            case -1301121252:
                b = !string12.equals(ProductCategory.Promo_premiumUpgradeToUltra) ? (byte) -1 : (byte) 2;
                break;
            case -1204773696:
                if (!string12.equals(ProductCategory.tttDiamond)) {
                    b = -1;
                }
                break;
            case -1106172890:
                b = !string12.equals("letter") ? (byte) -1 : (byte) 4;
                break;
            case -993539419:
                b = !string12.equals(ProductCategory.tttCoin) ? (byte) -1 : (byte) 5;
                break;
            case -863315575:
                b = !string12.equals(ProductCategory.tttVip) ? (byte) -1 : (byte) 6;
                break;
            case -815973819:
                b = !string12.equals(ProductCategory.tttInstantChat) ? (byte) -1 : (byte) 7;
                break;
            case -796840475:
                b = !string12.equals("oDiamond") ? (byte) -1 : (byte) 8;
                break;
            case -735868401:
                b = !string12.equals(ProductCategory.tttBoost) ? (byte) -1 : (byte) 9;
                break;
            case -435036897:
                b = !string12.equals(ProductCategory.tttUltraPremium) ? (byte) -1 : (byte) 10;
                break;
            case -333095502:
                b = !string12.equals("superLike") ? (byte) -1 : (byte) 11;
                break;
            case -94011970:
                b = !string12.equals("svipPicksMembership") ? (byte) -1 : (byte) 12;
                break;
            case 3059345:
                b = !string12.equals("coin") ? (byte) -1 : HttpTokens.CARRIAGE_RETURN;
                break;
            case 3542730:
                b = !string12.equals("svip") ? (byte) -1 : (byte) 14;
                break;
            case 93922211:
                b = !string12.equals("boost") ? (byte) -1 : (byte) 15;
                break;
            case 150908446:
                b = !string12.equals(ProductCategory.tttSuperLike) ? (byte) -1 : Tnaf.POW_2_WIDTH;
                break;
            case 219393643:
                b = !string12.equals(ProductCategory.tttSvipGoogleplay) ? (byte) -1 : (byte) 17;
                break;
            case 449746854:
                b = !string12.equals(ProductCategory.tttSeeWhoLikedMe) ? (byte) -1 : (byte) 18;
                break;
            case 1166765179:
                b = !string12.equals("quickchatMembership") ? (byte) -1 : (byte) 19;
                break;
            case 1581498686:
                b = !string12.equals(ProductCategory.tttCompliment) ? (byte) -1 : (byte) 20;
                break;
            case 1654011977:
                b = !string12.equals(ProductCategory.tttVipUpgradeToPremium) ? (byte) -1 : (byte) 21;
                break;
            case 1879244927:
                b = !string12.equals(ProductCategory.tttSeeUpgradeToPremium) ? (byte) -1 : (byte) 22;
                break;
            case 1905099240:
                b = !string12.equals("picksMembership") ? (byte) -1 : (byte) 23;
                break;
            case 1916885208:
                b = !string12.equals(ProductCategory.tttPremiumUpgradeToUltra) ? (byte) -1 : (byte) 24;
                break;
            default:
                b = -1;
                break;
        }
        String strM133156c = "";
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 13:
                d5 = d5;
                String string13 = resources.getString(l7n.m148817e());
                f81261c.setMaximumFractionDigits(2);
                f81261c.setMinimumFractionDigits(2);
                string = null;
                str = null;
                str9 = null;
                string2 = String.format("%1$s %2$s", str8, f81261c.format(d5));
                string3 = string13;
                iM107322r = 0;
                str2 = str9;
                double d7 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d7 - d5) / d7));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context4 = context3;
                    strM133156c = string10;
                    context2 = context4;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 2:
            case 21:
            case 22:
            case 24:
                String string14 = resources.getString(i5 == 1 ? R$string.f27611t9 : R$string.f27622u9);
                StringBuilder sb = new StringBuilder();
                sb.append(str8);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                d5 = d5;
                sb.append(f81260b.format(d5));
                str9 = null;
                string3 = string14;
                string = sb.toString();
                string2 = "";
                str = string2;
                iM107322r = 0;
                str2 = str9;
                double d8 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d8 - d5) / d8));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context5 = context3;
                    strM133156c = string10;
                    context2 = context5;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 4:
                String str11 = String.format("%1$s %2$s", str8, str6);
                str2 = null;
                str9 = null;
                string3 = "条";
                str = String.format("%.1f", Double.valueOf(d2));
                string2 = "";
                d5 = d5;
                iM107322r = 0;
                string = str11;
                double d9 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d9 - d5) / d9));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context6 = context3;
                    strM133156c = string10;
                    context2 = context6;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 6:
            case 17:
            case 19:
                if (TEnum.equals(productCategory, ProductCategory.tttVip) || TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay)) {
                    if (merchandise.weekly()) {
                        string4 = resources.getString(i5 == 1 ? R$string.f27224M1 : R$string.f27235N1);
                        string2 = resources.getString(R$string.f27097A6, str8, str7);
                    } else {
                        string4 = resources.getString(i5 == 1 ? R$string.f27611t9 : R$string.f27622u9);
                        string2 = resources.getString(R$string.f27633v9, str8, str7);
                    }
                    str3 = String.format("%1$s%2$s", str8, str6);
                    if (!merchandise.autoRenewable() || !TEnum.equals(productCategory, "quickchatMembership")) {
                        string3 = string4;
                        string = str3;
                        str = "";
                        d5 = d5;
                        iM107322r = 0;
                        str2 = str9;
                        double d10 = ((double) i5) * d3;
                        i2 = (int) (100.0d * ((d10 - d5) / d10));
                        if (i2 != 0) {
                            if (IntlCountryCodeController.m28125u()) {
                                context3 = context;
                                string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                            } else {
                                context3 = context;
                                string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                            }
                            Context context7 = context3;
                            strM133156c = string10;
                            context2 = context7;
                        } else {
                            context2 = context;
                        }
                        if (m107302H(merchandise)) {
                            strM133156c = hvc0.m133156c(R$string.f27424e);
                        } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                            if (CoreModule.f17545c.f19696x0.m30195c4()) {
                                strM133156c = hvc0.m133156c(R$string.f27259P3);
                            } else {
                                strM133156c = hvc0.m133156c(R$string.f27424e);
                            }
                        } else if (m107324t(purchaseType, context2)) {
                            zM107304J = m107304J(purchaseType, context2);
                            if (zM107304J) {
                                i3 = 12;
                            } else {
                                i3 = 1;
                            }
                            if (i5 == i3) {
                                if (zM107304J) {
                                    i4 = R$string.f27270Q3;
                                } else {
                                    i4 = R$string.f27259P3;
                                }
                                strM133156c = hvc0.m133156c(i4);
                            }
                        }
                        return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
                    }
                    int i6 = R$string.f27446f9;
                    if (!z3) {
                        d6 = d2;
                    }
                    String string15 = resources.getString(i6, str8, t0g0.m186864e(d6 / ((double) f81259a)));
                    strM107319o = m107319o(merchandise, zM107299E);
                    string3 = string4;
                    str = string15;
                    iM107322r = 0;
                    string = str3;
                } else {
                    if (merchandise.noneRenewable()) {
                        str4 = String.format("%1$s %2$s", str8, str6);
                        iM107322r = 0;
                        strM107319o = null;
                    } else {
                        int i7 = R$string.f27387aa;
                        if (z3) {
                            str6 = str10;
                        }
                        String string16 = resources.getString(i7, str8, str6);
                        iM107322r = m107322r(merchandise, merchandise2, i5);
                        str4 = string16;
                        strM107319o = m107329y(merchandise);
                    }
                    String string17 = resources.getString(i5 == 1 ? R$string.f27611t9 : R$string.f27622u9);
                    string = resources.getString(R$string.f27633v9, str8, str7);
                    string2 = str4;
                    string3 = string17;
                    str = "";
                }
                str2 = strM107319o;
                double d11 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d11 - d5) / d11));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context8 = context3;
                    strM133156c = string10;
                    context2 = context8;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 7:
                string5 = resources.getString(R$string.f27217L5);
                string6 = str8 + t0g0.m186864e(d5);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM107322r = 0;
                double d12 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d12 - d5) / d12));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context9 = context3;
                    strM133156c = string10;
                    context2 = context9;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 8:
            case 10:
            case 12:
            case 14:
            case 23:
                string3 = merchandise.weekly() ? resources.getString(i5 == 1 ? R$string.f27224M1 : R$string.f27235N1) : resources.getString(i5 == 1 ? R$string.f27611t9 : R$string.f27622u9);
                if (!z || z2) {
                    if (zM107299E) {
                        string7 = p2b0.m167133h().m167151t(merchandise, merchandise.quantity);
                        str5 = String.format("%1$s /%2$s", str8 + str10, str8 + str6);
                    } else if (merchandise.weekly()) {
                        string7 = resources.getString(R$string.f27097A6, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    } else {
                        string7 = resources.getString(R$string.f27633v9, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    }
                    if (!merchandise.autoRenewable() || z2) {
                        string8 = "";
                    } else {
                        int i8 = R$string.f27446f9;
                        if (!z3) {
                            d6 = d2;
                        }
                        string8 = resources.getString(i8, str8, t0g0.m186864e(d6 / ((double) f81259a)));
                        m107326v(m107322r(merchandise, merchandise2, i5));
                    }
                    int iM107322r2 = m107322r(merchandise, merchandise2, i5);
                    String strM107318n2 = m107318n(merchandise, z3 || zM107299E);
                    string2 = string7;
                    iM107322r = iM107322r2;
                    str = string8;
                    string = str5;
                    str9 = strM107318n2;
                } else {
                    if (merchandise.noneRenewable()) {
                        string9 = String.format("%1$s %2$s", str8, str6);
                        strM107318n = null;
                        iM107322r = 0;
                    } else {
                        int i9 = R$string.f27387aa;
                        if (z3) {
                            str6 = str10;
                        }
                        string9 = resources.getString(i9, str8, str6);
                        int iM107322r3 = m107322r(merchandise, merchandise2, i5);
                        strM107318n = m107318n(merchandise, z3 || zM107299E);
                        iM107322r = iM107322r3;
                    }
                    string2 = string9;
                    string = resources.getString(R$string.f27633v9, str8, str7);
                    str9 = strM107318n;
                    str = "";
                }
                d5 = d5;
                str2 = null;
                double d13 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d13 - d5) / d13));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context10 = context3;
                    strM133156c = string10;
                    context2 = context10;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 9:
            case 15:
                string5 = resources.getString(i5 == 1 ? R$string.f27508l : R$string.f27520m);
                string6 = resources.getString(R$string.f27496k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM107322r = 0;
                double d14 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d14 - d5) / d14));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context11 = context3;
                    strM133156c = string10;
                    context2 = context11;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 11:
            case 16:
                String string18 = resources.getString(i5 == 1 ? R$string.f27153F7 : R$string.f27164G7);
                String string19 = resources.getString(R$string.f27175H7, str8, str7);
                str9 = null;
                string3 = string18;
                string = string19;
                string2 = "";
                str = string2;
                d5 = d5;
                iM107322r = 0;
                str2 = str9;
                double d15 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d15 - d5) / d15));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context12 = context3;
                    strM133156c = string10;
                    context2 = context12;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 18:
                String string20 = resources.getString(i5 == 1 ? R$string.f27611t9 : R$string.f27622u9);
                String string21 = resources.getString(R$string.f27633v9, str8, str7);
                str3 = String.format("%1$s%2$s", str8, str6);
                string3 = string20;
                string2 = string21;
                string = str3;
                str = "";
                d5 = d5;
                iM107322r = 0;
                str2 = str9;
                double d16 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d16 - d5) / d16));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context13 = context3;
                    strM133156c = string10;
                    context2 = context13;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            case 20:
                string5 = resources.getString(R$string.f27380a3);
                string6 = resources.getString(R$string.f27496k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM107322r = 0;
                double d17 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d17 - d5) / d17));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m28125u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f27422d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f27410c9, String.valueOf(i2));
                    }
                    Context context14 = context3;
                    strM133156c = string10;
                    context2 = context14;
                } else {
                    context2 = context;
                }
                if (m107302H(merchandise)) {
                    strM133156c = hvc0.m133156c(R$string.f27424e);
                } else if (CoreModule.f17545c.f19696x0.m30204m4(merchandise)) {
                    if (CoreModule.f17545c.f19696x0.m30195c4()) {
                        strM133156c = hvc0.m133156c(R$string.f27259P3);
                    } else {
                        strM133156c = hvc0.m133156c(R$string.f27424e);
                    }
                } else if (m107324t(purchaseType, context2)) {
                    zM107304J = m107304J(purchaseType, context2);
                    if (zM107304J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM107304J) {
                            i4 = R$string.f27270Q3;
                        } else {
                            i4 = R$string.f27259P3;
                        }
                        strM133156c = hvc0.m133156c(i4);
                    }
                }
                return C8765d.b.m53609b().m53621m(merchandise).m53624p(i5).m53625q(string3).m53626r(string2).m53613e(string).m53612d(str).m53619k(str2).m53617i(str9).m53620l(strM133156c).m53623o(productCategory).m53615g(null).m53618j(iM107322r).m53622n(d5).m53614f(str8).m53616h(String.valueOf(d3)).m53610a();
            default:
                all.m97315a("You should add ", productCategory.name(), " in parseMerchandise method.");
                return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m107304J(PurchaseType purchaseType, Context context) {
        return CoreModule.m29935P().m94651a().mo33560pf(context) && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f17545c.f19654j0.m30645z4();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m107305a(Optional optional) {
        if (optional.isPresent()) {
            GPContract gPContract = CoreModule.f17545c.f19654j0.f19281T.m221515e().get(0);
            if (m107327w(gPContract.chargeInterval) <= 0) {
                m107323s(1);
                return;
            }
            ogj.m164200c().f143864a.m132487l(Double.valueOf(f81263e));
            ogj.m164200c().f143865b.m132487l(Integer.valueOf(m107325u(gPContract.chargeInterval)));
            ogj.m164200c().f143866c.put(gPContract.iapProductID + ogj.f143862e + PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m107307c(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = CoreModule.f17545c.f19654j0.f19282U.m221515e().get(0);
                int iM107327w = m107327w(gPContract.chargeInterval);
                if (iM107327w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m107295A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM107327w)) * d;
                    f81263e = d2;
                    double d3 = f81262d;
                    if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 > d3) {
                        if (d2 > d) {
                            f81263e = d;
                        }
                        ogj.m164200c().f143864a.m132487l(Double.valueOf(f81263e));
                        ogj.m164200c().f143865b.m132487l(Integer.valueOf(m107325u(gPContract.chargeInterval)));
                        ogj.m164200c().f143866c.put(gPContract.iapProductID + ogj.f143862e + PurchaseType.TYPE_GET_LIKERS);
                        ogj.m164200c().f143867d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m107323s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m107308d(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = CoreModule.f17545c.f19654j0.f19280S.m221515e().get(0);
                int iM107327w = m107327w(gPContract.chargeInterval);
                if (iM107327w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m107295A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM107327w)) * d;
                    f81262d = d2;
                    double d3 = f81263e;
                    if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 > d3) {
                        if (d2 > d) {
                            f81262d = d;
                        }
                        ogj.m164200c().f143864a.m132487l(Double.valueOf(f81262d));
                        ogj.m164200c().f143865b.m132487l(Integer.valueOf(m107325u(gPContract.chargeInterval)));
                        ogj.m164200c().f143866c.put(gPContract.iapProductID + ogj.f143862e + PurchaseType.TYPE_GET_VIP);
                        ogj.m164200c().f143867d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m107323s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m107318n(Merchandise merchandise, boolean z) {
        if (z) {
            return String.valueOf(Math.round(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice - merchandise.getFirstCouponPrice()));
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return String.valueOf(Math.round(prices.noneRenewalPrice - prices.price));
    }

    /* JADX INFO: renamed from: o */
    public static String m107319o(Merchandise merchandise, boolean z) {
        if (z) {
            return i0g0.m133839F((merchandise.getFirstCouponPrice() / merchandise.defaultStockKeepUnit.prices.noneRenewalPrice) * 10.0d, 1);
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return i0g0.m133841H((prices.price / prices.noneRenewalPrice) * 10.0d);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m107320p(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
            if ((CoreModule.m29935P().m94651a().mo33529k() && rxa0.m181495p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks)) || rxa0.m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m107321q(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (rxa0.m181493n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static int m107322r(Merchandise merchandise, Merchandise merchandise2, int i) {
        double d;
        if (merchandise == null) {
            return 0;
        }
        double firstCouponPrice = rxa0.m181493n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        ArrayList arrayListM200339n = vwb.m200339n(CoreModule.f17545c.f19654j0.m30579D5(merchandise.category), new w9j() { // from class: l.ziy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.noneRenewable() && merchandise3.monthly());
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            d = NullChecker.m81303a(merchandise2) ? merchandise2.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            d = ((Merchandise) arrayListM200339n.get(0)).defaultStockKeepUnit.prices.unitPrice;
        }
        double d2 = d * ((double) i);
        return (int) (((d2 - firstCouponPrice) / d2) * 100.0d);
    }

    /* JADX INFO: renamed from: s */
    public static void m107323s(int i) {
        ogj.m164200c().f143865b.m132487l(Integer.valueOf(m107325u(i)));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m107324t(PurchaseType purchaseType, Context context) {
        if (CoreModule.m29935P().m94651a().mo33560pf(context)) {
            if (purchaseType == PurchaseType.TYPE_GET_VIP && CoreModule.f17545c.f19654j0.m30574B4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_LIKERS && CoreModule.f17545c.f19654j0.m30572A4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f17545c.f19654j0.m30643y4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static int m107325u(int i) {
        if (h6a.m129476i()) {
            if (i != 300) {
                if (i != 1800) {
                    if (i != 2678400) {
                        if (i != 31622400) {
                            return 1;
                        }
                    }
                }
                return 2;
            }
            return 0;
        }
        if (i != 300) {
            if (i != 1800) {
                if (i != 2678400) {
                    if (i != 31622400) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: v */
    public static String m107326v(int i) {
        return String.format(Locale.getDefault(), CoreModule.f17544b.getString(R$string.f27168H0), i + "%");
    }

    /* JADX INFO: renamed from: w */
    public static int m107327w(int i) {
        int i2 = 300;
        if (i != 300) {
            i2 = 600;
            if (i != 600) {
                i2 = 1800;
                if (i != 1800) {
                    i2 = 2678400;
                    if (i != 2678400) {
                        i2 = 8035200;
                        if (i != 8035200) {
                            i2 = 31622400;
                            if (i != 31622400) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: x */
    public static rwl m107328x() {
        return IntlCountryCodeController.m28115k() ? new C16177f() : new C16172a();
    }

    /* JADX INFO: renamed from: y */
    public static String m107329y(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return i0g0.m133839F((prices.price / prices.noneRenewalPrice) * 10.0d, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r0.equals(com.p046p1.mobile.putong.core.data.ProductCategory.tttSvipGoogleplay) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r0.equals("svipPicksMembership") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (p149l.p2b0.m167133h().m167157z() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        return new p149l.cjy.C16173b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        return new p149l.cjy.C16175d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r0.equals(com.p046p1.mobile.putong.core.data.ProductCategory.tttVip) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        return m107328x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.equals("picksMembership") != false) goto L42;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p149l.rwl m107330z(com.p046p1.mobile.putong.core.data.ProductCategory r3) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.cjy.m107330z(com.p1.mobile.putong.core.data.ProductCategory):l.rwl");
    }
}
