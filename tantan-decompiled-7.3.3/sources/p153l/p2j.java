package p153l;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class p2j extends Drawable implements Drawable.Callback, rgj0, qgj0, uce {

    /* JADX INFO: renamed from: d */
    public static final Matrix f150266d = new Matrix();

    /* JADX INFO: renamed from: a */
    public Drawable f150267a;

    /* JADX INFO: renamed from: b */
    public final vce f150268b = new vce();

    /* JADX INFO: renamed from: c */
    public rgj0 f150269c;

    public p2j(Drawable drawable) {
        this.f150267a = drawable;
        fde.m125089d(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f150267a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f150267a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // p153l.rgj0
    /* JADX INFO: renamed from: h */
    public void mo128369h(RectF rectF) {
        rgj0 rgj0Var = this.f150269c;
        if (rgj0Var != null) {
            rgj0Var.mo128369h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p153l.uce
    /* JADX INFO: renamed from: i */
    public Drawable mo128371i() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f150267a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public void mo96260j(Matrix matrix) {
        m170352o(matrix);
    }

    @Override // p153l.uce
    /* JADX INFO: renamed from: k */
    public Drawable mo128372k(Drawable drawable) {
        return mo163253q(drawable);
    }

    @Override // p153l.qgj0
    /* JADX INFO: renamed from: l */
    public void mo128370l(rgj0 rgj0Var) {
        this.f150269c = rgj0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public void m170352o(Matrix matrix) {
        rgj0 rgj0Var = this.f150269c;
        if (rgj0Var != null) {
            rgj0Var.mo96260j(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f150267a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    /* JADX INFO: renamed from: p */
    public void m170353p(RectF rectF) {
        Matrix matrix = f150266d;
        m170352o(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    /* JADX INFO: renamed from: q */
    public Drawable mo163253q(Drawable drawable) {
        Drawable drawableM170354r = m170354r(drawable);
        invalidateSelf();
        return drawableM170354r;
    }

    /* JADX INFO: renamed from: r */
    public Drawable m170354r(Drawable drawable) {
        Drawable drawable2 = this.f150267a;
        fde.m125089d(drawable2, null, null);
        fde.m125089d(drawable, null, null);
        fde.m125090e(drawable, this.f150268b);
        fde.m125086a(drawable, this);
        fde.m125089d(drawable, this, this);
        this.f150267a = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f150268b.m200798b(i);
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f150268b.m200799c(colorFilter);
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f150268b.m200800d(z);
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f150268b.m200801e(z);
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f150267a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f150267a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
