package p153l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes12.dex */
public class g4c extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Path f102163a;

    /* JADX INFO: renamed from: b */
    public Paint f102164b;

    /* JADX INFO: renamed from: c */
    public float f102165c;

    /* JADX INFO: renamed from: d */
    public int f102166d;

    public g4c(@ColorInt int i) {
        this.f102166d = qa00.m175859d(2.5f);
        this.f102163a = new Path();
        Paint paint = new Paint();
        this.f102164b = paint;
        paint.setColor(i);
        this.f102164b.setStyle(Paint.Style.STROKE);
        this.f102164b.setStrokeWidth(this.f102166d);
        float fM175859d = qa00.m175859d(3.0f);
        this.f102164b.setPathEffect(new DashPathEffect(new float[]{fM175859d, fM175859d}, 0.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m128862a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.f102163a.reset();
        this.f102163a.moveTo(f, f2);
        this.f102163a.lineTo(f3, f4);
        canvas.drawPath(this.f102163a, paint);
    }

    /* JADX INFO: renamed from: b */
    public void m128863b(int i) {
        this.f102166d = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m128864c(float f) {
        this.f102165c = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fExactCenterY = bounds.exactCenterY() - (this.f102165c * bounds.exactCenterX());
        int i = bounds.left;
        float f = this.f102165c;
        int i2 = bounds.right;
        m128862a(canvas, i, (i * f) + fExactCenterY, i2, (f * i2) + fExactCenterY, this.f102164b);
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

    public g4c() {
        this(Color.parseColor("#edb54e"));
    }
}
