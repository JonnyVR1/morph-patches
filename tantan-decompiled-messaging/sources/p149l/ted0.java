package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class ted0 implements sed0 {

    /* JADX INFO: renamed from: a */
    public Context f169812a;

    /* JADX INFO: renamed from: b */
    public View f169813b;

    /* JADX INFO: renamed from: c */
    public Paint f169814c;

    /* JADX INFO: renamed from: d */
    public RectF f169815d;

    /* JADX INFO: renamed from: e */
    public RectF f169816e;

    /* JADX INFO: renamed from: f */
    public RectF f169817f;

    /* JADX INFO: renamed from: g */
    public Path f169818g;

    /* JADX INFO: renamed from: h */
    public Path f169819h;

    /* JADX INFO: renamed from: i */
    public Xfermode f169820i;

    /* JADX INFO: renamed from: j */
    public boolean f169821j;

    /* JADX INFO: renamed from: k */
    public float[] f169822k;

    /* JADX INFO: renamed from: l */
    public float[] f169823l;

    /* JADX INFO: renamed from: m */
    public int f169824m;

    /* JADX INFO: renamed from: n */
    public int f169825n;

    /* JADX INFO: renamed from: o */
    public int f169826o;

    /* JADX INFO: renamed from: p */
    public float f169827p;

    /* JADX INFO: renamed from: q */
    public float f169828q;

    /* JADX INFO: renamed from: r */
    public float f169829r;

    /* JADX INFO: renamed from: s */
    public float f169830s;

    /* JADX INFO: renamed from: t */
    public float f169831t;

    @Override // p149l.sed0
    /* JADX INFO: renamed from: a */
    public void mo183598a(boolean z) {
        this.f169821j = z;
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: b */
    public void mo183599b(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        float fM205535a = wtd.m205535a(context, f);
        this.f169828q = fM205535a;
        this.f169829r = fM205535a;
        this.f169830s = fM205535a;
        this.f169831t = fM205535a;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: c */
    public void mo183600c(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        this.f169828q = wtd.m205535a(context, f);
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: d */
    public void mo183601d(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        float fM205535a = wtd.m205535a(context, f);
        this.f169828q = fM205535a;
        this.f169829r = fM205535a;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: e */
    public void mo183602e(int i) {
        this.f169826o = i;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: f */
    public void mo183603f(Canvas canvas) {
        this.f169814c.reset();
        this.f169818g.reset();
        this.f169814c.setAntiAlias(true);
        this.f169814c.setStyle(Paint.Style.FILL);
        this.f169814c.setXfermode(this.f169820i);
        Path path = this.f169818g;
        RectF rectF = this.f169815d;
        float[] fArr = this.f169822k;
        Path.Direction direction = Path.Direction.CCW;
        path.addRoundRect(rectF, fArr, direction);
        this.f169819h.reset();
        this.f169819h.addRect(this.f169817f, direction);
        this.f169819h.op(this.f169818g, Path.Op.DIFFERENCE);
        canvas.drawPath(this.f169819h, this.f169814c);
        this.f169814c.setXfermode(null);
        canvas.restore();
        this.f169814c.setXfermode(null);
        if (this.f169827p > 0.0f) {
            this.f169814c.setStyle(Paint.Style.STROKE);
            this.f169814c.setStrokeWidth(this.f169827p);
            this.f169814c.setColor(this.f169826o);
            this.f169818g.reset();
            this.f169818g.addRoundRect(this.f169816e, this.f169823l, direction);
            canvas.drawPath(this.f169818g, this.f169814c);
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: g */
    public void mo183604g(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        float fM205535a = wtd.m205535a(context, f);
        this.f169829r = fM205535a;
        this.f169831t = fM205535a;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: h */
    public void mo183605h(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        float fM205535a = wtd.m205535a(context, f);
        this.f169828q = fM205535a;
        this.f169830s = fM205535a;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: i */
    public void mo183606i(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        this.f169831t = wtd.m205535a(context, f);
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: j */
    public void mo183607j(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        this.f169827p = wtd.m205535a(context, f);
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: k */
    public void mo183608k(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        this.f169830s = wtd.m205535a(context, f);
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: l */
    public void mo183609l(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        float fM205535a = wtd.m205535a(context, f);
        this.f169830s = fM205535a;
        this.f169831t = fM205535a;
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: m */
    public void mo183610m(Canvas canvas) {
        canvas.saveLayer(this.f169815d, null, 31);
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: n */
    public void mo183611n(float f) {
        Context context = this.f169812a;
        if (context == null) {
            return;
        }
        this.f169829r = wtd.m205535a(context, f);
        if (this.f169813b != null) {
            onSizeChanged(this.f169824m, this.f169825n);
            this.f169813b.invalidate();
        }
    }

    @Override // p149l.sed0
    /* JADX INFO: renamed from: o */
    public void mo183612o(Context context, AttributeSet attributeSet, View view) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.parseColor("#00000000"));
        }
        view.setLayerType(0, null);
        this.f169812a = context;
        this.f169813b = view;
        this.f169822k = new float[8];
        this.f169823l = new float[8];
        this.f169814c = new Paint();
        this.f169815d = new RectF();
        this.f169816e = new RectF();
        this.f169817f = new RectF();
        this.f169818g = new Path();
        this.f169819h = new Path();
        this.f169820i = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f169826o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158352y);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(r9c0.f158296D, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(r9c0.f158295C, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(r9c0.f158297E, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(r9c0.f158301I, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(r9c0.f158293A, dimension);
        this.f169828q = typedArrayObtainStyledAttributes.getDimension(r9c0.f158300H, dimension4 > 0.0f ? dimension4 : dimension2);
        int i = r9c0.f158302J;
        if (dimension4 <= 0.0f) {
            dimension4 = dimension3;
        }
        this.f169829r = typedArrayObtainStyledAttributes.getDimension(i, dimension4);
        int i2 = r9c0.f158353z;
        if (dimension5 > 0.0f) {
            dimension2 = dimension5;
        }
        this.f169830s = typedArrayObtainStyledAttributes.getDimension(i2, dimension2);
        int i3 = r9c0.f158294B;
        if (dimension5 > 0.0f) {
            dimension3 = dimension5;
        }
        this.f169831t = typedArrayObtainStyledAttributes.getDimension(i3, dimension3);
        this.f169827p = typedArrayObtainStyledAttributes.getDimension(r9c0.f158299G, 0.0f);
        this.f169826o = typedArrayObtainStyledAttributes.getColor(r9c0.f158298F, this.f169826o);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p149l.sed0
    public void onSizeChanged(int i, int i2) {
        this.f169824m = i;
        this.f169825n = i2;
        if (this.f169821j) {
            float fMin = (Math.min(i2, i) * 1.0f) / 2.0f;
            this.f169828q = fMin;
            this.f169829r = fMin;
            this.f169831t = fMin;
            this.f169830s = fMin;
        }
        m188488p();
        RectF rectF = this.f169815d;
        if (rectF != null) {
            float f = this.f169827p;
            rectF.set(f, f, i - f, i2 - f);
        }
        RectF rectF2 = this.f169816e;
        if (rectF2 != null) {
            float f2 = this.f169827p;
            rectF2.set(f2 / 2.0f, f2 / 2.0f, i - (f2 / 2.0f), i2 - (f2 / 2.0f));
        }
        RectF rectF3 = this.f169817f;
        if (rectF3 != null) {
            rectF3.set(0.0f, 0.0f, i, i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m188488p() {
        float[] fArr = this.f169822k;
        float f = this.f169828q;
        float f2 = this.f169827p;
        float f3 = f - f2;
        fArr[1] = f3;
        fArr[0] = f3;
        float f4 = this.f169829r;
        float f5 = f4 - f2;
        fArr[3] = f5;
        fArr[2] = f5;
        float f6 = this.f169831t;
        float f7 = f6 - f2;
        fArr[5] = f7;
        fArr[4] = f7;
        float f8 = this.f169830s;
        float f9 = f8 - f2;
        fArr[7] = f9;
        fArr[6] = f9;
        float[] fArr2 = this.f169823l;
        float f10 = f - (f2 / 2.0f);
        fArr2[1] = f10;
        fArr2[0] = f10;
        float f11 = f4 - (f2 / 2.0f);
        fArr2[3] = f11;
        fArr2[2] = f11;
        float f12 = f6 - (f2 / 2.0f);
        fArr2[5] = f12;
        fArr2[4] = f12;
        float f13 = f8 - (f2 / 2.0f);
        fArr2[7] = f13;
        fArr2[6] = f13;
    }
}
