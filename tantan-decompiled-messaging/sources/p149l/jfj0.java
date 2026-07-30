package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class jfj0 extends dye {

    /* JADX INFO: renamed from: f */
    public static Paint f117671f;

    public jfj0(bye byeVar) {
        super(byeVar);
    }

    /* JADX INFO: renamed from: c */
    public static Paint m141189c() {
        if (f117671f == null) {
            TextPaint textPaint = new TextPaint();
            f117671f = textPaint;
            textPaint.setColor(exe.m118631a().m118635b());
            f117671f.setStyle(Paint.Style.FILL);
        }
        return f117671f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Canvas canvas2;
        float f2;
        if (exe.m118631a().m118638h()) {
            canvas2 = canvas;
            f2 = f;
            canvas2.drawRect(f2, i3, f + m114068b(), i5, m141189c());
        } else {
            canvas2 = canvas;
            f2 = f;
        }
        m114067a().m104440a(canvas2, f2, i4, paint);
    }
}
