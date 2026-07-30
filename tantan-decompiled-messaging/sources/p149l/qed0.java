package p149l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class qed0 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public int f154006a;

    /* JADX INFO: renamed from: b */
    public int f154007b;

    /* JADX INFO: renamed from: c */
    public int[] f154008c;

    /* JADX INFO: renamed from: d */
    public int f154009d;

    /* JADX INFO: renamed from: e */
    public int f154010e;

    /* JADX INFO: renamed from: f */
    public float f154011f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C19470a> f154012g;

    /* JADX INFO: renamed from: h */
    public int f154013h;

    /* JADX INFO: renamed from: i */
    public int f154014i;

    /* JADX INFO: renamed from: j */
    public int f154015j;

    /* JADX INFO: renamed from: k */
    public int f154016k;

    /* JADX INFO: renamed from: l */
    public int f154017l;

    /* JADX INFO: renamed from: m */
    public int f154018m;

    /* JADX INFO: renamed from: n */
    public boolean f154019n;

    public qed0(int i, int i2, int i3, int i4, float f, int[] iArr) {
        ArrayList<C19470a> arrayList = new ArrayList<>();
        this.f154012g = arrayList;
        this.f154013h = 0;
        int i5 = t100.f167257f;
        this.f154014i = i5;
        this.f154015j = i5;
        this.f154016k = 0;
        this.f154017l = 0;
        this.f154018m = 0;
        this.f154019n = true;
        this.f154006a = i;
        this.f154007b = i2;
        this.f154008c = iArr;
        this.f154009d = i3;
        this.f154010e = i4;
        this.f154011f = f;
        arrayList.add(new C19470a(i4, f, -1));
    }

    /* JADX INFO: renamed from: a */
    public qed0 m174188a(boolean z) {
        this.f154019n = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final float m174189b(Paint paint, CharSequence charSequence, int i, int i2) {
        return paint.measureText(charSequence, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m174190c(int i, int i2, int i3, int i4) {
        this.f154014i = i;
        this.f154015j = i3;
        this.f154016k = i2;
        this.f154017l = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m174191d(int i) {
        this.f154018m = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint paint2 = paint;
        int color = paint2.getColor();
        paint2.setColor(this.f154007b);
        int[] iArr = this.f154008c;
        if (iArr != null && iArr.length > 1) {
            int i7 = this.f154018m;
            float f2 = f + i7;
            float f3 = (f + this.f154013h) - i7;
            int[] iArr2 = this.f154008c;
            paint2.setShader(new LinearGradient(f2, 0.0f, f3, 0.0f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP));
        }
        float textSize = paint2.getTextSize();
        int flags = paint2.getFlags();
        int i8 = this.f154018m;
        RectF rectF = new RectF(f + i8, i3 - this.f154016k, (f + this.f154013h) - i8, (i5 - t100.f167252a) + this.f154017l);
        int i9 = this.f154006a;
        canvas.drawRoundRect(rectF, i9, i9, paint2);
        paint2.setShader(null);
        float f4 = f + this.f154014i + this.f154018m;
        int i10 = this.f154009d;
        if (i10 != 0) {
            paint2.setColor(i10);
        } else {
            paint2.setColor(-1);
        }
        float fM174189b = f4;
        int i11 = i;
        for (C19470a c19470a : this.f154012g) {
            paint2.setFakeBoldText((c19470a.f154020a & 1) != 0);
            paint2.setTextSkewX((c19470a.f154020a & 2) != 0 ? -0.15f : 0.0f);
            int i12 = c19470a.f154024e;
            if (i12 >= 0) {
                paint2.setFlags(i12);
            } else {
                paint2.setFlags(flags);
            }
            float f5 = c19470a.f154021b;
            if (f5 > 0.0f) {
                paint2.setTextSize(f5);
            } else {
                paint2.setTextSize(textSize);
            }
            if (paint2.getFontMetrics() != null) {
                float f6 = i4 + paint2.getFontMetrics().ascent;
                int i13 = t100.f167252a;
                if (f6 < i3 + i13) {
                    i6 = i4 + i13;
                } else {
                    i6 = i4;
                }
            } else {
                i6 = i4;
            }
            if (c19470a.f154023d) {
                i6 -= t100.f167252a;
            }
            int i14 = i6 + ((this.f154016k - this.f154017l) / 2);
            int i15 = c19470a.f154022c;
            if (i15 < 0) {
                canvas.drawText(charSequence, i11, this.f154019n ? i2 + 1 : i2, fM174189b, i14, paint2);
                paint2 = paint;
                break;
            }
            float f7 = fM174189b;
            int i16 = i11;
            canvas.drawText(charSequence, i16, i15, f7, i14, paint);
            paint2 = paint;
            fM174189b = f7 + m174189b(paint2, charSequence, i16, c19470a.f154022c) + t100.m186890d(1.0f);
            i11 = c19470a.f154022c;
        }
        paint2.setColor(color);
        paint2.setTextSize(textSize);
        paint2.setFlags(flags);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f154013h = 0;
        for (C19470a c19470a : this.f154012g) {
            float f = c19470a.f154021b;
            if (f > 0.0f) {
                paint.setTextSize(f);
            }
            int i3 = c19470a.f154022c;
            int i4 = this.f154013h;
            if (i3 < 0) {
                float f2 = i4;
                if (this.f154019n) {
                    i2++;
                }
                this.f154013h = (int) (f2 + m174189b(paint, charSequence, i, i2));
                break;
            }
            this.f154013h = (int) (i4 + m174189b(paint, charSequence, i, i3) + t100.f167252a);
            i = c19470a.f154022c;
        }
        float f3 = this.f154011f;
        if (f3 > 0.0f) {
            paint.setTextSize(f3);
        } else {
            this.f154011f = paint.getTextSize();
        }
        int i5 = this.f154013h + this.f154014i + this.f154015j + (this.f154018m * 2);
        this.f154013h = i5;
        return i5;
    }

    /* JADX INFO: renamed from: l.qed0$a */
    public static class C19470a {

        /* JADX INFO: renamed from: a */
        public int f154020a;

        /* JADX INFO: renamed from: b */
        public float f154021b;

        /* JADX INFO: renamed from: c */
        public int f154022c;

        /* JADX INFO: renamed from: d */
        public boolean f154023d;

        /* JADX INFO: renamed from: e */
        public int f154024e;

        public C19470a(int i, float f, int i2, boolean z) {
            this.f154024e = -1;
            this.f154020a = i;
            this.f154021b = f;
            this.f154022c = i2;
            this.f154023d = z;
        }

        public C19470a(int i, float f, int i2) {
            this(i, f, i2, false);
        }
    }

    public qed0(int i, int i2, int i3, int i4, float f) {
        this(i, i2, i3, i4, f, null);
    }

    public qed0(int i, int i2, int i3, C19470a... c19470aArr) {
        ArrayList<C19470a> arrayList = new ArrayList<>();
        this.f154012g = arrayList;
        this.f154013h = 0;
        int i4 = t100.f167257f;
        this.f154014i = i4;
        this.f154015j = i4;
        this.f154016k = 0;
        this.f154017l = 0;
        this.f154018m = 0;
        this.f154019n = true;
        this.f154006a = i;
        this.f154007b = i2;
        this.f154009d = i3;
        arrayList.addAll(Arrays.asList(c19470aArr));
    }
}
