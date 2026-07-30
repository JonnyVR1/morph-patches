package p149l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class imr extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public int f113956a;

    /* JADX INFO: renamed from: b */
    public int f113957b;

    /* JADX INFO: renamed from: c */
    public int f113958c;

    /* JADX INFO: renamed from: d */
    public boolean f113959d;

    public imr(int i, int i2, boolean z) {
        this.f113957b = i;
        this.f113958c = i2;
        this.f113959d = z;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        LinearGradient linearGradient;
        if (this.f113959d) {
            float f2 = i4;
            linearGradient = new LinearGradient(f, f2, f + this.f113956a, f2, this.f113957b, this.f113958c, Shader.TileMode.REPEAT);
        } else {
            float f3 = i4;
            linearGradient = new LinearGradient(f, f3, f, (paint.descent() + f3) - paint.ascent(), this.f113957b, this.f113958c, Shader.TileMode.REPEAT);
        }
        paint.setShader(linearGradient);
        canvas.drawText(charSequence, i, i2, f, i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        this.f113956a = iMeasureText;
        return iMeasureText;
    }
}
