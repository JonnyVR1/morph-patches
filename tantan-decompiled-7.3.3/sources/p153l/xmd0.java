package p153l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class xmd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f195066a;

    /* JADX INFO: renamed from: c */
    public final RectF f195068c;

    /* JADX INFO: renamed from: d */
    public final Rect f195069d;

    /* JADX INFO: renamed from: e */
    public float f195070e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f195073h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f195074i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f195075j;

    /* JADX INFO: renamed from: f */
    public boolean f195071f = false;

    /* JADX INFO: renamed from: g */
    public boolean f195072g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f195076k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f195067b = new Paint(5);

    public xmd0(ColorStateList colorStateList, float f) {
        this.f195066a = f;
        m211721e(colorStateList);
        this.f195068c = new RectF();
        this.f195069d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m211717a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m211718b() {
        return this.f195073h;
    }

    /* JADX INFO: renamed from: c */
    public float m211719c() {
        return this.f195070e;
    }

    /* JADX INFO: renamed from: d */
    public float m211720d() {
        return this.f195066a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f195067b;
        if (this.f195074i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f195074i);
            z = true;
        }
        RectF rectF = this.f195068c;
        float f = this.f195066a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m211721e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f195073h = colorStateList;
        this.f195067b.setColor(colorStateList.getColorForState(getState(), this.f195073h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: f */
    public void m211722f(@Nullable ColorStateList colorStateList) {
        m211721e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m211723g(float f, boolean z, boolean z2) {
        if (f == this.f195070e && this.f195071f == z && this.f195072g == z2) {
            return;
        }
        this.f195070e = f;
        this.f195071f = z;
        this.f195072g = z2;
        m211725i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f195069d, this.f195066a);
    }

    /* JADX INFO: renamed from: h */
    public void m211724h(float f) {
        if (f == this.f195066a) {
            return;
        }
        this.f195066a = f;
        m211725i(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m211725i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f195068c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f195069d.set(rect);
        if (this.f195071f) {
            this.f195069d.inset((int) Math.ceil(ymd0.m216673a(this.f195070e, this.f195066a, this.f195072g)), (int) Math.ceil(ymd0.m216674b(this.f195070e, this.f195066a, this.f195072g)));
            this.f195068c.set(this.f195069d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f195075j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f195073h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m211725i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f195073h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f195067b.getColor();
        if (z) {
            this.f195067b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f195075j;
        if (colorStateList2 == null || (mode = this.f195076k) == null) {
            return z;
        }
        this.f195074i = m211717a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f195067b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f195067b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f195075j = colorStateList;
        this.f195074i = m211717a(colorStateList, this.f195076k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f195076k = mode;
        this.f195074i = m211717a(this.f195075j, mode);
        invalidateSelf();
    }
}
