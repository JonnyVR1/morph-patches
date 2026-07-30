package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class bfd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f75293a;

    /* JADX INFO: renamed from: b */
    public int f75294b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f75297e;

    /* JADX INFO: renamed from: g */
    public float f75299g;

    /* JADX INFO: renamed from: k */
    public boolean f75303k;

    /* JADX INFO: renamed from: l */
    public int f75304l;

    /* JADX INFO: renamed from: m */
    public int f75305m;

    /* JADX INFO: renamed from: c */
    public int f75295c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f75296d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f75298f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f75300h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f75301i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f75302j = true;

    public bfd0(Resources resources, Bitmap bitmap) {
        this.f75294b = 160;
        if (resources != null) {
            this.f75294b = resources.getDisplayMetrics().densityDpi;
        }
        this.f75293a = bitmap;
        if (bitmap != null) {
            m101526a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f75297e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f75305m = -1;
            this.f75304l = -1;
            this.f75297e = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m101525d(float f) {
        return f > 0.05f;
    }

    /* JADX INFO: renamed from: a */
    public final void m101526a() {
        this.f75304l = this.f75293a.getScaledWidth(this.f75294b);
        this.f75305m = this.f75293a.getScaledHeight(this.f75294b);
    }

    /* JADX INFO: renamed from: b */
    public float m101527b() {
        return this.f75299g;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo96213c(int i, int i2, int i3, Rect rect, Rect rect2);

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f75293a;
        if (bitmap == null) {
            return;
        }
        m101530g();
        if (this.f75296d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f75300h, this.f75296d);
            return;
        }
        RectF rectF = this.f75301i;
        float f = this.f75299g;
        canvas.drawRoundRect(rectF, f, f, this.f75296d);
    }

    /* JADX INFO: renamed from: e */
    public void m101528e(float f) {
        if (this.f75299g == f) {
            return;
        }
        this.f75303k = false;
        boolean zM101525d = m101525d(f);
        Paint paint = this.f75296d;
        if (zM101525d) {
            paint.setShader(this.f75297e);
        } else {
            paint.setShader(null);
        }
        this.f75299g = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public final void m101529f() {
        this.f75299g = Math.min(this.f75305m, this.f75304l) / 2;
    }

    /* JADX INFO: renamed from: g */
    public void m101530g() {
        bfd0 bfd0Var;
        if (this.f75302j) {
            if (this.f75303k) {
                int iMin = Math.min(this.f75304l, this.f75305m);
                bfd0Var = this;
                bfd0Var.mo96213c(this.f75295c, iMin, iMin, getBounds(), this.f75300h);
                int iMin2 = Math.min(bfd0Var.f75300h.width(), bfd0Var.f75300h.height());
                bfd0Var.f75300h.inset(Math.max(0, (bfd0Var.f75300h.width() - iMin2) / 2), Math.max(0, (bfd0Var.f75300h.height() - iMin2) / 2));
                bfd0Var.f75299g = iMin2 * 0.5f;
            } else {
                bfd0Var = this;
                bfd0Var.mo96213c(bfd0Var.f75295c, bfd0Var.f75304l, bfd0Var.f75305m, bfd0Var.getBounds(), bfd0Var.f75300h);
            }
            bfd0Var.f75301i.set(bfd0Var.f75300h);
            if (bfd0Var.f75297e != null) {
                Matrix matrix = bfd0Var.f75298f;
                RectF rectF = bfd0Var.f75301i;
                matrix.setTranslate(rectF.left, rectF.top);
                bfd0Var.f75298f.preScale(bfd0Var.f75301i.width() / bfd0Var.f75293a.getWidth(), bfd0Var.f75301i.height() / bfd0Var.f75293a.getHeight());
                bfd0Var.f75297e.setLocalMatrix(bfd0Var.f75298f);
                bfd0Var.f75296d.setShader(bfd0Var.f75297e);
            }
            bfd0Var.f75302j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f75296d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f75296d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f75305m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f75304l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f75295c != 119 || this.f75303k || (bitmap = this.f75293a) == null || bitmap.hasAlpha() || this.f75296d.getAlpha() < 255 || m101525d(this.f75299g)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f75303k) {
            m101529f();
        }
        this.f75302j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f75296d.getAlpha()) {
            this.f75296d.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f75296d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f75296d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f75296d.setFilterBitmap(z);
        invalidateSelf();
    }
}
