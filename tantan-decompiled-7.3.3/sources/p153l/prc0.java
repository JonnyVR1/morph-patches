package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class prc0 {

    /* JADX INFO: renamed from: e */
    public static final Object f153745e = new Object();

    /* JADX INFO: renamed from: f */
    public static int f153746f;

    /* JADX INFO: renamed from: g */
    public static prc0 f153747g;

    /* JADX INFO: renamed from: a */
    public prc0 f153748a;

    /* JADX INFO: renamed from: b */
    public int f153749b = -1;

    /* JADX INFO: renamed from: c */
    public long f153750c = -1;

    /* JADX INFO: renamed from: d */
    public int f153751d;

    /* JADX INFO: renamed from: c */
    public static prc0 m173430c() {
        synchronized (f153745e) {
            try {
                if (!NullChecker.m82486a(f153747g)) {
                    return new prc0();
                }
                prc0 prc0Var = f153747g;
                f153747g = prc0Var.f153748a;
                f153746f--;
                prc0Var.f153748a = null;
                return prc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public prc0 m173431a(int i) {
        this.f153749b = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public long m173432b() {
        return this.f153750c;
    }

    /* JADX INFO: renamed from: d */
    public prc0 m173433d(long j) {
        this.f153750c = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m173434e() {
        synchronized (f153745e) {
            try {
                int i = f153746f;
                if (i < 20) {
                    this.f153748a = f153747g;
                    f153747g = this;
                    f153746f = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public prc0 m173435f(int i) {
        this.f153751d = i;
        return this;
    }
}
