package p009l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.GPContract;
import com.p1.mobile.putong.data.GPSkuDetails;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l.all;
import l.e30;
import l.h6a;
import l.hvc0;
import l.l7n;
import l.mkd0;
import l.n5c;
import l.p2b0;
import l.qqi0;
import l.sab0;
import l.t0g0;
import l.vwb;
import l.w9j;
import l.xma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Deprecated
public final class cjy {

    /* JADX INFO: renamed from: a */
    public static int f10644a = 30;

    /* JADX INFO: renamed from: b */
    public static NumberFormat f10645b = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: c */
    public static NumberFormat f10646c = NumberFormat.getNumberInstance();

    /* JADX INFO: renamed from: d */
    public static double f10647d = 0.0d;

    /* JADX INFO: renamed from: e */
    public static double f10648e = 0.0d;

    /* JADX INFO: renamed from: l.cjy$a */
    public static class C0816a implements rwl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m12679b(int i, boolean z, boolean z2, Merchandise merchandise) {
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
        public static /* synthetic */ Boolean m12680c(Merchandise merchandise) {
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
        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            Merchandise merchandiseS;
            Merchandise merchandiseS2;
            int i;
            final int i2;
            final boolean z;
            final boolean z2;
            List list2;
            d.a aVarM12651I;
            d dVarA;
            boolean z3;
            boolean z4;
            int i3;
            ?? r7;
            boolean z5;
            String strSubstring;
            ProductCategory productCategory2 = productCategory;
            ArrayList<d> arrayList = new ArrayList();
            boolean zM12669q = cjy.m12669q(list);
            List listV = p2b0.h().v(productCategory2);
            String strM = p2b0.h().m(productCategory2);
            ArrayList arrayListM12645C = cjy.m12645C("tttVip");
            ArrayList arrayListM12645C2 = cjy.m12645C("tttSeeWhoLikedMe");
            ArrayList arrayListM12645C3 = cjy.m12645C("svip");
            int i4 = 0;
            boolean z6 = false;
            while (i4 < listV.size()) {
                String str = (String) listV.get(i4);
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
                Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.ajy
                    public final Object call(Object obj) {
                        return cjy.C0816a.m12679b(i2, z, z2, (Merchandise) obj);
                    }
                });
                boolean z7 = TEnum.equals(productCategory2, "tttUltraPremium") || sab0.v(purchaseType);
                if (z2 && z7) {
                    boolean zC3 = xma.C3();
                    if (NullChecker.a(merchandise) && zC3) {
                        list2 = listV;
                    } else if (NullChecker.a(merchandise)) {
                        list2 = listV;
                        aVarM12651I = cjy.m12651I(context, purchaseType, i4, productCategory2, merchandise, null, zM12669q, false);
                        if (NullChecker.a(aVarM12651I)) {
                            dVarA = d.a(aVarM12651I, (d.a) null, false);
                            dVarA.t(rxa0.m21877n(merchandise));
                            if (TextUtils.isEmpty(strM)) {
                                z3 = true;
                            } else {
                                if (strM.startsWith("-")) {
                                    z3 = true;
                                    strSubstring = strM.substring(1);
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
                                    if (strM.endsWith("w")) {
                                        int i7 = Integer.parseInt(strM.substring(0, strM.length() - 1));
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    } else {
                                        int i8 = Integer.parseInt(strM);
                                        if (!merchandise.autoRenewable()) {
                                        }
                                    }
                                }
                                dVarA.v(z4);
                                dVarA.r(dVarA.l());
                                if (z4) {
                                    z6 = z3;
                                }
                                if (CoreModule.K().me_().isVIP()) {
                                    i3 = merchandise.quantity;
                                    if (cjy.m12652J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    dVarA.v(z5);
                                    dVarA.r(dVarA.l());
                                } else {
                                    i3 = merchandise.quantity;
                                    if (cjy.m12652J(purchaseType, context)) {
                                        r7 = 12;
                                    } else {
                                        r7 = z3;
                                    }
                                    if (i3 == r7) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                    dVarA.v(z5);
                                    dVarA.r(dVarA.l());
                                }
                                arrayList.add(dVarA);
                            }
                            z4 = false;
                            dVarA.v(z4);
                            dVarA.r(dVarA.l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (CoreModule.K().me_().isVIP()) {
                                i3 = merchandise.quantity;
                                if (cjy.m12652J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                dVarA.v(z5);
                                dVarA.r(dVarA.l());
                            } else {
                                i3 = merchandise.quantity;
                                if (cjy.m12652J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                dVarA.v(z5);
                                dVarA.r(dVarA.l());
                            }
                            arrayList.add(dVarA);
                        }
                    } else {
                        list2 = listV;
                    }
                } else if (NullChecker.a(merchandise)) {
                    list2 = listV;
                    aVarM12651I = cjy.m12651I(context, purchaseType, i4, productCategory2, merchandise, null, zM12669q, false);
                    if (NullChecker.a(aVarM12651I)) {
                        dVarA = d.a(aVarM12651I, (d.a) null, false);
                        dVarA.t(rxa0.m21877n(merchandise));
                        if (TextUtils.isEmpty(strM)) {
                            if (strM.startsWith("-")) {
                                z3 = true;
                                strSubstring = strM.substring(1);
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
                                if (strM.endsWith("w")) {
                                    int i11 = Integer.parseInt(strM.substring(0, strM.length() - 1));
                                    if (!merchandise.autoRenewable() && merchandise.weekly() && merchandise.quantity == i11) {
                                        z4 = z3;
                                    }
                                } else {
                                    int i12 = Integer.parseInt(strM);
                                    if (!merchandise.autoRenewable() && merchandise.monthType() && merchandise.quantity == i12) {
                                        z4 = z3;
                                    }
                                }
                            }
                            dVarA.v(z4);
                            dVarA.r(dVarA.l());
                            if (z4) {
                                z6 = z3;
                            }
                            if (((CoreModule.K().me_().isVIP() && CoreModule.P().a().e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ((arrayListM12645C.isEmpty() && arrayListM12645C2.isEmpty()) || (CoreModule.K().me_().isSVIP() && arrayListM12645C3.isEmpty()))) && cjy.m12672t(purchaseType, context)) {
                                i3 = merchandise.quantity;
                                if (cjy.m12652J(purchaseType, context)) {
                                    r7 = 12;
                                } else {
                                    r7 = z3;
                                }
                                if (i3 == r7) {
                                    z5 = z3;
                                } else {
                                    z5 = false;
                                }
                                dVarA.v(z5);
                                dVarA.r(dVarA.l());
                            }
                            arrayList.add(dVarA);
                        } else {
                            z3 = true;
                        }
                        z4 = false;
                        dVarA.v(z4);
                        dVarA.r(dVarA.l());
                        if (z4) {
                            z6 = z3;
                        }
                        if (CoreModule.K().me_().isVIP()) {
                            i3 = merchandise.quantity;
                            if (cjy.m12652J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            dVarA.v(z5);
                            dVarA.r(dVarA.l());
                        } else {
                            i3 = merchandise.quantity;
                            if (cjy.m12652J(purchaseType, context)) {
                                r7 = 12;
                            } else {
                                r7 = z3;
                            }
                            if (i3 == r7) {
                                z5 = z3;
                            } else {
                                z5 = false;
                            }
                            dVarA.v(z5);
                            dVarA.r(dVarA.l());
                        }
                        arrayList.add(dVarA);
                    }
                } else {
                    list2 = listV;
                }
                i4++;
                productCategory2 = productCategory;
                listV = list2;
            }
            d.a aVar = null;
            if (!z6 && !arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    ((d) arrayList.get(1)).v(true);
                    ((d) arrayList.get(1)).r(true);
                } else {
                    ((d) arrayList.get(0)).v(true);
                    ((d) arrayList.get(0)).r(true);
                }
            }
            if (CoreModule.c.j0.T4()) {
                for (d dVar : arrayList) {
                    if (cjy.m12650H(dVar.c())) {
                        dVar.r(cjy.m12650H(dVar.c()));
                    }
                }
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.c.x0.P3()) {
                for (d dVar2 : arrayList) {
                    if (CoreModule.c.x0.m4(dVar2.c())) {
                        dVar2.r(true);
                        dVar2.v(true);
                    } else {
                        dVar2.v(false);
                    }
                }
            }
            if (CoreModule.P().a().Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                cjy.m12644B(context, list);
            }
            int i13 = -1;
            for (d dVar3 : arrayList) {
                d.a aVarD = dVar3.d() != null ? dVar3.d() : dVar3.b();
                if (aVarD != null && (merchandiseS2 = aVarD.s()) != null && !merchandiseS2.weekly() && (i = merchandiseS2.quantity) > i13) {
                    aVar = aVarD;
                    i13 = i;
                }
            }
            if (aVar != null) {
                aVar.L(true);
            }
            Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.bjy
                public final Object call(Object obj) {
                    return cjy.C0816a.m12680c((Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                double d = merchandise2.defaultStockKeepUnit.prices.price;
                if (d > 0.0d) {
                    cjy.f10645b.setMaximumFractionDigits(2);
                    for (d dVar4 : arrayList) {
                        d.a aVarD2 = dVar4.d() != null ? dVar4.d() : dVar4.b();
                        if (aVarD2 != null && (merchandiseS = aVarD2.s()) != null && !merchandiseS.weekly()) {
                            double d2 = (merchandiseS.defaultStockKeepUnit.prices.price * 12.0d) / (((double) merchandiseS.quantity) * 52.0d);
                            double d3 = d2 / d;
                            int iCeil = (int) Math.ceil((1.0d - d3) * 100.0d);
                            if (!cjy.m12646D(context, purchaseType, merchandiseS)) {
                                if (iCeil > 0) {
                                    aVarD2.e0(IntlCountryCodeController.u() ? context.getString(R$string.f6200d9, String.valueOf((int) Math.floor(d3 * 100.0d))) : context.getString(R$string.f6188c9, String.valueOf(iCeil)));
                                } else {
                                    aVarD2.e0("");
                                }
                            }
                            aVarD2.l0(context.getString(R$string.f5875A6, merchandiseS.defaultStockKeepUnit.prices.currencySymbol, String.format(Locale.US, "%.2f", Double.valueOf(d2))));
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$b */
    public static class C0817b implements rwl {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Boolean m12683c(String str, Merchandise merchandise) {
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

        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m12684d(context, purchaseType, productCategory, list, null);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX INFO: renamed from: d */
        public List<d> m12684d(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            d dVarA;
            ProductCategory productCategory2 = productCategory;
            boolean zM12669q = cjy.m12669q(list);
            boolean zM12668p = cjy.m12668p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.djy
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            String strM = p2b0.h().m(productCategory2);
            int i = 0;
            for (final String str : p2b0.h().v(productCategory2)) {
                Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.ejy
                    public final Object call(Object obj) {
                        return cjy.C0817b.m12683c(str, (Merchandise) obj);
                    }
                });
                if (NullChecker.a(merchandise2)) {
                    d.a aVarM12651I = cjy.m12651I(context, purchaseType, i, productCategory2, merchandise2, merchandise, zM12669q, zM12668p);
                    if (NullChecker.a(aVarM12651I)) {
                        boolean z = true;
                        aVarM12651I.c0(true);
                        boolean zM21877n = rxa0.m21877n(merchandise2);
                        if (merchandise2.autoRenewable()) {
                            if (!zM21877n) {
                                aVarM12651I.e0(merchandise2.yearly() ? "连续包年" : merchandise2.quarterly() ? "连续包季" : "连续包月");
                            }
                            dVarA = d.a((d.a) null, aVarM12651I, true);
                            dVarA.s(zM21877n);
                        } else {
                            dVarA = d.a(aVarM12651I, (d.a) null, false);
                            dVarA.t(zM21877n);
                        }
                        if (strM.startsWith("-")) {
                            if (merchandise2.noneRenewable()) {
                                if (!TextUtils.equals(strM, "-" + merchandise2.quantity)) {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        } else if (!merchandise2.autoRenewable() || !TextUtils.equals(strM, String.valueOf(merchandise2.quantity))) {
                            z = false;
                        }
                        dVarA.v(z);
                        arrayList.add(dVarA);
                        i++;
                    }
                }
                productCategory2 = productCategory;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$c */
    public static class C0818c implements rwl {
        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM12669q = cjy.m12669q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                Merchandise merchandise = list.get(i);
                d dVar = new d();
                boolean z = true;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                ProductCategory productCategory2 = productCategory;
                d.a aVarM12651I = cjy.m12651I(context2, purchaseType2, i, productCategory2, merchandise, list.get(list.size() - 1), zM12669q, false);
                if (merchandise.autoRenewable()) {
                    dVar.o(aVarM12651I);
                } else {
                    dVar.u(aVarM12651I);
                }
                if (((int) Math.floor(list.size() / 2.0f)) != i) {
                    z = false;
                }
                dVar.v(z);
                dVar.r(z);
                dVar.w(z);
                dVar.e();
                arrayList.add(dVar);
                i++;
                context = context2;
                purchaseType = purchaseType2;
                productCategory = productCategory2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$d */
    public static class C0819d implements rwl {
        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            return m12691h(context, purchaseType, productCategory, list, null);
        }

        /* JADX INFO: renamed from: h */
        public List<d> m12691h(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list, List<Coupon> list2) {
            boolean zM12669q = cjy.m12669q(list);
            boolean zM12668p = cjy.m12668p(list);
            ArrayList arrayList = new ArrayList();
            Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.fjy
                public final Object call(Object obj) {
                    Merchandise merchandise2 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
                }
            });
            d.a aVarM12651I = cjy.m12651I(context, purchaseType, 0, productCategory, merchandise, merchandise, zM12669q, zM12668p);
            Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.gjy
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
                }
            });
            d.a aVarM12651I2 = cjy.m12651I(context, purchaseType, 0, productCategory, merchandise2, merchandise2, zM12669q, zM12668p);
            if (NullChecker.a(aVarM12651I) && NullChecker.a(aVarM12651I2)) {
                d dVarA = d.a(aVarM12651I, aVarM12651I2, true);
                dVarA.s(rxa0.m21877n(merchandise2));
                dVarA.t(rxa0.m21877n(merchandise));
                dVarA.v(false);
                arrayList.add(dVarA);
            }
            Merchandise merchandise3 = (Merchandise) vwb.r(list, new w9j() { // from class: l.hjy
                public final Object call(Object obj) {
                    Merchandise merchandise4 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise4.quarterly() && merchandise4.noneRenewable());
                }
            });
            d.a aVarM12651I3 = cjy.m12651I(context, purchaseType, 1, productCategory, merchandise3, merchandise, zM12669q, zM12668p);
            Merchandise merchandise4 = (Merchandise) vwb.r(list, new w9j() { // from class: l.ijy
                public final Object call(Object obj) {
                    Merchandise merchandise5 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise5.quarterly() && merchandise5.autoRenewable());
                }
            });
            d.a aVarM12651I4 = cjy.m12651I(context, purchaseType, 1, productCategory, merchandise4, merchandise2, zM12669q, zM12668p);
            if (NullChecker.a(aVarM12651I3) && NullChecker.a(aVarM12651I4)) {
                d dVarA2 = d.a(aVarM12651I3, aVarM12651I4, true);
                dVarA2.s(rxa0.m21877n(merchandise4));
                dVarA2.t(rxa0.m21877n(merchandise3));
                dVarA2.v(true);
                dVarA2.r(true);
                arrayList.add(dVarA2);
            }
            Merchandise merchandise5 = (Merchandise) vwb.r(list, new w9j() { // from class: l.jjy
                public final Object call(Object obj) {
                    Merchandise merchandise6 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise6.yearly() && merchandise6.noneRenewable());
                }
            });
            d.a aVarM12651I5 = cjy.m12651I(context, purchaseType, 2, productCategory, merchandise5, merchandise, zM12669q, zM12668p);
            Merchandise merchandise6 = (Merchandise) vwb.r(list, new w9j() { // from class: l.kjy
                public final Object call(Object obj) {
                    Merchandise merchandise7 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise7.yearly() && merchandise7.autoRenewable());
                }
            });
            d.a aVarM12651I6 = cjy.m12651I(context, purchaseType, 2, productCategory, merchandise6, merchandise2, zM12669q, zM12668p);
            if (NullChecker.a(aVarM12651I5) && NullChecker.a(aVarM12651I6)) {
                d dVarA3 = d.a(aVarM12651I5, aVarM12651I6, true);
                dVarA3.s(rxa0.m21877n(merchandise6));
                dVarA3.t(rxa0.m21877n(merchandise5));
                dVarA3.v(false);
                dVarA3.r(false);
                arrayList.add(dVarA3);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.cjy$e */
    public static class C0820e implements rwl {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Boolean m12692b(String str, Merchandise merchandise) {
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

        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            boolean zM12669q = cjy.m12669q(list);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (final String str : p2b0.h().v(productCategory)) {
                w9j<Merchandise, Boolean> w9jVar = new w9j() { // from class: l.ljy
                    public final Object call(Object obj) {
                        return cjy.C0820e.m12692b(str, (Merchandise) obj);
                    }
                };
                C0820e c0820e = this;
                Context context2 = context;
                PurchaseType purchaseType2 = purchaseType;
                List<Merchandise> list2 = list;
                d dVarM12694d = c0820e.m12694d(context2, purchaseType2, list2, zM12669q, i, w9jVar);
                if (NullChecker.a(dVarM12694d)) {
                    i++;
                    arrayList.add(dVarM12694d);
                }
                this = c0820e;
                context = context2;
                purchaseType = purchaseType2;
                list = list2;
            }
            C0820e c0820e2 = this;
            String strM = p2b0.h().m(productCategory);
            for (d dVar : arrayList) {
                d.a aVarD = dVar.d();
                if (aVarD == null) {
                    aVarD = dVar.b();
                }
                if (TextUtils.equals(String.valueOf(NullChecker.b(aVarD) ? aVarD.s().quantity : 0), strM)) {
                    dVar.v(true);
                    return arrayList;
                }
            }
            c0820e2.m12695e(arrayList);
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final d m12694d(Context context, PurchaseType purchaseType, List<Merchandise> list, boolean z, int i, final w9j<Merchandise, Boolean> w9jVar) {
            d dVarA;
            Objects.requireNonNull(w9jVar);
            final Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.mjy
                public final Object call(Object obj) {
                    return (Boolean) w9jVar.call((Merchandise) obj);
                }
            });
            if (!NullChecker.b(merchandise)) {
                return null;
            }
            final boolean zNoneRenewable = merchandise.noneRenewable();
            boolean zM12668p = cjy.m12668p(list);
            Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.njy
                public final Object call(Object obj) {
                    Merchandise merchandise3 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise.quantity == merchandise3.quantity && (!zNoneRenewable ? merchandise3.noneRenewable() : merchandise3.autoRenewable()));
                }
            });
            d.a aVarM12651I = cjy.m12651I(context, purchaseType, i, merchandise.category, merchandise, merchandise2, z, zM12668p);
            d.a aVarM12651I2 = cjy.m12651I(context, purchaseType, i, merchandise.category, merchandise2, merchandise, z, zM12668p);
            if (!NullChecker.a(aVarM12651I) || !NullChecker.a(aVarM12651I2)) {
                return null;
            }
            if (zNoneRenewable) {
                dVarA = d.a(aVarM12651I, aVarM12651I2, true);
                dVarA.s(rxa0.m21877n(merchandise2));
                dVarA.t(rxa0.m21877n(merchandise));
            } else {
                dVarA = d.a(aVarM12651I2, aVarM12651I, true);
                dVarA.s(rxa0.m21877n(merchandise));
                dVarA.t(rxa0.m21877n(merchandise2));
            }
            dVarA.v(false);
            return dVarA;
        }

        /* JADX INFO: renamed from: e */
        public final void m12695e(List<d> list) {
            for (d dVar : list) {
                if ((dVar.b() == null ? dVar.d() : dVar.b()).s().quarterly()) {
                    dVar.v(true);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.cjy$f */
    public static class C0821f implements rwl {
        @Override // p009l.rwl
        /* JADX INFO: renamed from: a */
        public List<d> mo12681a(Context context, PurchaseType purchaseType, ProductCategory productCategory, List<Merchandise> list) {
            int size;
            boolean zM12669q = cjy.m12669q(list);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Merchandise merchandise : list) {
                if (!arrayList2.contains(Integer.valueOf(merchandise.quantity))) {
                    arrayList2.add(Integer.valueOf(merchandise.quantity));
                }
            }
            if (h6a.i()) {
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
            ArrayList arrayListM12645C = cjy.m12645C("tttVip");
            ArrayList arrayListM12645C2 = cjy.m12645C("tttSeeWhoLikedMe");
            ArrayList arrayListM12645C3 = cjy.m12645C("svip");
            int i = 0;
            boolean z = false;
            while (i < arrayList2.size()) {
                final int iIntValue = ((Integer) arrayList2.get(i)).intValue();
                Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.qjy
                    public final Object call(Object obj) {
                        Merchandise merchandise3 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise3.quantity == iIntValue && merchandise3.noneRenewable());
                    }
                });
                d.a aVarM12651I = cjy.m12651I(context, purchaseType, 1, productCategory, merchandise2, null, zM12669q, false);
                Merchandise merchandise3 = (Merchandise) vwb.r(list, new w9j() { // from class: l.rjy
                    public final Object call(Object obj) {
                        Merchandise merchandise4 = (Merchandise) obj;
                        return Boolean.valueOf(merchandise4.quantity == iIntValue && merchandise4.autoRenewable());
                    }
                });
                d.a aVarM12651I2 = cjy.m12651I(context, purchaseType, (arrayList2.size() - 1) - i, productCategory, merchandise3, null, zM12669q, false);
                if (NullChecker.a(aVarM12651I) || NullChecker.a(aVarM12651I2)) {
                    d dVarA = d.a(aVarM12651I, aVarM12651I2, true);
                    dVarA.s(rxa0.m21877n(merchandise3));
                    dVarA.t(rxa0.m21877n(merchandise2));
                    if ((!CoreModule.K().me_().isVIP() && CoreModule.P().a().e2()) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        dVarA.v(i == (cjy.m12672t(purchaseType, context) ? cjy.m12652J(purchaseType, context) ? 0 : 2 : 1));
                        dVarA.r(dVarA.l());
                    } else if ((arrayListM12645C.isEmpty() && arrayListM12645C2.isEmpty()) || (CoreModule.K().me_().isSVIP() && arrayListM12645C3.isEmpty())) {
                        dVarA.v(i == (cjy.m12672t(purchaseType, context) ? cjy.m12652J(purchaseType, context) ? 0 : 2 : 1));
                        dVarA.r(dVarA.l());
                    }
                    if (sab0.v(purchaseType) && arrayList2.size() < 3) {
                        dVarA.v(i == 0);
                    }
                    if (h6a.i()) {
                        dVarA.v(i == 0);
                    }
                    if (dVarA.l()) {
                        z = true;
                    }
                    dVarA.r(dVarA.l());
                    arrayList.add(dVarA);
                }
                i++;
            }
            if (!z && (size = arrayList.size() / 2) < arrayList.size()) {
                ((d) arrayList.get(size)).v(true);
                ((d) arrayList.get(size)).r(true);
            }
            if (CoreModule.P().a().Xi() && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                cjy.m12644B(context, list);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m12643A(int i) {
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
    public static void m12644B(Context context, final List<Merchandise> list) {
        final long vipToExpireTimeInMill = CoreModule.c.e0.p9().getVipToExpireTimeInMill();
        final long jWs = CoreModule.P().a().ws();
        ArrayList<String> arrayListM12645C = m12645C("tttVip");
        ArrayList<String> arrayListM12645C2 = m12645C("tttSeeWhoLikedMe");
        ArrayList<String> arrayListM12645C3 = m12645C("svip");
        ogj.m19756c().f18031c.put("");
        ogj.m19756c().f18032d.put("");
        if (!arrayListM12645C3.isEmpty() && CoreModule.c.e0.p9().isSVIP()) {
            f10648e = -1.0d;
            CoreModule.P().a().Sm(context, arrayListM12645C3, true, 500L).subscribe(mkd0.G(new e30() { // from class: l.wiy
                public final void call(Object obj) {
                    cjy.m12653a((Optional) obj);
                }
            }));
        } else if (!arrayListM12645C2.isEmpty() && !CoreModule.P().a().e2()) {
            f10648e = -1.0d;
            CoreModule.P().a().Sm(context, arrayListM12645C2, true, 500L).subscribe(mkd0.G(new e30() { // from class: l.xiy
                public final void call(Object obj) {
                    cjy.m12655c(list, jWs, (Optional) obj);
                }
            }));
        } else {
            if (arrayListM12645C.isEmpty() || !CoreModule.c.e0.p9().isVIP()) {
                return;
            }
            f10647d = -1.0d;
            CoreModule.P().a().Sm(context, arrayListM12645C, true, 500L).subscribe(mkd0.G(new e30() { // from class: l.yiy
                public final void call(Object obj) {
                    cjy.m12656d(list, vipToExpireTimeInMill, (Optional) obj);
                }
            }));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static ArrayList<String> m12645C(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        List list = Collections.EMPTY_LIST;
        str.getClass();
        switch (str) {
            case "tttVip":
                list = (List) CoreModule.c.j0.S.e();
                break;
            case "svip":
                list = (List) CoreModule.c.j0.T.e();
                break;
            case "tttSeeWhoLikedMe":
                list = (List) CoreModule.c.j0.U.e();
                break;
        }
        if (list != null && !list.isEmpty()) {
            arrayList.add(((GPContract) list.get(0)).iapProductID);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m12646D(Context context, PurchaseType purchaseType, Merchandise merchandise) {
        if (merchandise == null) {
            return false;
        }
        if (m12650H(merchandise) || CoreModule.c.x0.m4(merchandise)) {
            return true;
        }
        if (m12672t(purchaseType, context)) {
            if (merchandise.quantity == (m12652J(purchaseType, context) ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m12647E(PurchaseType purchaseType, Merchandise merchandise) {
        return merchandise.autoRenewable() && sab0.m(purchaseType) && rxa0.m21884u(merchandise) && CoreModule.P().a().k();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m12648F() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 != null) {
            return qqi0.h(mqi0.m18550o(), (long) userP9.createdTime, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m12649G(String str) {
        return CoreModule.c.j0.T4() && CoreModule.c.x0.P3() && !TextUtils.isEmpty(CoreModule.c.j0.C4().skuId) && TextUtils.equals("tttSvipGoogleplay", str) && !m12648F();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m12650H(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (CoreModule.c.j0.T4() && CoreModule.c.x0.P3() && merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && stockKeepUnit.affiliateProducts != null && CoreModule.c.j0.C4() != null) {
            String str = merchandise.defaultStockKeepUnit.affiliateProducts.googleplay;
            String str2 = CoreModule.c.j0.C4().skuId;
            if (NullChecker.a(str) && NullChecker.a(str2) && str2.equals(str)) {
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
    public static d.a m12651I(Context context, PurchaseType purchaseType, int i, ProductCategory productCategory, Merchandise merchandise, Merchandise merchandise2, boolean z, boolean z2) {
        boolean zM21877n;
        double firstCouponPrice;
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        int iM12670r;
        String string4;
        String str3;
        String strM12667o;
        String str4;
        String string5;
        String string6;
        String string7;
        String str5;
        String string8;
        String string9;
        String strM12666n;
        int i2;
        Context context2;
        boolean zM12652J;
        int i3;
        int i4;
        Context context3;
        String string10;
        if (merchandise == null) {
            return null;
        }
        f10645b.setMaximumFractionDigits(2);
        double d = merchandise.defaultStockKeepUnit.prices.price;
        String str6 = f10645b.format(d);
        double d2 = merchandise.defaultStockKeepUnit.prices.unitPrice;
        String str7 = f10645b.format(d2);
        f10645b.format(merchandise.defaultStockKeepUnit.prices.originalPrice);
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
                zM21877n = rxa0.m21877n(merchandise);
                firstCouponPrice = merchandise.getFirstCouponPrice();
                break;
            default:
                firstCouponPrice = 0.0d;
                zM21877n = false;
                break;
        }
        double d4 = firstCouponPrice;
        double d5 = d;
        String str10 = f10645b.format(d4);
        boolean z3 = zM21877n;
        Resources resources = context.getResources();
        double d6 = d4;
        int i5 = merchandise.quantity;
        boolean zM12647E = m12647E(purchaseType, merchandise);
        String string12 = productCategory.toString();
        string12.getClass();
        switch (string12.hashCode()) {
            case -1403004683:
                b = !string12.equals("noneLiveCoin") ? (byte) -1 : (byte) 0;
                break;
            case -1338150991:
                b = !string12.equals("tttLiveCoin") ? (byte) -1 : (byte) 1;
                break;
            case -1301121252:
                b = !string12.equals("Promo_premiumUpgradeToUltra") ? (byte) -1 : (byte) 2;
                break;
            case -1204773696:
                if (!string12.equals("tttDiamond")) {
                    b = -1;
                }
                break;
            case -1106172890:
                b = !string12.equals("letter") ? (byte) -1 : (byte) 4;
                break;
            case -993539419:
                b = !string12.equals("tttCoin") ? (byte) -1 : (byte) 5;
                break;
            case -863315575:
                b = !string12.equals("tttVip") ? (byte) -1 : (byte) 6;
                break;
            case -815973819:
                b = !string12.equals("tttInstantChat") ? (byte) -1 : (byte) 7;
                break;
            case -796840475:
                b = !string12.equals("oDiamond") ? (byte) -1 : (byte) 8;
                break;
            case -735868401:
                b = !string12.equals("tttBoost") ? (byte) -1 : (byte) 9;
                break;
            case -435036897:
                b = !string12.equals("tttUltraPremium") ? (byte) -1 : (byte) 10;
                break;
            case -333095502:
                b = !string12.equals("superLike") ? (byte) -1 : (byte) 11;
                break;
            case -94011970:
                b = !string12.equals("svipPicksMembership") ? (byte) -1 : (byte) 12;
                break;
            case 3059345:
                b = !string12.equals("coin") ? (byte) -1 : (byte) 13;
                break;
            case 3542730:
                b = !string12.equals("svip") ? (byte) -1 : (byte) 14;
                break;
            case 93922211:
                b = !string12.equals("boost") ? (byte) -1 : (byte) 15;
                break;
            case 150908446:
                b = !string12.equals("tttSuperLike") ? (byte) -1 : (byte) 16;
                break;
            case 219393643:
                b = !string12.equals("tttSvipGoogleplay") ? (byte) -1 : (byte) 17;
                break;
            case 449746854:
                b = !string12.equals("tttSeeWhoLikedMe") ? (byte) -1 : (byte) 18;
                break;
            case 1166765179:
                b = !string12.equals("quickchatMembership") ? (byte) -1 : (byte) 19;
                break;
            case 1581498686:
                b = !string12.equals("tttCompliment") ? (byte) -1 : (byte) 20;
                break;
            case 1654011977:
                b = !string12.equals("tttVipUpgradeToPremium") ? (byte) -1 : (byte) 21;
                break;
            case 1879244927:
                b = !string12.equals("tttSeeUpgradeToPremium") ? (byte) -1 : (byte) 22;
                break;
            case 1905099240:
                b = !string12.equals("picksMembership") ? (byte) -1 : (byte) 23;
                break;
            case 1916885208:
                b = !string12.equals("tttPremiumUpgradeToUltra") ? (byte) -1 : (byte) 24;
                break;
            default:
                b = -1;
                break;
        }
        String strC = "";
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 5:
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                d5 = d5;
                String string13 = resources.getString(l7n.e());
                f10646c.setMaximumFractionDigits(2);
                f10646c.setMinimumFractionDigits(2);
                string = null;
                str = null;
                str9 = null;
                string2 = String.format("%1$s %2$s", str8, f10646c.format(d5));
                string3 = string13;
                iM12670r = 0;
                str2 = str9;
                double d7 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d7 - d5) / d7));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context4 = context3;
                    strC = string10;
                    context2 = context4;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 2:
            case 21:
            case 22:
            case 24:
                String string14 = resources.getString(i5 == 1 ? R$string.f6389t9 : R$string.f6400u9);
                StringBuilder sb = new StringBuilder();
                sb.append(str8);
                sb.append(" ");
                d5 = d5;
                sb.append(f10645b.format(d5));
                str9 = null;
                string3 = string14;
                string = sb.toString();
                string2 = "";
                str = string2;
                iM12670r = 0;
                str2 = str9;
                double d8 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d8 - d5) / d8));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context5 = context3;
                    strC = string10;
                    context2 = context5;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 4:
                String str11 = String.format("%1$s %2$s", str8, str6);
                str2 = null;
                str9 = null;
                string3 = "条";
                str = String.format("%.1f", Double.valueOf(d2));
                string2 = "";
                d5 = d5;
                iM12670r = 0;
                string = str11;
                double d9 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d9 - d5) / d9));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context6 = context3;
                    strC = string10;
                    context2 = context6;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 6:
            case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
            case 19:
                if (TEnum.equals(productCategory, "tttVip") || TEnum.equals(productCategory, "tttSvipGoogleplay")) {
                    if (merchandise.weekly()) {
                        string4 = resources.getString(i5 == 1 ? R$string.f6002M1 : R$string.f6013N1);
                        string2 = resources.getString(R$string.f5875A6, str8, str7);
                    } else {
                        string4 = resources.getString(i5 == 1 ? R$string.f6389t9 : R$string.f6400u9);
                        string2 = resources.getString(R$string.f6411v9, str8, str7);
                    }
                    str3 = String.format("%1$s%2$s", str8, str6);
                    if (!merchandise.autoRenewable() || !TEnum.equals(productCategory, "quickchatMembership")) {
                        string3 = string4;
                        string = str3;
                        str = "";
                        d5 = d5;
                        iM12670r = 0;
                        str2 = str9;
                        double d10 = ((double) i5) * d3;
                        i2 = (int) (100.0d * ((d10 - d5) / d10));
                        if (i2 != 0) {
                            if (IntlCountryCodeController.u()) {
                                context3 = context;
                                string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                            } else {
                                context3 = context;
                                string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                            }
                            Context context7 = context3;
                            strC = string10;
                            context2 = context7;
                        } else {
                            context2 = context;
                        }
                        if (m12650H(merchandise)) {
                            strC = hvc0.c(R$string.f6202e);
                        } else if (CoreModule.c.x0.m4(merchandise)) {
                            if (CoreModule.c.x0.c4()) {
                                strC = hvc0.c(R$string.f6037P3);
                            } else {
                                strC = hvc0.c(R$string.f6202e);
                            }
                        } else if (m12672t(purchaseType, context2)) {
                            zM12652J = m12652J(purchaseType, context2);
                            if (zM12652J) {
                                i3 = 12;
                            } else {
                                i3 = 1;
                            }
                            if (i5 == i3) {
                                if (zM12652J) {
                                    i4 = R$string.f6048Q3;
                                } else {
                                    i4 = R$string.f6037P3;
                                }
                                strC = hvc0.c(i4);
                            }
                        }
                        return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
                    }
                    int i6 = R$string.f6224f9;
                    if (!z3) {
                        d6 = d2;
                    }
                    String string15 = resources.getString(i6, str8, t0g0.e(d6 / ((double) f10644a)));
                    strM12667o = m12667o(merchandise, zM12647E);
                    string3 = string4;
                    str = string15;
                    iM12670r = 0;
                    string = str3;
                } else {
                    if (merchandise.noneRenewable()) {
                        str4 = String.format("%1$s %2$s", str8, str6);
                        iM12670r = 0;
                        strM12667o = null;
                    } else {
                        int i7 = R$string.f6165aa;
                        if (z3) {
                            str6 = str10;
                        }
                        String string16 = resources.getString(i7, str8, str6);
                        iM12670r = m12670r(merchandise, merchandise2, i5);
                        str4 = string16;
                        strM12667o = m12677y(merchandise);
                    }
                    String string17 = resources.getString(i5 == 1 ? R$string.f6389t9 : R$string.f6400u9);
                    string = resources.getString(R$string.f6411v9, str8, str7);
                    string2 = str4;
                    string3 = string17;
                    str = "";
                }
                str2 = strM12667o;
                double d11 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d11 - d5) / d11));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context8 = context3;
                    strC = string10;
                    context2 = context8;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 7:
                string5 = resources.getString(R$string.f5995L5);
                string6 = str8 + t0g0.e(d5);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM12670r = 0;
                double d12 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d12 - d5) / d12));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context9 = context3;
                    strC = string10;
                    context2 = context9;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 8:
            case 10:
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
            case 23:
                string3 = merchandise.weekly() ? resources.getString(i5 == 1 ? R$string.f6002M1 : R$string.f6013N1) : resources.getString(i5 == 1 ? R$string.f6389t9 : R$string.f6400u9);
                if (!z || z2) {
                    if (zM12647E) {
                        string7 = p2b0.h().t(merchandise, merchandise.quantity);
                        str5 = String.format("%1$s /%2$s", str8 + str10, str8 + str6);
                    } else if (merchandise.weekly()) {
                        string7 = resources.getString(R$string.f5875A6, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    } else {
                        string7 = resources.getString(R$string.f6411v9, str8, str7);
                        str5 = String.format("%1$s%2$s", str8, str6);
                    }
                    if (!merchandise.autoRenewable() || z2) {
                        string8 = "";
                    } else {
                        int i8 = R$string.f6224f9;
                        if (!z3) {
                            d6 = d2;
                        }
                        string8 = resources.getString(i8, str8, t0g0.e(d6 / ((double) f10644a)));
                        m12674v(m12670r(merchandise, merchandise2, i5));
                    }
                    int iM12670r2 = m12670r(merchandise, merchandise2, i5);
                    String strM12666n2 = m12666n(merchandise, z3 || zM12647E);
                    string2 = string7;
                    iM12670r = iM12670r2;
                    str = string8;
                    string = str5;
                    str9 = strM12666n2;
                } else {
                    if (merchandise.noneRenewable()) {
                        string9 = String.format("%1$s %2$s", str8, str6);
                        strM12666n = null;
                        iM12670r = 0;
                    } else {
                        int i9 = R$string.f6165aa;
                        if (z3) {
                            str6 = str10;
                        }
                        string9 = resources.getString(i9, str8, str6);
                        int iM12670r3 = m12670r(merchandise, merchandise2, i5);
                        strM12666n = m12666n(merchandise, z3 || zM12647E);
                        iM12670r = iM12670r3;
                    }
                    string2 = string9;
                    string = resources.getString(R$string.f6411v9, str8, str7);
                    str9 = strM12666n;
                    str = "";
                }
                d5 = d5;
                str2 = null;
                double d13 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d13 - d5) / d13));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context10 = context3;
                    strC = string10;
                    context2 = context10;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                string5 = resources.getString(i5 == 1 ? R$string.f6286l : R$string.f6298m);
                string6 = resources.getString(R$string.f6274k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM12670r = 0;
                double d14 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d14 - d5) / d14));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context11 = context3;
                    strC = string10;
                    context2 = context11;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                String string18 = resources.getString(i5 == 1 ? R$string.f5931F7 : R$string.f5942G7);
                String string19 = resources.getString(R$string.f5953H7, str8, str7);
                str9 = null;
                string3 = string18;
                string = string19;
                string2 = "";
                str = string2;
                d5 = d5;
                iM12670r = 0;
                str2 = str9;
                double d15 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d15 - d5) / d15));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context12 = context3;
                    strC = string10;
                    context2 = context12;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 18:
                String string20 = resources.getString(i5 == 1 ? R$string.f6389t9 : R$string.f6400u9);
                String string21 = resources.getString(R$string.f6411v9, str8, str7);
                str3 = String.format("%1$s%2$s", str8, str6);
                string3 = string20;
                string2 = string21;
                string = str3;
                str = "";
                d5 = d5;
                iM12670r = 0;
                str2 = str9;
                double d16 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d16 - d5) / d16));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context13 = context3;
                    strC = string10;
                    context2 = context13;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            case 20:
                string5 = resources.getString(R$string.f6158a3);
                string6 = resources.getString(R$string.f6274k, str8, str7);
                str2 = null;
                str9 = null;
                string3 = string5;
                string = string6;
                string2 = "";
                str = string2;
                d5 = d5;
                iM12670r = 0;
                double d17 = ((double) i5) * d3;
                i2 = (int) (100.0d * ((d17 - d5) / d17));
                if (i2 != 0) {
                    if (IntlCountryCodeController.u()) {
                        context3 = context;
                        string10 = context3.getString(R$string.f6200d9, String.valueOf(100 - i2));
                    } else {
                        context3 = context;
                        string10 = context3.getString(R$string.f6188c9, String.valueOf(i2));
                    }
                    Context context14 = context3;
                    strC = string10;
                    context2 = context14;
                } else {
                    context2 = context;
                }
                if (m12650H(merchandise)) {
                    strC = hvc0.c(R$string.f6202e);
                } else if (CoreModule.c.x0.m4(merchandise)) {
                    if (CoreModule.c.x0.c4()) {
                        strC = hvc0.c(R$string.f6037P3);
                    } else {
                        strC = hvc0.c(R$string.f6202e);
                    }
                } else if (m12672t(purchaseType, context2)) {
                    zM12652J = m12652J(purchaseType, context2);
                    if (zM12652J) {
                        i3 = 12;
                    } else {
                        i3 = 1;
                    }
                    if (i5 == i3) {
                        if (zM12652J) {
                            i4 = R$string.f6048Q3;
                        } else {
                            i4 = R$string.f6037P3;
                        }
                        strC = hvc0.c(i4);
                    }
                }
                return d.b.b().m(merchandise).p(i5).q(string3).r(string2).e(string).d(str).k(str2).i(str9).l(strC).o(productCategory).g((n5c) null).j(iM12670r).n(d5).f(str8).h(String.valueOf(d3)).a();
            default:
                all.a("You should add ", productCategory.name(), " in parseMerchandise method.");
                return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12652J(PurchaseType purchaseType, Context context) {
        return CoreModule.P().a().pf(context) && purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.c.j0.z4();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12653a(Optional optional) {
        if (optional.isPresent()) {
            GPContract gPContract = (GPContract) ((List) CoreModule.c.j0.T.e()).get(0);
            if (m12675w(gPContract.chargeInterval) <= 0) {
                m12671s(1);
                return;
            }
            ogj.m19756c().f18029a.onNext(Double.valueOf(f10648e));
            ogj.m19756c().f18030b.onNext(Integer.valueOf(m12673u(gPContract.chargeInterval)));
            ogj.m19756c().f18031c.put(gPContract.iapProductID + ogj.f18027e + PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12655c(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = (GPContract) ((List) CoreModule.c.j0.U.e()).get(0);
                int iM12675w = m12675w(gPContract.chargeInterval);
                if (iM12675w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m12643A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM12675w)) * d;
                    f10648e = d2;
                    double d3 = f10647d;
                    if (d3 >= 0.0d && d2 > d3) {
                        if (d2 > d) {
                            f10648e = d;
                        }
                        ogj.m19756c().f18029a.onNext(Double.valueOf(f10648e));
                        ogj.m19756c().f18030b.onNext(Integer.valueOf(m12673u(gPContract.chargeInterval)));
                        ogj.m19756c().f18031c.put(gPContract.iapProductID + ogj.f18027e + PurchaseType.TYPE_GET_LIKERS);
                        ogj.m19756c().f18032d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m12671s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12656d(List list, long j, Optional optional) {
        if (optional.isPresent()) {
            for (GPSkuDetails gPSkuDetails : (List) optional.get()) {
                GPContract gPContract = (GPContract) ((List) CoreModule.c.j0.S.e()).get(0);
                int iM12675w = m12675w(gPContract.chargeInterval);
                if (iM12675w > 0) {
                    Merchandise merchandise = (Merchandise) list.get(1);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Merchandise merchandise2 = (Merchandise) it.next();
                        if (merchandise2.quantity == m12643A(gPContract.chargeInterval)) {
                            merchandise = merchandise2;
                        }
                    }
                    double d = merchandise.defaultStockKeepUnit.prices.price - (gPSkuDetails.priceAmountMicros / 1000000);
                    double d2 = ((j / 1000.0d) / ((double) iM12675w)) * d;
                    f10647d = d2;
                    double d3 = f10648e;
                    if (d3 >= 0.0d && d2 > d3) {
                        if (d2 > d) {
                            f10647d = d;
                        }
                        ogj.m19756c().f18029a.onNext(Double.valueOf(f10647d));
                        ogj.m19756c().f18030b.onNext(Integer.valueOf(m12673u(gPContract.chargeInterval)));
                        ogj.m19756c().f18031c.put(gPContract.iapProductID + ogj.f18027e + PurchaseType.TYPE_GET_VIP);
                        ogj.m19756c().f18032d.put(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                    }
                } else {
                    m12671s(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m12666n(Merchandise merchandise, boolean z) {
        if (z) {
            return String.valueOf(Math.round(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice - merchandise.getFirstCouponPrice()));
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return String.valueOf(Math.round(prices.noneRenewalPrice - prices.price));
    }

    /* JADX INFO: renamed from: o */
    public static String m12667o(Merchandise merchandise, boolean z) {
        if (z) {
            return i0g0.m16107F((merchandise.getFirstCouponPrice() / merchandise.defaultStockKeepUnit.prices.noneRenewalPrice) * 10.0d, 1);
        }
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return i0g0.m16109H((prices.price / prices.noneRenewalPrice) * 10.0d);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m12668p(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
            if ((CoreModule.P().a().k() && rxa0.m21879p(merchandise, ProductCategory.get("svipPicksMembership"), "lowPriceSVIPPicks")) || rxa0.m21879p(merchandise, ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m12669q(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (rxa0.m21877n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static int m12670r(Merchandise merchandise, Merchandise merchandise2, int i) {
        double d;
        if (merchandise == null) {
            return 0;
        }
        double firstCouponPrice = rxa0.m21877n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        ArrayList arrayListN = vwb.n(CoreModule.c.j0.D5(merchandise.category), new w9j() { // from class: l.ziy
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.noneRenewable() && merchandise3.monthly());
            }
        });
        if (vwb.J(arrayListN)) {
            d = NullChecker.a(merchandise2) ? merchandise2.defaultStockKeepUnit.prices.unitPrice : 0.0d;
        } else {
            d = ((Merchandise) arrayListN.get(0)).defaultStockKeepUnit.prices.unitPrice;
        }
        double d2 = d * ((double) i);
        return (int) (((d2 - firstCouponPrice) / d2) * 100.0d);
    }

    /* JADX INFO: renamed from: s */
    public static void m12671s(int i) {
        ogj.m19756c().f18030b.onNext(Integer.valueOf(m12673u(i)));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m12672t(PurchaseType purchaseType, Context context) {
        if (CoreModule.P().a().pf(context)) {
            if (purchaseType == PurchaseType.TYPE_GET_VIP && CoreModule.c.j0.B4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_LIKERS && CoreModule.c.j0.A4()) {
                return true;
            }
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.c.j0.y4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static int m12673u(int i) {
        if (h6a.i()) {
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
    public static String m12674v(int i) {
        return String.format(Locale.getDefault(), CoreModule.b.getString(R$string.f5946H0), i + "%");
    }

    /* JADX INFO: renamed from: w */
    public static int m12675w(int i) {
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
    public static rwl m12676x() {
        return IntlCountryCodeController.k() ? new C0821f() : new C0816a();
    }

    /* JADX INFO: renamed from: y */
    public static String m12677y(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        return i0g0.m16107F((prices.price / prices.noneRenewalPrice) * 10.0d, 1);
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
    
        if (r0.equals("tttSvipGoogleplay") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r0.equals("svipPicksMembership") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (l.p2b0.h().z() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        return new p009l.cjy.C0817b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        return new p009l.cjy.C0819d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r0.equals("tttVip") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        return m12676x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.equals("picksMembership") != false) goto L42;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p009l.rwl m12678z(com.p1.mobile.putong.core.data.ProductCategory r3) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.cjy.m12678z(com.p1.mobile.putong.core.data.ProductCategory):l.rwl");
    }
}
