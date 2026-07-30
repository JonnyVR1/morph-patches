package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import p149l.rf80;
import p149l.uzi;
import p149l.yed0;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornersDrawable extends uzi implements yed0 {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Type f6319e;

    /* JADX INFO: renamed from: f */
    public final RectF f6320f;

    /* JADX INFO: renamed from: g */
    public RectF f6321g;

    /* JADX INFO: renamed from: h */
    public Matrix f6322h;

    /* JADX INFO: renamed from: i */
    public final float[] f6323i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final float[] f6324j;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public final Paint f6325k;

    /* JADX INFO: renamed from: l */
    public boolean f6326l;

    /* JADX INFO: renamed from: m */
    public float f6327m;

    /* JADX INFO: renamed from: n */
    public int f6328n;

    /* JADX INFO: renamed from: o */
    public int f6329o;

    /* JADX INFO: renamed from: p */
    public float f6330p;

    /* JADX INFO: renamed from: q */
    public boolean f6331q;

    /* JADX INFO: renamed from: r */
    public boolean f6332r;

    /* JADX INFO: renamed from: s */
    public final Path f6333s;

    /* JADX INFO: renamed from: t */
    public final Path f6334t;

    /* JADX INFO: renamed from: u */
    public final RectF f6335u;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$a */
    public static /* synthetic */ class C1597a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6336a;

        static {
            int[] iArr = new int[Type.values().length];
            f6336a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6336a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) rf80.m179116g(drawable));
        this.f6319e = Type.OVERLAY_COLOR;
        this.f6320f = new RectF();
        this.f6323i = new float[8];
        this.f6324j = new float[8];
        this.f6325k = new Paint(1);
        this.f6326l = false;
        this.f6327m = 0.0f;
        this.f6328n = 0;
        this.f6329o = 0;
        this.f6330p = 0.0f;
        this.f6331q = false;
        this.f6332r = false;
        this.f6333s = new Path();
        this.f6334t = new Path();
        this.f6335u = new RectF();
    }

    /* JADX INFO: renamed from: u */
    private void m8236u() {
        float[] fArr;
        this.f6333s.reset();
        this.f6334t.reset();
        this.f6335u.set(getBounds());
        RectF rectF = this.f6335u;
        float f = this.f6330p;
        rectF.inset(f, f);
        if (this.f6319e == Type.OVERLAY_COLOR) {
            this.f6333s.addRect(this.f6335u, Path.Direction.CW);
        }
        boolean z = this.f6326l;
        Path path = this.f6333s;
        if (z) {
            path.addCircle(this.f6335u.centerX(), this.f6335u.centerY(), Math.min(this.f6335u.width(), this.f6335u.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(this.f6335u, this.f6323i, Path.Direction.CW);
        }
        RectF rectF2 = this.f6335u;
        float f2 = this.f6330p;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f6335u;
        float f3 = this.f6327m;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f6326l) {
            this.f6334t.addCircle(this.f6335u.centerX(), this.f6335u.centerY(), Math.min(this.f6335u.width(), this.f6335u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f6324j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f6323i[i] + this.f6330p) - (this.f6327m / 2.0f);
                i++;
            }
            this.f6334t.addRoundRect(this.f6335u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f6335u;
        float f4 = this.f6327m;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: a */
    public void mo8237a(boolean z) {
        this.f6326l = z;
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: b */
    public void mo8238b(float f) {
        Arrays.fill(this.f6323i, f);
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: c */
    public void mo8239c(int i, float f) {
        this.f6328n = i;
        this.f6327m = f;
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6320f.set(getBounds());
        int i = C1597a.f6336a[this.f6319e.ordinal()];
        if (i == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f6333s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i == 2) {
            if (this.f6331q) {
                RectF rectF = this.f6321g;
                if (rectF == null) {
                    this.f6321g = new RectF(this.f6320f);
                    this.f6322h = new Matrix();
                } else {
                    rectF.set(this.f6320f);
                }
                RectF rectF2 = this.f6321g;
                float f = this.f6327m;
                rectF2.inset(f, f);
                Matrix matrix = this.f6322h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f6320f, this.f6321g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f6320f);
                canvas.concat(this.f6322h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f6325k.setStyle(Paint.Style.FILL);
            this.f6325k.setColor(this.f6329o);
            this.f6325k.setStrokeWidth(0.0f);
            this.f6325k.setFilterBitmap(m8245s());
            this.f6333s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6333s, this.f6325k);
            if (this.f6326l) {
                float fWidth = ((this.f6320f.width() - this.f6320f.height()) + this.f6327m) / 2.0f;
                float fHeight = ((this.f6320f.height() - this.f6320f.width()) + this.f6327m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f6320f;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + fWidth, rectF3.bottom, this.f6325k);
                    RectF rectF4 = this.f6320f;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - fWidth, rectF4.top, f3, rectF4.bottom, this.f6325k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f6320f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + fHeight, this.f6325k);
                    RectF rectF6 = this.f6320f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - fHeight, rectF6.right, f7, this.f6325k);
                }
            }
        }
        if (this.f6328n != 0) {
            this.f6325k.setStyle(Paint.Style.STROKE);
            this.f6325k.setColor(this.f6328n);
            this.f6325k.setStrokeWidth(this.f6327m);
            this.f6333s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6334t, this.f6325k);
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: e */
    public void mo8240e(float f) {
        this.f6330p = f;
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: f */
    public void mo8241f(boolean z) {
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: g */
    public void mo8242g(boolean z) {
        if (this.f6332r != z) {
            this.f6332r = z;
            invalidateSelf();
        }
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: m */
    public void mo8243m(boolean z) {
        this.f6331q = z;
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.yed0
    /* JADX INFO: renamed from: n */
    public void mo8244n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f6323i, 0.0f);
        } else {
            rf80.m179112c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f6323i, 0, 8);
        }
        m8236u();
        invalidateSelf();
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8236u();
    }

    /* JADX INFO: renamed from: s */
    public boolean m8245s() {
        return this.f6332r;
    }

    /* JADX INFO: renamed from: t */
    public void m8246t(int i) {
        this.f6329o = i;
        invalidateSelf();
    }
}
