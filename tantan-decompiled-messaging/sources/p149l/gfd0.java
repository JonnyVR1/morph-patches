package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class gfd0 extends Drawable implements yed0, m7j0 {

    /* JADX INFO: renamed from: C */
    @Nullable
    public n7j0 f102361C;

    /* JADX INFO: renamed from: a */
    public final Drawable f102362a;

    /* JADX INFO: renamed from: k */
    @Nullable
    @VisibleForTesting
    public float[] f102372k;

    /* JADX INFO: renamed from: p */
    @Nullable
    @VisibleForTesting
    public RectF f102377p;

    /* JADX INFO: renamed from: v */
    @Nullable
    @VisibleForTesting
    public Matrix f102383v;

    /* JADX INFO: renamed from: w */
    @Nullable
    @VisibleForTesting
    public Matrix f102384w;

    /* JADX INFO: renamed from: b */
    public boolean f102363b = false;

    /* JADX INFO: renamed from: c */
    public boolean f102364c = false;

    /* JADX INFO: renamed from: d */
    public float f102365d = 0.0f;

    /* JADX INFO: renamed from: e */
    public final Path f102366e = new Path();

    /* JADX INFO: renamed from: f */
    public boolean f102367f = true;

    /* JADX INFO: renamed from: g */
    public int f102368g = 0;

    /* JADX INFO: renamed from: h */
    public final Path f102369h = new Path();

    /* JADX INFO: renamed from: i */
    public final float[] f102370i = new float[8];

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final float[] f102371j = new float[8];

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public final RectF f102373l = new RectF();

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public final RectF f102374m = new RectF();

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public final RectF f102375n = new RectF();

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public final RectF f102376o = new RectF();

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public final Matrix f102378q = new Matrix();

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public final Matrix f102379r = new Matrix();

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public final Matrix f102380s = new Matrix();

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public final Matrix f102381t = new Matrix();

    /* JADX INFO: renamed from: u */
    @VisibleForTesting
    public final Matrix f102382u = new Matrix();

    /* JADX INFO: renamed from: x */
    @VisibleForTesting
    public final Matrix f102385x = new Matrix();

    /* JADX INFO: renamed from: y */
    public float f102386y = 0.0f;

    /* JADX INFO: renamed from: z */
    public boolean f102387z = false;

    /* JADX INFO: renamed from: A */
    public boolean f102359A = false;

    /* JADX INFO: renamed from: B */
    public boolean f102360B = true;

    public gfd0(Drawable drawable) {
        this.f102362a = drawable;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Matrix m125882d(@Nullable Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m125883i(@Nullable Matrix matrix, @Nullable Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: a */
    public void mo8237a(boolean z) {
        this.f102363b = z;
        this.f102360B = true;
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: b */
    public void mo8238b(float f) {
        rf80.m179118i(f >= 0.0f);
        Arrays.fill(this.f102370i, f);
        this.f102364c = f != 0.0f;
        this.f102360B = true;
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: c */
    public void mo8239c(int i, float f) {
        if (this.f102368g == i && this.f102365d == f) {
            return;
        }
        this.f102368g = i;
        this.f102365d = f;
        this.f102360B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f102362a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (o6j.m162852d()) {
            o6j.m162850a("RoundedDrawable#draw");
        }
        this.f102362a.draw(canvas);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: e */
    public void mo8240e(float f) {
        if (this.f102386y != f) {
            this.f102386y = f;
            this.f102360B = true;
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: g */
    public void mo8242g(boolean z) {
        if (this.f102359A != z) {
            this.f102359A = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.f102362a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.f102362a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f102362a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f102362a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f102362a.getOpacity();
    }

    /* JADX INFO: renamed from: h */
    public boolean m125884h() {
        return this.f102359A;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public boolean mo125885j() {
        return this.f102363b || this.f102364c || this.f102365d > 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public void m125886k() {
        float[] fArr;
        if (this.f102360B) {
            this.f102369h.reset();
            RectF rectF = this.f102373l;
            float f = this.f102365d;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f102363b) {
                this.f102369h.addCircle(this.f102373l.centerX(), this.f102373l.centerY(), Math.min(this.f102373l.width(), this.f102373l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f102371j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f102370i[i] + this.f102386y) - (this.f102365d / 2.0f);
                    i++;
                }
                this.f102369h.addRoundRect(this.f102373l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f102373l;
            float f2 = this.f102365d;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f102366e.reset();
            float f3 = this.f102386y + (this.f102387z ? this.f102365d : 0.0f);
            this.f102373l.inset(f3, f3);
            if (this.f102363b) {
                this.f102366e.addCircle(this.f102373l.centerX(), this.f102373l.centerY(), Math.min(this.f102373l.width(), this.f102373l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f102387z) {
                if (this.f102372k == null) {
                    this.f102372k = new float[8];
                }
                for (int i2 = 0; i2 < this.f102371j.length; i2++) {
                    this.f102372k[i2] = this.f102370i[i2] - this.f102365d;
                }
                this.f102366e.addRoundRect(this.f102373l, this.f102372k, Path.Direction.CW);
            } else {
                this.f102366e.addRoundRect(this.f102373l, this.f102370i, Path.Direction.CW);
            }
            float f4 = -f3;
            this.f102373l.inset(f4, f4);
            this.f102366e.setFillType(Path.FillType.WINDING);
            this.f102360B = false;
        }
    }

    @Override // p149l.m7j0
    /* JADX INFO: renamed from: l */
    public void mo125887l(@Nullable n7j0 n7j0Var) {
        this.f102361C = n7j0Var;
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: m */
    public void mo8243m(boolean z) {
        if (this.f102387z != z) {
            this.f102387z = z;
            this.f102360B = true;
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: n */
    public void mo8244n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f102370i, 0.0f);
            this.f102364c = false;
        } else {
            rf80.m179112c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f102370i, 0, 8);
            this.f102364c = false;
            for (int i = 0; i < 8; i++) {
                this.f102364c |= fArr[i] > 0.0f;
            }
        }
        this.f102360B = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public void mo125888o() {
        Matrix matrix;
        Matrix matrix2;
        n7j0 n7j0Var = this.f102361C;
        Matrix matrix3 = this.f102380s;
        if (n7j0Var != null) {
            n7j0Var.mo158146j(matrix3);
            this.f102361C.mo158145h(this.f102373l);
        } else {
            matrix3.reset();
            this.f102373l.set(getBounds());
        }
        this.f102375n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f102376o.set(this.f102362a.getBounds());
        Matrix matrix4 = this.f102378q;
        RectF rectF = this.f102375n;
        RectF rectF2 = this.f102376o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix4.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f102387z) {
            RectF rectF3 = this.f102377p;
            if (rectF3 == null) {
                this.f102377p = new RectF(this.f102373l);
            } else {
                rectF3.set(this.f102373l);
            }
            RectF rectF4 = this.f102377p;
            float f = this.f102365d;
            rectF4.inset(f, f);
            if (this.f102383v == null) {
                this.f102383v = new Matrix();
            }
            this.f102383v.setRectToRect(this.f102373l, this.f102377p, scaleToFit);
        } else {
            Matrix matrix5 = this.f102383v;
            if (matrix5 != null) {
                matrix5.reset();
            }
        }
        if (!this.f102380s.equals(this.f102381t) || !this.f102378q.equals(this.f102379r) || ((matrix2 = this.f102383v) != null && !m125883i(matrix2, this.f102384w))) {
            this.f102367f = true;
            this.f102380s.invert(this.f102382u);
            this.f102385x.set(this.f102380s);
            if (this.f102387z && (matrix = this.f102383v) != null) {
                this.f102385x.postConcat(matrix);
            }
            this.f102385x.preConcat(this.f102378q);
            this.f102381t.set(this.f102380s);
            this.f102379r.set(this.f102378q);
            boolean z = this.f102387z;
            Matrix matrix6 = this.f102384w;
            if (z) {
                Matrix matrix7 = this.f102383v;
                if (matrix6 == null) {
                    this.f102384w = m125882d(matrix7);
                } else {
                    matrix6.set(matrix7);
                }
            } else if (matrix6 != null) {
                matrix6.reset();
            }
        }
        if (this.f102373l.equals(this.f102374m)) {
            return;
        }
        this.f102360B = true;
        this.f102374m.set(this.f102373l);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f102362a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f102362a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f102362a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f102362a.setColorFilter(colorFilter);
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: f */
    public void mo8241f(boolean z) {
    }
}
