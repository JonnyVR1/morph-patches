package p002l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ijc0 {

    /* JADX INFO: renamed from: e */
    public static final Object f13271e = new Object();

    /* JADX INFO: renamed from: f */
    public static int f13272f;

    /* JADX INFO: renamed from: g */
    public static ijc0 f13273g;

    /* JADX INFO: renamed from: a */
    public ijc0 f13274a;

    /* JADX INFO: renamed from: b */
    public int f13275b = -1;

    /* JADX INFO: renamed from: c */
    public long f13276c = -1;

    /* JADX INFO: renamed from: d */
    public int f13277d;

    /* JADX INFO: renamed from: c */
    public static ijc0 m15206c() {
        synchronized (f13271e) {
            try {
                if (!NullChecker.a(f13273g)) {
                    return new ijc0();
                }
                ijc0 ijc0Var = f13273g;
                f13273g = ijc0Var.f13274a;
                f13272f--;
                ijc0Var.f13274a = null;
                return ijc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public ijc0 m15207a(int i) {
        this.f13275b = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public long m15208b() {
        return this.f13276c;
    }

    /* JADX INFO: renamed from: d */
    public ijc0 m15209d(long j) {
        this.f13276c = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m15210e() {
        synchronized (f13271e) {
            try {
                int i = f13272f;
                if (i < 20) {
                    this.f13274a = f13273g;
                    f13273g = this;
                    f13272f = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public ijc0 m15211f(int i) {
        this.f13277d = i;
        return this;
    }
}
