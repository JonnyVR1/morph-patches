package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class po0 {

    /* JADX INFO: renamed from: f */
    public static final Object f150433f = new Object();

    /* JADX INFO: renamed from: g */
    public static int f150434g;

    /* JADX INFO: renamed from: h */
    public static po0 f150435h;

    /* JADX INFO: renamed from: a */
    public po0 f150436a;

    /* JADX INFO: renamed from: b */
    public long f150437b;

    /* JADX INFO: renamed from: c */
    public int f150438c;

    /* JADX INFO: renamed from: d */
    public int f150439d;

    /* JADX INFO: renamed from: e */
    public long f150440e;

    /* JADX INFO: renamed from: b */
    public static po0 m170476b() {
        synchronized (f150433f) {
            try {
                if (!NullChecker.m81303a(f150435h)) {
                    return new po0();
                }
                po0 po0Var = f150435h;
                f150435h = po0Var.f150436a;
                f150434g--;
                po0Var.f150436a = null;
                return po0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m170477a() {
        return this.f150437b > System.nanoTime();
    }

    /* JADX INFO: renamed from: c */
    public void m170478c() {
        synchronized (f150433f) {
            try {
                int i = f150434g;
                if (i < 20) {
                    this.f150436a = f150435h;
                    f150435h = this;
                    f150434g = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
