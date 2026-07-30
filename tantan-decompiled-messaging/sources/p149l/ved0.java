package p149l;

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
public class ved0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f181175a;

    /* JADX INFO: renamed from: c */
    public final RectF f181177c;

    /* JADX INFO: renamed from: d */
    public final Rect f181178d;

    /* JADX INFO: renamed from: e */
    public float f181179e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f181182h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f181183i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f181184j;

    /* JADX INFO: renamed from: f */
    public boolean f181180f = false;

    /* JADX INFO: renamed from: g */
    public boolean f181181g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f181185k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f181176b = new Paint(5);

    public ved0(ColorStateList colorStateList, float f) {
        this.f181175a = f;
        m198172e(colorStateList);
        this.f181177c = new RectF();
        this.f181178d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m198168a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m198169b() {
        return this.f181182h;
    }

    /* JADX INFO: renamed from: c */
    public float m198170c() {
        return this.f181179e;
    }

    /* JADX INFO: renamed from: d */
    public float m198171d() {
        return this.f181175a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f181176b;
        if (this.f181183i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f181183i);
            z = true;
        }
        RectF rectF = this.f181177c;
        float f = this.f181175a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m198172e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f181182h = colorStateList;
        this.f181176b.setColor(colorStateList.getColorForState(getState(), this.f181182h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: f */
    public void m198173f(@Nullable ColorStateList colorStateList) {
        m198172e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m198174g(float f, boolean z, boolean z2) {
        if (f == this.f181179e && this.f181180f == z && this.f181181g == z2) {
            return;
        }
        this.f181179e = f;
        this.f181180f = z;
        this.f181181g = z2;
        m198176i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f181178d, this.f181175a);
    }

    /* JADX INFO: renamed from: h */
    public void m198175h(float f) {
        if (f == this.f181175a) {
            return;
        }
        this.f181175a = f;
        m198176i(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m198176i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f181177c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f181178d.set(rect);
        if (this.f181180f) {
            this.f181178d.inset((int) Math.ceil(wed0.m202888a(this.f181179e, this.f181175a, this.f181181g)), (int) Math.ceil(wed0.m202889b(this.f181179e, this.f181175a, this.f181181g)));
            this.f181177c.set(this.f181178d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f181184j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f181182h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m198176i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f181182h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f181176b.getColor();
        if (z) {
            this.f181176b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f181184j;
        if (colorStateList2 == null || (mode = this.f181185k) == null) {
            return z;
        }
        this.f181183i = m198168a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f181176b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f181176b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f181184j = colorStateList;
        this.f181183i = m198168a(colorStateList, this.f181185k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f181185k = mode;
        this.f181183i = m198168a(this.f181184j, mode);
        invalidateSelf();
    }
}
