package p149l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes9.dex */
public class x2c extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Path f189149a;

    /* JADX INFO: renamed from: b */
    public Paint f189150b;

    /* JADX INFO: renamed from: c */
    public float f189151c;

    /* JADX INFO: renamed from: d */
    public int f189152d;

    public x2c(@ColorInt int i) {
        this.f189152d = t100.m186890d(2.5f);
        this.f189149a = new Path();
        Paint paint = new Paint();
        this.f189150b = paint;
        paint.setColor(i);
        this.f189150b.setStyle(Paint.Style.STROKE);
        this.f189150b.setStrokeWidth(this.f189152d);
        float fM186890d = t100.m186890d(3.0f);
        this.f189150b.setPathEffect(new DashPathEffect(new float[]{fM186890d, fM186890d}, 0.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m206848a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        this.f189149a.reset();
        this.f189149a.moveTo(f, f2);
        this.f189149a.lineTo(f3, f4);
        canvas.drawPath(this.f189149a, paint);
    }

    /* JADX INFO: renamed from: b */
    public void m206849b(int i) {
        this.f189152d = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m206850c(float f) {
        this.f189151c = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fExactCenterY = bounds.exactCenterY() - (this.f189151c * bounds.exactCenterX());
        int i = bounds.left;
        float f = this.f189151c;
        int i2 = bounds.right;
        m206848a(canvas, i, (i * f) + fExactCenterY, i2, (f * i2) + fExactCenterY, this.f189150b);
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
