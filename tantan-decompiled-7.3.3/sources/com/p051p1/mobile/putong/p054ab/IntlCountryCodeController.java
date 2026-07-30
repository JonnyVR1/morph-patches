package com.p051p1.mobile.putong.p054ab;

import android.text.TextUtils;
import com.core.glcore.util.DetectDelayStopHelper;
import com.google.common.primitives.Ints;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.geocoding.Geocoder;
import com.p051p1.mobile.android.geocoding.Geocoding;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import p153l.qcj;
import p153l.tu2;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public final class IntlCountryCodeController {

    /* JADX INFO: renamed from: a */
    public static final int[] f16730a = {43, 32, 359, 357, UnixStat.DEFAULT_FILE_PERM, 45, 372, 358, 33, 49, 30, 36, 385, 39, 353, 371, 370, 352, 356, 31, 48, 351, 40, 421, 386, 34, 46, 44, 350, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f16731b = {232, 206, 284, 280, 230, 238, 248, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 208, 262, 202, 216, 219, 222, 272, 247, 246, 270, 278, 204, 260, 268, 226, 231, 293, 214, 240, 234, 266, 310, 311, 316};

    /* JADX INFO: renamed from: c */
    public static final int[] f16732c = {310, 311, 312, 313, 314, 315, 316, 234, 235};

    /* JADX INFO: renamed from: d */
    public static final int[] f16733d = {310, 311, 312, 313, 314, 315, 316};

    /* JADX INFO: renamed from: e */
    public static boolean f16734e = false;

    /* JADX INFO: renamed from: f */
    public static final String[] f16735f = {"zh", "ja", "ko"};

    /* JADX INFO: renamed from: g */
    public static final String[] f16736g = {"th", "in"};

    /* JADX INFO: renamed from: h */
    public static final int[] f16737h = {460, 454, 455, 466, 428, 440, 450, 467, HttpStatus.BAD_GATEWAY_502, 525};

    /* JADX INFO: renamed from: i */
    public static final int[] f16738i = {528, 456, 514, 510, 457, HttpStatus.REQUEST_URI_TOO_LONG_414, 515, 520, 452};

    /* JADX INFO: renamed from: j */
    public static final int[] f16739j = {404, 410, 470, HttpStatus.REQUEST_ENTITY_TOO_LARGE_413, 429, 402, 472, HttpStatus.PRECONDITION_FAILED_412};

    /* JADX INFO: renamed from: k */
    public static final int[] f16740k = {404, HttpStatus.METHOD_NOT_ALLOWED_405, HttpStatus.NOT_ACCEPTABLE_406};

    /* JADX INFO: renamed from: l */
    public static final int[] f16741l = {466};

    /* JADX INFO: renamed from: m */
    public static final int[] f16742m = {454};

    /* JADX INFO: renamed from: n */
    public static final int[] f16743n = {455};

    /* JADX INFO: renamed from: o */
    public static final int[] f16744o = {440, 441};

    /* JADX INFO: renamed from: p */
    public static final int[] f16745p = {450};

    /* JADX INFO: renamed from: q */
    public static final int[] f16746q = {310, 311, 312, 313, 314, 315, 316, 330, 332, 234, 235, 266, 346, 348, 350, 354, 376, DetectDelayStopHelper.TYPE_DETECT_PICKNOISE, 302, HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505, 530, 548};

    /* JADX INFO: renamed from: r */
    public static boolean f16747r = false;

    /* JADX INFO: renamed from: s */
    public static boolean f16748s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f16749t = false;

    /* JADX INFO: renamed from: u */
    public static boolean f16750u = false;

    /* JADX INFO: renamed from: v */
    public static boolean f16751v = false;

    public enum ModelRegion {
        EA,
        SEA,
        SA,
        OTHER
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m29104a(Location location) {
        Geocoding.Country country = new Geocoder(App.f16088e).getCountry((float) location.m80014u(), (float) location.m80016x());
        return country == null ? "Unknown" : country.getIso();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m29105b(String str) {
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
                f16734e = true;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ModelRegion m29106c() {
        String language = Locale.getDefault().getLanguage();
        int i = uqb0.f180400f0;
        if (Arrays.asList(f16735f).contains(language)) {
            return ModelRegion.EA;
        }
        if (Arrays.asList(f16736g).contains(language)) {
            return ModelRegion.SEA;
        }
        if (Ints.m16513c(f16737h).contains(Integer.valueOf(i))) {
            return ModelRegion.EA;
        }
        if (Ints.m16513c(f16738i).contains(Integer.valueOf(i))) {
            return ModelRegion.SEA;
        }
        return Ints.m16513c(f16739j).contains(Integer.valueOf(i)) ? ModelRegion.SA : ModelRegion.OTHER;
    }

    /* JADX INFO: renamed from: d */
    public static String m29107d(int i) {
        if (Ints.m16513c(f16731b).contains(Integer.valueOf(i))) {
            return "EUROPEAN";
        }
        if (Ints.m16513c(f16733d).contains(Integer.valueOf(i))) {
            return "US";
        }
        if (Ints.m16513c(f16742m).contains(Integer.valueOf(i))) {
            return "HONGKONG";
        }
        if (Ints.m16513c(f16743n).contains(Integer.valueOf(i))) {
            return "AOMEN";
        }
        if (Ints.m16513c(f16741l).contains(Integer.valueOf(i))) {
            return "TAIWAN";
        }
        if (Ints.m16513c(f16740k).contains(Integer.valueOf(i))) {
            return "IND";
        }
        if (Ints.m16513c(f16744o).contains(Integer.valueOf(i))) {
            return "JAPAN";
        }
        if (Ints.m16513c(f16745p).contains(Integer.valueOf(i))) {
            return "KOREA";
        }
        if (Ints.m16513c(f16737h).contains(Integer.valueOf(i))) {
            return "EA";
        }
        if (Ints.m16513c(f16738i).contains(Integer.valueOf(i))) {
            return "SEA";
        }
        return Ints.m16513c(f16739j).contains(Integer.valueOf(i)) ? "SA" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: e */
    public static void m29108e() {
        if (Ints.m16513c(f16733d).contains(Integer.valueOf(uqb0.f180400f0))) {
            f16734e = true;
        } else {
            uqb0.f180370E.m80047p().take(1).map(new qcj() { // from class: l.s8n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlCountryCodeController.m29104a((Location) obj);
                }
            }).doOnNext(new y20() { // from class: l.t8n
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlCountryCodeController.m29105b((String) obj);
                }
            }).materialize().subscribe();
        }
        if (Ints.m16513c(f16731b).contains(Integer.valueOf(uqb0.f180400f0))) {
            m29129z(true);
        }
        if (Ints.m16513c(f16732c).contains(Integer.valueOf(uqb0.f180400f0))) {
            m29128y(true);
        }
        if (Ints.m16513c(f16740k).contains(Integer.valueOf(uqb0.f180400f0))) {
            f16749t = true;
        }
        if (Ints.m16513c(f16744o).contains(Integer.valueOf(uqb0.f180400f0))) {
            f16750u = true;
        }
        if (Ints.m16513c(f16741l).contains(Integer.valueOf(uqb0.f180400f0))) {
            f16751v = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m29109f() {
        return f16748s;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m29110g() {
        return Ints.m16513c(f16744o).contains(Integer.valueOf(uqb0.f180400f0)) || Ints.m16513c(f16745p).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m29111h(int i) {
        return Ints.m16513c(f16730a).contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m29112i() {
        return f16747r;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m29113j() {
        return Ints.m16513c(f16746q).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m29114k() {
        return TextUtils.equals("hms", "gms");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m29115l() {
        return f16749t;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m29116m() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m29117n() {
        return f16750u;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m29118o() {
        return Ints.m16513c(f16744o).contains(Integer.valueOf(uqb0.f180400f0)) || Ints.m16513c(f16745p).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m29119p() {
        return (uqb0.f180400f0 == 0 && "ko".equals(Locale.getDefault().getLanguage()) && "KR".equals(Locale.getDefault().getCountry())) || Ints.m16513c(f16745p).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m29120q() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m29121r() {
        return (Ints.m16513c(f16740k).contains(Integer.valueOf(uqb0.f180400f0)) || Ints.m16513c(f16741l).contains(Integer.valueOf(uqb0.f180400f0)) || Ints.m16513c(f16744o).contains(Integer.valueOf(uqb0.f180400f0))) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m29122s() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m29123t() {
        return m29114k() && uqb0.f180400f0 == 250;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m29124u() {
        return f16751v;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m29125v() {
        return f16734e;
    }

    /* JADX INFO: renamed from: w */
    public static void m29126w() {
        f16748s = Ints.m16513c(f16732c).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: x */
    public static void m29127x() {
        f16747r = Ints.m16513c(f16731b).contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: y */
    public static void m29128y(boolean z) {
        tu2.m192703a("[putong-common][location]", "setBSGroup isBritishSystem = " + f16748s + ", isBS = " + z);
        if (f16748s) {
            return;
        }
        f16748s = z;
    }

    /* JADX INFO: renamed from: z */
    public static void m29129z(boolean z) {
        tu2.m192703a("[putong-common][location]", "setIsEuropeanUnion isEuropeanUnion = " + f16747r + ", isEU = " + z);
        if (f16747r) {
            return;
        }
        f16747r = z;
    }
}
