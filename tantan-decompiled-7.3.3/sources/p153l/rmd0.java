package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public class rmd0 extends ReplacementSpan implements brl {

    /* JADX INFO: renamed from: a */
    public String f163854a;

    /* JADX INFO: renamed from: b */
    public int f163855b;

    /* JADX INFO: renamed from: c */
    public int f163856c;

    /* JADX INFO: renamed from: d */
    public boolean f163857d;

    /* JADX INFO: renamed from: e */
    public int f163858e = qa00.m175859d(5.0f);

    /* JADX INFO: renamed from: f */
    public int f163859f = qa00.m175859d(2.0f);

    /* JADX INFO: renamed from: g */
    public int f163860g = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: h */
    public int f163861h;

    public rmd0(String str, int i, int i2, int i3) {
        this.f163854a = str;
        this.f163861h = i;
        this.f163855b = i2;
        this.f163856c = i3;
    }

    /* JADX INFO: renamed from: a */
    public String m182061a() {
        return this.f163854a;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f163857d) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f163855b);
        paint.setTextSize(qa00.m175859d(this.f163861h));
        Rect rect = new Rect();
        paint.getTextBounds(charSequence.toString(), i, i2, rect);
        int iHeight = ((i5 - i3) - (rect.height() + (this.f163859f * 2))) / 2;
        float f2 = f != 0.0f ? this.f163860g : 0;
        float f3 = f + f2;
        canvas.drawRoundRect(new RectF(f3, i3 + this.f163859f, ((int) paint.measureText(charSequence, i, i2)) + (this.f163858e * 2) + f3, i5 - this.f163859f), qa00.m175859d(4.0f), qa00.m175859d(4.0f), paint);
        paint.setColor(this.f163856c);
        canvas.drawText(charSequence, i, i2, f + this.f163858e + f2, ((i5 - this.f163859f) - iHeight) - rect.bottom, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f163857d) {
            return 0;
        }
        paint.setTextSize(qa00.m175859d(this.f163861h));
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f163858e * 2) + this.f163860g;
    }

    @Override // p153l.brl
    public void setVisible(boolean z) {
        this.f163857d = !z;
    }
}
