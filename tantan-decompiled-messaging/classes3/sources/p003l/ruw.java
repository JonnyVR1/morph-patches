package p003l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ruw extends q0l0 {

    /* JADX INFO: renamed from: a */
    public int f7082a;

    public ruw(Drawable drawable, int i) {
        super(drawable);
        this.f7082a = i;
    }

    @Override // p003l.q0l0, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(this.f7082a + f, (((i5 - i3) - drawable.getBounds().bottom) / 2) + i3);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // p003l.q0l0, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        int i3 = this.f7082a;
        return i3 > 0 ? i3 + size : size;
    }
}
