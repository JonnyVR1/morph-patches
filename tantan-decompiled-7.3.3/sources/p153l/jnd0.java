package p153l;

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
public abstract class jnd0 extends Drawable implements and0, qgj0 {

    /* JADX INFO: renamed from: C */
    @Nullable
    public rgj0 f121805C;

    /* JADX INFO: renamed from: a */
    public final Drawable f121806a;

    /* JADX INFO: renamed from: k */
    @Nullable
    @VisibleForTesting
    public float[] f121816k;

    /* JADX INFO: renamed from: p */
    @Nullable
    @VisibleForTesting
    public RectF f121821p;

    /* JADX INFO: renamed from: v */
    @Nullable
    @VisibleForTesting
    public Matrix f121827v;

    /* JADX INFO: renamed from: w */
    @Nullable
    @VisibleForTesting
    public Matrix f121828w;

    /* JADX INFO: renamed from: b */
    public boolean f121807b = false;

    /* JADX INFO: renamed from: c */
    public boolean f121808c = false;

    /* JADX INFO: renamed from: d */
    public float f121809d = 0.0f;

    /* JADX INFO: renamed from: e */
    public final Path f121810e = new Path();

    /* JADX INFO: renamed from: f */
    public boolean f121811f = true;

    /* JADX INFO: renamed from: g */
    public int f121812g = 0;

    /* JADX INFO: renamed from: h */
    public final Path f121813h = new Path();

    /* JADX INFO: renamed from: i */
    public final float[] f121814i = new float[8];

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final float[] f121815j = new float[8];

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public final RectF f121817l = new RectF();

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public final RectF f121818m = new RectF();

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public final RectF f121819n = new RectF();

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public final RectF f121820o = new RectF();

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public final Matrix f121822q = new Matrix();

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public final Matrix f121823r = new Matrix();

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public final Matrix f121824s = new Matrix();

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public final Matrix f121825t = new Matrix();

    /* JADX INFO: renamed from: u */
    @VisibleForTesting
    public final Matrix f121826u = new Matrix();

    /* JADX INFO: renamed from: x */
    @VisibleForTesting
    public final Matrix f121829x = new Matrix();

    /* JADX INFO: renamed from: y */
    public float f121830y = 0.0f;

    /* JADX INFO: renamed from: z */
    public boolean f121831z = false;

    /* JADX INFO: renamed from: A */
    public boolean f121803A = false;

    /* JADX INFO: renamed from: B */
    public boolean f121804B = true;

    public jnd0(Drawable drawable) {
        this.f121806a = drawable;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Matrix m146234d(@Nullable Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m146235i(@Nullable Matrix matrix, @Nullable Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: a */
    public void mo8291a(boolean z) {
        this.f121807b = z;
        this.f121804B = true;
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: b */
    public void mo8292b(float f) {
        wn80.m207184i(f >= 0.0f);
        Arrays.fill(this.f121814i, f);
        this.f121808c = f != 0.0f;
        this.f121804B = true;
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: c */
    public void mo8293c(int i, float f) {
        if (this.f121812g == i && this.f121809d == f) {
            return;
        }
        this.f121812g = i;
        this.f121809d = f;
        this.f121804B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f121806a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (i9j.m139099d()) {
            i9j.m139097a("RoundedDrawable#draw");
        }
        this.f121806a.draw(canvas);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: e */
    public void mo8294e(float f) {
        if (this.f121830y != f) {
            this.f121830y = f;
            this.f121804B = true;
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: g */
    public void mo8296g(boolean z) {
        if (this.f121803A != z) {
            this.f121803A = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.f121806a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.f121806a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f121806a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f121806a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f121806a.getOpacity();
    }

    /* JADX INFO: renamed from: h */
    public boolean m146236h() {
        return this.f121803A;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public boolean mo105372j() {
        return this.f121807b || this.f121808c || this.f121809d > 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public void m146237k() {
        float[] fArr;
        if (this.f121804B) {
            this.f121813h.reset();
            RectF rectF = this.f121817l;
            float f = this.f121809d;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f121807b) {
                this.f121813h.addCircle(this.f121817l.centerX(), this.f121817l.centerY(), Math.min(this.f121817l.width(), this.f121817l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f121815j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f121814i[i] + this.f121830y) - (this.f121809d / 2.0f);
                    i++;
                }
                this.f121813h.addRoundRect(this.f121817l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f121817l;
            float f2 = this.f121809d;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f121810e.reset();
            float f3 = this.f121830y + (this.f121831z ? this.f121809d : 0.0f);
            this.f121817l.inset(f3, f3);
            if (this.f121807b) {
                this.f121810e.addCircle(this.f121817l.centerX(), this.f121817l.centerY(), Math.min(this.f121817l.width(), this.f121817l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f121831z) {
                if (this.f121816k == null) {
                    this.f121816k = new float[8];
                }
                for (int i2 = 0; i2 < this.f121815j.length; i2++) {
                    this.f121816k[i2] = this.f121814i[i2] - this.f121809d;
                }
                this.f121810e.addRoundRect(this.f121817l, this.f121816k, Path.Direction.CW);
            } else {
                this.f121810e.addRoundRect(this.f121817l, this.f121814i, Path.Direction.CW);
            }
            float f4 = -f3;
            this.f121817l.inset(f4, f4);
            this.f121810e.setFillType(Path.FillType.WINDING);
            this.f121804B = false;
        }
    }

    @Override // p153l.qgj0
    /* JADX INFO: renamed from: l */
    public void mo128370l(@Nullable rgj0 rgj0Var) {
        this.f121805C = rgj0Var;
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: m */
    public void mo8297m(boolean z) {
        if (this.f121831z != z) {
            this.f121831z = z;
            this.f121804B = true;
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: n */
    public void mo8298n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f121814i, 0.0f);
            this.f121808c = false;
        } else {
            wn80.m207178c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f121814i, 0, 8);
            this.f121808c = false;
            for (int i = 0; i < 8; i++) {
                this.f121808c |= fArr[i] > 0.0f;
            }
        }
        this.f121804B = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public void mo105373o() {
        Matrix matrix;
        Matrix matrix2;
        rgj0 rgj0Var = this.f121805C;
        Matrix matrix3 = this.f121824s;
        if (rgj0Var != null) {
            rgj0Var.mo96260j(matrix3);
            this.f121805C.mo128369h(this.f121817l);
        } else {
            matrix3.reset();
            this.f121817l.set(getBounds());
        }
        this.f121819n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f121820o.set(this.f121806a.getBounds());
        Matrix matrix4 = this.f121822q;
        RectF rectF = this.f121819n;
        RectF rectF2 = this.f121820o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix4.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f121831z) {
            RectF rectF3 = this.f121821p;
            if (rectF3 == null) {
                this.f121821p = new RectF(this.f121817l);
            } else {
                rectF3.set(this.f121817l);
            }
            RectF rectF4 = this.f121821p;
            float f = this.f121809d;
            rectF4.inset(f, f);
            if (this.f121827v == null) {
                this.f121827v = new Matrix();
            }
            this.f121827v.setRectToRect(this.f121817l, this.f121821p, scaleToFit);
        } else {
            Matrix matrix5 = this.f121827v;
            if (matrix5 != null) {
                matrix5.reset();
            }
        }
        if (!this.f121824s.equals(this.f121825t) || !this.f121822q.equals(this.f121823r) || ((matrix2 = this.f121827v) != null && !m146235i(matrix2, this.f121828w))) {
            this.f121811f = true;
            this.f121824s.invert(this.f121826u);
            this.f121829x.set(this.f121824s);
            if (this.f121831z && (matrix = this.f121827v) != null) {
                this.f121829x.postConcat(matrix);
            }
            this.f121829x.preConcat(this.f121822q);
            this.f121825t.set(this.f121824s);
            this.f121823r.set(this.f121822q);
            boolean z = this.f121831z;
            Matrix matrix6 = this.f121828w;
            if (z) {
                Matrix matrix7 = this.f121827v;
                if (matrix6 == null) {
                    this.f121828w = m146234d(matrix7);
                } else {
                    matrix6.set(matrix7);
                }
            } else if (matrix6 != null) {
                matrix6.reset();
            }
        }
        if (this.f121817l.equals(this.f121818m)) {
            return;
        }
        this.f121804B = true;
        this.f121818m.set(this.f121817l);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f121806a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f121806a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f121806a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f121806a.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: f */
    public void mo8295f(boolean z) {
    }
}
