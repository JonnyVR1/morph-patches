package p149l;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public abstract class dye extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final bye f88378b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f88377a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f88379c = -1;

    /* JADX INFO: renamed from: d */
    public short f88380d = -1;

    /* JADX INFO: renamed from: e */
    public float f88381e = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public dye(@NonNull bye byeVar) {
        tf80.m188659f(byeVar, "metadata cannot be null");
        this.f88378b = byeVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public final bye m114067a() {
        return this.f88378b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public final int m114068b() {
        return this.f88379c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f88377a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f88377a;
        this.f88381e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f88378b.m104444e();
        this.f88380d = (short) (this.f88378b.m104444e() * this.f88381e);
        short sM104447h = (short) (this.f88378b.m104447h() * this.f88381e);
        this.f88379c = sM104447h;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f88377a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM104447h;
    }
}
