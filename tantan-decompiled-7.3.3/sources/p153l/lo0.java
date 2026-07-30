package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class lo0 {

    /* JADX INFO: renamed from: f */
    public static final Object f132860f = new Object();

    /* JADX INFO: renamed from: g */
    public static int f132861g;

    /* JADX INFO: renamed from: h */
    public static lo0 f132862h;

    /* JADX INFO: renamed from: a */
    public lo0 f132863a;

    /* JADX INFO: renamed from: b */
    public long f132864b;

    /* JADX INFO: renamed from: c */
    public int f132865c;

    /* JADX INFO: renamed from: d */
    public int f132866d;

    /* JADX INFO: renamed from: e */
    public long f132867e;

    /* JADX INFO: renamed from: b */
    public static lo0 m155034b() {
        synchronized (f132860f) {
            try {
                if (!NullChecker.m82486a(f132862h)) {
                    return new lo0();
                }
                lo0 lo0Var = f132862h;
                f132862h = lo0Var.f132863a;
                f132861g--;
                lo0Var.f132863a = null;
                return lo0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m155035a() {
        return this.f132864b > System.nanoTime();
    }

    /* JADX INFO: renamed from: c */
    public void m155036c() {
        synchronized (f132860f) {
            try {
                int i = f132861g;
                if (i < 20) {
                    this.f132863a = f132862h;
                    f132862h = this;
                    f132861g = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
