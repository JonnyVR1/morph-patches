package p009l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Arrays;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qed0 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public int f19172a;

    /* JADX INFO: renamed from: b */
    public int f19173b;

    /* JADX INFO: renamed from: c */
    public int[] f19174c;

    /* JADX INFO: renamed from: d */
    public int f19175d;

    /* JADX INFO: renamed from: e */
    public int f19176e;

    /* JADX INFO: renamed from: f */
    public float f19177f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C1137a> f19178g;

    /* JADX INFO: renamed from: h */
    public int f19179h;

    /* JADX INFO: renamed from: i */
    public int f19180i;

    /* JADX INFO: renamed from: j */
    public int f19181j;

    /* JADX INFO: renamed from: k */
    public int f19182k;

    /* JADX INFO: renamed from: l */
    public int f19183l;

    /* JADX INFO: renamed from: m */
    public int f19184m;

    /* JADX INFO: renamed from: n */
    public boolean f19185n;

    public qed0(int i, int i2, int i3, int i4, float f, int[] iArr) {
        ArrayList<C1137a> arrayList = new ArrayList<>();
        this.f19178g = arrayList;
        this.f19179h = 0;
        int i5 = t100.f;
        this.f19180i = i5;
        this.f19181j = i5;
        this.f19182k = 0;
        this.f19183l = 0;
        this.f19184m = 0;
        this.f19185n = true;
        this.f19172a = i;
        this.f19173b = i2;
        this.f19174c = iArr;
        this.f19175d = i3;
        this.f19176e = i4;
        this.f19177f = f;
        arrayList.add(new C1137a(i4, f, -1));
    }

    /* JADX INFO: renamed from: a */
    public qed0 m20897a(boolean z) {
        this.f19185n = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final float m20898b(Paint paint, CharSequence charSequence, int i, int i2) {
        return paint.measureText(charSequence, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m20899c(int i, int i2, int i3, int i4) {
        this.f19180i = i;
        this.f19181j = i3;
        this.f19182k = i2;
        this.f19183l = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m20900d(int i) {
        this.f19184m = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint paint2 = paint;
        int color = paint2.getColor();
        paint2.setColor(this.f19173b);
        int[] iArr = this.f19174c;
        if (iArr != null && iArr.length > 1) {
            int i7 = this.f19184m;
            float f2 = f + i7;
            float f3 = (f + this.f19179h) - i7;
            int[] iArr2 = this.f19174c;
            paint2.setShader(new LinearGradient(f2, 0.0f, f3, 0.0f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP));
        }
        float textSize = paint2.getTextSize();
        int flags = paint2.getFlags();
        int i8 = this.f19184m;
        RectF rectF = new RectF(f + i8, i3 - this.f19182k, (f + this.f19179h) - i8, (i5 - t100.a) + this.f19183l);
        int i9 = this.f19172a;
        canvas.drawRoundRect(rectF, i9, i9, paint2);
        paint2.setShader(null);
        float f4 = f + this.f19180i + this.f19184m;
        int i10 = this.f19175d;
        if (i10 != 0) {
            paint2.setColor(i10);
        } else {
            paint2.setColor(-1);
        }
        float fM20898b = f4;
        int i11 = i;
        for (C1137a c1137a : this.f19178g) {
            paint2.setFakeBoldText((c1137a.f19186a & 1) != 0);
            paint2.setTextSkewX((c1137a.f19186a & 2) != 0 ? -0.15f : 0.0f);
            int i12 = c1137a.f19190e;
            if (i12 >= 0) {
                paint2.setFlags(i12);
            } else {
                paint2.setFlags(flags);
            }
            float f5 = c1137a.f19187b;
            if (f5 > 0.0f) {
                paint2.setTextSize(f5);
            } else {
                paint2.setTextSize(textSize);
            }
            if (paint2.getFontMetrics() != null) {
                float f6 = i4 + paint2.getFontMetrics().ascent;
                int i13 = t100.a;
                if (f6 < i3 + i13) {
                    i6 = i4 + i13;
                } else {
                    i6 = i4;
                }
            } else {
                i6 = i4;
            }
            if (c1137a.f19189d) {
                i6 -= t100.a;
            }
            int i14 = i6 + ((this.f19182k - this.f19183l) / 2);
            int i15 = c1137a.f19188c;
            if (i15 < 0) {
                canvas.drawText(charSequence, i11, this.f19185n ? i2 + 1 : i2, fM20898b, i14, paint2);
                paint2 = paint;
                break;
            }
            float f7 = fM20898b;
            int i16 = i11;
            canvas.drawText(charSequence, i16, i15, f7, i14, paint);
            paint2 = paint;
            fM20898b = f7 + m20898b(paint2, charSequence, i16, c1137a.f19188c) + t100.d(1.0f);
            i11 = c1137a.f19188c;
        }
        paint2.setColor(color);
        paint2.setTextSize(textSize);
        paint2.setFlags(flags);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f19179h = 0;
        for (C1137a c1137a : this.f19178g) {
            float f = c1137a.f19187b;
            if (f > 0.0f) {
                paint.setTextSize(f);
            }
            int i3 = c1137a.f19188c;
            int i4 = this.f19179h;
            if (i3 < 0) {
                float f2 = i4;
                if (this.f19185n) {
                    i2++;
                }
                this.f19179h = (int) (f2 + m20898b(paint, charSequence, i, i2));
                break;
            }
            this.f19179h = (int) (i4 + m20898b(paint, charSequence, i, i3) + t100.a);
            i = c1137a.f19188c;
        }
        float f3 = this.f19177f;
        if (f3 > 0.0f) {
            paint.setTextSize(f3);
        } else {
            this.f19177f = paint.getTextSize();
        }
        int i5 = this.f19179h + this.f19180i + this.f19181j + (this.f19184m * 2);
        this.f19179h = i5;
        return i5;
    }

    /* JADX INFO: renamed from: l.qed0$a */
    public static class C1137a {

        /* JADX INFO: renamed from: a */
        public int f19186a;

        /* JADX INFO: renamed from: b */
        public float f19187b;

        /* JADX INFO: renamed from: c */
        public int f19188c;

        /* JADX INFO: renamed from: d */
        public boolean f19189d;

        /* JADX INFO: renamed from: e */
        public int f19190e;

        public C1137a(int i, float f, int i2, boolean z) {
            this.f19190e = -1;
            this.f19186a = i;
            this.f19187b = f;
            this.f19188c = i2;
            this.f19189d = z;
        }

        public C1137a(int i, float f, int i2) {
            this(i, f, i2, false);
        }
    }

    public qed0(int i, int i2, int i3, int i4, float f) {
        this(i, i2, i3, i4, f, null);
    }

    public qed0(int i, int i2, int i3, C1137a... c1137aArr) {
        ArrayList<C1137a> arrayList = new ArrayList<>();
        this.f19178g = arrayList;
        this.f19179h = 0;
        int i4 = t100.f;
        this.f19180i = i4;
        this.f19181j = i4;
        this.f19182k = 0;
        this.f19183l = 0;
        this.f19184m = 0;
        this.f19185n = true;
        this.f19172a = i;
        this.f19173b = i2;
        this.f19175d = i3;
        arrayList.addAll(Arrays.asList(c1137aArr));
    }
}
