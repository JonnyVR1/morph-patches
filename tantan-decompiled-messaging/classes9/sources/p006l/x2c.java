package p006l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x2c extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Path f25685a;

    /* JADX INFO: renamed from: b */
    public Paint f25686b;

    /* JADX INFO: renamed from: c */
    public float f25687c;

    /* JADX INFO: renamed from: d */
    public int f25688d;

    public x2c(@ColorInt int i) {
        this.f25688d = t100.d(2.5f);
        this.f25685a = new Path();
        Paint paint = new Paint();
        this.f25686b = paint;
        paint.setColor(i);
        this.f25686b.setStyle(Paint.Style.STROKE);
        this.f25686b.setStrokeWidth(this.f25688d);
        float fD = t100.d(3.0f);
        this.f25686b.setPathEffect(new DashPathEffect(new float[]{fD, fD}, 0.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m27149a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.f25685a.reset();
        this.f25685a.moveTo(f, f2);
        this.f25685a.lineTo(f3, f4);
        canvas.drawPath(this.f25685a, paint);
    }

    /* JADX INFO: renamed from: b */
    public void m27150b(int i) {
        this.f25688d = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m27151c(float f) {
        this.f25687c = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fExactCenterY = bounds.exactCenterY() - (this.f25687c * bounds.exactCenterX());
        int i = bounds.left;
        float f = this.f25687c;
        int i2 = bounds.right;
        m27149a(canvas, i, (i * f) + fExactCenterY, i2, (f * i2) + fExactCenterY, this.f25686b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public x2c() {
        this(Color.parseColor("#edb54e"));
    }
}
