package com.p000p1.mobile.putong.p001ab;

import android.text.TextUtils;
import com.google.common.primitives.Ints;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.geocoding.Geocoder;
import com.p1.mobile.android.geocoding.Geocoding;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.location.Location;
import java.util.Arrays;
import java.util.Locale;
import l.du2;
import l.e30;
import l.w9j;
import p006l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class IntlCountryCodeController {

    /* JADX INFO: renamed from: a */
    public static final int[] f0a = {43, 32, 359, 357, 420, 45, 372, 358, 33, 49, 30, 36, 385, 39, 353, 371, 370, 352, 356, 31, 48, 351, 40, 421, 386, 34, 46, 44, 350, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f1b = {232, 206, 284, 280, 230, 238, 248, 244, 208, 262, 202, 216, 219, 222, 272, 247, 246, 270, 278, 204, 260, 268, 226, 231, 293, 214, 240, 234, 266, 310, 311, 316};

    /* JADX INFO: renamed from: c */
    public static final int[] f2c = {310, 311, 312, 313, 314, 315, 316, 234, 235};

    /* JADX INFO: renamed from: d */
    public static final int[] f3d = {310, 311, 312, 313, 314, 315, 316};

    /* JADX INFO: renamed from: e */
    public static boolean f4e = false;

    /* JADX INFO: renamed from: f */
    public static final String[] f5f = {"zh", "ja", "ko"};

    /* JADX INFO: renamed from: g */
    public static final String[] f6g = {"th", "in"};

    /* JADX INFO: renamed from: h */
    public static final int[] f7h = {460, 454, 455, 466, 428, 440, 450, 467, 502, 525};

    /* JADX INFO: renamed from: i */
    public static final int[] f8i = {528, 456, 514, 510, 457, 414, 515, 520, 452};

    /* JADX INFO: renamed from: j */
    public static final int[] f9j = {404, 410, 470, 413, 429, 402, 472, 412};

    /* JADX INFO: renamed from: k */
    public static final int[] f10k = {404, 405, 406};

    /* JADX INFO: renamed from: l */
    public static final int[] f11l = {466};

    /* JADX INFO: renamed from: m */
    public static final int[] f12m = {454};

    /* JADX INFO: renamed from: n */
    public static final int[] f13n = {455};

    /* JADX INFO: renamed from: o */
    public static final int[] f14o = {440, 441};

    /* JADX INFO: renamed from: p */
    public static final int[] f15p = {450};

    /* JADX INFO: renamed from: q */
    public static final int[] f16q = {310, 311, 312, 313, 314, 315, 316, 330, 332, 234, 235, 266, 346, 348, 350, 354, 376, 750, 302, 505, 530, 548};

    /* JADX INFO: renamed from: r */
    public static boolean f17r = false;

    /* JADX INFO: renamed from: s */
    public static boolean f18s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f19t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f20u = false;

    /* JADX INFO: renamed from: v */
    public static boolean f21v = false;

    public enum ModelRegion {
        EA,
        SEA,
        SA,
        OTHER
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m0a(Location location) {
        Geocoding.Country country = new Geocoder(App.e).getCountry((float) location.u(), (float) location.x());
        return country == null ? "Unknown" : country.getIso();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1b(String str) {
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "AS":
            case "GU":
            case "MP":
            case "PR":
            case "UM":
            case "US":
            case "VI":
                f4e = true;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ModelRegion m2c() {
        String language = Locale.getDefault().getLanguage();
        int i = qib0.f19808f0;
        if (Arrays.asList(f5f).contains(language)) {
            return ModelRegion.EA;
        }
        if (Arrays.asList(f6g).contains(language)) {
            return ModelRegion.SEA;
        }
        if (Ints.c(f7h).contains(Integer.valueOf(i))) {
            return ModelRegion.EA;
        }
        if (Ints.c(f8i).contains(Integer.valueOf(i))) {
            return ModelRegion.SEA;
        }
        return Ints.c(f9j).contains(Integer.valueOf(i)) ? ModelRegion.SA : ModelRegion.OTHER;
    }

    /* JADX INFO: renamed from: d */
    public static String m3d(int i) {
        if (Ints.c(f1b).contains(Integer.valueOf(i))) {
            return "EUROPEAN";
        }
        if (Ints.c(f3d).contains(Integer.valueOf(i))) {
            return "US";
        }
        if (Ints.c(f12m).contains(Integer.valueOf(i))) {
            return "HONGKONG";
        }
        if (Ints.c(f13n).contains(Integer.valueOf(i))) {
            return "AOMEN";
        }
        if (Ints.c(f11l).contains(Integer.valueOf(i))) {
            return "TAIWAN";
        }
        if (Ints.c(f10k).contains(Integer.valueOf(i))) {
            return "IND";
        }
        if (Ints.c(f14o).contains(Integer.valueOf(i))) {
            return "JAPAN";
        }
        if (Ints.c(f15p).contains(Integer.valueOf(i))) {
            return "KOREA";
        }
        if (Ints.c(f7h).contains(Integer.valueOf(i))) {
            return "EA";
        }
        if (Ints.c(f8i).contains(Integer.valueOf(i))) {
            return "SEA";
        }
        return Ints.c(f9j).contains(Integer.valueOf(i)) ? "SA" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: e */
    public static void m4e() {
        if (Ints.c(f3d).contains(Integer.valueOf(qib0.f19808f0))) {
            f4e = true;
        } else {
            qib0.f19778E.p().take(1).map(new w9j() { // from class: l.s6n
                public final Object call(Object obj) {
                    return IntlCountryCodeController.m0a((Location) obj);
                }
            }).doOnNext(new e30() { // from class: l.t6n
                public final void call(Object obj) {
                    IntlCountryCodeController.m1b((String) obj);
                }
            }).materialize().subscribe();
        }
        if (Ints.c(f1b).contains(Integer.valueOf(qib0.f19808f0))) {
            m25z(true);
        }
        if (Ints.c(f2c).contains(Integer.valueOf(qib0.f19808f0))) {
            m24y(true);
        }
        if (Ints.c(f10k).contains(Integer.valueOf(qib0.f19808f0))) {
            f19t = true;
        }
        if (Ints.c(f14o).contains(Integer.valueOf(qib0.f19808f0))) {
            f20u = true;
        }
        if (Ints.c(f11l).contains(Integer.valueOf(qib0.f19808f0))) {
            f21v = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5f() {
        return f18s;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6g() {
        return Ints.c(f14o).contains(Integer.valueOf(qib0.f19808f0)) || Ints.c(f15p).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7h(int i) {
        return Ints.c(f0a).contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8i() {
        return f17r;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9j() {
        return Ints.c(f16q).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10k() {
        return TextUtils.equals("hms", "gms");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11l() {
        return f19t;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12m() {
        return TEnum.equals(qib0.f19810h0, "indonesia");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m13n() {
        return f20u;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14o() {
        return Ints.c(f14o).contains(Integer.valueOf(qib0.f19808f0)) || Ints.c(f15p).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m15p() {
        return (qib0.f19808f0 == 0 && "ko".equals(Locale.getDefault().getLanguage()) && "KR".equals(Locale.getDefault().getCountry())) || Ints.c(f15p).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m16q() {
        return TEnum.equals(qib0.f19810h0, "mainland");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m17r() {
        return (Ints.c(f10k).contains(Integer.valueOf(qib0.f19808f0)) || Ints.c(f11l).contains(Integer.valueOf(qib0.f19808f0)) || Ints.c(f14o).contains(Integer.valueOf(qib0.f19808f0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m18s() {
        return TEnum.equals(qib0.f19810h0, "oversea_chinese");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m19t() {
        return m10k() && qib0.f19808f0 == 250;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m20u() {
        return f21v;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m21v() {
        return f4e;
    }

    /* JADX INFO: renamed from: w */
    public static void m22w() {
        f18s = Ints.c(f2c).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: x */
    public static void m23x() {
        f17r = Ints.c(f1b).contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: y */
    public static void m24y(boolean z) {
        du2.a("[putong-common][location]", "setBSGroup isBritishSystem = " + f18s + ", isBS = " + z);
        if (f18s) {
            return;
        }
        f18s = z;
    }

    /* JADX INFO: renamed from: z */
    public static void m25z(boolean z) {
        du2.a("[putong-common][location]", "setIsEuropeanUnion isEuropeanUnion = " + f17r + ", isEU = " + z);
        if (f17r) {
            return;
        }
        f17r = z;
    }
}
