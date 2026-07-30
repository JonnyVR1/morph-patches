package p006l;

import com.p1.mobile.putong.core.ui.match.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gt80 {

    /* JADX INFO: renamed from: g */
    public static gt80 f13484g;

    /* JADX INFO: renamed from: a */
    public boolean f13485a = false;

    /* JADX INFO: renamed from: b */
    public boolean f13486b = false;

    /* JADX INFO: renamed from: c */
    public boolean f13487c = false;

    /* JADX INFO: renamed from: d */
    public boolean f13488d = false;

    /* JADX INFO: renamed from: e */
    public boolean f13489e = false;

    /* JADX INFO: renamed from: f */
    public boolean f13490f = false;

    /* JADX INFO: renamed from: a */
    public static gt80 m15969a() {
        if (f13484g == null) {
            synchronized (b.class) {
                try {
                    if (f13484g == null) {
                        f13484g = new gt80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13484g;
    }

    /* JADX INFO: renamed from: b */
    public static void m15970b() {
        f13484g = null;
    }
}
