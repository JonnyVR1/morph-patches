package p153l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public class tro0 extends ReplacementSpan implements brl {

    /* JADX INFO: renamed from: b */
    public String f175896b;

    /* JADX INFO: renamed from: c */
    public int f175897c;

    /* JADX INFO: renamed from: d */
    public int f175898d;

    /* JADX INFO: renamed from: e */
    public boolean f175899e;

    /* JADX INFO: renamed from: i */
    public int f175903i;

    /* JADX INFO: renamed from: j */
    public int f175904j;

    /* JADX INFO: renamed from: k */
    public int f175905k;

    /* JADX INFO: renamed from: p */
    public String f175910p;

    /* JADX INFO: renamed from: f */
    public int f175900f = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: g */
    public int f175901g = 0;

    /* JADX INFO: renamed from: h */
    public int f175902h = 20;

    /* JADX INFO: renamed from: l */
    public int f175906l = Color.parseColor("#33ffffff");

    /* JADX INFO: renamed from: m */
    public int f175907m = qa00.m175859d(1.0f);

    /* JADX INFO: renamed from: o */
    public int f175909o = qa00.m175859d(21.0f);

    /* JADX INFO: renamed from: q */
    public int f175911q = 0;

    /* JADX INFO: renamed from: r */
    public int f175912r = qa00.m175859d(13.0f);

    /* JADX INFO: renamed from: a */
    public RectF f175895a = new RectF();

    /* JADX INFO: renamed from: n */
    public Rect f175908n = new Rect();

    public tro0(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.f175910p = "";
        this.f175896b = str;
        this.f175910p = str2;
        this.f175903i = i;
        this.f175897c = i2;
        this.f175898d = i3;
        this.f175904j = i4;
        this.f175905k = i5;
    }

    /* JADX INFO: renamed from: a */
    public final LinearGradient m192515a(float f, float f2, float f3, float f4) {
        return new LinearGradient(f, f2, f3, f4, this.f175904j, this.f175905k, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: b */
    public String m192516b() {
        return this.f175896b;
    }

    /* JADX INFO: renamed from: c */
    public final int m192517c() {
        Paint paint = new Paint();
        paint.setTextSize(qa00.m175859d(this.f175903i));
        return ((bnl0.m105592y0() - qa00.m175859d(179.0f)) - ((int) paint.measureText(this.f175910p))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public final int m192518d(int i, float f) {
        if (this.f175911q != 1 || !m192519e()) {
            return 0;
        }
        int iM175859d = qa00.m175859d(30.0f);
        if (i <= 0 || f != 0.0f) {
            return 0;
        }
        return (int) (iM175859d - f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f175899e) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f175897c);
        paint.setTextSize(qa00.m175859d(this.f175903i));
        paint.getTextBounds(charSequence.toString(), i, i2, this.f175908n);
        int iHeight = this.f175908n.height() + (this.f175901g * 2);
        int i6 = i5 - i3;
        int i7 = i5 - (i6 / 2);
        int i8 = this.f175909o;
        int i9 = i7 - (i8 / 2);
        int i10 = i7 + (i8 / 2);
        int i11 = (i6 - iHeight) / 2;
        float fM192518d = f != 0.0f ? this.f175902h : m192518d(i3, f);
        float f2 = f + fM192518d;
        float f3 = i9;
        float f4 = i10;
        this.f175895a.set(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f175900f * 2) + f2, f4);
        if (this.f175904j == 0 || this.f175905k == 0) {
            paint.setColor(this.f175897c);
        } else {
            paint.setShader(m192515a(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f175900f * 2) + f2, f4));
        }
        RectF rectF = this.f175895a;
        int i12 = this.f175912r;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        paint.setShader(null);
        paint.setColor(this.f175898d);
        canvas.drawText(charSequence, i, i2, f + this.f175900f + fM192518d, ((i5 - this.f175901g) - i11) - this.f175908n.bottom, paint);
        if (this.f175911q == 3) {
            paint.setColor(this.f175906l);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f175907m);
            RectF rectF2 = this.f175895a;
            int i13 = this.f175912r;
            canvas.drawRoundRect(rectF2, i13, i13, paint);
        }
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m192519e() {
        return TextUtils.equals(this.f175896b, "voiceCallApply") || TextUtils.equals(this.f175896b, "settleApprove");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m192520f() {
        return this.f175911q == 2;
    }

    /* JADX INFO: renamed from: g */
    public void m192521g(int i) {
        this.f175911q = i;
        if (i == 1) {
            this.f175900f = qa00.m175859d(8.0f);
            this.f175909o = qa00.m175859d(22.0f);
            this.f175912r = qa00.m175859d(6.0f);
        } else {
            if (i == 2) {
                this.f175900f = m192517c();
                this.f175901g = qa00.m175859d(8.0f);
                this.f175909o = qa00.m175859d(34.0f);
                this.f175912r = qa00.m175859d(10.0f);
                return;
            }
            if (i != 3) {
                this.f175900f = qa00.m175859d(8.0f);
                this.f175912r = qa00.m175859d(13.0f);
            } else {
                this.f175900f = qa00.m175859d(6.0f);
                this.f175909o = qa00.m175859d(14.0f);
                this.f175912r = qa00.m175859d(5.0f);
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f175899e) {
            return 0;
        }
        paint.setTextSize(qa00.m175859d(this.f175903i));
        this.f175902h = 20;
        if (fontMetricsInt != null && m192520f()) {
            fontMetricsInt.descent += qa00.m175859d(27.0f);
        }
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f175900f * 2) + this.f175902h;
    }

    @Override // p153l.brl
    public void setVisible(boolean z) {
        this.f175899e = !z;
    }
}
