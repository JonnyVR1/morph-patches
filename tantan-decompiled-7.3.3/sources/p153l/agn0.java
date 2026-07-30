package p153l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class agn0 extends ReplacementSpan {

    /* JADX INFO: renamed from: p */
    public static int f71250p = 14;

    /* JADX INFO: renamed from: a */
    public String f71251a;

    /* JADX INFO: renamed from: b */
    public int f71252b;

    /* JADX INFO: renamed from: c */
    public boolean f71253c;

    /* JADX INFO: renamed from: f */
    public int f71256f;

    /* JADX INFO: renamed from: g */
    public int f71257g;

    /* JADX INFO: renamed from: h */
    public String f71258h;

    /* JADX INFO: renamed from: i */
    public int f71259i;

    /* JADX INFO: renamed from: j */
    public String f71260j;

    /* JADX INFO: renamed from: k */
    public int f71261k;

    /* JADX INFO: renamed from: d */
    public int f71254d = qa00.m175859d(17.0f);

    /* JADX INFO: renamed from: e */
    public int f71255e = qa00.m175859d(5.0f);

    /* JADX INFO: renamed from: n */
    public int f71264n = qa00.m175859d(6.0f);

    /* JADX INFO: renamed from: o */
    public int f71265o = qa00.m175859d(21.0f);

    /* JADX INFO: renamed from: l */
    public Rect f71262l = new Rect();

    /* JADX INFO: renamed from: m */
    public RectF f71263m = new RectF();

    public agn0(String str) {
        this.f71251a = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m97703a(int i) {
        return zrv.f205803e.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public String m97704b() {
        return this.f71251a;
    }

    /* JADX INFO: renamed from: c */
    public final int m97705c() {
        Paint paint = new Paint();
        paint.setTextSize(qa00.m175859d(f71250p));
        return ((bnl0.m105592y0() - qa00.m175859d(179.0f)) - ((int) paint.measureText(this.f71258h))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public void m97706d() {
        this.f71256f = m97703a(n9c0.f140864s0);
        this.f71257g = m97703a(n9c0.f140764D0);
        this.f71252b = -1;
        this.f71258h = zrv.f205803e.getString(R$string.f47475D4);
        this.f71255e = qa00.m175859d(10.0f);
        this.f71254d = qa00.m175859d(24.0f);
        this.f71259i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM175859d;
        int i6;
        int color = paint.getColor();
        paint.setTextSize(qa00.m175859d(f71250p));
        String str = this.f71258h;
        paint.getTextBounds(str, 0, str.length() - 1, this.f71262l);
        if (!"5".equals(this.f71260j) && !Constants.VIA_SHARE_TYPE_INFO.equals(this.f71260j)) {
            if ("3".equals(this.f71260j)) {
                i6 = i3;
            } else {
                iM175859d = qa00.m175859d(12.0f);
            }
            int iHeight = this.f71262l.height() + (this.f71255e * 2);
            int i7 = i5 - i6;
            int i8 = i5 - (i7 / 2);
            int i9 = this.f71265o;
            int i10 = i8 - (i9 / 2);
            int i11 = i8 + (i9 / 2);
            int i12 = (i7 - iHeight) / 2;
            if (this.f71256f != 0 || this.f71257g == 0) {
                paint.setColor(this.f71261k);
            } else {
                int i13 = this.f71259i;
                paint.setShader(new LinearGradient(f + i13, i10, f + i13 + ((int) paint.measureText(this.f71258h)) + (this.f71254d * 2), i11, this.f71256f, this.f71257g, Shader.TileMode.CLAMP));
            }
            RectF rectF = this.f71263m;
            int i14 = this.f71259i;
            rectF.left = f + i14;
            rectF.top = i10;
            rectF.right = f + i14 + ((int) paint.measureText(this.f71258h)) + (this.f71254d * 2);
            RectF rectF2 = this.f71263m;
            rectF2.bottom = i11;
            int i15 = this.f71264n;
            canvas.drawRoundRect(rectF2, i15, i15, paint);
            paint.setShader(null);
            paint.setColor(this.f71252b);
            canvas.drawText(this.f71258h, f + this.f71259i + this.f71254d, ((i5 - this.f71255e) - i12) - this.f71262l.bottom, paint);
            paint.setColor(color);
        }
        iM175859d = qa00.m175859d(1.0f);
        i6 = i3 + iM175859d;
        int iHeight2 = this.f71262l.height() + (this.f71255e * 2);
        int i16 = i5 - i6;
        int i17 = i5 - (i16 / 2);
        int i18 = this.f71265o;
        int i19 = i17 - (i18 / 2);
        int i110 = i17 + (i18 / 2);
        int i111 = (i16 - iHeight2) / 2;
        if (this.f71256f != 0) {
            paint.setColor(this.f71261k);
        } else {
            paint.setColor(this.f71261k);
        }
        RectF rectF3 = this.f71263m;
        int i112 = this.f71259i;
        rectF3.left = f + i112;
        rectF3.top = i19;
        rectF3.right = f + i112 + ((int) paint.measureText(this.f71258h)) + (this.f71254d * 2);
        RectF rectF4 = this.f71263m;
        rectF4.bottom = i110;
        int i113 = this.f71264n;
        canvas.drawRoundRect(rectF4, i113, i113, paint);
        paint.setShader(null);
        paint.setColor(this.f71252b);
        canvas.drawText(this.f71258h, f + this.f71259i + this.f71254d, ((i5 - this.f71255e) - i111) - this.f71262l.bottom, paint);
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m97707e() {
        return TextUtils.equals("5", this.f71260j) || TextUtils.equals(Constants.VIA_SHARE_TYPE_INFO, this.f71260j);
    }

    /* JADX INFO: renamed from: f */
    public void m97708f() {
        this.f71256f = m97703a(n9c0.f140838j1);
        this.f71257g = m97703a(n9c0.f140838j1);
        this.f71252b = m97703a(n9c0.f140838j1);
        this.f71258h = zrv.f205803e.getString(R$string.f47745Pe);
        this.f71255e = qa00.m175859d(10.0f);
        this.f71254d = qa00.m175859d(17.0f);
        this.f71259i = 0;
    }

    /* JADX INFO: renamed from: g */
    public void m97709g(String str, String str2) {
        this.f71260j = str;
        byte b = 0;
        this.f71253c = false;
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
                b = !str.equals(Constants.VIA_SHARE_TYPE_INFO) ? (byte) -1 : (byte) 4;
                break;
        }
        switch (b) {
            case 0:
                m97706d();
                break;
            case 1:
                m97708f();
                break;
            case 2:
                this.f71253c = true;
                break;
            case 3:
                m97712j();
                break;
            case 4:
                m97713k();
                break;
            default:
                m97711i(str2);
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f71253c) {
            return 0;
        }
        paint.setTextSize(qa00.m175859d(f71250p));
        if (fontMetricsInt != null && m97707e()) {
            fontMetricsInt.descent += qa00.m175859d(27.0f);
        }
        return ((int) paint.measureText(this.f71258h)) + this.f71259i + (this.f71254d * 2);
    }

    /* JADX INFO: renamed from: h */
    public void m97710h(boolean z) {
        this.f71253c = !z;
    }

    /* JADX INFO: renamed from: i */
    public void m97711i(String str) {
        this.f71256f = 0;
        this.f71257g = 0;
        this.f71261k = -1;
        this.f71252b = m97703a(n9c0.f140864s0);
        f71250p = 12;
        this.f71254d = qa00.m175859d(10.0f);
        this.f71255e = qa00.m175859d(2.0f);
        this.f71259i = 20;
        this.f71258h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m97712j() {
        this.f71256f = m97703a(n9c0.f140855p0);
        this.f71257g = m97703a(n9c0.f140855p0);
        this.f71252b = -1;
        this.f71258h = zrv.f205803e.getString(R$string.f47475D4);
        f71250p = 13;
        this.f71255e = qa00.m175859d(8.0f);
        this.f71254d = m97705c();
        this.f71264n = qa00.m175859d(10.0f);
        this.f71265o = qa00.m175859d(34.0f);
    }

    /* JADX INFO: renamed from: k */
    public void m97713k() {
        this.f71256f = m97703a(n9c0.f140855p0);
        this.f71257g = m97703a(n9c0.f140855p0);
        this.f71252b = m97703a(n9c0.f140847m1);
        this.f71258h = zrv.f205803e.getString(R$string.f47745Pe);
        f71250p = 13;
        this.f71255e = qa00.m175859d(8.0f);
        this.f71254d = m97705c();
        this.f71264n = qa00.m175859d(10.0f);
        this.f71265o = qa00.m175859d(34.0f);
    }
}
