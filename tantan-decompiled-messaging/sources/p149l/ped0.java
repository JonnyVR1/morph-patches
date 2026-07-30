package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public class ped0 extends ReplacementSpan implements qol {

    /* JADX INFO: renamed from: a */
    public String f148420a;

    /* JADX INFO: renamed from: b */
    public int f148421b;

    /* JADX INFO: renamed from: c */
    public int f148422c;

    /* JADX INFO: renamed from: d */
    public boolean f148423d;

    /* JADX INFO: renamed from: e */
    public int f148424e = t100.m186890d(5.0f);

    /* JADX INFO: renamed from: f */
    public int f148425f = t100.m186890d(2.0f);

    /* JADX INFO: renamed from: g */
    public int f148426g = t100.m186890d(4.0f);

    /* JADX INFO: renamed from: h */
    public int f148427h;

    public ped0(String str, int i, int i2, int i3) {
        this.f148420a = str;
        this.f148427h = i;
        this.f148421b = i2;
        this.f148422c = i3;
    }

    /* JADX INFO: renamed from: a */
    public String m168505a() {
        return this.f148420a;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f148423d) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f148421b);
        paint.setTextSize(t100.m186890d(this.f148427h));
        Rect rect = new Rect();
        paint.getTextBounds(charSequence.toString(), i, i2, rect);
        int iHeight = ((i5 - i3) - (rect.height() + (this.f148425f * 2))) / 2;
        float f2 = f != 0.0f ? this.f148426g : 0;
        float f3 = f + f2;
        canvas.drawRoundRect(new RectF(f3, i3 + this.f148425f, ((int) paint.measureText(charSequence, i, i2)) + (this.f148424e * 2) + f3, i5 - this.f148425f), t100.m186890d(4.0f), t100.m186890d(4.0f), paint);
        paint.setColor(this.f148422c);
        canvas.drawText(charSequence, i, i2, f + this.f148424e + f2, ((i5 - this.f148425f) - iHeight) - rect.bottom, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f148423d) {
            return 0;
        }
        paint.setTextSize(t100.m186890d(this.f148427h));
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f148424e * 2) + this.f148426g;
    }

    @Override // p149l.qol
    public void setVisible(boolean z) {
        this.f148423d = !z;
    }
}
