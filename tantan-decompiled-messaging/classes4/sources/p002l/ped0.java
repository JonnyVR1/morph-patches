package p002l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ped0 extends ReplacementSpan implements qol {

    /* JADX INFO: renamed from: a */
    public String f17220a;

    /* JADX INFO: renamed from: b */
    public int f17221b;

    /* JADX INFO: renamed from: c */
    public int f17222c;

    /* JADX INFO: renamed from: d */
    public boolean f17223d;

    /* JADX INFO: renamed from: e */
    public int f17224e = t100.d(5.0f);

    /* JADX INFO: renamed from: f */
    public int f17225f = t100.d(2.0f);

    /* JADX INFO: renamed from: g */
    public int f17226g = t100.d(4.0f);

    /* JADX INFO: renamed from: h */
    public int f17227h;

    public ped0(String str, int i, int i2, int i3) {
        this.f17220a = str;
        this.f17227h = i;
        this.f17221b = i2;
        this.f17222c = i3;
    }

    /* JADX INFO: renamed from: a */
    public String m20191a() {
        return this.f17220a;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f17223d) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f17221b);
        paint.setTextSize(t100.d(this.f17227h));
        Rect rect = new Rect();
        paint.getTextBounds(charSequence.toString(), i, i2, rect);
        int iHeight = ((i5 - i3) - (rect.height() + (this.f17225f * 2))) / 2;
        float f2 = f != 0.0f ? this.f17226g : 0;
        float f3 = f + f2;
        canvas.drawRoundRect(new RectF(f3, i3 + this.f17225f, ((int) paint.measureText(charSequence, i, i2)) + (this.f17224e * 2) + f3, i5 - this.f17225f), t100.d(4.0f), t100.d(4.0f), paint);
        paint.setColor(this.f17222c);
        canvas.drawText(charSequence, i, i2, f + this.f17224e + f2, ((i5 - this.f17225f) - iHeight) - rect.bottom, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f17223d) {
            return 0;
        }
        paint.setTextSize(t100.d(this.f17227h));
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f17224e * 2) + this.f17226g;
    }

    @Override // p002l.qol
    public void setVisible(boolean z) {
        this.f17223d = !z;
    }
}
