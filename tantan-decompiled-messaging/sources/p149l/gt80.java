package p149l;

import com.p046p1.mobile.putong.core.p053ui.match.C8456b;

/* JADX INFO: loaded from: classes9.dex */
public class gt80 {

    /* JADX INFO: renamed from: g */
    public static gt80 f104255g;

    /* JADX INFO: renamed from: a */
    public boolean f104256a = false;

    /* JADX INFO: renamed from: b */
    public boolean f104257b = false;

    /* JADX INFO: renamed from: c */
    public boolean f104258c = false;

    /* JADX INFO: renamed from: d */
    public boolean f104259d = false;

    /* JADX INFO: renamed from: e */
    public boolean f104260e = false;

    /* JADX INFO: renamed from: f */
    public boolean f104261f = false;

    /* JADX INFO: renamed from: a */
    public static gt80 m127907a() {
        if (f104255g == null) {
            synchronized (C8456b.class) {
                try {
                    if (f104255g == null) {
                        f104255g = new gt80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f104255g;
    }

    /* JADX INFO: renamed from: b */
    public static void m127908b() {
        f104255g = null;
    }
}
