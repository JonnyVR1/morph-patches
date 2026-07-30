package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class jeh extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final int f120499a;

    /* JADX INFO: renamed from: b */
    public final int f120500b;

    public jeh(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f120500b = i;
        this.f120499a = i2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = this.f120500b + f;
        int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f2, i6);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        int i4 = this.f120499a;
        return (i4 <= 0 || (i3 = this.f120500b) <= 0) ? size : i4 + size + i3;
    }
}
