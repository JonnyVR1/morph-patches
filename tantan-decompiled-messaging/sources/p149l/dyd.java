package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.UUID;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class dyd {

    /* JADX INFO: renamed from: a */
    public static uie0<Object, Object> f88364a = C22392a.m221512b().m167245a();

    /* JADX INFO: renamed from: b */
    public static String f88365b = null;

    /* JADX INFO: renamed from: c */
    public static String f88366c = null;

    /* JADX INFO: renamed from: d */
    public static String f88367d = null;

    /* JADX INFO: renamed from: e */
    public static String f88368e = null;

    /* JADX INFO: renamed from: f */
    public static String f88369f = null;

    /* JADX INFO: renamed from: g */
    public static String f88370g = null;

    /* JADX INFO: renamed from: h */
    public static String f88371h = null;

    /* JADX INFO: renamed from: i */
    public static String f88372i = null;

    /* JADX INFO: renamed from: j */
    public static String f88373j = null;

    /* JADX INFO: renamed from: k */
    public static String f88374k = null;

    /* JADX INFO: renamed from: l */
    public static String f88375l = null;

    /* JADX INFO: renamed from: m */
    public static String f88376m = null;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m114055a() {
        if (f88366c == null) {
            f88366c = UUID.nameUUIDFromBytes(m114056b().getBytes(vwb.f183321a)).toString();
        }
        if (f88366c == null) {
            f88366c = "";
        }
        return f88366c;
    }

    /* JADX INFO: renamed from: b */
    public static String m114056b() {
        if (f88365b == null) {
            m114057c();
        }
        return f88365b;
    }

    /* JADX INFO: renamed from: c */
    public static void m114057c() {
        if (f88365b == null) {
            f88365b = bo0.m102888a();
            f88364a.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m114058d() {
        if (f88367d == null) {
            f88367d = m114065k(-1);
        }
        return f88367d;
    }

    /* JADX INFO: renamed from: e */
    public static String m114059e() {
        if (f88368e == null) {
            f88368e = m114065k(0);
        }
        return f88368e;
    }

    /* JADX INFO: renamed from: f */
    public static String m114060f() {
        if (f88369f == null) {
            f88369f = m114065k(1);
        }
        return f88369f;
    }

    /* JADX INFO: renamed from: g */
    public static String m114061g() {
        if (f88370g == null) {
            f88370g = m114066l(-1);
        }
        return f88370g;
    }

    /* JADX INFO: renamed from: h */
    public static String m114062h() {
        if (f88371h == null) {
            f88371h = m114066l(0);
        }
        return f88371h;
    }

    /* JADX INFO: renamed from: i */
    public static String m114063i() {
        if (f88372i == null) {
            f88372i = m114066l(1);
        }
        return f88372i;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: j */
    public static String m114064j() {
        if (f88373j == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                f88373j = "";
            } else {
                f88373j = "";
            }
        }
        return f88373j;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public static String m114065k(int i) {
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public static String m114066l(int i) {
        return "";
    }
}
