package p147v.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes3.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    private final int color;
    private int customStyle;
    private final Typeface newType;
    private final int size;

    public CustomTypefaceSpan(String str, Typeface typeface, int i, int i2) {
        super(str);
        this.customStyle = -1;
        this.newType = typeface;
        this.color = i;
        this.size = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m223784a(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface == null ? 0 : typeface.getStyle()) & (~this.newType.getStyle());
        int i = this.customStyle;
        if ((i >= 0 && (i & 1) != 0) || (style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        int i2 = this.customStyle;
        if ((i2 >= 0 && (i2 & 2) != 0) || (style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.newType);
        int i3 = this.color;
        if (i3 != 0) {
            paint.setColor(i3);
        }
        int i4 = this.size;
        if (i4 != 0) {
            paint.setTextSize(i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m223785b(int i) {
        this.customStyle = i;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m223784a(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m223784a(textPaint);
    }

    public CustomTypefaceSpan(String str, Typeface typeface, int i) {
        this(str, typeface, i, 0);
    }

    public CustomTypefaceSpan(String str, Typeface typeface) {
        this(str, typeface, 0, 0);
    }
}
