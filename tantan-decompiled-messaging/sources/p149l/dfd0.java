package p149l;

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
public class dfd0 extends Drawable implements yed0 {

    /* JADX INFO: renamed from: a */
    public final float[] f85913a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final float[] f85914b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public float[] f85915c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Paint f85916d;

    /* JADX INFO: renamed from: e */
    public boolean f85917e;

    /* JADX INFO: renamed from: f */
    public float f85918f;

    /* JADX INFO: renamed from: g */
    public float f85919g;

    /* JADX INFO: renamed from: h */
    public int f85920h;

    /* JADX INFO: renamed from: i */
    public boolean f85921i;

    /* JADX INFO: renamed from: j */
    public boolean f85922j;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public final Path f85923k;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public final Path f85924l;

    /* JADX INFO: renamed from: m */
    public int f85925m;

    /* JADX INFO: renamed from: n */
    public final RectF f85926n;

    /* JADX INFO: renamed from: o */
    public int f85927o;

    public dfd0(int i) {
        this.f85913a = new float[8];
        this.f85914b = new float[8];
        this.f85916d = new Paint(1);
        this.f85917e = false;
        this.f85918f = 0.0f;
        this.f85919g = 0.0f;
        this.f85920h = 0;
        this.f85921i = false;
        this.f85922j = false;
        this.f85923k = new Path();
        this.f85924l = new Path();
        this.f85925m = 0;
        this.f85926n = new RectF();
        this.f85927o = 255;
        m111444i(i);
    }

    /* JADX INFO: renamed from: d */
    public static dfd0 m111441d(ColorDrawable colorDrawable) {
        return new dfd0(colorDrawable.getColor());
    }

    /* JADX INFO: renamed from: j */
    private void m111442j() {
        float[] fArr;
        float[] fArr2;
        this.f85923k.reset();
        this.f85924l.reset();
        this.f85926n.set(getBounds());
        RectF rectF = this.f85926n;
        float f = this.f85918f;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f85917e) {
            this.f85924l.addCircle(this.f85926n.centerX(), this.f85926n.centerY(), Math.min(this.f85926n.width(), this.f85926n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f85914b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f85913a[i2] + this.f85919g) - (this.f85918f / 2.0f);
                i2++;
            }
            this.f85924l.addRoundRect(this.f85926n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f85926n;
        float f2 = this.f85918f;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f85919g + (this.f85921i ? this.f85918f : 0.0f);
        this.f85926n.inset(f3, f3);
        if (this.f85917e) {
            this.f85923k.addCircle(this.f85926n.centerX(), this.f85926n.centerY(), Math.min(this.f85926n.width(), this.f85926n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f85921i) {
            if (this.f85915c == null) {
                this.f85915c = new float[8];
            }
            while (true) {
                fArr2 = this.f85915c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f85913a[i] - this.f85918f;
                i++;
            }
            this.f85923k.addRoundRect(this.f85926n, fArr2, Path.Direction.CW);
        } else {
            this.f85923k.addRoundRect(this.f85926n, this.f85913a, Path.Direction.CW);
        }
        float f4 = -f3;
        this.f85926n.inset(f4, f4);
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: a */
    public void mo8237a(boolean z) {
        this.f85917e = z;
        m111442j();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: b */
    public void mo8238b(float f) {
        rf80.m179112c(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f85913a, f);
        m111442j();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: c */
    public void mo8239c(int i, float f) {
        if (this.f85920h != i) {
            this.f85920h = i;
            invalidateSelf();
        }
        if (this.f85918f != f) {
            this.f85918f = f;
            m111442j();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f85916d.setColor(bce.m101057c(this.f85925m, this.f85927o));
        this.f85916d.setStyle(Paint.Style.FILL);
        this.f85916d.setFilterBitmap(m111443h());
        canvas.drawPath(this.f85923k, this.f85916d);
        if (this.f85918f != 0.0f) {
            this.f85916d.setColor(bce.m101057c(this.f85920h, this.f85927o));
            this.f85916d.setStyle(Paint.Style.STROKE);
            this.f85916d.setStrokeWidth(this.f85918f);
            canvas.drawPath(this.f85924l, this.f85916d);
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: e */
    public void mo8240e(float f) {
        if (this.f85919g != f) {
            this.f85919g = f;
            m111442j();
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: g */
    public void mo8242g(boolean z) {
        if (this.f85922j != z) {
            this.f85922j = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f85927o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return bce.m101056b(bce.m101057c(this.f85925m, this.f85927o));
    }

    /* JADX INFO: renamed from: h */
    public boolean m111443h() {
        return this.f85922j;
    }

    /* JADX INFO: renamed from: i */
    public void m111444i(int i) {
        if (this.f85925m != i) {
            this.f85925m = i;
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: m */
    public void mo8243m(boolean z) {
        if (this.f85921i != z) {
            this.f85921i = z;
            m111442j();
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: n */
    public void mo8244n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f85913a, 0.0f);
        } else {
            rf80.m179112c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f85913a, 0, 8);
        }
        m111442j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m111442j();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f85927o) {
            this.f85927o = i;
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: f */
    public void mo8241f(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public dfd0(float[] fArr, int i) {
        this(i);
        mo8244n(fArr);
    }
}
