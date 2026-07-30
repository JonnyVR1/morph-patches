package p153l;

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
public abstract class dnd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f89782a;

    /* JADX INFO: renamed from: b */
    public int f89783b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f89786e;

    /* JADX INFO: renamed from: g */
    public float f89788g;

    /* JADX INFO: renamed from: k */
    public boolean f89792k;

    /* JADX INFO: renamed from: l */
    public int f89793l;

    /* JADX INFO: renamed from: m */
    public int f89794m;

    /* JADX INFO: renamed from: c */
    public int f89784c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f89785d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f89787f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f89789h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f89790i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f89791j = true;

    public dnd0(Resources resources, Bitmap bitmap) {
        this.f89783b = 160;
        if (resources != null) {
            this.f89783b = resources.getDisplayMetrics().densityDpi;
        }
        this.f89782a = bitmap;
        if (bitmap != null) {
            m117057a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f89786e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f89794m = -1;
            this.f89793l = -1;
            this.f89786e = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m117056d(float f) {
        return f > 0.05f;
    }

    /* JADX INFO: renamed from: a */
    public final void m117057a() {
        this.f89793l = this.f89782a.getScaledWidth(this.f89783b);
        this.f89794m = this.f89782a.getScaledHeight(this.f89783b);
    }

    /* JADX INFO: renamed from: b */
    public float m117058b() {
        return this.f89788g;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo111497c(int i, int i2, int i3, Rect rect, Rect rect2);

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f89782a;
        if (bitmap == null) {
            return;
        }
        m117061g();
        if (this.f89785d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f89789h, this.f89785d);
            return;
        }
        RectF rectF = this.f89790i;
        float f = this.f89788g;
        canvas.drawRoundRect(rectF, f, f, this.f89785d);
    }

    /* JADX INFO: renamed from: e */
    public void m117059e(float f) {
        if (this.f89788g == f) {
            return;
        }
        this.f89792k = false;
        boolean zM117056d = m117056d(f);
        Paint paint = this.f89785d;
        if (zM117056d) {
            paint.setShader(this.f89786e);
        } else {
            paint.setShader(null);
        }
        this.f89788g = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public final void m117060f() {
        this.f89788g = Math.min(this.f89794m, this.f89793l) / 2;
    }

    /* JADX INFO: renamed from: g */
    public void m117061g() {
        dnd0 dnd0Var;
        if (this.f89791j) {
            if (this.f89792k) {
                int iMin = Math.min(this.f89793l, this.f89794m);
                dnd0Var = this;
                dnd0Var.mo111497c(this.f89784c, iMin, iMin, getBounds(), this.f89789h);
                int iMin2 = Math.min(dnd0Var.f89789h.width(), dnd0Var.f89789h.height());
                dnd0Var.f89789h.inset(Math.max(0, (dnd0Var.f89789h.width() - iMin2) / 2), Math.max(0, (dnd0Var.f89789h.height() - iMin2) / 2));
                dnd0Var.f89788g = iMin2 * 0.5f;
            } else {
                dnd0Var = this;
                dnd0Var.mo111497c(dnd0Var.f89784c, dnd0Var.f89793l, dnd0Var.f89794m, dnd0Var.getBounds(), dnd0Var.f89789h);
            }
            dnd0Var.f89790i.set(dnd0Var.f89789h);
            if (dnd0Var.f89786e != null) {
                Matrix matrix = dnd0Var.f89787f;
                RectF rectF = dnd0Var.f89790i;
                matrix.setTranslate(rectF.left, rectF.top);
                dnd0Var.f89787f.preScale(dnd0Var.f89790i.width() / dnd0Var.f89782a.getWidth(), dnd0Var.f89790i.height() / dnd0Var.f89782a.getHeight());
                dnd0Var.f89786e.setLocalMatrix(dnd0Var.f89787f);
                dnd0Var.f89785d.setShader(dnd0Var.f89786e);
            }
            dnd0Var.f89791j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f89785d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f89785d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f89794m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f89793l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f89784c != 119 || this.f89792k || (bitmap = this.f89782a) == null || bitmap.hasAlpha() || this.f89785d.getAlpha() < 255 || m117056d(this.f89788g)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f89792k) {
            m117060f();
        }
        this.f89791j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f89785d.getAlpha()) {
            this.f89785d.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f89785d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f89785d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f89785d.setFilterBitmap(z);
        invalidateSelf();
    }
}
