package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class g0f0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public RectF f101646a;

    /* JADX INFO: renamed from: b */
    public float f101647b;

    /* JADX INFO: renamed from: c */
    public float f101648c;

    /* JADX INFO: renamed from: d */
    public float f101649d;

    /* JADX INFO: renamed from: e */
    public float f101650e;

    /* JADX INFO: renamed from: f */
    public int f101651f;

    /* JADX INFO: renamed from: g */
    public int f101652g;

    /* JADX INFO: renamed from: h */
    public Paint f101653h;

    public g0f0(float f, float f2, float f3, float f4, int i, int i2) {
        Paint paint = new Paint();
        this.f101653h = paint;
        this.f101647b = f;
        this.f101648c = f2;
        this.f101649d = f3;
        this.f101650e = f4;
        this.f101651f = i;
        this.f101652g = i2;
        paint.setAntiAlias(true);
        this.f101653h.setColor(i2);
        this.f101653h.setStyle(Paint.Style.FILL);
        this.f101653h.setShadowLayer(f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m128427a(Rect rect) {
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        float f = this.f101648c;
        RectF rectF = new RectF(f, f, i - f, i2 - f);
        this.f101646a = rectF;
        float f2 = this.f101650e;
        if (f2 > 0.0f) {
            rectF.top += f2;
            rectF.bottom -= f2;
        } else if (f2 < 0.0f) {
            rectF.top += Math.abs(f2);
            this.f101646a.bottom -= Math.abs(this.f101650e);
        }
        float f3 = this.f101649d;
        if (f3 > 0.0f) {
            RectF rectF2 = this.f101646a;
            rectF2.left += f3;
            rectF2.right -= f3;
        } else if (f3 < 0.0f) {
            this.f101646a.left += Math.abs(f3);
            this.f101646a.right -= Math.abs(this.f101649d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f101646a == null) {
            m128427a(getBounds());
        }
        RectF rectF = this.f101646a;
        float f = this.f101647b;
        canvas.drawRoundRect(rectF, f, f, this.f101653h);
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
        m128427a(rect);
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
