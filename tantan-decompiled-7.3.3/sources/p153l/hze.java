package p153l;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public abstract class hze extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final fze f112235b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f112234a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f112236c = -1;

    /* JADX INFO: renamed from: d */
    public short f112237d = -1;

    /* JADX INFO: renamed from: e */
    public float f112238e = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public hze(@NonNull fze fzeVar) {
        yn80.m216776f(fzeVar, "metadata cannot be null");
        this.f112235b = fzeVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public final fze m137890a() {
        return this.f112235b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public final int m137891b() {
        return this.f112236c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f112234a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f112234a;
        this.f112238e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f112235b.m128164e();
        this.f112237d = (short) (this.f112235b.m128164e() * this.f112238e);
        short sM128167h = (short) (this.f112235b.m128167h() * this.f112238e);
        this.f112236c = sM128167h;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f112234a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM128167h;
    }
}
