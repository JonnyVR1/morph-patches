package p002l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pio0 extends ReplacementSpan implements qol {

    /* JADX INFO: renamed from: b */
    public String f17391b;

    /* JADX INFO: renamed from: c */
    public int f17392c;

    /* JADX INFO: renamed from: d */
    public int f17393d;

    /* JADX INFO: renamed from: e */
    public boolean f17394e;

    /* JADX INFO: renamed from: i */
    public int f17398i;

    /* JADX INFO: renamed from: j */
    public int f17399j;

    /* JADX INFO: renamed from: k */
    public int f17400k;

    /* JADX INFO: renamed from: p */
    public String f17405p;

    /* JADX INFO: renamed from: f */
    public int f17395f = t100.d(8.0f);

    /* JADX INFO: renamed from: g */
    public int f17396g = 0;

    /* JADX INFO: renamed from: h */
    public int f17397h = 20;

    /* JADX INFO: renamed from: l */
    public int f17401l = Color.parseColor("#33ffffff");

    /* JADX INFO: renamed from: m */
    public int f17402m = t100.d(1.0f);

    /* JADX INFO: renamed from: o */
    public int f17404o = t100.d(21.0f);

    /* JADX INFO: renamed from: q */
    public int f17406q = 0;

    /* JADX INFO: renamed from: r */
    public int f17407r = t100.d(13.0f);

    /* JADX INFO: renamed from: a */
    public RectF f17390a = new RectF();

    /* JADX INFO: renamed from: n */
    public Rect f17403n = new Rect();

    public pio0(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.f17405p = "";
        this.f17391b = str;
        this.f17405p = str2;
        this.f17398i = i;
        this.f17392c = i2;
        this.f17393d = i3;
        this.f17399j = i4;
        this.f17400k = i5;
    }

    /* JADX INFO: renamed from: a */
    public final LinearGradient m20341a(float f, float f2, float f3, float f4) {
        return new LinearGradient(f, f2, f3, f4, this.f17399j, this.f17400k, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: b */
    public String m20342b() {
        return this.f17391b;
    }

    /* JADX INFO: renamed from: c */
    public final int m20343c() {
        Paint paint = new Paint();
        paint.setTextSize(t100.d(this.f17398i));
        return ((xdl0.y0() - t100.d(179.0f)) - ((int) paint.measureText(this.f17405p))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public final int m20344d(int i, float f) {
        if (this.f17406q != 1 || !m20345e()) {
            return 0;
        }
        int iD = t100.d(30.0f);
        if (i <= 0 || f != 0.0f) {
            return 0;
        }
        return (int) (iD - f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f17394e) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f17392c);
        paint.setTextSize(t100.d(this.f17398i));
        paint.getTextBounds(charSequence.toString(), i, i2, this.f17403n);
        int iHeight = this.f17403n.height() + (this.f17396g * 2);
        int i6 = i5 - i3;
        int i7 = i5 - (i6 / 2);
        int i8 = this.f17404o;
        int i9 = i7 - (i8 / 2);
        int i10 = i7 + (i8 / 2);
        int i11 = (i6 - iHeight) / 2;
        float fM20344d = f != 0.0f ? this.f17397h : m20344d(i3, f);
        float f2 = f + fM20344d;
        float f3 = i9;
        float f4 = i10;
        this.f17390a.set(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f17395f * 2) + f2, f4);
        if (this.f17399j == 0 || this.f17400k == 0) {
            paint.setColor(this.f17392c);
        } else {
            paint.setShader(m20341a(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f17395f * 2) + f2, f4));
        }
        RectF rectF = this.f17390a;
        int i12 = this.f17407r;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        paint.setShader(null);
        paint.setColor(this.f17393d);
        canvas.drawText(charSequence, i, i2, f + this.f17395f + fM20344d, ((i5 - this.f17396g) - i11) - this.f17403n.bottom, paint);
        if (this.f17406q == 3) {
            paint.setColor(this.f17401l);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f17402m);
            RectF rectF2 = this.f17390a;
            int i13 = this.f17407r;
            canvas.drawRoundRect(rectF2, i13, i13, paint);
        }
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20345e() {
        return TextUtils.equals(this.f17391b, "voiceCallApply") || TextUtils.equals(this.f17391b, "settleApprove");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20346f() {
        return this.f17406q == 2;
    }

    /* JADX INFO: renamed from: g */
    public void m20347g(int i) {
        this.f17406q = i;
        if (i == 1) {
            this.f17395f = t100.d(8.0f);
            this.f17404o = t100.d(22.0f);
            this.f17407r = t100.d(6.0f);
        } else {
            if (i == 2) {
                this.f17395f = m20343c();
                this.f17396g = t100.d(8.0f);
                this.f17404o = t100.d(34.0f);
                this.f17407r = t100.d(10.0f);
                return;
            }
            if (i != 3) {
                this.f17395f = t100.d(8.0f);
                this.f17407r = t100.d(13.0f);
            } else {
                this.f17395f = t100.d(6.0f);
                this.f17404o = t100.d(14.0f);
                this.f17407r = t100.d(5.0f);
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f17394e) {
            return 0;
        }
        paint.setTextSize(t100.d(this.f17398i));
        this.f17397h = 20;
        if (fontMetricsInt != null && m20346f()) {
            fontMetricsInt.descent += t100.d(27.0f);
        }
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f17395f * 2) + this.f17397h;
    }

    @Override // p002l.qol
    public void setVisible(boolean z) {
        this.f17394e = !z;
    }
}
