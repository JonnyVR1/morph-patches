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
import p153l.and0;
import p153l.p2j;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornersDrawable extends p2j implements and0 {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Type f6356e;

    /* JADX INFO: renamed from: f */
    public final RectF f6357f;

    /* JADX INFO: renamed from: g */
    public RectF f6358g;

    /* JADX INFO: renamed from: h */
    public Matrix f6359h;

    /* JADX INFO: renamed from: i */
    public final float[] f6360i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final float[] f6361j;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public final Paint f6362k;

    /* JADX INFO: renamed from: l */
    public boolean f6363l;

    /* JADX INFO: renamed from: m */
    public float f6364m;

    /* JADX INFO: renamed from: n */
    public int f6365n;

    /* JADX INFO: renamed from: o */
    public int f6366o;

    /* JADX INFO: renamed from: p */
    public float f6367p;

    /* JADX INFO: renamed from: q */
    public boolean f6368q;

    /* JADX INFO: renamed from: r */
    public boolean f6369r;

    /* JADX INFO: renamed from: s */
    public final Path f6370s;

    /* JADX INFO: renamed from: t */
    public final Path f6371t;

    /* JADX INFO: renamed from: u */
    public final RectF f6372u;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$a */
    public static /* synthetic */ class C1620a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6373a;

        static {
            int[] iArr = new int[Type.values().length];
            f6373a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6373a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) wn80.m207182g(drawable));
        this.f6356e = Type.OVERLAY_COLOR;
        this.f6357f = new RectF();
        this.f6360i = new float[8];
        this.f6361j = new float[8];
        this.f6362k = new Paint(1);
        this.f6363l = false;
        this.f6364m = 0.0f;
        this.f6365n = 0;
        this.f6366o = 0;
        this.f6367p = 0.0f;
        this.f6368q = false;
        this.f6369r = false;
        this.f6370s = new Path();
        this.f6371t = new Path();
        this.f6372u = new RectF();
    }

    /* JADX INFO: renamed from: u */
    private void m8290u() {
        float[] fArr;
        this.f6370s.reset();
        this.f6371t.reset();
        this.f6372u.set(getBounds());
        RectF rectF = this.f6372u;
        float f = this.f6367p;
        rectF.inset(f, f);
        if (this.f6356e == Type.OVERLAY_COLOR) {
            this.f6370s.addRect(this.f6372u, Path.Direction.CW);
        }
        boolean z = this.f6363l;
        Path path = this.f6370s;
        if (z) {
            path.addCircle(this.f6372u.centerX(), this.f6372u.centerY(), Math.min(this.f6372u.width(), this.f6372u.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(this.f6372u, this.f6360i, Path.Direction.CW);
        }
        RectF rectF2 = this.f6372u;
        float f2 = this.f6367p;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f6372u;
        float f3 = this.f6364m;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f6363l) {
            this.f6371t.addCircle(this.f6372u.centerX(), this.f6372u.centerY(), Math.min(this.f6372u.width(), this.f6372u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f6361j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f6360i[i] + this.f6367p) - (this.f6364m / 2.0f);
                i++;
            }
            this.f6371t.addRoundRect(this.f6372u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f6372u;
        float f4 = this.f6364m;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: a */
    public void mo8291a(boolean z) {
        this.f6363l = z;
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: b */
    public void mo8292b(float f) {
        Arrays.fill(this.f6360i, f);
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: c */
    public void mo8293c(int i, float f) {
        this.f6365n = i;
        this.f6364m = f;
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6357f.set(getBounds());
        int i = C1620a.f6373a[this.f6356e.ordinal()];
        if (i == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f6370s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i == 2) {
            if (this.f6368q) {
                RectF rectF = this.f6358g;
                if (rectF == null) {
                    this.f6358g = new RectF(this.f6357f);
                    this.f6359h = new Matrix();
                } else {
                    rectF.set(this.f6357f);
                }
                RectF rectF2 = this.f6358g;
                float f = this.f6364m;
                rectF2.inset(f, f);
                Matrix matrix = this.f6359h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f6357f, this.f6358g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f6357f);
                canvas.concat(this.f6359h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f6362k.setStyle(Paint.Style.FILL);
            this.f6362k.setColor(this.f6366o);
            this.f6362k.setStrokeWidth(0.0f);
            this.f6362k.setFilterBitmap(m8299s());
            this.f6370s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6370s, this.f6362k);
            if (this.f6363l) {
                float fWidth = ((this.f6357f.width() - this.f6357f.height()) + this.f6364m) / 2.0f;
                float fHeight = ((this.f6357f.height() - this.f6357f.width()) + this.f6364m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f6357f;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + fWidth, rectF3.bottom, this.f6362k);
                    RectF rectF4 = this.f6357f;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - fWidth, rectF4.top, f3, rectF4.bottom, this.f6362k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f6357f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + fHeight, this.f6362k);
                    RectF rectF6 = this.f6357f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - fHeight, rectF6.right, f7, this.f6362k);
                }
            }
        }
        if (this.f6365n != 0) {
            this.f6362k.setStyle(Paint.Style.STROKE);
            this.f6362k.setColor(this.f6365n);
            this.f6362k.setStrokeWidth(this.f6364m);
            this.f6370s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6371t, this.f6362k);
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: e */
    public void mo8294e(float f) {
        this.f6367p = f;
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: f */
    public void mo8295f(boolean z) {
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: g */
    public void mo8296g(boolean z) {
        if (this.f6369r != z) {
            this.f6369r = z;
            invalidateSelf();
        }
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: m */
    public void mo8297m(boolean z) {
        this.f6368q = z;
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.and0
    /* JADX INFO: renamed from: n */
    public void mo8298n(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f6360i, 0.0f);
        } else {
            wn80.m207178c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f6360i, 0, 8);
        }
        m8290u();
        invalidateSelf();
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8290u();
    }

    /* JADX INFO: renamed from: s */
    public boolean m8299s() {
        return this.f6369r;
    }

    /* JADX INFO: renamed from: t */
    public void m8300t(int i) {
        this.f6366o = i;
        invalidateSelf();
    }
}
