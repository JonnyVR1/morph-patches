package p007l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zre0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public RectF f5528a;

    /* JADX INFO: renamed from: b */
    public float f5529b;

    /* JADX INFO: renamed from: c */
    public float f5530c;

    /* JADX INFO: renamed from: d */
    public float f5531d;

    /* JADX INFO: renamed from: e */
    public float f5532e;

    /* JADX INFO: renamed from: f */
    public int f5533f;

    /* JADX INFO: renamed from: g */
    public int f5534g;

    /* JADX INFO: renamed from: h */
    public Paint f5535h;

    public zre0(float f, float f2, float f3, float f4, int i, int i2) {
        Paint paint = new Paint();
        this.f5535h = paint;
        this.f5529b = f;
        this.f5530c = f2;
        this.f5531d = f3;
        this.f5532e = f4;
        this.f5533f = i;
        this.f5534g = i2;
        paint.setAntiAlias(true);
        this.f5535h.setColor(i2);
        this.f5535h.setStyle(Paint.Style.FILL);
        this.f5535h.setShadowLayer(f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m12037a(Rect rect) {
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        float f = this.f5530c;
        RectF rectF = new RectF(f, f, i - f, i2 - f);
        this.f5528a = rectF;
        float f2 = this.f5532e;
        if (f2 > 0.0f) {
            rectF.top += f2;
            rectF.bottom -= f2;
        } else if (f2 < 0.0f) {
            rectF.top += Math.abs(f2);
            this.f5528a.bottom -= Math.abs(this.f5532e);
        }
        float f3 = this.f5531d;
        if (f3 > 0.0f) {
            RectF rectF2 = this.f5528a;
            rectF2.left += f3;
            rectF2.right -= f3;
        } else if (f3 < 0.0f) {
            this.f5528a.left += Math.abs(f3);
            this.f5528a.right -= Math.abs(this.f5531d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f5528a == null) {
            m12037a(getBounds());
        }
        RectF rectF = this.f5528a;
        float f = this.f5529b;
        canvas.drawRoundRect(rectF, f, f, this.f5535h);
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
        m12037a(rect);
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
