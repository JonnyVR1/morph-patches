package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class bi2 extends ai2 implements ib5 {

    /* JADX INFO: renamed from: i */
    public static boolean f76826i = false;

    /* JADX INFO: renamed from: d */
    public fb5<Bitmap> f76827d;

    /* JADX INFO: renamed from: e */
    public volatile Bitmap f76828e;

    /* JADX INFO: renamed from: f */
    public final qvb0 f76829f;

    /* JADX INFO: renamed from: g */
    public final int f76830g;

    /* JADX INFO: renamed from: h */
    public final int f76831h;

    public bi2(Bitmap bitmap, w4d0<Bitmap> w4d0Var, qvb0 qvb0Var, int i, int i2) {
        this.f76828e = (Bitmap) wn80.m207182g(bitmap);
        this.f76827d = fb5.m124867Z(this.f76828e, (w4d0) wn80.m207182g(w4d0Var));
        this.f76829f = qvb0Var;
        this.f76830g = i;
        this.f76831h = i2;
    }

    /* JADX INFO: renamed from: M */
    public static int m104384M(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* JADX INFO: renamed from: N */
    public static int m104385N(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m104386Q() {
        return f76826i;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized fb5<Bitmap> m104387J() {
        fb5<Bitmap> fb5Var;
        fb5Var = this.f76827d;
        this.f76827d = null;
        this.f76828e = null;
        return fb5Var;
    }

    @Override // p153l.ib5
    /* JADX INFO: renamed from: V */
    public int mo104388V() {
        return this.f76830g;
    }

    @Override // p153l.ai2, p153l.db5
    /* JADX INFO: renamed from: Y */
    public qvb0 mo97948Y() {
        return this.f76829f;
    }

    @Override // p153l.ab5
    /* JADX INFO: renamed from: b0 */
    public Bitmap mo96697b0() {
        return this.f76828e;
    }

    @Override // p153l.db5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fb5<Bitmap> fb5VarM104387J = m104387J();
        if (fb5VarM104387J != null) {
            fb5VarM104387J.close();
        }
    }

    @Override // p153l.db5, p153l.qim
    public int getHeight() {
        int i;
        return (this.f76830g % 180 != 0 || (i = this.f76831h) == 5 || i == 7) ? m104385N(this.f76828e) : m104384M(this.f76828e);
    }

    @Override // p153l.db5
    public int getSizeInBytes() {
        return j33.m143310i(this.f76828e);
    }

    @Override // p153l.db5, p153l.qim
    public int getWidth() {
        int i;
        return (this.f76830g % 180 != 0 || (i = this.f76831h) == 5 || i == 7) ? m104384M(this.f76828e) : m104385N(this.f76828e);
    }

    @Override // p153l.db5
    public synchronized boolean isClosed() {
        return this.f76827d == null;
    }

    @Override // p153l.ib5
    /* JADX INFO: renamed from: s */
    public synchronized fb5<Bitmap> mo104389s() {
        return fb5.m124872t(this.f76827d);
    }

    @Override // p153l.ib5
    /* JADX INFO: renamed from: x */
    public int mo104390x() {
        return this.f76831h;
    }

    public bi2(fb5<Bitmap> fb5Var, qvb0 qvb0Var, int i, int i2) {
        fb5<Bitmap> fb5Var2 = (fb5) wn80.m207182g(fb5Var.mo124879q());
        this.f76827d = fb5Var2;
        this.f76828e = fb5Var2.m124875B();
        this.f76829f = qvb0Var;
        this.f76830g = i;
        this.f76831h = i2;
    }
}
