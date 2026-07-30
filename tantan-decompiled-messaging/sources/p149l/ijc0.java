package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ijc0 {

    /* JADX INFO: renamed from: e */
    public static final Object f113537e = new Object();

    /* JADX INFO: renamed from: f */
    public static int f113538f;

    /* JADX INFO: renamed from: g */
    public static ijc0 f113539g;

    /* JADX INFO: renamed from: a */
    public ijc0 f113540a;

    /* JADX INFO: renamed from: b */
    public int f113541b = -1;

    /* JADX INFO: renamed from: c */
    public long f113542c = -1;

    /* JADX INFO: renamed from: d */
    public int f113543d;

    /* JADX INFO: renamed from: c */
    public static ijc0 m136587c() {
        synchronized (f113537e) {
            try {
                if (!NullChecker.m81303a(f113539g)) {
                    return new ijc0();
                }
                ijc0 ijc0Var = f113539g;
                f113539g = ijc0Var.f113540a;
                f113538f--;
                ijc0Var.f113540a = null;
                return ijc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public ijc0 m136588a(int i) {
        this.f113541b = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public long m136589b() {
        return this.f113542c;
    }

    /* JADX INFO: renamed from: d */
    public ijc0 m136590d(long j) {
        this.f113542c = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m136591e() {
        synchronized (f113537e) {
            try {
                int i = f113538f;
                if (i < 20) {
                    this.f113540a = f113539g;
                    f113539g = this;
                    f113538f = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public ijc0 m136592f(int i) {
        this.f113543d = i;
        return this;
    }
}
