package p002l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class po0 {

    /* JADX INFO: renamed from: f */
    public static final Object f17546f = new Object();

    /* JADX INFO: renamed from: g */
    public static int f17547g;

    /* JADX INFO: renamed from: h */
    public static po0 f17548h;

    /* JADX INFO: renamed from: a */
    public po0 f17549a;

    /* JADX INFO: renamed from: b */
    public long f17550b;

    /* JADX INFO: renamed from: c */
    public int f17551c;

    /* JADX INFO: renamed from: d */
    public int f17552d;

    /* JADX INFO: renamed from: e */
    public long f17553e;

    /* JADX INFO: renamed from: b */
    public static po0 m20515b() {
        synchronized (f17546f) {
            try {
                if (!NullChecker.a(f17548h)) {
                    return new po0();
                }
                po0 po0Var = f17548h;
                f17548h = po0Var.f17549a;
                f17547g--;
                po0Var.f17549a = null;
                return po0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m20516a() {
        return this.f17550b > System.nanoTime();
    }

    /* JADX INFO: renamed from: c */
    public void m20517c() {
        synchronized (f17546f) {
            try {
                int i = f17547g;
                if (i < 20) {
                    this.f17549a = f17548h;
                    f17548h = this;
                    f17547g = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
