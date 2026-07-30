package p003l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import l.c3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public Bitmap f4195i;

    /* JADX INFO: renamed from: j */
    public Rect f4196j;

    /* JADX INFO: renamed from: k */
    public RectF f4197k;

    /* JADX INFO: renamed from: l */
    public Paint f4198l;

    /* JADX INFO: renamed from: m */
    public Paint f4199m;

    /* JADX INFO: renamed from: n */
    public RectF f4200n;

    /* JADX INFO: renamed from: o */
    public int f4201o;

    /* JADX INFO: renamed from: p */
    public int f4202p;

    /* JADX INFO: renamed from: q */
    public int f4203q;

    /* JADX INFO: renamed from: r */
    public int f4204r;

    /* JADX INFO: renamed from: s */
    public float f4205s;

    /* JADX INFO: renamed from: t */
    public int f4206t;

    /* JADX INFO: renamed from: u */
    public int f4207u;

    /* JADX INFO: renamed from: v */
    public float f4208v;

    /* JADX INFO: renamed from: w */
    public float f4209w;

    /* JADX INFO: renamed from: x */
    public int[] f4210x;

    /* JADX INFO: renamed from: y */
    public int f4211y;

    /* JADX INFO: renamed from: z */
    public int f4212z;

    public hic0(Context context) {
        super(context);
        this.f4208v = 1.0f;
        this.f4209w = 0.0f;
        int[] iArr = {-98787, -39836};
        this.f4210x = iArr;
        this.f4211y = iArr[0];
        this.f4212z = 0;
        m4964l();
    }

    /* JADX INFO: renamed from: l */
    private void m4964l() {
        this.f4195i = BitmapFactory.decodeResource(m8300b().getResources(), c3c0.d4);
        Paint paint = new Paint();
        this.f4198l = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f4199m = paint2;
        paint2.setAntiAlias(true);
        this.f4200n = new RectF();
        this.f4196j = new Rect(0, 0, this.f4195i.getWidth(), this.f4195i.getHeight());
        this.f4197k = new RectF();
        this.f4203q = m8299a(42);
        this.f4204r = m8299a(56);
        this.f4201o = m8299a(16);
        this.f4202p = m8299a(42);
        this.f4206t = m8299a(24);
        this.f4207u = m8299a(24);
        this.f4205s = m8299a(12);
        RectF rectF = this.f4200n;
        int i = this.f4201o;
        int i2 = this.f4202p;
        rectF.set(i, i2, i + this.f4203q, i2 + this.f4204r);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        if (i == 0) {
            m4965m();
            this.f4212z = (i2 * 255) / 100;
            this.f4211y = this.f4210x[0];
            int i3 = this.f4203q;
            int i4 = (-i3) + ((i2 * (this.f4201o + i3)) / 100);
            int i5 = this.f4202p;
            this.f8230g.set(i4, i5, i4 + i3, i5 + this.f4204r);
            RectF rectF = this.f4200n;
            RectF rectF2 = this.f8230g;
            rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
            m4966n();
            return;
        }
        if (i == 1) {
            m4965m();
            this.f4212z = 255;
            int[] iArr = this.f4210x;
            this.f4211y = m8303e(iArr[0], iArr[1], i2);
            float f = i2;
            this.f4208v = ((0.3f * f) / 100.0f) + 1.0f;
            int i6 = this.f4203q;
            float f2 = i6 + (((i6 * 0.4f) * f) / 100.0f);
            this.f4209w = ((f * 0.25f) / 100.0f) * (-90.0f);
            RectF rectF3 = this.f8230g;
            int i7 = this.f4201o;
            int i8 = this.f4202p;
            rectF3.set(i7, i8, i7 + f2, i8 + this.f4204r);
            RectF rectF4 = this.f4200n;
            RectF rectF5 = this.f8230g;
            rectF4.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
            m4966n();
            return;
        }
        if (i == 2) {
            float f3 = this.f8230g.right + dic0.f3007b;
            float f4 = dic0.f3006a;
            int i9 = this.f4202p;
            float fM8302d = i9;
            float fM8302d2 = this.f4204r + i9;
            RectF rectF6 = this.f8231h;
            if (rectF6 != null) {
                f4 = rectF6.left;
                fM8302d = m8302d(i9, this.f8226c - rectF6.top, i2);
                fM8302d2 = m8302d(fM8302d2, this.f8226c - this.f8231h.bottom, i2);
            }
            RectF rectF7 = this.f8230g;
            float f5 = rectF7.left;
            float f6 = i2;
            float f7 = (f5 - (((f3 - f4) * f6) / 100.0f)) - (((f4 - f5) * f6) / 100.0f);
            this.f4212z = 255 - ((i2 * 255) / 100);
            this.f4200n.set(f7, fM8302d, (rectF7.right - f5) + f7, fM8302d2);
            m4966n();
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        this.f4198l.setColor(this.f4211y);
        this.f4198l.setAlpha(this.f4212z);
        RectF rectF = this.f4200n;
        float f = this.f4205s;
        canvas.drawRoundRect(rectF, f, f, this.f4198l);
        int iSave = canvas.save();
        float f2 = this.f4209w;
        RectF rectF2 = this.f4197k;
        canvas.rotate(f2, (rectF2.left + rectF2.right) / 2.0f, (rectF2.top + rectF2.bottom) / 2.0f);
        canvas.drawBitmap(this.f4195i, this.f4196j, this.f4197k, this.f4199m);
        canvas.restoreToCount(iSave);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
        mo3836f(this.f8227d, this.f8228e);
    }

    /* JADX INFO: renamed from: m */
    public final void m4965m() {
        this.f4208v = 1.0f;
        this.f4209w = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public final void m4966n() {
        RectF rectF = this.f4200n;
        float f = (rectF.right + rectF.left) / 2.0f;
        float f2 = (rectF.top + rectF.bottom) / 2.0f;
        RectF rectF2 = this.f4197k;
        int i = this.f4206t;
        float f3 = this.f4208v;
        rectF2.set(f - ((i * f3) / 2.0f), f2 - ((i * f3) / 2.0f), f + ((i * f3) / 2.0f), f2 + ((this.f4207u * f3) / 2.0f));
    }
}
