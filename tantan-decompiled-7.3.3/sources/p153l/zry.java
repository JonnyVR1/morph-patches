package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.GPContract;
import com.p051p1.mobile.putong.data.GPSkuDetails;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class zry {

    /* JADX INFO: renamed from: a */
    public static int f205829a = 30;

    /* JADX INFO: renamed from: b */
    public static NumberFormat f205830b = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static NumberFormat f205831c = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: d */
    public static double f205832d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: e */
    public static double f205833e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l.zry$a */
    public static class C21876a implements jzl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m221276b(int i, boolean z, boolean z2, Merchandise merchandise) {
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
        public static /* synthetic */ Boolean m221277c(Merchandise merchandise) {
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
        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            Merchandise merchandiseM54784s;
            Merchandise merchandiseM54784s2;
            int i;
            final int i2;
            final boolean z;
            final boolean z2;
            List<String> list2;
            C8928d.a aVarM221248I;
            C8928d c8928dM54702a;
            boolean z3;
            boolean z4;
            int i3;
            ?? r7;
            boolean z5;
            String strSubstring;
            ProductCategory productCategory2 = productCategory;
            ArrayList<C8928d> arrayList = new ArrayList();
            boolean zM221266q = zry.m221266q(list);
            List<String> listM189831v = tab0.m189811h().m189831v(productCategory2);
            String strM189822m = tab0.m189811h().m189822m(productCategory2);
            ArrayList arrayListM221242C = zry.m221242C(ProductCategory.tttVip);
            ArrayList arrayListM221242C2 = zry.m221242C(ProductCategory.tttSeeWhoLikedMe);
            ArrayList arrayListM221242C3 = zry.m221242C("svip");
            int i4 = 0;
            boolean z6 = false;
            while (i4 < listM189831v.size()) {
                String str = listM189831v.get(i4);
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
                Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.xry
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return zry.C21876a.m221276b(i2, z, z2, (Merchandise) obj);
                    }
                });
                boolean z7 = TEnum.equals(productCategory2, ProductCategory.tttUltraPremium) || wib0.m206578v(purchaseType);
                if (z2 && z7) {
                    boolean zM146354D3 = joa.m146354D3();
                    if (NullChecker.m82486a(merchandise) && zM146354D3) {
                        list2 = listM189831v;
                    } else if (NullChecker.m82486a(merchandise)) {
                        list2 = listM189831v;
                        aVarM221248I = zry.m221248I(context, purchaseType, i4, productCategory2, merchandise, null, zM221266q, false);
                        if (NullChecker.m82486a(aVarM221248I)) {
                            c8928dM54702a = C8928d.m54702a(aVarM221248I, null, false);
                            c8928dM54702a.m54721t(v5b0.m199788n(merchandise));
                            if (TextUtils.isEmpty(strM189822m)) {
                                z3 = true;
                            } else {
                                if (strM189822m.startsWith("-")) {
                                    z3 = true;
                                    strSubstring = strM189822m.substring(1);
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
                                    if (strM189822m.endsWith("w")) {
                                        int i7 = Integer.parseInt(strM189822m.substring(0, strM189822m.length() - 1));
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    } else {
                                        int i8 = Integer.parseInt(strM189822m);
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    }
                                }
                                c8928dM54702a.m54723v(z4);
                                c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                                if (z4) {
                                    z6 = z3;
                                }
                                if (CoreModule.m30930K().me_().isVIP()) {
                                    i3 = merchandise.quantity;
                                    if (zry.m221249J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    c8928dM54702a.m54723v(z5);
                                    c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                                } else {
                                    i3 = merchandise.quantity;
                                    if (zry.m221249J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    c8928dM54702a.m54723v(z5);
                                    c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                                }
                                arrayList.add(c8928dM54702a);
                            }
                            z4 = false;
                            c8928dM54702a.m54723v(z4);
                            c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (CoreModule.m30930K().me_().isVIP()) {
                                i3 = merchandise.quantity;
                                if (zry.m221249J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8928dM54702a.m54723v(z5);
                                c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                            } else {
                                i3 = merchandise.quantity;
                                if (zry.m221249J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8928dM54702a.m54723v(z5);
                                c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                            }
                            arrayList.add(c8928dM54702a);
                        }
                    } else {
                        list2 = listM189831v;
                    }
                } else if (NullChecker.m82486a(merchandise)) {
                    list2 = listM189831v;
                    aVarM221248I = zry.m221248I(context, purchaseType, i4, productCategory2, merchandise, null, zM221266q, false);
                    if (NullChecker.m82486a(aVarM221248I)) {
                        c8928dM54702a = C8928d.m54702a(aVarM221248I, null, false);
                        c8928dM54702a.m54721t(v5b0.m199788n(merchandise));
                        if (TextUtils.isEmpty(strM189822m)) {
                            if (strM189822m.startsWith("-")) {
                                z3 = true;
                                strSubstring = strM189822m.substring(1);
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
                                if (strM189822m.endsWith("w")) {
                                    int i11 = Integer.parseInt(strM189822m.substring(0, strM189822m.length() - 1));
                                    if (!merchandise.autoRenewable() && merchandise.weekly() && merchandise.quantity == i11) {
                                        z4 = z3;
                                    }
                                } else {
                                    int i12 = Integer.parseInt(strM189822m);
                                    if (!merchandise.autoRenewable() && merchandise.monthType() && merchandise.quantity == i12) {
                                        z4 = z3;
                                    }
                                }
                            }
                            c8928dM54702a.m54723v(z4);
                            c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (((CoreModule.m30930K().me_().isVIP() && CoreModule.m30933P().m143405a().mo34492e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ((arrayListM221242C.isEmpty() && arrayListM221242C2.isEmpty()) || (CoreModule.m30930K().me_().isSVIP() && arrayListM221242C3.isEmpty()))) && zry.m221269t(purchaseType, context)) {
                                i3 = merchandise.quantity;
                                if (zry.m221249J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                c8928dM54702a.m54723v(z5);
                                c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                            }
                            arrayList.add(c8928dM54702a);
                        } else {
                            z3 = true;
                        }
                        z4 = false;
                        c8928dM54702a.m54723v(z4);
                        c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                        if (z4) {
                            z6 = z3;
                        }
                        if (CoreModule.m30930K().me_().isVIP()) {
                            i3 = merchandise.quantity;
                            if (zry.m221249J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            c8928dM54702a.m54723v(z5);
                            c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                        } else {
                            i3 = merchandise.quantity;
                            if (zry.m221249J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            c8928dM54702a.m54723v(z5);
                            c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                        }
                        arrayList.add(c8928dM54702a);
                    }
                } else {
                    list2 = listM189831v;
                }
                i4++;
                productCategory2 = productCategory;
                listM189831v = list2;
            }
            C8928d.a aVar = null;
            if (!z6 && !arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    ((C8928d) arrayList.get(1)).m54723v(true);
                    ((C8928d) arrayList.get(1)).m54719r(true);
                } else {
                    ((C8928d) arrayList.get(0)).m54723v(true);
                    ((C8928d) arrayList.get(0)).m54719r(true);
                }
            }
            if (CoreModule.f18264c.f20396j0.m31611T4()) {
                for (C8928d c8928d : arrayList) {
                    if (zry.m221247H(c8928d.m54704c())) {
                        c8928d.m54719r(zry.m221247H(c8928d.m54704c()));
                    }
                }
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f18264c.f20438x0.m31186P3()) {
                for (C8928d c8928d2 : arrayList) {
                    if (CoreModule.f18264c.f20438x0.m31202m4(c8928d2.m54704c())) {
                        c8928d2.m54719r(true);
                        c8928d2.m54723v(true);
                    } else {
                        c8928d2.m54723v(false);
                    }
                }
            }
            if (CoreModule.m30933P().m143405a().mo34445Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                zry.m221241B(context, list);
            }
            int i13 = -1;
            for (C8928d c8928d3 : arrayList) {
                C8928d.a aVarM54705d = c8928d3.m54705d() != null ? c8928d3.m54705d() : c8928d3.m54703b();
                if (aVarM54705d != null && (merchandiseM54784s2 = aVarM54705d.m54784s()) != null && !merchandiseM54784s2.weekly() && (i = merchandiseM54784s2.quantity) > i13) {
                    aVar = aVarM54705d;
                    i13 = i;
                }
            }
            if (aVar != null) {
                aVar.m54739L(true);
            }
            Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.yry
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return zry.C21876a.m221277c((Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                double d = merchandise2.defaultStockKeepUnit.prices.price;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    zry.f205830b.setMaximumFractionDigits(2);
                    for (C8928d c8928d4 : arrayList) {
                        C8928d.a aVarM54705d2 = c8928d4.m54705d() != null ? c8928d4.m54705d() : c8928d4.m54703b();
                        if (aVarM54705d2 != null && (merchandiseM54784s = aVarM54705d2.m54784s()) != null && !merchandiseM54784s.weekly()) {
                            double d2 = (merchandiseM54784s.defaultStockKeepUnit.prices.price * 12.0d) / (((double) merchandiseM54784s.quantity) * 52.0d);
                            double d3 = d2 / d;
                            int iCeil = (int) Math.ceil((1.0d - d3) * 100.0d);
                            if (!zry.m221243D(context, purchaseType, merchandiseM54784s)) {
                                if (iCeil > 0) {
                                    aVarM54705d2.m54761e0(IntlCountryCodeController.m29124u() ? context.getString(R$string.f28270d9, String.valueOf((int) Math.floor(d3 * 100.0d))) : context.getString(R$string.f28258c9, String.valueOf(iCeil)));
                                } else {
                                    aVarM54705d2.m54761e0("");
                                }
                            }
                            aVarM54705d2.m54775l0(context.getString(R$string.f27945A6, merchandiseM54784s.defaultStockKeepUnit.prices.currencySymbol, String.format(Locale.US, "%.2f", Double.valueOf(d2))));
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.zry$b */
    public static class C21877b implements jzl {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Boolean m221279c(String str, Merchandise merchandise) {
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

        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m221280d(context, purchaseType, productCategory, list, null);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX INFO: renamed from: d */
        public List<C8928d> m221280d(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            C8928d c8928dM54702a;
            ProductCategory productCategory2 = productCategory;
            boolean zM221266q = zry.m221266q(list);
            boolean zM221265p = zry.m221265p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.asy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            String strM189822m = tab0.m189811h().m189822m(productCategory2);
            int i = 0;
            for (final String str : tab0.m189811h().m189831v(productCategory2)) {
                Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.bsy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return zry.C21877b.m221279c(str, (Merchandise) obj);
                    }
                });
                if (NullChecker.m82486a(merchandise2)) {
                    C8928d.a aVarM221248I = zry.m221248I(context, purchaseType, i, productCategory2, merchandise2, merchandise, zM221266q, zM221265p);
                    if (NullChecker.m82486a(aVarM221248I)) {
                        boolean z = true;
                        aVarM221248I.m54757c0(true);
                        boolean zM199788n = v5b0.m199788n(merchandise2);
                        if (merchandise2.autoRenewable()) {
                            if (!zM199788n) {
                                aVarM221248I.m54761e0(merchandise2.yearly() ? "连续包年" : merchandise2.quarterly() ? "连续包季" : "连续包月");
                            }
                            c8928dM54702a = C8928d.m54702a(null, aVarM221248I, true);
                            c8928dM54702a.m54720s(zM199788n);
                        } else {
                            c8928dM54702a = C8928d.m54702a(aVarM221248I, null, false);
                            c8928dM54702a.m54721t(zM199788n);
                        }
                        if (strM189822m.startsWith("-")) {
                            if (merchandise2.noneRenewable()) {
                                if (!TextUtils.equals(strM189822m, "-" + merchandise2.quantity)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        } else if (!merchandise2.autoRenewable() || !TextUtils.equals(strM189822m, String.valueOf(merchandise2.quantity))) {
                            z = false;
                        }
                        c8928dM54702a.m54723v(z);
                        arrayList.add(c8928dM54702a);
                        i++;
                    }
                }
                productCategory2 = productCategory;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.zry$c */
    public static class C21878c implements jzl {
        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM221266q = zry.m221266q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                Merchandise merchandise = list.get(i);
                C8928d c8928d = new C8928d();
                boolean z = true;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                ProductCategory productCategory2 = productCategory;
                C8928d.a aVarM221248I = zry.m221248I(context2, purchaseType2, i, productCategory2, merchandise, list.get(list.size() - 1), zM221266q, false);
                if (merchandise.autoRenewable()) {
                    c8928d.m54716o(aVarM221248I);
                } else {
                    c8928d.m54722u(aVarM221248I);
                }
                if (((int) Math.floor(list.size() / 2.0f)) != i) {
                    z = false;
                }
                c8928d.m54723v(z);
                c8928d.m54719r(z);
                c8928d.m54724w(z);
                c8928d.m54706e();
                arrayList.add(c8928d);
                i++;
                context = context2;
                purchaseType = purchaseType2;
                productCategory = productCategory2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.zry$d */
    public static class C21879d implements jzl {
        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m221287h(context, purchaseType, productCategory, list, null);
        }

        /* JADX INFO: renamed from: h */
        public List<C8928d> m221287h(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            boolean zM221266q = zry.m221266q(list);
            boolean zM221265p = zry.m221265p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.csy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            C8928d.a aVarM221248I = zry.m221248I(context, purchaseType, 0, productCategory, merchandise, merchandise, zM221266q, zM221265p);
            Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.dsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
                }
            });
            C8928d.a aVarM221248I2 = zry.m221248I(context, purchaseType, 0, productCategory, merchandise2, merchandise2, zM221266q, zM221265p);
            if (NullChecker.m82486a(aVarM221248I) && NullChecker.m82486a(aVarM221248I2)) {
                C8928d c8928dM54702a = C8928d.m54702a(aVarM221248I, aVarM221248I2, true);
                c8928dM54702a.m54720s(v5b0.m199788n(merchandise2));
                c8928dM54702a.m54721t(v5b0.m199788n(merchandise));
                c8928dM54702a.m54723v(false);
                arrayList.add(c8928dM54702a);
            }
            Merchandise merchandise3 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.esy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise4 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise4.quarterly() && merchandise4.noneRenewable());
                }
            });
            C8928d.a aVarM221248I3 = zry.m221248I(context, purchaseType, 1, productCategory, merchandise3, merchandise, zM221266q, zM221265p);
            Merchandise merchandise4 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.fsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise5 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise5.quarterly() && merchandise5.autoRenewable());
                }
            });
            C8928d.a aVarM221248I4 = zry.m221248I(context, purchaseType, 1, productCategory, merchandise4, merchandise2, zM221266q, zM221265p);
            if (NullChecker.m82486a(aVarM221248I3) && NullChecker.m82486a(aVarM221248I4)) {
                C8928d c8928dM54702a2 = C8928d.m54702a(aVarM221248I3, aVarM221248I4, true);
                c8928dM54702a2.m54720s(v5b0.m199788n(merchandise4));
                c8928dM54702a2.m54721t(v5b0.m199788n(merchandise3));
                c8928dM54702a2.m54723v(true);
                c8928dM54702a2.m54719r(true);
                arrayList.add(c8928dM54702a2);
            }
            Merchandise merchandise5 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.gsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise6 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise6.yearly() && merchandise6.noneRenewable());
                }
            });
            C8928d.a aVarM221248I5 = zry.m221248I(context, purchaseType, 2, productCategory, merchandise5, merchandise, zM221266q, zM221265p);
            Merchandise merchandise6 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.hsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise7 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise7.yearly() && merchandise7.autoRenewable());
                }
            });
            C8928d.a aVarM221248I6 = zry.m221248I(context, purchaseType, 2, productCategory, merchandise6, merchandise2, zM221266q, zM221265p);
            if (NullChecker.m82486a(aVarM221248I5) && NullChecker.m82486a(aVarM221248I6)) {
                C8928d c8928dM54702a3 = C8928d.m54702a(aVarM221248I5, aVarM221248I6, true);
                c8928dM54702a3.m54720s(v5b0.m199788n(merchandise6));
                c8928dM54702a3.m54721t(v5b0.m199788n(merchandise5));
                c8928dM54702a3.m54723v(false);
                c8928dM54702a3.m54719r(false);
                arrayList.add(c8928dM54702a3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.zry$e */
    public static class C21880e implements jzl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m221288b(String str, Merchandise merchandise) {
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

        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM221266q = zry.m221266q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (final String str : tab0.m189811h().m189831v(productCategory)) {
                qcj<Merchandise, Boolean> qcjVar = new qcj() { // from class: l.isy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return zry.C21880e.m221288b(str, (Merchandise) obj);
                    }
                };
                C21880e c21880e = this;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                List<Merchandise> list2 = list;
                C8928d c8928dM221290d = c21880e.m221290d(context2, purchaseType2, list2, zM221266q, i, qcjVar);
                if (NullChecker.m82486a(c8928dM221290d)) {
                    i++;
                    arrayList.add(c8928dM221290d);
                }
                this = c21880e;
                context = context2;
                purchaseType = purchaseType2;
                list = list2;
            }
            C21880e c21880e2 = this;
            String strM189822m = tab0.m189811h().m189822m(productCategory);
            for (C8928d c8928d : arrayList) {
                C8928d.a aVarM54705d = c8928d.m54705d();
                if (aVarM54705d == null) {
                    aVarM54705d = c8928d.m54703b();
                }
                if (TextUtils.equals(String.valueOf(NullChecker.m82487b(aVarM54705d) ? aVarM54705d.m54784s().quantity : 0), strM189822m)) {
                    c8928d.m54723v(true);
                    return arrayList;
                }
            }
            c21880e2.m221291e(arrayList);
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final C8928d m221290d(Context context, PurchaseType purchaseType, List<Merchandise> list, boolean z, int i, final qcj<Merchandise, Boolean> qcjVar) {
            C8928d c8928dM54702a;
            Objects.requireNonNull(qcjVar);
            final Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.jsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return (Boolean) qcjVar.call((Merchandise) obj);
                }
            });
            if (!NullChecker.m82487b(merchandise)) {
                return null;
            }
            final boolean zNoneRenewable = merchandise.noneRenewable();
            boolean zM221265p = zry.m221265p(list);
            Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.ksy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise.quantity == merchandise3.quantity && (!zNoneRenewable ? merchandise3.noneRenewable() : merchandise3.autoRenewable()));
                }
            });
            C8928d.a aVarM221248I = zry.m221248I(context, purchaseType, i, merchandise.category, merchandise, merchandise2, z, zM221265p);
            C8928d.a aVarM221248I2 = zry.m221248I(context, purchaseType, i, merchandise.category, merchandise2, merchandise, z, zM221265p);
            if (!NullChecker.m82486a(aVarM221248I) || !NullChecker.m82486a(aVarM221248I2)) {
                return null;
            }
            if (zNoneRenewable) {
                c8928dM54702a = C8928d.m54702a(aVarM221248I, aVarM221248I2, true);
                c8928dM54702a.m54720s(v5b0.m199788n(merchandise2));
                c8928dM54702a.m54721t(v5b0.m199788n(merchandise));
            } else {
                c8928dM54702a = C8928d.m54702a(aVarM221248I2, aVarM221248I, true);
                c8928dM54702a.m54720s(v5b0.m199788n(merchandise));
                c8928dM54702a.m54721t(v5b0.m199788n(merchandise2));
            }
            c8928dM54702a.m54723v(false);
            return c8928dM54702a;
        }

        /* JADX INFO: renamed from: e */
        public final void m221291e(List<C8928d> list) {
            for (C8928d c8928d : list) {
                if ((c8928d.m54703b() == null ? c8928d.m54705d() : c8928d.m54703b()).m54784s().quarterly()) {
                    c8928d.m54723v(true);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.zry$f */
    public static class C21881f implements jzl {
        @Override // p153l.jzl
        /* JADX INFO: renamed from: a */
        public List<C8928d> mo147671a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            int size;
            boolean zM221266q = zry.m221266q(list);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Merchandise merchandise : list) {
                if (!arrayList2.contains(Integer.valueOf(merchandise.quantity))) {
                    arrayList2.add(Integer.valueOf(merchandise.quantity));
                }
            }
            if (t7a.m189553i()) {
                Collections.sort(arrayList2, new Comparator() { // from class: l.lsy
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Integer) obj).compareTo((Integer) obj2);
                    }
                });
            } else {
                Collections.sort(arrayList2, new Comparator() { // from class: l.msy
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Integer) obj2).compareTo((Integer) obj);
                    }
                });
            }
            ArrayList arrayListM221242C = zry.m221242C(ProductCategory.tttVip);
            ArrayList arrayListM221242C2 = zry.m221242C(ProductCategory.tttSeeWhoLikedMe);
            ArrayList arrayListM221242C3 = zry.m221242C("svip");
            int i = 0;
            boolean z = false;
            while (i < arrayList2.size()) {
                final int iIntValue = ((Integer) arrayList2.get(i)).intValue();
                Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.nsy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Merchandise merchandise3 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise3.quantity == iIntValue && merchandise3.noneRenewable());
                    }
                });
                C8928d.a aVarM221248I = zry.m221248I(context, purchaseType, 1, productCategory, merchandise2, null, zM221266q, false);
                Merchandise merchandise3 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.osy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Merchandise merchandise4 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise4.quantity == iIntValue && merchandise4.autoRenewable());
                    }
                });
                C8928d.a aVarM221248I2 = zry.m221248I(context, purchaseType, (arrayList2.size() - 1) - i, productCategory, merchandise3, null, zM221266q, false);
                if (NullChecker.m82486a(aVarM221248I) || NullChecker.m82486a(aVarM221248I2)) {
                    C8928d c8928dM54702a = C8928d.m54702a(aVarM221248I, aVarM221248I2, true);
                    c8928dM54702a.m54720s(v5b0.m199788n(merchandise3));
                    c8928dM54702a.m54721t(v5b0.m199788n(merchandise2));
                    if ((!CoreModule.m30930K().me_().isVIP() && CoreModule.m30933P().m143405a().mo34492e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        c8928dM54702a.m54723v(i == (zry.m221269t(purchaseType, context) ? zry.m221249J(purchaseType, context) ? 0 : 2 : 1));
                        c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                    } else if ((arrayListM221242C.isEmpty() && arrayListM221242C2.isEmpty()) || (CoreModule.m30930K().me_().isSVIP() && arrayListM221242C3.isEmpty())) {
                        c8928dM54702a.m54723v(i == (zry.m221269t(purchaseType, context) ? zry.m221249J(purchaseType, context) ? 0 : 2 : 1));
                        c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                    }
                    if (wib0.m206578v(purchaseType) && arrayList2.size() < 3) {
                        c8928dM54702a.m54723v(i == 0);
                    }
                    if (t7a.m189553i()) {
                        c8928dM54702a.m54723v(i == 0);
                    }
                    if (c8928dM54702a.m54713l()) {
                        z = true;
                    }
                    c8928dM54702a.m54719r(c8928dM54702a.m54713l());
                    arrayList.add(c8928dM54702a);
                }
                i++;
            }
            if (!z && (size = arrayList.size() / 2) < arrayList.size()) {
                ((C8928d) arrayList.get(size)).m54723v(true);
                ((C8928d) arrayList.get(size)).m54719r(true);
            }
            if (CoreModule.m30933P().m143405a().mo34445Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                zry.m221241B(context, list);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m221240A(int i) {
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
    public static void m221241B(Context context, final List<Merchandise> list) {
        final long vipToExpireTimeInMill = CoreModule.f18264c.f20381e0.m116600p9().getVipToExpireTimeInMill();
        final long jMo34626ws = CoreModule.m30933P().m143405a().mo34626ws();
        ArrayList<String> arrayListM221242C = m221242C(ProductCategory.tttVip);
        ArrayList<String> arrayListM221242C2 = m221242C(ProductCategory.tttSeeWhoLikedMe);
        ArrayList<String> arrayListM221242C3 = m221242C("svip");
        ijj.m140191c().f115233c.put("");
        ijj.m140191c().f115234d.put("");
        if (!arrayListM221242C3.isEmpty() && CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            f205833e = -1.0d;
            CoreModule.m30933P().m143405a().mo34411Sm(context, arrayListM221242C3, true, 500L).subscribe(psd0.m173596G(new y20() { // from class: l.try
                @Override // p153l.y20
                public final void call(Object obj) {
                    zry.m221250a((Optional) obj);
                }
            }));
        } else if (!arrayListM221242C2.isEmpty() && !CoreModule.m30933P().m143405a().mo34492e2()) {
            f205833e = -1.0d;
            CoreModule.m30933P().m143405a().mo34411Sm(context, arrayListM221242C2, true, 500L).subscribe(psd0.m173596G(new y20() { // from class: l.ury
                @Override // p153l.y20
                public final void call(Object obj) {
                    zry.m221252c(list, jMo34626ws, (Optional) obj);
                }
            }));
        } else {
            if (arrayListM221242C.isEmpty() || !CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                return;
            }
            f205832d = -1.0d;
            CoreModule.m30933P().m143405a().mo34411Sm(context, arrayListM221242C, true, 500L).subscribe(psd0.m173596G(new y20() { // from class: l.vry
                @Override // p153l.y20
                public final void call(Object obj) {
                    zry.m221253d(list, vipToExpireTimeInMill, (Optional) obj);
                }
            }));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static ArrayList<String> m221242C(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        List<GPContract> listM222761e = Collections.EMPTY_LIST;
        str.getClass();
        switch (str) {
            case "tttVip":
                listM222761e = CoreModule.f18264c.f20396j0.f20022S.m222761e();
                break;
            case "svip":
                listM222761e = CoreModule.f18264c.f20396j0.f20023T.m222761e();
                break;
            case "tttSeeWhoLikedMe":
                listM222761e = CoreModule.f18264c.f20396j0.f20024U.m222761e();
                break;
        }
        if (listM222761e != null && !listM222761e.isEmpty()) {
            arrayList.add(listM222761e.get(0).iapProductID);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m221243D(Context context, PurchaseType purchaseType, Merchandise merchandise) {
        if (merchandise == null) {
            return false;
        }
        if (m221247H(merchandise) || CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
            return true;
        }
        if (m221269t(purchaseType, context)) {
            if (merchandise.quantity == (m221249J(purchaseType, context) ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m221244E(PurchaseType purchaseType, Merchandise merchandise) {
        return merchandise.autoRenewable() && wib0.m206569m(purchaseType) && v5b0.m199795u(merchandise) && CoreModule.m30933P().m143405a().mo34532k();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m221245F() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 != null) {
            return tzi0.m193670h(pzi0.m174454o(), (long) userM116600p9.createdTime, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m221246G(String str) {
        return CoreModule.f18264c.f20396j0.m31611T4() && CoreModule.f18264c.f20438x0.m31186P3() && !TextUtils.isEmpty(CoreModule.f18264c.f20396j0.m31579C4().skuId) && TextUtils.equals(ProductCategory.tttSvipGoogleplay, str) && !m221245F();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m221247H(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (CoreModule.f18264c.f20396j0.m31611T4() && CoreModule.f18264c.f20438x0.m31186P3() && merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && stockKeepUnit.affiliateProducts != null && CoreModule.f18264c.f20396j0.m31579C4() != null) {
            String str = merchandise.defaultStockKeepUnit.affiliateProducts.googleplay;
            String str2 = CoreModule.f18264c.f20396j0.m31579C4().skuId;
            if (NullChecker.m82486a(str) && NullChecker.m82486a(str2) && str2.equals(str)) {
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
    public static C8928d.a m221248I(Context context, PurchaseType purchaseType, int i, ProductCategory productCategory, Merchandise merchandise, Merchandise merchandise2, boolean z, boolean z2) {
        boolean zM199788n;
        double firstCouponPrice;
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        int iM221267r;
        String string4;
        String str3;
        String strM221264o;
        String str4;
        String string5;
        String string6;
        String string7;
        String str5;
        String string8;
        String string9;
        String strM221263n;
        int i2;
        Context context2;
        boolean zM221249J;
        int i3;
        int i4;
        Context context3;
        String string10;
        if (merchandise == null) {
            return null;
        }
        f205830b.setMaximumFractionDigits(2);
        double d = merchandise.defaultStockKeepUnit.prices.price;
        String str6 = f205830b.format(d);
        double d2 = merchandise.defaultStockKeepUnit.prices.unitPrice;
        String str7 = f205830b.format(d2);
        f205830b.format(merchandise.defaultStockKeepUnit.prices.originalPrice);
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
                zM199788n = v5b0.m199788n(merchandise);
                firstCouponPrice = merchandise.getFirstCouponPrice();
                break;
            default:
                firstCouponPrice = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                zM199788n = false;
                break;
        }
        double d4 = firstCouponPrice;
        double d5 = d;
        String str10 = f205830b.format(d4);
        boolean z3 = zM199788n;
        Resources resources = context.getResources();
        double d6 = d4;
        int i5 = merchandise.quantity;
        boolean zM221244E = m221244E(purchaseType, merchandise);
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
        String strM148007c = "";
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 13:
                d5 = d5;
                String string13 = resources.getString(l9n.m153440e());
                f205831c.setMaximumFractionDigits(2);
                f205831c.setMinimumFractionDigits(2);
                string = null;
                str = null;
                str9 = null;
                string2 = String.format("%1$s %2$s", str8, f205831c.format(d5));
                string3 = string13;
                iM221267r = 0;
                str2 = str9;
                double d7 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d7 - d5) / d7));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context4 = context3;
                    strM148007c = string10;
                    context2 = context4;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 2:
            case 21:
            case 22:
            case 24:
                String string14 = resources.getString(i5 == 1 ? R$string.f28459t9 : R$string.f28470u9);
                StringBuilder sb = new StringBuilder();
                sb.append(str8);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                d5 = d5;
                sb.append(f205830b.format(d5));
                str9 = null;
                string3 = string14;
                string = sb.toString();
                string2 = "";
                str = string2;
                iM221267r = 0;
                str2 = str9;
                double d8 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d8 - d5) / d8));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context5 = context3;
                    strM148007c = string10;
                    context2 = context5;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 4:
                String str11 = String.format("%1$s %2$s", str8, str6);
                str2 = null;
                str9 = null;
                string3 = "条";
                str = String.format("%.1f", Double.valueOf(d2));
                string2 = "";
                d5 = d5;
                iM221267r = 0;
                string = str11;
                double d9 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d9 - d5) / d9));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context6 = context3;
                    strM148007c = string10;
                    context2 = context6;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 6:
            case 17:
            case 19:
                if (TEnum.equals(productCategory, ProductCategory.tttVip) || TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay)) {
                    if (merchandise.weekly()) {
                        string4 = resources.getString(i5 == 1 ? R$string.f28072M1 : R$string.f28083N1);
                        string2 = resources.getString(R$string.f27945A6, str8, str7);
                    } else {
                        string4 = resources.getString(i5 == 1 ? R$string.f28459t9 : R$string.f28470u9);
                        string2 = resources.getString(R$string.f28481v9, str8, str7);
                    }
                    str3 = String.format("%1$s%2$s", str8, str6);
                    if (!merchandise.autoRenewable() || !TEnum.equals(productCategory, "quickchatMembership")) {
                        string3 = string4;
                        string = str3;
                        str = "";
                        d5 = d5;
                        iM221267r = 0;
                        str2 = str9;
                        double d10 = ((double) i5) * d3;
                        i2 = (int) (100.0d * ((d10 - d5) / d10));
                        if (i2 != 0) {
                            if (IntlCountryCodeController.m29124u()) {
                                context3 = context;
                                string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                            } else {
                                context3 = context;
                                string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                            }
                            Context context7 = context3;
                            strM148007c = string10;
                            context2 = context7;
                        } else {
                            context2 = context;
                        }
                        if (m221247H(merchandise)) {
                            strM148007c = k3d0.m148007c(R$string.f28272e);
                        } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                            if (CoreModule.f18264c.f20438x0.m31193c4()) {
                                strM148007c = k3d0.m148007c(R$string.f28107P3);
                            } else {
                                strM148007c = k3d0.m148007c(R$string.f28272e);
                            }
                        } else if (m221269t(purchaseType, context2)) {
                            zM221249J = m221249J(purchaseType, context2);
                            if (zM221249J) {
                                i3 = 12;
                            } else {
                                i3 = 1;
                            }
                            if (i5 == i3) {
                                if (zM221249J) {
                                    i4 = R$string.f28118Q3;
                                } else {
                                    i4 = R$string.f28107P3;
                                }
                                strM148007c = k3d0.m148007c(i4);
                            }
                        }
                        return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
                    }
                    int i6 = R$string.f28294f9;
                    if (!z3) {
                        d6 = d2;
                    }
                    String string15 = resources.getString(i6, str8, a9g0.m96570e(d6 / ((double) f205829a)));
                    strM221264o = m221264o(merchandise, zM221244E);
                    string3 = string4;
                    str = string15;
                    iM221267r = 0;
                    string = str3;
                } else {
                    if (merchandise.noneRenewable()) {
                        str4 = String.format("%1$s %2$s", str8, str6);
                        iM221267r = 0;
                        strM221264o = null;
                    } else {
                        int i7 = R$string.f28235aa;
                        if (z3) {
                            str6 = str10;
                        }
                        String string16 = resources.getString(i7, str8, str6);
                        iM221267r = m221267r(merchandise, merchandise2, i5);
                        str4 = string16;
                        strM221264o = m221274y(merchandise);
                    }
                    String string17 = resources.getString(i5 == 1 ? R$string.f28459t9 : R$string.f28470u9);
                    string = resources.getString(R$string.f28481v9, str8, str7);
                    string2 = str4;
                    string3 = string17;
                    str = "";
                }
                str2 = strM221264o;
                double d11 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d11 - d5) / d11));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context8 = context3;
                    strM148007c = string10;
                    context2 = context8;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 7:
                string5 = resources.getString(R$string.f28065L5);
                string6 = str8 + a9g0.m96570e(d5);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM221267r = 0;
                double d12 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d12 - d5) / d12));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context9 = context3;
                    strM148007c = string10;
                    context2 = context9;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 8:
            case 10:
            case 12:
            case 14:
            case 23:
                string3 = merchandise.weekly() ? resources.getString(i5 == 1 ? R$string.f28072M1 : R$string.f28083N1) : resources.getString(i5 == 1 ? R$string.f28459t9 : R$string.f28470u9);
                if (!z || z2) {
                    if (zM221244E) {
                        string7 = tab0.m189811h().m189829t(merchandise, merchandise.quantity);
                        str5 = String.format("%1$s /%2$s", str8 + str10, str8 + str6);
                    } else if (merchandise.weekly()) {
                        string7 = resources.getString(R$string.f27945A6, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    } else {
                        string7 = resources.getString(R$string.f28481v9, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    }
                    if (!merchandise.autoRenewable() || z2) {
                        string8 = "";
                    } else {
                        int i8 = R$string.f28294f9;
                        if (!z3) {
                            d6 = d2;
                        }
                        string8 = resources.getString(i8, str8, a9g0.m96570e(d6 / ((double) f205829a)));
                        m221271v(m221267r(merchandise, merchandise2, i5));
                    }
                    int iM221267r2 = m221267r(merchandise, merchandise2, i5);
                    String strM221263n2 = m221263n(merchandise, z3 || zM221244E);
                    string2 = string7;
                    iM221267r = iM221267r2;
                    str = string8;
                    string = str5;
                    str9 = strM221263n2;
                } else {
                    if (merchandise.noneRenewable()) {
                        string9 = String.format("%1$s %2$s", str8, str6);
                        strM221263n = null;
                        iM221267r = 0;
                    } else {
                        int i9 = R$string.f28235aa;
                        if (z3) {
                            str6 = str10;
                        }
                        string9 = resources.getString(i9, str8, str6);
                        int iM221267r3 = m221267r(merchandise, merchandise2, i5);
                        strM221263n = m221263n(merchandise, z3 || zM221244E);
                        iM221267r = iM221267r3;
                    }
                    string2 = string9;
                    string = resources.getString(R$string.f28481v9, str8, str7);
                    str9 = strM221263n;
                    str = "";
                }
                d5 = d5;
                str2 = null;
                double d13 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d13 - d5) / d13));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context10 = context3;
                    strM148007c = string10;
                    context2 = context10;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 9:
            case 15:
                string5 = resources.getString(i5 == 1 ? R$string.f28356l : R$string.f28368m);
                string6 = resources.getString(R$string.f28344k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM221267r = 0;
                double d14 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d14 - d5) / d14));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context11 = context3;
                    strM148007c = string10;
                    context2 = context11;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 11:
            case 16:
                String string18 = resources.getString(i5 == 1 ? R$string.f28001F7 : R$string.f28012G7);
                String string19 = resources.getString(R$string.f28023H7, str8, str7);
                str9 = null;
                string3 = string18;
                string = string19;
                string2 = "";
                str = string2;
                d5 = d5;
                iM221267r = 0;
                str2 = str9;
                double d15 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d15 - d5) / d15));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context12 = context3;
                    strM148007c = string10;
                    context2 = context12;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 18:
                String string20 = resources.getString(i5 == 1 ? R$string.f28459t9 : R$string.f28470u9);
                String string21 = resources.getString(R$string.f28481v9, str8, str7);
                str3 = String.format("%1$s%2$s", str8, str6);
                string3 = string20;
                string2 = string21;
                string = str3;
                str = "";
                d5 = d5;
                iM221267r = 0;
                str2 = str9;
                double d16 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d16 - d5) / d16));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context13 = context3;
                    strM148007c = string10;
                    context2 = context13;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            case 20:
                string5 = resources.getString(R$string.f28228a3);
                string6 = resources.getString(R$string.f28344k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM221267r = 0;
                double d17 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d17 - d5) / d17));
                if (i2 != 0) {
                    if (IntlCountryCodeController.m29124u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f28270d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f28258c9, String.valueOf(i2));
                    }
                    Context context14 = context3;
                    strM148007c = string10;
                    context2 = context14;
                } else {
                    context2 = context;
                }
                if (m221247H(merchandise)) {
                    strM148007c = k3d0.m148007c(R$string.f28272e);
                } else if (CoreModule.f18264c.f20438x0.m31202m4(merchandise)) {
                    if (CoreModule.f18264c.f20438x0.m31193c4()) {
                        strM148007c = k3d0.m148007c(R$string.f28107P3);
                    } else {
                        strM148007c = k3d0.m148007c(R$string.f28272e);
                    }
                } else if (m221269t(purchaseType, context2)) {
                    zM221249J = m221249J(purchaseType, context2);
                    if (zM221249J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM221249J) {
                            i4 = R$string.f28118Q3;
                        } else {
                            i4 = R$string.f28107P3;
                        }
                        strM148007c = k3d0.m148007c(i4);
                    }
                }
                return C8928d.b.m54792b().m54804m(merchandise).m54807p(i5).m54808q(string3).m54809r(string2).m54796e(string).m54795d(str).m54802k(str2).m54800i(str9).m54803l(strM148007c).m54806o(productCategory).m54798g(null).m54801j(iM221267r).m54805n(d5).m54797f(str8).m54799h(String.valueOf(d3)).m54793a();
            default:
                pnl.m173070a("You should add ", productCategory.name(), " in parseMerchandise method.");
                return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m221249J(PurchaseType purchaseType, Context context) {
        return CoreModule.m30933P().m143405a().mo34563pf(context) && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f18264c.f20396j0.m31648z4();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m221250a(Optional optional) {
        if (optional.isPresent()) {
            GPContract gPContract = CoreModule.f18264c.f20396j0.f20023T.m222761e().get(0);
            if (m221272w(gPContract.chargeInterval) <= 0) {
                m221268s(1);
                return;
            }
            ijj.m140191c().f115231a.m137019l(Double.valueOf(f205833e));
            ijj.m140191c().f115232b.m137019l(Integer.valueOf(m221270u(gPContract.chargeInterval)));
            ijj.m140191c().f115233c.put(gPContract.iapProductID + ijj.f115229e + PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m221252c(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = CoreModule.f18264c.f20396j0.f20024U.m222761e().get(0);
                int iM221272w = m221272w(gPContract.chargeInterval);
                if (iM221272w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m221240A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM221272w)) * d;
                    f205833e = d2;
                    double d3 = f205832d;
                    if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 > d3) {
                        if (d2 > d) {
                            f205833e = d;
                        }
                        ijj.m140191c().f115231a.m137019l(Double.valueOf(f205833e));
                        ijj.m140191c().f115232b.m137019l(Integer.valueOf(m221270u(gPContract.chargeInterval)));
                        ijj.m140191c().f115233c.put(gPContract.iapProductID + ijj.f115229e + PurchaseType.TYPE_GET_LIKERS);
                        ijj.m140191c().f115234d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m221268s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m221253d(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = CoreModule.f18264c.f20396j0.f20022S.m222761e().get(0);
                int iM221272w = m221272w(gPContract.chargeInterval);
                if (iM221272w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m221240A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM221272w)) * d;
                    f205832d = d2;
                    double d3 = f205833e;
                    if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 > d3) {
                        if (d2 > d) {
                            f205832d = d;
                        }
                        ijj.m140191c().f115231a.m137019l(Double.valueOf(f205832d));
                        ijj.m140191c().f115232b.m137019l(Integer.valueOf(m221270u(gPContract.chargeInterval)));
                        ijj.m140191c().f115233c.put(gPContract.iapProductID + ijj.f115229e + PurchaseType.TYPE_GET_VIP);
                        ijj.m140191c().f115234d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m221268s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m221263n(Merchandise merchandise, boolean z) {
        if (z) {
            return String.valueOf(Math.round(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice - merchandise.getFirstCouponPrice()));
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return String.valueOf(Math.round(prices.noneRenewalPrice - prices.price));
    }

    /* JADX INFO: renamed from: o */
    public static String m221264o(Merchandise merchandise, boolean z) {
        if (z) {
            return q8g0.m175774F((merchandise.getFirstCouponPrice() / merchandise.defaultStockKeepUnit.prices.noneRenewalPrice) * 10.0d, 1);
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return q8g0.m175776H((prices.price / prices.noneRenewalPrice) * 10.0d);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m221265p(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
            if ((CoreModule.m30933P().m143405a().mo34532k() && v5b0.m199790p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks)) || v5b0.m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m221266q(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (v5b0.m199788n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static int m221267r(Merchandise merchandise, Merchandise merchandise2, int i) {
        double d;
        if (merchandise == null) {
            return 0;
        }
        double firstCouponPrice = v5b0.m199788n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        ArrayList arrayListM147522n = jyb.m147522n(CoreModule.f18264c.f20396j0.m31582D5(merchandise.category), new qcj() { // from class: l.wry
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.noneRenewable() && merchandise3.monthly());
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            d = NullChecker.m82486a(merchandise2) ? merchandise2.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            d = ((Merchandise) arrayListM147522n.get(0)).defaultStockKeepUnit.prices.unitPrice;
        }
        double d2 = d * ((double) i);
        return (int) (((d2 - firstCouponPrice) / d2) * 100.0d);
    }

    /* JADX INFO: renamed from: s */
    public static void m221268s(int i) {
        ijj.m140191c().f115232b.m137019l(Integer.valueOf(m221270u(i)));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m221269t(PurchaseType purchaseType, Context context) {
        if (CoreModule.m30933P().m143405a().mo34563pf(context)) {
            if (purchaseType == PurchaseType.TYPE_GET_VIP && CoreModule.f18264c.f20396j0.m31577B4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_LIKERS && CoreModule.f18264c.f20396j0.m31575A4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f18264c.f20396j0.m31646y4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static int m221270u(int i) {
        if (t7a.m189553i()) {
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
    public static String m221271v(int i) {
        return String.format(Locale.getDefault(), CoreModule.f18263b.getString(R$string.f28016H0), i + "%");
    }

    /* JADX INFO: renamed from: w */
    public static int m221272w(int i) {
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
    public static jzl m221273x() {
        return IntlCountryCodeController.m29114k() ? new C21881f() : new C21876a();
    }

    /* JADX INFO: renamed from: y */
    public static String m221274y(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return q8g0.m175774F((prices.price / prices.noneRenewalPrice) * 10.0d, 1);
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
    
        if (r0.equals(com.p051p1.mobile.putong.core.data.ProductCategory.tttSvipGoogleplay) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r0.equals("svipPicksMembership") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (p153l.tab0.m189811h().m189835z() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        return new p153l.zry.C21877b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        return new p153l.zry.C21879d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r0.equals(com.p051p1.mobile.putong.core.data.ProductCategory.tttVip) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        return m221273x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.equals("picksMembership") != false) goto L42;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jzl m221275z(ProductCategory productCategory) {
        String str;
        String string = productCategory.toString();
        switch (string.hashCode()) {
            case -2116756882:
                str = "quickchatNumber";
                string.equals(str);
                return new C21878c();
            case -1428291852:
                if (string.equals("intlReadMessage")) {
                    if (!tab0.m189811h().m189835z() && TEnum.equals(productCategory, "svip")) {
                        return new C21877b();
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5() && TEnum.equals(productCategory, "svip")) {
                        return new C21879d();
                    }
                }
                return new C21878c();
            case -1403004683:
                if (string.equals(ProductCategory.noneLiveCoin)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -1338150991:
                if (string.equals(ProductCategory.tttLiveCoin)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -1204773696:
                if (string.equals(ProductCategory.tttDiamond)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -1106172890:
                str = "letter";
                string.equals(str);
                return new C21878c();
            case -993539419:
                if (string.equals(ProductCategory.tttCoin)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -863315575:
                break;
            case -735868401:
                if (string.equals(ProductCategory.tttBoost)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -435036897:
                if (string.equals(ProductCategory.tttUltraPremium)) {
                    return m221273x();
                }
                return new C21878c();
            case -333095502:
                if (string.equals("superLike")) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case -94011970:
                break;
            case 3059345:
                if (string.equals("coin")) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case 3542730:
                if (string.equals("svip")) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case 93922211:
                if (string.equals("boost")) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case 106660978:
                str = "picks";
                string.equals(str);
                return new C21878c();
            case 150908446:
                if (string.equals(ProductCategory.tttSuperLike)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case 219393643:
                break;
            case 449746854:
                if (string.equals(ProductCategory.tttSeeWhoLikedMe)) {
                    return m221273x();
                }
                return new C21878c();
            case 1166765179:
                if (string.equals("quickchatMembership")) {
                    return tab0.m189811h().m189814d(productCategory) ? new C21880e() : new C21879d();
                }
                return new C21878c();
            case 1581498686:
                if (string.equals(ProductCategory.tttCompliment)) {
                    if (!tab0.m189811h().m189835z()) {
                    }
                    if (tab0.m189811h().m189814d(productCategory)) {
                        return new C21880e();
                    }
                    if (TEnum.equals(productCategory, "svip")) {
                        return m221273x();
                    }
                    if (CoreModule.m30933P().m143405a().mo34510h5()) {
                        return new C21879d();
                    }
                    break;
                }
                return new C21878c();
            case 1905099240:
                break;
            default:
                return new C21878c();
        }
    }
}
