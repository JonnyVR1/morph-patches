package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.UUID;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class qzd {

    /* JADX INFO: renamed from: a */
    public static zqe0<Object, Object> f160242a = C22507a.m222758b().m205717a();

    /* JADX INFO: renamed from: b */
    public static String f160243b = null;

    /* JADX INFO: renamed from: c */
    public static String f160244c = null;

    /* JADX INFO: renamed from: d */
    public static String f160245d = null;

    /* JADX INFO: renamed from: e */
    public static String f160246e = null;

    /* JADX INFO: renamed from: f */
    public static String f160247f = null;

    /* JADX INFO: renamed from: g */
    public static String f160248g = null;

    /* JADX INFO: renamed from: h */
    public static String f160249h = null;

    /* JADX INFO: renamed from: i */
    public static String f160250i = null;

    /* JADX INFO: renamed from: j */
    public static String f160251j = null;

    /* JADX INFO: renamed from: k */
    public static String f160252k = null;

    /* JADX INFO: renamed from: l */
    public static String f160253l = null;

    /* JADX INFO: renamed from: m */
    public static String f160254m = null;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m178768a() {
        if (f160244c == null) {
            f160244c = UUID.nameUUIDFromBytes(m178769b().getBytes(jyb.f123125a)).toString();
        }
        if (f160244c == null) {
            f160244c = "";
        }
        return f160244c;
    }

    /* JADX INFO: renamed from: b */
    public static String m178769b() {
        if (f160243b == null) {
            m178770c();
        }
        return f160243b;
    }

    /* JADX INFO: renamed from: c */
    public static void m178770c() {
        if (f160243b == null) {
            f160243b = xn0.m212073a();
            f160242a.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m178771d() {
        if (f160245d == null) {
            f160245d = m178778k(-1);
        }
        return f160245d;
    }

    /* JADX INFO: renamed from: e */
    public static String m178772e() {
        if (f160246e == null) {
            f160246e = m178778k(0);
        }
        return f160246e;
    }

    /* JADX INFO: renamed from: f */
    public static String m178773f() {
        if (f160247f == null) {
            f160247f = m178778k(1);
        }
        return f160247f;
    }

    /* JADX INFO: renamed from: g */
    public static String m178774g() {
        if (f160248g == null) {
            f160248g = m178779l(-1);
        }
        return f160248g;
    }

    /* JADX INFO: renamed from: h */
    public static String m178775h() {
        if (f160249h == null) {
            f160249h = m178779l(0);
        }
        return f160249h;
    }

    /* JADX INFO: renamed from: i */
    public static String m178776i() {
        if (f160250i == null) {
            f160250i = m178779l(1);
        }
        return f160250i;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: j */
    public static String m178777j() {
        if (f160251j == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                f160251j = "";
            } else {
                f160251j = "";
            }
        }
        return f160251j;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public static String m178778k(int i) {
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public static String m178779l(int i) {
        return "";
    }
}
