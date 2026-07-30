package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class qxw extends v9l0 {

    /* JADX INFO: renamed from: a */
    public int f160079a;

    public qxw(Drawable drawable, int i) {
        super(drawable);
        this.f160079a = i;
    }

    @Override // p153l.v9l0, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(this.f160079a + f, (((i5 - i3) - drawable.getBounds().bottom) / 2) + i3);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // p153l.v9l0, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        int i3 = this.f160079a;
        return i3 > 0 ? i3 + size : size;
    }
}
