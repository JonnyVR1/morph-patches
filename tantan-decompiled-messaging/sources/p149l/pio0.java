package p149l;

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
public class pio0 extends ReplacementSpan implements qol {

    /* JADX INFO: renamed from: b */
    public String f149586b;

    /* JADX INFO: renamed from: c */
    public int f149587c;

    /* JADX INFO: renamed from: d */
    public int f149588d;

    /* JADX INFO: renamed from: e */
    public boolean f149589e;

    /* JADX INFO: renamed from: i */
    public int f149593i;

    /* JADX INFO: renamed from: j */
    public int f149594j;

    /* JADX INFO: renamed from: k */
    public int f149595k;

    /* JADX INFO: renamed from: p */
    public String f149600p;

    /* JADX INFO: renamed from: f */
    public int f149590f = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: g */
    public int f149591g = 0;

    /* JADX INFO: renamed from: h */
    public int f149592h = 20;

    /* JADX INFO: renamed from: l */
    public int f149596l = Color.parseColor("#33ffffff");

    /* JADX INFO: renamed from: m */
    public int f149597m = t100.m186890d(1.0f);

    /* JADX INFO: renamed from: o */
    public int f149599o = t100.m186890d(21.0f);

    /* JADX INFO: renamed from: q */
    public int f149601q = 0;

    /* JADX INFO: renamed from: r */
    public int f149602r = t100.m186890d(13.0f);

    /* JADX INFO: renamed from: a */
    public RectF f149585a = new RectF();

    /* JADX INFO: renamed from: n */
    public Rect f149598n = new Rect();

    public pio0(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.f149600p = "";
        this.f149586b = str;
        this.f149600p = str2;
        this.f149593i = i;
        this.f149587c = i2;
        this.f149588d = i3;
        this.f149594j = i4;
        this.f149595k = i5;
    }

    /* JADX INFO: renamed from: a */
    public final LinearGradient m169612a(float f, float f2, float f3, float f4) {
        return new LinearGradient(f, f2, f3, f4, this.f149594j, this.f149595k, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: b */
    public String m169613b() {
        return this.f149586b;
    }

    /* JADX INFO: renamed from: c */
    public final int m169614c() {
        Paint paint = new Paint();
        paint.setTextSize(t100.m186890d(this.f149593i));
        return ((xdl0.m208412y0() - t100.m186890d(179.0f)) - ((int) paint.measureText(this.f149600p))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public final int m169615d(int i, float f) {
        if (this.f149601q != 1 || !m169616e()) {
            return 0;
        }
        int iM186890d = t100.m186890d(30.0f);
        if (i <= 0 || f != 0.0f) {
            return 0;
        }
        return (int) (iM186890d - f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f149589e) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.f149587c);
        paint.setTextSize(t100.m186890d(this.f149593i));
        paint.getTextBounds(charSequence.toString(), i, i2, this.f149598n);
        int iHeight = this.f149598n.height() + (this.f149591g * 2);
        int i6 = i5 - i3;
        int i7 = i5 - (i6 / 2);
        int i8 = this.f149599o;
        int i9 = i7 - (i8 / 2);
        int i10 = i7 + (i8 / 2);
        int i11 = (i6 - iHeight) / 2;
        float fM169615d = f != 0.0f ? this.f149592h : m169615d(i3, f);
        float f2 = f + fM169615d;
        float f3 = i9;
        float f4 = i10;
        this.f149585a.set(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f149590f * 2) + f2, f4);
        if (this.f149594j == 0 || this.f149595k == 0) {
            paint.setColor(this.f149587c);
        } else {
            paint.setShader(m169612a(f2, f3, ((int) paint.measureText(charSequence, i, i2)) + (this.f149590f * 2) + f2, f4));
        }
        RectF rectF = this.f149585a;
        int i12 = this.f149602r;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        paint.setShader(null);
        paint.setColor(this.f149588d);
        canvas.drawText(charSequence, i, i2, f + this.f149590f + fM169615d, ((i5 - this.f149591g) - i11) - this.f149598n.bottom, paint);
        if (this.f149601q == 3) {
            paint.setColor(this.f149596l);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f149597m);
            RectF rectF2 = this.f149585a;
            int i13 = this.f149602r;
            canvas.drawRoundRect(rectF2, i13, i13, paint);
        }
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m169616e() {
        return TextUtils.equals(this.f149586b, "voiceCallApply") || TextUtils.equals(this.f149586b, "settleApprove");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m169617f() {
        return this.f149601q == 2;
    }

    /* JADX INFO: renamed from: g */
    public void m169618g(int i) {
        this.f149601q = i;
        if (i == 1) {
            this.f149590f = t100.m186890d(8.0f);
            this.f149599o = t100.m186890d(22.0f);
            this.f149602r = t100.m186890d(6.0f);
        } else {
            if (i == 2) {
                this.f149590f = m169614c();
                this.f149591g = t100.m186890d(8.0f);
                this.f149599o = t100.m186890d(34.0f);
                this.f149602r = t100.m186890d(10.0f);
                return;
            }
            if (i != 3) {
                this.f149590f = t100.m186890d(8.0f);
                this.f149602r = t100.m186890d(13.0f);
            } else {
                this.f149590f = t100.m186890d(6.0f);
                this.f149599o = t100.m186890d(14.0f);
                this.f149602r = t100.m186890d(5.0f);
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f149589e) {
            return 0;
        }
        paint.setTextSize(t100.m186890d(this.f149593i));
        this.f149592h = 20;
        if (fontMetricsInt != null && m169617f()) {
            fontMetricsInt.descent += t100.m186890d(27.0f);
        }
        return ((int) paint.measureText(charSequence, i, i2)) + (this.f149590f * 2) + this.f149592h;
    }

    @Override // p149l.qol
    public void setVisible(boolean z) {
        this.f149589e = !z;
    }
}
