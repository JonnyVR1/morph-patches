package p002l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.t100;
import l.xdl0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w6n0 extends ReplacementSpan {

    /* JADX INFO: renamed from: p */
    public static int f21492p = 14;

    /* JADX INFO: renamed from: a */
    public String f21493a;

    /* JADX INFO: renamed from: b */
    public int f21494b;

    /* JADX INFO: renamed from: c */
    public boolean f21495c;

    /* JADX INFO: renamed from: f */
    public int f21498f;

    /* JADX INFO: renamed from: g */
    public int f21499g;

    /* JADX INFO: renamed from: h */
    public String f21500h;

    /* JADX INFO: renamed from: i */
    public int f21501i;

    /* JADX INFO: renamed from: j */
    public String f21502j;

    /* JADX INFO: renamed from: k */
    public int f21503k;

    /* JADX INFO: renamed from: d */
    public int f21496d = t100.d(17.0f);

    /* JADX INFO: renamed from: e */
    public int f21497e = t100.d(5.0f);

    /* JADX INFO: renamed from: n */
    public int f21506n = t100.d(6.0f);

    /* JADX INFO: renamed from: o */
    public int f21507o = t100.d(21.0f);

    /* JADX INFO: renamed from: l */
    public Rect f21504l = new Rect();

    /* JADX INFO: renamed from: m */
    public RectF f21505m = new RectF();

    public w6n0(String str) {
        this.f21493a = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m24354a(int i) {
        return ypv.e.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public String m24355b() {
        return this.f21493a;
    }

    /* JADX INFO: renamed from: c */
    public final int m24356c() {
        Paint paint = new Paint();
        paint.setTextSize(t100.d(f21492p));
        return ((xdl0.y0() - t100.d(179.0f)) - ((int) paint.measureText(this.f21500h))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public void m24357d() {
        this.f21498f = m24354a(h1c0.f11823s0);
        this.f21499g = m24354a(h1c0.f11723D0);
        this.f21494b = -1;
        this.f21500h = ypv.e.getString(R$string.f2669D4);
        this.f21497e = t100.d(10.0f);
        this.f21496d = t100.d(24.0f);
        this.f21501i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iD;
        int i6;
        int color = paint.getColor();
        paint.setTextSize(t100.d(f21492p));
        String str = this.f21500h;
        paint.getTextBounds(str, 0, str.length() - 1, this.f21504l);
        if (!"5".equals(this.f21502j) && !"6".equals(this.f21502j)) {
            if ("3".equals(this.f21502j)) {
                i6 = i3;
            } else {
                iD = t100.d(12.0f);
            }
            int iHeight = this.f21504l.height() + (this.f21497e * 2);
            int i7 = i5 - i6;
            int i8 = i5 - (i7 / 2);
            int i9 = this.f21507o;
            int i10 = i8 - (i9 / 2);
            int i11 = i8 + (i9 / 2);
            int i12 = (i7 - iHeight) / 2;
            if (this.f21498f != 0 || this.f21499g == 0) {
                paint.setColor(this.f21503k);
            } else {
                int i13 = this.f21501i;
                paint.setShader(new LinearGradient(f + i13, i10, f + i13 + ((int) paint.measureText(this.f21500h)) + (this.f21496d * 2), i11, this.f21498f, this.f21499g, Shader.TileMode.CLAMP));
            }
            RectF rectF = this.f21505m;
            int i14 = this.f21501i;
            rectF.left = f + i14;
            rectF.top = i10;
            rectF.right = f + i14 + ((int) paint.measureText(this.f21500h)) + (this.f21496d * 2);
            RectF rectF2 = this.f21505m;
            rectF2.bottom = i11;
            int i15 = this.f21506n;
            canvas.drawRoundRect(rectF2, i15, i15, paint);
            paint.setShader(null);
            paint.setColor(this.f21494b);
            canvas.drawText(this.f21500h, f + this.f21501i + this.f21496d, ((i5 - this.f21497e) - i12) - this.f21504l.bottom, paint);
            paint.setColor(color);
        }
        iD = t100.d(1.0f);
        i6 = i3 + iD;
        int iHeight2 = this.f21504l.height() + (this.f21497e * 2);
        int i16 = i5 - i6;
        int i17 = i5 - (i16 / 2);
        int i18 = this.f21507o;
        int i19 = i17 - (i18 / 2);
        int i110 = i17 + (i18 / 2);
        int i111 = (i16 - iHeight2) / 2;
        if (this.f21498f != 0) {
            paint.setColor(this.f21503k);
        } else {
            paint.setColor(this.f21503k);
        }
        RectF rectF3 = this.f21505m;
        int i112 = this.f21501i;
        rectF3.left = f + i112;
        rectF3.top = i19;
        rectF3.right = f + i112 + ((int) paint.measureText(this.f21500h)) + (this.f21496d * 2);
        RectF rectF4 = this.f21505m;
        rectF4.bottom = i110;
        int i113 = this.f21506n;
        canvas.drawRoundRect(rectF4, i113, i113, paint);
        paint.setShader(null);
        paint.setColor(this.f21494b);
        canvas.drawText(this.f21500h, f + this.f21501i + this.f21496d, ((i5 - this.f21497e) - i111) - this.f21504l.bottom, paint);
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m24358e() {
        return TextUtils.equals("5", this.f21502j) || TextUtils.equals("6", this.f21502j);
    }

    /* JADX INFO: renamed from: f */
    public void m24359f() {
        this.f21498f = m24354a(h1c0.f11797j1);
        this.f21499g = m24354a(h1c0.f11797j1);
        this.f21494b = m24354a(h1c0.f11797j1);
        this.f21500h = ypv.e.getString(R$string.f2939Pe);
        this.f21497e = t100.d(10.0f);
        this.f21496d = t100.d(17.0f);
        this.f21501i = 0;
    }

    /* JADX INFO: renamed from: g */
    public void m24360g(String str, String str2) {
        this.f21502j = str;
        byte b = 0;
        this.f21495c = false;
        str.getClass();
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                    b = -1;
                }
                break;
            case 50:
                b = !str.equals("2") ? (byte) -1 : (byte) 1;
                break;
            case 51:
            default:
                b = -1;
                break;
            case 52:
                b = !str.equals("4") ? (byte) -1 : (byte) 2;
                break;
            case 53:
                b = !str.equals("5") ? (byte) -1 : (byte) 3;
                break;
            case 54:
                b = !str.equals("6") ? (byte) -1 : (byte) 4;
                break;
        }
        switch (b) {
            case 0:
                m24357d();
                break;
            case 1:
                m24359f();
                break;
            case 2:
                this.f21495c = true;
                break;
            case 3:
                m24363j();
                break;
            case 4:
                m24364k();
                break;
            default:
                m24362i(str2);
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f21495c) {
            return 0;
        }
        paint.setTextSize(t100.d(f21492p));
        if (fontMetricsInt != null && m24358e()) {
            fontMetricsInt.descent += t100.d(27.0f);
        }
        return ((int) paint.measureText(this.f21500h)) + this.f21501i + (this.f21496d * 2);
    }

    /* JADX INFO: renamed from: h */
    public void m24361h(boolean z) {
        this.f21495c = !z;
    }

    /* JADX INFO: renamed from: i */
    public void m24362i(String str) {
        this.f21498f = 0;
        this.f21499g = 0;
        this.f21503k = -1;
        this.f21494b = m24354a(h1c0.f11823s0);
        f21492p = 12;
        this.f21496d = t100.d(10.0f);
        this.f21497e = t100.d(2.0f);
        this.f21501i = 20;
        this.f21500h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m24363j() {
        this.f21498f = m24354a(h1c0.f11814p0);
        this.f21499g = m24354a(h1c0.f11814p0);
        this.f21494b = -1;
        this.f21500h = ypv.e.getString(R$string.f2669D4);
        f21492p = 13;
        this.f21497e = t100.d(8.0f);
        this.f21496d = m24356c();
        this.f21506n = t100.d(10.0f);
        this.f21507o = t100.d(34.0f);
    }

    /* JADX INFO: renamed from: k */
    public void m24364k() {
        this.f21498f = m24354a(h1c0.f11814p0);
        this.f21499g = m24354a(h1c0.f11814p0);
        this.f21494b = m24354a(h1c0.f11806m1);
        this.f21500h = ypv.e.getString(R$string.f2939Pe);
        f21492p = 13;
        this.f21497e = t100.d(8.0f);
        this.f21496d = m24356c();
        this.f21506n = t100.d(10.0f);
        this.f21507o = t100.d(34.0f);
    }
}
