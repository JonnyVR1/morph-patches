package com.p046p1.mobile.putong.p049ab;

import android.text.TextUtils;
import com.core.glcore.util.DetectDelayStopHelper;
import com.google.common.primitives.Ints;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.geocoding.Geocoder;
import com.p046p1.mobile.android.geocoding.Geocoding;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import p149l.du2;
import p149l.e30;
import p149l.qib0;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public final class IntlCountryCodeController {

    /* JADX INFO: renamed from: a */
    public static final int[] f16011a = {43, 32, 359, 357, UnixStat.DEFAULT_FILE_PERM, 45, 372, 358, 33, 49, 30, 36, 385, 39, 353, 371, 370, 352, 356, 31, 48, 351, 40, 421, 386, 34, 46, 44, 350, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f16012b = {232, 206, 284, 280, 230, 238, 248, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 208, 262, 202, 216, 219, 222, 272, 247, 246, 270, 278, 204, 260, 268, 226, 231, 293, 214, 240, 234, 266, 310, 311, 316};

    /* JADX INFO: renamed from: c */
    public static final int[] f16013c = {310, 311, 312, 313, 314, 315, 316, 234, 235};

    /* JADX INFO: renamed from: d */
    public static final int[] f16014d = {310, 311, 312, 313, 314, 315, 316};

    /* JADX INFO: renamed from: e */
    public static boolean f16015e = false;

    /* JADX INFO: renamed from: f */
    public static final String[] f16016f = {"zh", "ja", "ko"};

    /* JADX INFO: renamed from: g */
    public static final String[] f16017g = {"th", "in"};

    /* JADX INFO: renamed from: h */
    public static final int[] f16018h = {460, 454, 455, 466, 428, 440, 450, 467, HttpStatus.BAD_GATEWAY_502, 525};

    /* JADX INFO: renamed from: i */
    public static final int[] f16019i = {528, 456, 514, 510, 457, HttpStatus.REQUEST_URI_TOO_LONG_414, 515, 520, 452};

    /* JADX INFO: renamed from: j */
    public static final int[] f16020j = {404, 410, 470, HttpStatus.REQUEST_ENTITY_TOO_LARGE_413, 429, 402, 472, HttpStatus.PRECONDITION_FAILED_412};

    /* JADX INFO: renamed from: k */
    public static final int[] f16021k = {404, HttpStatus.METHOD_NOT_ALLOWED_405, HttpStatus.NOT_ACCEPTABLE_406};

    /* JADX INFO: renamed from: l */
    public static final int[] f16022l = {466};

    /* JADX INFO: renamed from: m */
    public static final int[] f16023m = {454};

    /* JADX INFO: renamed from: n */
    public static final int[] f16024n = {455};

    /* JADX INFO: renamed from: o */
    public static final int[] f16025o = {440, 441};

    /* JADX INFO: renamed from: p */
    public static final int[] f16026p = {450};

    /* JADX INFO: renamed from: q */
    public static final int[] f16027q = {310, 311, 312, 313, 314, 315, 316, 330, 332, 234, 235, 266, 346, 348, 350, 354, 376, DetectDelayStopHelper.TYPE_DETECT_PICKNOISE, 302, HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505, 530, 548};

    /* JADX INFO: renamed from: r */
    public static boolean f16028r = false;

    /* JADX INFO: renamed from: s */
    public static boolean f16029s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f16030t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f16031u = false;

    /* JADX INFO: renamed from: v */
    public static boolean f16032v = false;

    public enum ModelRegion {
        EA,
        SEA,
        SA,
        OTHER
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m28105a(Location location) {
        Geocoding.Country country = new Geocoder(App.f15369e).getCountry((float) location.m78831u(), (float) location.m78833x());
        return country == null ? "Unknown" : country.getIso();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m28106b(String str) {
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
                f16015e = true;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ModelRegion m28107c() {
        String language = Locale.getDefault().getLanguage();
        int i = qib0.f154717f0;
        if (Arrays.asList(f16016f).contains(language)) {
            return ModelRegion.EA;
        }
        if (Arrays.asList(f16017g).contains(language)) {
            return ModelRegion.SEA;
        }
        if (Ints.m16458c(f16018h).contains(Integer.valueOf(i))) {
            return ModelRegion.EA;
        }
        if (Ints.m16458c(f16019i).contains(Integer.valueOf(i))) {
            return ModelRegion.SEA;
        }
        return Ints.m16458c(f16020j).contains(Integer.valueOf(i)) ? ModelRegion.SA : ModelRegion.OTHER;
    }

    /* JADX INFO: renamed from: d */
    public static String m28108d(int i) {
        if (Ints.m16458c(f16012b).contains(Integer.valueOf(i))) {
            return "EUROPEAN";
        }
        if (Ints.m16458c(f16014d).contains(Integer.valueOf(i))) {
            return "US";
        }
        if (Ints.m16458c(f16023m).contains(Integer.valueOf(i))) {
            return "HONGKONG";
        }
        if (Ints.m16458c(f16024n).contains(Integer.valueOf(i))) {
            return "AOMEN";
        }
        if (Ints.m16458c(f16022l).contains(Integer.valueOf(i))) {
            return "TAIWAN";
        }
        if (Ints.m16458c(f16021k).contains(Integer.valueOf(i))) {
            return "IND";
        }
        if (Ints.m16458c(f16025o).contains(Integer.valueOf(i))) {
            return "JAPAN";
        }
        if (Ints.m16458c(f16026p).contains(Integer.valueOf(i))) {
            return "KOREA";
        }
        if (Ints.m16458c(f16018h).contains(Integer.valueOf(i))) {
            return "EA";
        }
        if (Ints.m16458c(f16019i).contains(Integer.valueOf(i))) {
            return "SEA";
        }
        return Ints.m16458c(f16020j).contains(Integer.valueOf(i)) ? "SA" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: e */
    public static void m28109e() {
        if (Ints.m16458c(f16014d).contains(Integer.valueOf(qib0.f154717f0))) {
            f16015e = true;
        } else {
            qib0.f154687E.m78864p().take(1).map(new w9j() { // from class: l.s6n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlCountryCodeController.m28105a((Location) obj);
                }
            }).doOnNext(new e30() { // from class: l.t6n
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlCountryCodeController.m28106b((String) obj);
                }
            }).materialize().subscribe();
        }
        if (Ints.m16458c(f16012b).contains(Integer.valueOf(qib0.f154717f0))) {
            m28130z(true);
        }
        if (Ints.m16458c(f16013c).contains(Integer.valueOf(qib0.f154717f0))) {
            m28129y(true);
        }
        if (Ints.m16458c(f16021k).contains(Integer.valueOf(qib0.f154717f0))) {
            f16030t = true;
        }
        if (Ints.m16458c(f16025o).contains(Integer.valueOf(qib0.f154717f0))) {
            f16031u = true;
        }
        if (Ints.m16458c(f16022l).contains(Integer.valueOf(qib0.f154717f0))) {
            f16032v = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m28110f() {
        return f16029s;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m28111g() {
        return Ints.m16458c(f16025o).contains(Integer.valueOf(qib0.f154717f0)) || Ints.m16458c(f16026p).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m28112h(int i) {
        return Ints.m16458c(f16011a).contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m28113i() {
        return f16028r;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m28114j() {
        return Ints.m16458c(f16027q).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m28115k() {
        return TextUtils.equals("hms", "gms");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m28116l() {
        return f16030t;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m28117m() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28118n() {
        return f16031u;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m28119o() {
        return Ints.m16458c(f16025o).contains(Integer.valueOf(qib0.f154717f0)) || Ints.m16458c(f16026p).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m28120p() {
        return (qib0.f154717f0 == 0 && "ko".equals(Locale.getDefault().getLanguage()) && "KR".equals(Locale.getDefault().getCountry())) || Ints.m16458c(f16026p).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m28121q() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m28122r() {
        return (Ints.m16458c(f16021k).contains(Integer.valueOf(qib0.f154717f0)) || Ints.m16458c(f16022l).contains(Integer.valueOf(qib0.f154717f0)) || Ints.m16458c(f16025o).contains(Integer.valueOf(qib0.f154717f0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m28123s() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m28124t() {
        return m28115k() && qib0.f154717f0 == 250;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m28125u() {
        return f16032v;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m28126v() {
        return f16015e;
    }

    /* JADX INFO: renamed from: w */
    public static void m28127w() {
        f16029s = Ints.m16458c(f16013c).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: x */
    public static void m28128x() {
        f16028r = Ints.m16458c(f16012b).contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: y */
    public static void m28129y(boolean z) {
        du2.m113670a("[putong-common][location]", "setBSGroup isBritishSystem = " + f16029s + ", isBS = " + z);
        if (f16029s) {
            return;
        }
        f16029s = z;
    }

    /* JADX INFO: renamed from: z */
    public static void m28130z(boolean z) {
        du2.m113670a("[putong-common][location]", "setIsEuropeanUnion isEuropeanUnion = " + f16028r + ", isEU = " + z);
        if (f16028r) {
            return;
        }
        f16028r = z;
    }
}
