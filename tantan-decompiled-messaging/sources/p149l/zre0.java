package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class zre0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public RectF f204504a;

    /* JADX INFO: renamed from: b */
    public float f204505b;

    /* JADX INFO: renamed from: c */
    public float f204506c;

    /* JADX INFO: renamed from: d */
    public float f204507d;

    /* JADX INFO: renamed from: e */
    public float f204508e;

    /* JADX INFO: renamed from: f */
    public int f204509f;

    /* JADX INFO: renamed from: g */
    public int f204510g;

    /* JADX INFO: renamed from: h */
    public Paint f204511h;

    public zre0(float f, float f2, float f3, float f4, int i, int i2) {
        Paint paint = new Paint();
        this.f204511h = paint;
        this.f204505b = f;
        this.f204506c = f2;
        this.f204507d = f3;
        this.f204508e = f4;
        this.f204509f = i;
        this.f204510g = i2;
        paint.setAntiAlias(true);
        this.f204511h.setColor(i2);
        this.f204511h.setStyle(Paint.Style.FILL);
        this.f204511h.setShadowLayer(f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m219949a(Rect rect) {
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        float f = this.f204506c;
        RectF rectF = new RectF(f, f, i - f, i2 - f);
        this.f204504a = rectF;
        float f2 = this.f204508e;
        if (f2 > 0.0f) {
            rectF.top += f2;
            rectF.bottom -= f2;
        } else if (f2 < 0.0f) {
            rectF.top += Math.abs(f2);
            this.f204504a.bottom -= Math.abs(this.f204508e);
        }
        float f3 = this.f204507d;
        if (f3 > 0.0f) {
            RectF rectF2 = this.f204504a;
            rectF2.left += f3;
            rectF2.right -= f3;
        } else if (f3 < 0.0f) {
            this.f204504a.left += Math.abs(f3);
            this.f204504a.right -= Math.abs(this.f204507d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f204504a == null) {
            m219949a(getBounds());
        }
        RectF rectF = this.f204504a;
        float f = this.f204505b;
        canvas.drawRoundRect(rectF, f, f, this.f204511h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (rect.right - rect.left <= 0 || rect.bottom - rect.top <= 0) {
            return;
        }
        m219949a(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
