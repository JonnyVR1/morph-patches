package p153l;

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
public final class noj0 extends hze {

    /* JADX INFO: renamed from: f */
    public static Paint f142991f;

    public noj0(fze fzeVar) {
        super(fzeVar);
    }

    /* JADX INFO: renamed from: c */
    public static Paint m164138c() {
        if (f142991f == null) {
            TextPaint textPaint = new TextPaint();
            f142991f = textPaint;
            textPaint.setColor(iye.m142622a().m142626b());
            f142991f.setStyle(Paint.Style.FILL);
        }
        return f142991f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Canvas canvas2;
        float f2;
        if (iye.m142622a().m142629h()) {
            canvas2 = canvas;
            f2 = f;
            canvas2.drawRect(f2, i3, f + m137891b(), i5, m164138c());
        } else {
            canvas2 = canvas;
            f2 = f;
        }
        m137890a().m128160a(canvas2, f2, i4, paint);
    }
}
