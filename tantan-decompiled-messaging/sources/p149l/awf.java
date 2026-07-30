package p149l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class awf extends zz0 {

    /* JADX INFO: renamed from: i */
    public final Drawable[] f72039i;

    /* JADX INFO: renamed from: j */
    public final boolean f72040j;

    /* JADX INFO: renamed from: k */
    public final int f72041k;

    /* JADX INFO: renamed from: l */
    public final int f72042l;

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public int f72043m;

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public int f72044n;

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public long f72045o;

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public int[] f72046p;

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public int[] f72047q;

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public int f72048r;

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public boolean[] f72049s;

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public int f72050t;

    /* JADX INFO: renamed from: u */
    public xd50 f72051u;

    /* JADX INFO: renamed from: v */
    public boolean f72052v;

    /* JADX INFO: renamed from: w */
    public boolean f72053w;

    /* JADX INFO: renamed from: x */
    public boolean f72054x;

    public awf(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        this.f72054x = true;
        rf80.m179119j(drawableArr.length >= 1, "At least one layer required!");
        this.f72039i = drawableArr;
        this.f72046p = new int[drawableArr.length];
        this.f72047q = new int[drawableArr.length];
        this.f72048r = 255;
        this.f72049s = new boolean[drawableArr.length];
        this.f72050t = 0;
        this.f72040j = z;
        this.f72041k = z ? 255 : 0;
        this.f72042l = i;
        m99278t();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // p149l.zz0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zM99280v;
        Drawable[] drawableArr;
        int i = this.f72043m;
        int i2 = 0;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                rf80.m179118i(this.f72044n > 0);
                zM99280v = m99280v((m99274p() - this.f72045o) / this.f72044n);
                this.f72043m = zM99280v ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f72039i;
                if (i2 < drawableArr.length) {
                    break;
                }
                m99268g(canvas, drawableArr[i2], (int) Math.ceil(((double) (this.f72047q[i2] * this.f72048r)) / 255.0d));
                i2++;
            }
            if (z) {
                invalidateSelf();
            } else {
                m99275q();
                m99277s();
            }
        }
        System.arraycopy(this.f72047q, 0, this.f72046p, 0, this.f72039i.length);
        this.f72045o = m99274p();
        zM99280v = m99280v(this.f72044n == 0 ? 1.0f : 0.0f);
        m99276r();
        this.f72043m = zM99280v ? 2 : 1;
        z = zM99280v;
        while (true) {
            drawableArr = this.f72039i;
            if (i2 < drawableArr.length) {
                break;
                break;
            } else {
                m99268g(canvas, drawableArr[i2], (int) Math.ceil(((double) (this.f72047q[i2] * this.f72048r)) / 255.0d));
                i2++;
            }
        }
        if (z) {
            invalidateSelf();
        } else {
            m99275q();
            m99277s();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m99267f() {
        this.f72050t++;
    }

    /* JADX INFO: renamed from: g */
    public final void m99268g(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.f72050t++;
        if (this.f72054x) {
            drawable.mutate();
        }
        drawable.setAlpha(i);
        this.f72050t--;
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f72048r;
    }

    /* JADX INFO: renamed from: i */
    public void m99269i() {
        this.f72050t--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f72050t == 0) {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m99270k() {
        this.f72043m = 0;
        Arrays.fill(this.f72049s, true);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public void m99271m(int i) {
        this.f72043m = 0;
        this.f72049s[i] = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    public void m99272n(int i) {
        this.f72043m = 0;
        this.f72049s[i] = false;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public void m99273o() {
        this.f72043m = 2;
        for (int i = 0; i < this.f72039i.length; i++) {
            this.f72047q[i] = this.f72049s[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: p */
    public long m99274p() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: q */
    public final void m99275q() {
        if (this.f72052v) {
            this.f72052v = false;
            xd50 xd50Var = this.f72051u;
            if (xd50Var != null) {
                xd50Var.m208274a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m99276r() {
        int i;
        if (!this.f72052v && (i = this.f72042l) >= 0) {
            boolean[] zArr = this.f72049s;
            if (i < zArr.length && zArr[i]) {
                this.f72052v = true;
                xd50 xd50Var = this.f72051u;
                if (xd50Var != null) {
                    xd50Var.m208275b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m99277s() {
        if (this.f72053w && this.f72043m == 2 && this.f72049s[this.f72042l]) {
            xd50 xd50Var = this.f72051u;
            if (xd50Var != null) {
                xd50Var.m208276c();
            }
            this.f72053w = false;
        }
    }

    @Override // p149l.zz0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f72048r != i) {
            this.f72048r = i;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m99278t() {
        this.f72043m = 2;
        Arrays.fill(this.f72046p, this.f72041k);
        this.f72046p[0] = 255;
        Arrays.fill(this.f72047q, this.f72041k);
        this.f72047q[0] = 255;
        Arrays.fill(this.f72049s, this.f72040j);
        this.f72049s[0] = true;
    }

    /* JADX INFO: renamed from: u */
    public void m99279u(int i) {
        this.f72044n = i;
        if (this.f72043m == 1) {
            this.f72043m = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m99280v(float f) {
        boolean z = true;
        for (int i = 0; i < this.f72039i.length; i++) {
            boolean z2 = this.f72049s[i];
            int i2 = z2 ? 1 : -1;
            int[] iArr = this.f72047q;
            int i3 = (int) (this.f72046p[i] + (i2 * 255 * f));
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
