package p153l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class oxf extends g01 {

    /* JADX INFO: renamed from: i */
    public final Drawable[] f149647i;

    /* JADX INFO: renamed from: j */
    public final boolean f149648j;

    /* JADX INFO: renamed from: k */
    public final int f149649k;

    /* JADX INFO: renamed from: l */
    public final int f149650l;

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public int f149651m;

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public int f149652n;

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public long f149653o;

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public int[] f149654p;

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public int[] f149655q;

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public int f149656r;

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public boolean[] f149657s;

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public int f149658t;

    /* JADX INFO: renamed from: u */
    public em50 f149659u;

    /* JADX INFO: renamed from: v */
    public boolean f149660v;

    /* JADX INFO: renamed from: w */
    public boolean f149661w;

    /* JADX INFO: renamed from: x */
    public boolean f149662x;

    public oxf(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        this.f149662x = true;
        wn80.m207185j(drawableArr.length >= 1, "At least one layer required!");
        this.f149647i = drawableArr;
        this.f149654p = new int[drawableArr.length];
        this.f149655q = new int[drawableArr.length];
        this.f149656r = 255;
        this.f149657s = new boolean[drawableArr.length];
        this.f149658t = 0;
        this.f149648j = z;
        this.f149649k = z ? 255 : 0;
        this.f149650l = i;
        m169703t();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // p153l.g01, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zM169705v;
        Drawable[] drawableArr;
        int i = this.f149651m;
        int i2 = 0;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                wn80.m207184i(this.f149652n > 0);
                zM169705v = m169705v((m169699p() - this.f149653o) / this.f149652n);
                this.f149651m = zM169705v ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f149647i;
                if (i2 < drawableArr.length) {
                    break;
                }
                m169693g(canvas, drawableArr[i2], (int) Math.ceil(((double) (this.f149655q[i2] * this.f149656r)) / 255.0d));
                i2++;
            }
            if (z) {
                invalidateSelf();
            } else {
                m169700q();
                m169702s();
            }
        }
        System.arraycopy(this.f149655q, 0, this.f149654p, 0, this.f149647i.length);
        this.f149653o = m169699p();
        zM169705v = m169705v(this.f149652n == 0 ? 1.0f : 0.0f);
        m169701r();
        this.f149651m = zM169705v ? 2 : 1;
        z = zM169705v;
        while (true) {
            drawableArr = this.f149647i;
            if (i2 < drawableArr.length) {
                break;
                break;
            } else {
                m169693g(canvas, drawableArr[i2], (int) Math.ceil(((double) (this.f149655q[i2] * this.f149656r)) / 255.0d));
                i2++;
            }
        }
        if (z) {
            invalidateSelf();
        } else {
            m169700q();
            m169702s();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m169692f() {
        this.f149658t++;
    }

    /* JADX INFO: renamed from: g */
    public final void m169693g(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.f149658t++;
        if (this.f149662x) {
            drawable.mutate();
        }
        drawable.setAlpha(i);
        this.f149658t--;
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f149656r;
    }

    /* JADX INFO: renamed from: i */
    public void m169694i() {
        this.f149658t--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f149658t == 0) {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m169695k() {
        this.f149651m = 0;
        Arrays.fill(this.f149657s, true);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public void m169696m(int i) {
        this.f149651m = 0;
        this.f149657s[i] = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    public void m169697n(int i) {
        this.f149651m = 0;
        this.f149657s[i] = false;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public void m169698o() {
        this.f149651m = 2;
        for (int i = 0; i < this.f149647i.length; i++) {
            this.f149655q[i] = this.f149657s[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: p */
    public long m169699p() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: q */
    public final void m169700q() {
        if (this.f149660v) {
            this.f149660v = false;
            em50 em50Var = this.f149659u;
            if (em50Var != null) {
                em50Var.m121331a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m169701r() {
        int i;
        if (!this.f149660v && (i = this.f149650l) >= 0) {
            boolean[] zArr = this.f149657s;
            if (i < zArr.length && zArr[i]) {
                this.f149660v = true;
                em50 em50Var = this.f149659u;
                if (em50Var != null) {
                    em50Var.m121332b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m169702s() {
        if (this.f149661w && this.f149651m == 2 && this.f149657s[this.f149650l]) {
            em50 em50Var = this.f149659u;
            if (em50Var != null) {
                em50Var.m121333c();
            }
            this.f149661w = false;
        }
    }

    @Override // p153l.g01, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f149656r != i) {
            this.f149656r = i;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m169703t() {
        this.f149651m = 2;
        Arrays.fill(this.f149654p, this.f149649k);
        this.f149654p[0] = 255;
        Arrays.fill(this.f149655q, this.f149649k);
        this.f149655q[0] = 255;
        Arrays.fill(this.f149657s, this.f149648j);
        this.f149657s[0] = true;
    }

    /* JADX INFO: renamed from: u */
    public void m169704u(int i) {
        this.f149652n = i;
        if (this.f149651m == 1) {
            this.f149651m = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m169705v(float f) {
        boolean z = true;
        for (int i = 0; i < this.f149647i.length; i++) {
            boolean z2 = this.f149657s[i];
            int i2 = z2 ? 1 : -1;
            int[] iArr = this.f149655q;
            int i3 = (int) (this.f149654p[i] + (i2 * 255 * f));
            iArr[i] = i3;
            if (i3 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }
}
