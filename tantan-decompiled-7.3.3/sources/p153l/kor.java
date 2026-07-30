package p153l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import android.text.style.UpdateAppearance;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class kor extends ReplacementSpan implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public int f127790a;

    /* JADX INFO: renamed from: b */
    public int f127791b;

    public kor(int i, int i2) {
        this.f127790a = i;
        this.f127791b = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        String string = charSequence.subSequence(i, i2).toString();
        int color = paint.getColor();
        float fMeasureText = paint.measureText(string);
        if (fMeasureText <= 0.0f && !string.isEmpty()) {
            Rect rect = new Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            fMeasureText = rect.width();
        }
        Shader shader = paint.getShader();
        paint.setColor(-1);
        float f2 = i4;
        paint.setShader(new LinearGradient(f, f2, f + fMeasureText, f2, this.f127790a, this.f127791b, Shader.TileMode.CLAMP));
        canvas.drawText(string, 0, string.length(), f, f2, paint);
        paint.setShader(shader);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        String string = charSequence.subSequence(i, i2).toString();
        float fMeasureText = paint.measureText(string);
        if (fMeasureText <= 0.0f && !string.isEmpty()) {
            Rect rect = new Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            fMeasureText = rect.width();
        }
        int iCeil = (int) Math.ceil(fMeasureText);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return iCeil;
    }
}
