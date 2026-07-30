package p009l;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.UUID;
import l.uie0;
import l.vwb;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dyd {

    /* JADX INFO: renamed from: a */
    public static uie0<Object, Object> f12047a = a.b().a();

    /* JADX INFO: renamed from: b */
    public static String f12048b = null;

    /* JADX INFO: renamed from: c */
    public static String f12049c = null;

    /* JADX INFO: renamed from: d */
    public static String f12050d = null;

    /* JADX INFO: renamed from: e */
    public static String f12051e = null;

    /* JADX INFO: renamed from: f */
    public static String f12052f = null;

    /* JADX INFO: renamed from: g */
    public static String f12053g = null;

    /* JADX INFO: renamed from: h */
    public static String f12054h = null;

    /* JADX INFO: renamed from: i */
    public static String f12055i = null;

    /* JADX INFO: renamed from: j */
    public static String f12056j = null;

    /* JADX INFO: renamed from: k */
    public static String f12057k = null;

    /* JADX INFO: renamed from: l */
    public static String f12058l = null;

    /* JADX INFO: renamed from: m */
    public static String f12059m = null;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m13507a() {
        if (f12049c == null) {
            f12049c = UUID.nameUUIDFromBytes(m13508b().getBytes(vwb.a)).toString();
        }
        if (f12049c == null) {
            f12049c = "";
        }
        return f12049c;
    }

    /* JADX INFO: renamed from: b */
    public static String m13508b() {
        if (f12048b == null) {
            m13509c();
        }
        return f12048b;
    }

    /* JADX INFO: renamed from: c */
    public static void m13509c() {
        if (f12048b == null) {
            f12048b = bo0.m12179a();
            f12047a.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m13510d() {
        if (f12050d == null) {
            f12050d = m13517k(-1);
        }
        return f12050d;
    }

    /* JADX INFO: renamed from: e */
    public static String m13511e() {
        if (f12051e == null) {
            f12051e = m13517k(0);
        }
        return f12051e;
    }

    /* JADX INFO: renamed from: f */
    public static String m13512f() {
        if (f12052f == null) {
            f12052f = m13517k(1);
        }
        return f12052f;
    }

    /* JADX INFO: renamed from: g */
    public static String m13513g() {
        if (f12053g == null) {
            f12053g = m13518l(-1);
        }
        return f12053g;
    }

    /* JADX INFO: renamed from: h */
    public static String m13514h() {
        if (f12054h == null) {
            f12054h = m13518l(0);
        }
        return f12054h;
    }

    /* JADX INFO: renamed from: i */
    public static String m13515i() {
        if (f12055i == null) {
            f12055i = m13518l(1);
        }
        return f12055i;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: j */
    public static String m13516j() {
        if (f12056j == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                f12056j = "";
            } else {
                f12056j = "";
            }
        }
        return f12056j;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public static String m13517k(int i) {
        return "";
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l */
    public static String m13518l(int i) {
        return "";
    }
}
