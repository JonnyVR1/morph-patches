package p149l;

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class shw {

    /* JADX INFO: renamed from: a */
    private static Application f164651a = null;

    /* JADX INFO: renamed from: b */
    private static iiw f164652b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f164653c = true;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static xwm f164654d = null;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static p2m f164655e = null;

    /* JADX INFO: renamed from: f */
    private static rhw f164656f = null;

    /* JADX INFO: renamed from: g */
    private static boolean f164657g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f164658h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f164659i = false;

    /* JADX INFO: renamed from: A */
    public static void m184277A(boolean z) {
        f164657g = z;
    }

    /* JADX INFO: renamed from: C */
    public static void m184279C(boolean z) {
        f164653c = z;
    }

    /* JADX INFO: renamed from: D */
    public static String m184280D() {
        return m184290j() != null ? m184290j().mo105186a() : "";
    }

    /* JADX INFO: renamed from: a */
    public static String m184281a() {
        return System.currentTimeMillis() + "" + new Random(123456L).nextInt();
    }

    /* JADX INFO: renamed from: b */
    public static Application m184282b() {
        return f164651a;
    }

    /* JADX INFO: renamed from: c */
    public static Application m184283c() {
        return f164651a;
    }

    /* JADX INFO: renamed from: d */
    public static DisplayMetrics m184284d() {
        return m184289i().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: e */
    public static p1k m184285e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m184286f(String str) {
        try {
            p2m p2mVarM184294n = m184294n();
            return (p2mVarM184294n == null || !p2mVarM184294n.mo110234f()) ? new URL(str).getHost() : new URI(str).getHost();
        } catch (Exception e) {
            MDLog.m7391e("MKKit", e.getMessage());
            return "";
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static xwm m184287g() {
        return f164654d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m184288h() {
        return f164653c;
    }

    /* JADX INFO: renamed from: i */
    public static Resources m184289i() {
        return f164651a.getResources();
    }

    /* JADX INFO: renamed from: j */
    public static rhw m184290j() {
        return f164656f;
    }

    /* JADX INFO: renamed from: k */
    public static String m184291k() {
        iiw iiwVar = f164652b;
        if (iiwVar != null) {
            return iiwVar.mo136480a();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static String m184292l(Uri uri, String str) {
        try {
            List<String> queryParameters = uri.getQueryParameters(str);
            return queryParameters.size() > 0 ? queryParameters.get(0) : uri.getQueryParameter(str);
        } catch (Exception e) {
            MDLog.m7391e("MKKit", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static Resources m184293m() {
        return f164651a.getResources();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static p2m m184294n() {
        return f164655e;
    }

    /* JADX INFO: renamed from: o */
    public static void m184295o(Application application) {
        if (f164651a == null) {
            f164651a = application;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m184296p(xwm xwmVar) {
        if (xwmVar != null) {
            f164654d = xwmVar;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m184297q(rhw rhwVar) {
        if (rhwVar != null) {
            f164656f = rhwVar;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m184298r(iiw iiwVar) {
        f164652b = iiwVar;
    }

    /* JADX INFO: renamed from: s */
    public static void m184299s(p2m p2mVar) {
        if (p2mVar != null) {
            f164655e = p2mVar;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m184300t(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !str.contains("_bid=")) {
            return false;
        }
        String strTrim = scheme.trim();
        if (strTrim.equalsIgnoreCase("http") || strTrim.equalsIgnoreCase("https")) {
            return str.lastIndexOf(".jpg") > 0 || str.lastIndexOf(".jpeg") > 0 || str.lastIndexOf(".png") > 0 || str.lastIndexOf(".webp") > 0 || str.lastIndexOf(".gif") > 0 || str.lastIndexOf(".bmp") > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m184301u() {
        return f164657g;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m184302v() {
        if (m184290j() != null) {
            return m184290j().mo105187b();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m184303w() {
        return f164658h;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m184304x(String str) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static void m184305y() {
        try {
            ihw.INSTANCE.m136318o();
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKKit", th);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m184306z() {
        try {
            ihw.INSTANCE.m136317l();
            oiw.INSTANCE.m164574i();
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKKit", th);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m184278B(p1k p1kVar) {
    }
}
