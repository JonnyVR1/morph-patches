package p149l;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class uzi extends Drawable implements Drawable.Callback, n7j0, m7j0, qbe {

    /* JADX INFO: renamed from: d */
    public static final Matrix f178994d = new Matrix();

    /* JADX INFO: renamed from: a */
    public Drawable f178995a;

    /* JADX INFO: renamed from: b */
    public final rbe f178996b = new rbe();

    /* JADX INFO: renamed from: c */
    public n7j0 f178997c;

    public uzi(Drawable drawable) {
        this.f178995a = drawable;
        bce.m101058d(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f178995a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f178995a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // p149l.n7j0
    /* JADX INFO: renamed from: h */
    public void mo158145h(RectF rectF) {
        n7j0 n7j0Var = this.f178997c;
        if (n7j0Var != null) {
            n7j0Var.mo158145h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p149l.qbe
    /* JADX INFO: renamed from: i */
    public Drawable mo173824i() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f178995a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public void mo158146j(Matrix matrix) {
        m196418o(matrix);
    }

    @Override // p149l.qbe
    /* JADX INFO: renamed from: k */
    public Drawable mo173825k(Drawable drawable) {
        return mo164036q(drawable);
    }

    @Override // p149l.m7j0
    /* JADX INFO: renamed from: l */
    public void mo125887l(n7j0 n7j0Var) {
        this.f178997c = n7j0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public void m196418o(Matrix matrix) {
        n7j0 n7j0Var = this.f178997c;
        if (n7j0Var != null) {
            n7j0Var.mo158146j(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f178995a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    /* JADX INFO: renamed from: p */
    public void m196419p(RectF rectF) {
        Matrix matrix = f178994d;
        m196418o(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    /* JADX INFO: renamed from: q */
    public Drawable mo164036q(Drawable drawable) {
        Drawable drawableM196420r = m196420r(drawable);
        invalidateSelf();
        return drawableM196420r;
    }

    /* JADX INFO: renamed from: r */
    public Drawable m196420r(Drawable drawable) {
        Drawable drawable2 = this.f178995a;
        bce.m101058d(drawable2, null, null);
        bce.m101058d(drawable, null, null);
        bce.m101059e(drawable, this.f178996b);
        bce.m101055a(drawable, this);
        bce.m101058d(drawable, this, this);
        this.f178995a = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f178996b.m178596b(i);
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f178996b.m178597c(colorFilter);
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f178996b.m178598d(z);
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f178996b.m178599e(z);
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f178995a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f178995a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
