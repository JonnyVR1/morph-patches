package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class uh2 extends th2 implements ia5 {

    /* JADX INFO: renamed from: i */
    public static boolean f176473i = false;

    /* JADX INFO: renamed from: d */
    public fa5<Bitmap> f176474d;

    /* JADX INFO: renamed from: e */
    public volatile Bitmap f176475e;

    /* JADX INFO: renamed from: f */
    public final mnb0 f176476f;

    /* JADX INFO: renamed from: g */
    public final int f176477g;

    /* JADX INFO: renamed from: h */
    public final int f176478h;

    public uh2(Bitmap bitmap, twc0<Bitmap> twc0Var, mnb0 mnb0Var, int i, int i2) {
        this.f176475e = (Bitmap) rf80.m179116g(bitmap);
        this.f176474d = fa5.m120147Y(this.f176475e, (twc0) rf80.m179116g(twc0Var));
        this.f176476f = mnb0Var;
        this.f176477g = i;
        this.f176478h = i2;
    }

    /* JADX INFO: renamed from: M */
    public static int m193607M(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* JADX INFO: renamed from: N */
    public static int m193608N(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m193609Q() {
        return f176473i;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized fa5<Bitmap> m193610J() {
        fa5<Bitmap> fa5Var;
        fa5Var = this.f176474d;
        this.f176474d = null;
        this.f176475e = null;
        return fa5Var;
    }

    @Override // p149l.ia5
    /* JADX INFO: renamed from: U */
    public int mo135132U() {
        return this.f176477g;
    }

    @Override // p149l.th2, p149l.da5
    /* JADX INFO: renamed from: X */
    public mnb0 mo110565X() {
        return this.f176476f;
    }

    @Override // p149l.aa5
    /* JADX INFO: renamed from: a0 */
    public Bitmap mo95529a0() {
        return this.f176475e;
    }

    @Override // p149l.da5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fa5<Bitmap> fa5VarM193610J = m193610J();
        if (fa5VarM193610J != null) {
            fa5VarM193610J.close();
        }
    }

    @Override // p149l.da5, p149l.ngm
    public int getHeight() {
        int i;
        return (this.f176477g % 180 != 0 || (i = this.f176478h) == 5 || i == 7) ? m193608N(this.f176475e) : m193607M(this.f176475e);
    }

    @Override // p149l.da5
    public int getSizeInBytes() {
        return t23.m186960i(this.f176475e);
    }

    @Override // p149l.da5, p149l.ngm
    public int getWidth() {
        int i;
        return (this.f176477g % 180 != 0 || (i = this.f176478h) == 5 || i == 7) ? m193607M(this.f176475e) : m193608N(this.f176475e);
    }

    @Override // p149l.da5
    public synchronized boolean isClosed() {
        return this.f176474d == null;
    }

    @Override // p149l.ia5
    /* JADX INFO: renamed from: s */
    public synchronized fa5<Bitmap> mo135133s() {
        return fa5.m120152t(this.f176474d);
    }

    @Override // p149l.ia5
    /* JADX INFO: renamed from: x */
    public int mo135134x() {
        return this.f176478h;
    }

    public uh2(fa5<Bitmap> fa5Var, mnb0 mnb0Var, int i, int i2) {
        fa5<Bitmap> fa5Var2 = (fa5) rf80.m179116g(fa5Var.mo120158q());
        this.f176474d = fa5Var2;
        this.f176475e = fa5Var2.m120155B();
        this.f176476f = mnb0Var;
        this.f176477g = i;
        this.f176478h = i2;
    }
}
