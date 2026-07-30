package p153l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class smd0 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public int f169555a;

    /* JADX INFO: renamed from: b */
    public int f169556b;

    /* JADX INFO: renamed from: c */
    public int[] f169557c;

    /* JADX INFO: renamed from: d */
    public int f169558d;

    /* JADX INFO: renamed from: e */
    public int f169559e;

    /* JADX INFO: renamed from: f */
    public float f169560f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C20104a> f169561g;

    /* JADX INFO: renamed from: h */
    public int f169562h;

    /* JADX INFO: renamed from: i */
    public int f169563i;

    /* JADX INFO: renamed from: j */
    public int f169564j;

    /* JADX INFO: renamed from: k */
    public int f169565k;

    /* JADX INFO: renamed from: l */
    public int f169566l;

    /* JADX INFO: renamed from: m */
    public int f169567m;

    /* JADX INFO: renamed from: n */
    public boolean f169568n;

    public smd0(int i, int i2, int i3, int i4, float f, int[] iArr) {
        ArrayList<C20104a> arrayList = new ArrayList<>();
        this.f169561g = arrayList;
        this.f169562h = 0;
        int i5 = qa00.f156319f;
        this.f169563i = i5;
        this.f169564j = i5;
        this.f169565k = 0;
        this.f169566l = 0;
        this.f169567m = 0;
        this.f169568n = true;
        this.f169555a = i;
        this.f169556b = i2;
        this.f169557c = iArr;
        this.f169558d = i3;
        this.f169559e = i4;
        this.f169560f = f;
        arrayList.add(new C20104a(i4, f, -1));
    }

    /* JADX INFO: renamed from: a */
    public smd0 m186804a(boolean z) {
        this.f169568n = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final float m186805b(Paint paint, CharSequence charSequence, int i, int i2) {
        return paint.measureText(charSequence, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m186806c(int i, int i2, int i3, int i4) {
        this.f169563i = i;
        this.f169564j = i3;
        this.f169565k = i2;
        this.f169566l = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m186807d(int i) {
        this.f169567m = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint paint2 = paint;
        int color = paint2.getColor();
        paint2.setColor(this.f169556b);
        int[] iArr = this.f169557c;
        if (iArr != null && iArr.length > 1) {
            int i7 = this.f169567m;
            float f2 = f + i7;
            float f3 = (f + this.f169562h) - i7;
            int[] iArr2 = this.f169557c;
            paint2.setShader(new LinearGradient(f2, 0.0f, f3, 0.0f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP));
        }
        float textSize = paint2.getTextSize();
        int flags = paint2.getFlags();
        int i8 = this.f169567m;
        RectF rectF = new RectF(f + i8, i3 - this.f169565k, (f + this.f169562h) - i8, (i5 - qa00.f156314a) + this.f169566l);
        int i9 = this.f169555a;
        canvas.drawRoundRect(rectF, i9, i9, paint2);
        paint2.setShader(null);
        float f4 = f + this.f169563i + this.f169567m;
        int i10 = this.f169558d;
        if (i10 != 0) {
            paint2.setColor(i10);
        } else {
            paint2.setColor(-1);
        }
        float fM186805b = f4;
        int i11 = i;
        for (C20104a c20104a : this.f169561g) {
            paint2.setFakeBoldText((c20104a.f169569a & 1) != 0);
            paint2.setTextSkewX((c20104a.f169569a & 2) != 0 ? -0.15f : 0.0f);
            int i12 = c20104a.f169573e;
            if (i12 >= 0) {
                paint2.setFlags(i12);
            } else {
                paint2.setFlags(flags);
            }
            float f5 = c20104a.f169570b;
            if (f5 > 0.0f) {
                paint2.setTextSize(f5);
            } else {
                paint2.setTextSize(textSize);
            }
            if (paint2.getFontMetrics() != null) {
                float f6 = i4 + paint2.getFontMetrics().ascent;
                int i13 = qa00.f156314a;
                if (f6 < i3 + i13) {
                    i6 = i4 + i13;
                } else {
                    i6 = i4;
                }
            } else {
                i6 = i4;
            }
            if (c20104a.f169572d) {
                i6 -= qa00.f156314a;
            }
            int i14 = i6 + ((this.f169565k - this.f169566l) / 2);
            int i15 = c20104a.f169571c;
            if (i15 < 0) {
                canvas.drawText(charSequence, i11, this.f169568n ? i2 + 1 : i2, fM186805b, i14, paint2);
                paint2 = paint;
                break;
            }
            float f7 = fM186805b;
            int i16 = i11;
            canvas.drawText(charSequence, i16, i15, f7, i14, paint);
            paint2 = paint;
            fM186805b = f7 + m186805b(paint2, charSequence, i16, c20104a.f169571c) + qa00.m175859d(1.0f);
            i11 = c20104a.f169571c;
        }
        paint2.setColor(color);
        paint2.setTextSize(textSize);
        paint2.setFlags(flags);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f169562h = 0;
        for (C20104a c20104a : this.f169561g) {
            float f = c20104a.f169570b;
            if (f > 0.0f) {
                paint.setTextSize(f);
            }
            int i3 = c20104a.f169571c;
            int i4 = this.f169562h;
            if (i3 < 0) {
                float f2 = i4;
                if (this.f169568n) {
                    i2++;
                }
                this.f169562h = (int) (f2 + m186805b(paint, charSequence, i, i2));
                break;
            }
            this.f169562h = (int) (i4 + m186805b(paint, charSequence, i, i3) + qa00.f156314a);
            i = c20104a.f169571c;
        }
        float f3 = this.f169560f;
        if (f3 > 0.0f) {
            paint.setTextSize(f3);
        } else {
            this.f169560f = paint.getTextSize();
        }
        int i5 = this.f169562h + this.f169563i + this.f169564j + (this.f169567m * 2);
        this.f169562h = i5;
        return i5;
    }

    /* JADX INFO: renamed from: l.smd0$a */
    public static class C20104a {

        /* JADX INFO: renamed from: a */
        public int f169569a;

        /* JADX INFO: renamed from: b */
        public float f169570b;

        /* JADX INFO: renamed from: c */
        public int f169571c;

        /* JADX INFO: renamed from: d */
        public boolean f169572d;

        /* JADX INFO: renamed from: e */
        public int f169573e;

        public C20104a(int i, float f, int i2, boolean z) {
            this.f169573e = -1;
            this.f169569a = i;
            this.f169570b = f;
            this.f169571c = i2;
            this.f169572d = z;
        }

        public C20104a(int i, float f, int i2) {
            this(i, f, i2, false);
        }
    }

    public smd0(int i, int i2, int i3, int i4, float f) {
        this(i, i2, i3, i4, f, null);
    }

    public smd0(int i, int i2, int i3, C20104a... c20104aArr) {
        ArrayList<C20104a> arrayList = new ArrayList<>();
        this.f169561g = arrayList;
        this.f169562h = 0;
        int i4 = qa00.f156319f;
        this.f169563i = i4;
        this.f169564j = i4;
        this.f169565k = 0;
        this.f169566l = 0;
        this.f169567m = 0;
        this.f169568n = true;
        this.f169555a = i;
        this.f169556b = i2;
        this.f169558d = i3;
        arrayList.addAll(Arrays.asList(c20104aArr));
    }
}
