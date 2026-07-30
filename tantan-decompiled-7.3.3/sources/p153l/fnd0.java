package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class fnd0 extends Drawable implements and0 {

    /* JADX INFO: renamed from: a */
    public final float[] f99900a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final float[] f99901b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public float[] f99902c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Paint f99903d;

    /* JADX INFO: renamed from: e */
    public boolean f99904e;

    /* JADX INFO: renamed from: f */
    public float f99905f;

    /* JADX INFO: renamed from: g */
    public float f99906g;

    /* JADX INFO: renamed from: h */
    public int f99907h;

    /* JADX INFO: renamed from: i */
    public boolean f99908i;

    /* JADX INFO: renamed from: j */
    public boolean f99909j;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public final Path f99910k;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public final Path f99911l;

    /* JADX INFO: renamed from: m */
    public int f99912m;

    /* JADX INFO: renamed from: n */
    public final RectF f99913n;

    /* JADX INFO: renamed from: o */
    public int f99914o;

    public fnd0(int i) {
        this.f99900a = new float[8];
        this.f99901b = new float[8];
        this.f99903d = new Paint(1);
        this.f99904e = false;
        this.f99905f = 0.0f;
        this.f99906g = 0.0f;
        this.f99907h = 0;
        this.f99908i = false;
        this.f99909j = false;
        this.f99910k = new Path();
        this.f99911l = new Path();
        this.f99912m = 0;
        this.f99913n = new RectF();
        this.f99914o = 255;
        m126363i(i);
    }

    /* JADX INFO: renamed from: d */
    public static fnd0 m126360d(ColorDrawable colorDrawable) {
        return new fnd0(colorDrawable.getColor());
    }

    /* JADX INFO: renamed from: j */
    private void m126361j() {
        float[] fArr;
        float[] fArr2;
        this.f99910k.reset();
        this.f99911l.reset();
        this.f99913n.set(getBounds());
        RectF rectF = this.f99913n;
        float f = this.f99905f;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f99904e) {
            this.f99911l.addCircle(this.f99913n.centerX(), this.f99913n.centerY(), Math.min(this.f99913n.width(), this.f99913n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f99901b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f99900a[i2] + this.f99906g) - (this.f99905f / 2.0f);
                i2++;
            }
            this.f99911l.addRoundRect(this.f99913n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f99913n;
        float f2 = this.f99905f;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f99906g + (this.f99908i ? this.f99905f : 0.0f);
        this.f99913n.inset(f3, f3);
        if (this.f99904e) {
            this.f99910k.addCircle(this.f99913n.centerX(), this.f99913n.centerY(), Math.min(this.f99913n.width(), this.f99913n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f99908i) {
            if (this.f99902c == null) {
                this.f99902c = new float[8];
            }
            while (true) {
                fArr2 = this.f99902c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f99900a[i] - this.f99905f;
                i++;
            }
            this.f99910k.addRoundRect(this.f99913n, fArr2, Path.Direction.CW);
        } else {
            this.f99910k.addRoundRect(this.f99913n, this.f99900a, Path.Direction.CW);
        }
        float f4 = -f3;
        this.f99913n.inset(f4, f4);
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: a */
    public void mo8291a(boolean z) {
        this.f99904e = z;
        m126361j();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: b */
    public void mo8292b(float f) {
        wn80.m207178c(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f99900a, f);
        m126361j();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: c */
    public void mo8293c(int i, float f) {
        if (this.f99907h != i) {
            this.f99907h = i;
            invalidateSelf();
        }
        if (this.f99905f != f) {
            this.f99905f = f;
            m126361j();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f99903d.setColor(fde.m125088c(this.f99912m, this.f99914o));
        this.f99903d.setStyle(Paint.Style.FILL);
        this.f99903d.setFilterBitmap(m126362h());
        canvas.drawPath(this.f99910k, this.f99903d);
        if (this.f99905f != 0.0f) {
            this.f99903d.setColor(fde.m125088c(this.f99907h, this.f99914o));
            this.f99903d.setStyle(Paint.Style.STROKE);
            this.f99903d.setStrokeWidth(this.f99905f);
            canvas.drawPath(this.f99911l, this.f99903d);
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: e */
    public void mo8294e(float f) {
        if (this.f99906g != f) {
            this.f99906g = f;
            m126361j();
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: g */
    public void mo8296g(boolean z) {
        if (this.f99909j != z) {
            this.f99909j = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f99914o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return fde.m125087b(fde.m125088c(this.f99912m, this.f99914o));
    }

    /* JADX INFO: renamed from: h */
    public boolean m126362h() {
        return this.f99909j;
    }

    /* JADX INFO: renamed from: i */
    public void m126363i(int i) {
        if (this.f99912m != i) {
            this.f99912m = i;
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: m */
    public void mo8297m(boolean z) {
        if (this.f99908i != z) {
            this.f99908i = z;
            m126361j();
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: n */
    public void mo8298n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f99900a, 0.0f);
        } else {
            wn80.m207178c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f99900a, 0, 8);
        }
        m126361j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m126361j();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f99914o) {
            this.f99914o = i;
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: f */
    public void mo8295f(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public fnd0(float[] fArr, int i) {
        this(i);
        mo8298n(fArr);
    }
}
