package p149l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class w6n0 extends ReplacementSpan {

    /* JADX INFO: renamed from: p */
    public static int f184934p = 14;

    /* JADX INFO: renamed from: a */
    public String f184935a;

    /* JADX INFO: renamed from: b */
    public int f184936b;

    /* JADX INFO: renamed from: c */
    public boolean f184937c;

    /* JADX INFO: renamed from: f */
    public int f184940f;

    /* JADX INFO: renamed from: g */
    public int f184941g;

    /* JADX INFO: renamed from: h */
    public String f184942h;

    /* JADX INFO: renamed from: i */
    public int f184943i;

    /* JADX INFO: renamed from: j */
    public String f184944j;

    /* JADX INFO: renamed from: k */
    public int f184945k;

    /* JADX INFO: renamed from: d */
    public int f184938d = t100.m186890d(17.0f);

    /* JADX INFO: renamed from: e */
    public int f184939e = t100.m186890d(5.0f);

    /* JADX INFO: renamed from: n */
    public int f184948n = t100.m186890d(6.0f);

    /* JADX INFO: renamed from: o */
    public int f184949o = t100.m186890d(21.0f);

    /* JADX INFO: renamed from: l */
    public Rect f184946l = new Rect();

    /* JADX INFO: renamed from: m */
    public RectF f184947m = new RectF();

    public w6n0(String str) {
        this.f184935a = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m201885a(int i) {
        return ypv.f199497e.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public String m201886b() {
        return this.f184935a;
    }

    /* JADX INFO: renamed from: c */
    public final int m201887c() {
        Paint paint = new Paint();
        paint.setTextSize(t100.m186890d(f184934p));
        return ((xdl0.m208412y0() - t100.m186890d(179.0f)) - ((int) paint.measureText(this.f184942h))) / 2;
    }

    /* JADX INFO: renamed from: d */
    public void m201888d() {
        this.f184940f = m201885a(h1c0.f105403s0);
        this.f184941g = m201885a(h1c0.f105303D0);
        this.f184936b = -1;
        this.f184942h = ypv.f199497e.getString(R$string.f46627D4);
        this.f184939e = t100.m186890d(10.0f);
        this.f184938d = t100.m186890d(24.0f);
        this.f184943i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM186890d;
        int i6;
        int color = paint.getColor();
        paint.setTextSize(t100.m186890d(f184934p));
        String str = this.f184942h;
        paint.getTextBounds(str, 0, str.length() - 1, this.f184946l);
        if (!"5".equals(this.f184944j) && !Constants.VIA_SHARE_TYPE_INFO.equals(this.f184944j)) {
            if ("3".equals(this.f184944j)) {
                i6 = i3;
            } else {
                iM186890d = t100.m186890d(12.0f);
            }
            int iHeight = this.f184946l.height() + (this.f184939e * 2);
            int i7 = i5 - i6;
            int i8 = i5 - (i7 / 2);
            int i9 = this.f184949o;
            int i10 = i8 - (i9 / 2);
            int i11 = i8 + (i9 / 2);
            int i12 = (i7 - iHeight) / 2;
            if (this.f184940f != 0 || this.f184941g == 0) {
                paint.setColor(this.f184945k);
            } else {
                int i13 = this.f184943i;
                paint.setShader(new LinearGradient(f + i13, i10, f + i13 + ((int) paint.measureText(this.f184942h)) + (this.f184938d * 2), i11, this.f184940f, this.f184941g, Shader.TileMode.CLAMP));
            }
            RectF rectF = this.f184947m;
            int i14 = this.f184943i;
            rectF.left = f + i14;
            rectF.top = i10;
            rectF.right = f + i14 + ((int) paint.measureText(this.f184942h)) + (this.f184938d * 2);
            RectF rectF2 = this.f184947m;
            rectF2.bottom = i11;
            int i15 = this.f184948n;
            canvas.drawRoundRect(rectF2, i15, i15, paint);
            paint.setShader(null);
            paint.setColor(this.f184936b);
            canvas.drawText(this.f184942h, f + this.f184943i + this.f184938d, ((i5 - this.f184939e) - i12) - this.f184946l.bottom, paint);
            paint.setColor(color);
        }
        iM186890d = t100.m186890d(1.0f);
        i6 = i3 + iM186890d;
        int iHeight2 = this.f184946l.height() + (this.f184939e * 2);
        int i16 = i5 - i6;
        int i17 = i5 - (i16 / 2);
        int i18 = this.f184949o;
        int i19 = i17 - (i18 / 2);
        int i110 = i17 + (i18 / 2);
        int i111 = (i16 - iHeight2) / 2;
        if (this.f184940f != 0) {
            paint.setColor(this.f184945k);
        } else {
            paint.setColor(this.f184945k);
        }
        RectF rectF3 = this.f184947m;
        int i112 = this.f184943i;
        rectF3.left = f + i112;
        rectF3.top = i19;
        rectF3.right = f + i112 + ((int) paint.measureText(this.f184942h)) + (this.f184938d * 2);
        RectF rectF4 = this.f184947m;
        rectF4.bottom = i110;
        int i113 = this.f184948n;
        canvas.drawRoundRect(rectF4, i113, i113, paint);
        paint.setShader(null);
        paint.setColor(this.f184936b);
        canvas.drawText(this.f184942h, f + this.f184943i + this.f184938d, ((i5 - this.f184939e) - i111) - this.f184946l.bottom, paint);
        paint.setColor(color);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m201889e() {
        return TextUtils.equals("5", this.f184944j) || TextUtils.equals(Constants.VIA_SHARE_TYPE_INFO, this.f184944j);
    }

    /* JADX INFO: renamed from: f */
    public void m201890f() {
        this.f184940f = m201885a(h1c0.f105377j1);
        this.f184941g = m201885a(h1c0.f105377j1);
        this.f184936b = m201885a(h1c0.f105377j1);
        this.f184942h = ypv.f199497e.getString(R$string.f46897Pe);
        this.f184939e = t100.m186890d(10.0f);
        this.f184938d = t100.m186890d(17.0f);
        this.f184943i = 0;
    }

    /* JADX INFO: renamed from: g */
    public void m201891g(String str, String str2) {
        this.f184944j = str;
        byte b = 0;
        this.f184937c = false;
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
                m201888d();
                break;
            case 1:
                m201890f();
                break;
            case 2:
                this.f184937c = true;
                break;
            case 3:
                m201894j();
                break;
            case 4:
                m201895k();
                break;
            default:
                m201893i(str2);
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f184937c) {
            return 0;
        }
        paint.setTextSize(t100.m186890d(f184934p));
        if (fontMetricsInt != null && m201889e()) {
            fontMetricsInt.descent += t100.m186890d(27.0f);
        }
        return ((int) paint.measureText(this.f184942h)) + this.f184943i + (this.f184938d * 2);
    }

    /* JADX INFO: renamed from: h */
    public void m201892h(boolean z) {
        this.f184937c = !z;
    }

    /* JADX INFO: renamed from: i */
    public void m201893i(String str) {
        this.f184940f = 0;
        this.f184941g = 0;
        this.f184945k = -1;
        this.f184936b = m201885a(h1c0.f105403s0);
        f184934p = 12;
        this.f184938d = t100.m186890d(10.0f);
        this.f184939e = t100.m186890d(2.0f);
        this.f184943i = 20;
        this.f184942h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m201894j() {
        this.f184940f = m201885a(h1c0.f105394p0);
        this.f184941g = m201885a(h1c0.f105394p0);
        this.f184936b = -1;
        this.f184942h = ypv.f199497e.getString(R$string.f46627D4);
        f184934p = 13;
        this.f184939e = t100.m186890d(8.0f);
        this.f184938d = m201887c();
        this.f184948n = t100.m186890d(10.0f);
        this.f184949o = t100.m186890d(34.0f);
    }

    /* JADX INFO: renamed from: k */
    public void m201895k() {
        this.f184940f = m201885a(h1c0.f105394p0);
        this.f184941g = m201885a(h1c0.f105394p0);
        this.f184936b = m201885a(h1c0.f105386m1);
        this.f184942h = ypv.f199497e.getString(R$string.f46897Pe);
        f184934p = 13;
        this.f184939e = t100.m186890d(8.0f);
        this.f184938d = m201887c();
        this.f184948n = t100.m186890d(10.0f);
        this.f184949o = t100.m186890d(34.0f);
    }
}
