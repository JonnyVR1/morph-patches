package p153l;

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

/* JADX INFO: loaded from: classes12.dex */
public class vmd0 implements umd0 {

    /* JADX INFO: renamed from: a */
    public Context f184690a;

    /* JADX INFO: renamed from: b */
    public View f184691b;

    /* JADX INFO: renamed from: c */
    public Paint f184692c;

    /* JADX INFO: renamed from: d */
    public RectF f184693d;

    /* JADX INFO: renamed from: e */
    public RectF f184694e;

    /* JADX INFO: renamed from: f */
    public RectF f184695f;

    /* JADX INFO: renamed from: g */
    public Path f184696g;

    /* JADX INFO: renamed from: h */
    public Path f184697h;

    /* JADX INFO: renamed from: i */
    public Xfermode f184698i;

    /* JADX INFO: renamed from: j */
    public boolean f184699j;

    /* JADX INFO: renamed from: k */
    public float[] f184700k;

    /* JADX INFO: renamed from: l */
    public float[] f184701l;

    /* JADX INFO: renamed from: m */
    public int f184702m;

    /* JADX INFO: renamed from: n */
    public int f184703n;

    /* JADX INFO: renamed from: o */
    public int f184704o;

    /* JADX INFO: renamed from: p */
    public float f184705p;

    /* JADX INFO: renamed from: q */
    public float f184706q;

    /* JADX INFO: renamed from: r */
    public float f184707r;

    /* JADX INFO: renamed from: s */
    public float f184708s;

    /* JADX INFO: renamed from: t */
    public float f184709t;

    @Override // p153l.umd0
    /* JADX INFO: renamed from: a */
    public void mo196646a(boolean z) {
        this.f184699j = z;
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: b */
    public void mo196647b(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        float fM151662a = kvd.m151662a(context, f);
        this.f184706q = fM151662a;
        this.f184707r = fM151662a;
        this.f184708s = fM151662a;
        this.f184709t = fM151662a;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: c */
    public void mo196648c(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        this.f184706q = kvd.m151662a(context, f);
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: d */
    public void mo196649d(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        float fM151662a = kvd.m151662a(context, f);
        this.f184706q = fM151662a;
        this.f184707r = fM151662a;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: e */
    public void mo196650e(int i) {
        this.f184704o = i;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: f */
    public void mo196651f(Canvas canvas) {
        this.f184692c.reset();
        this.f184696g.reset();
        this.f184692c.setAntiAlias(true);
        this.f184692c.setStyle(Paint.Style.FILL);
        this.f184692c.setXfermode(this.f184698i);
        Path path = this.f184696g;
        RectF rectF = this.f184693d;
        float[] fArr = this.f184700k;
        Path.Direction direction = Path.Direction.CCW;
        path.addRoundRect(rectF, fArr, direction);
        this.f184697h.reset();
        this.f184697h.addRect(this.f184695f, direction);
        this.f184697h.op(this.f184696g, Path.Op.DIFFERENCE);
        canvas.drawPath(this.f184697h, this.f184692c);
        this.f184692c.setXfermode(null);
        canvas.restore();
        this.f184692c.setXfermode(null);
        if (this.f184705p > 0.0f) {
            this.f184692c.setStyle(Paint.Style.STROKE);
            this.f184692c.setStrokeWidth(this.f184705p);
            this.f184692c.setColor(this.f184704o);
            this.f184696g.reset();
            this.f184696g.addRoundRect(this.f184694e, this.f184701l, direction);
            canvas.drawPath(this.f184696g, this.f184692c);
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: g */
    public void mo196652g(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        float fM151662a = kvd.m151662a(context, f);
        this.f184707r = fM151662a;
        this.f184709t = fM151662a;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: h */
    public void mo196653h(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        float fM151662a = kvd.m151662a(context, f);
        this.f184706q = fM151662a;
        this.f184708s = fM151662a;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: i */
    public void mo196654i(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        this.f184709t = kvd.m151662a(context, f);
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: j */
    public void mo196655j(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        this.f184705p = kvd.m151662a(context, f);
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: k */
    public void mo196656k(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        this.f184708s = kvd.m151662a(context, f);
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: l */
    public void mo196657l(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        float fM151662a = kvd.m151662a(context, f);
        this.f184708s = fM151662a;
        this.f184709t = fM151662a;
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: m */
    public void mo196658m(Canvas canvas) {
        canvas.saveLayer(this.f184693d, null, 31);
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: n */
    public void mo196659n(float f) {
        Context context = this.f184690a;
        if (context == null) {
            return;
        }
        this.f184707r = kvd.m151662a(context, f);
        if (this.f184691b != null) {
            onSizeChanged(this.f184702m, this.f184703n);
            this.f184691b.invalidate();
        }
    }

    @Override // p153l.umd0
    /* JADX INFO: renamed from: o */
    public void mo196660o(Context context, AttributeSet attributeSet, View view) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.parseColor("#00000000"));
        }
        view.setLayerType(0, null);
        this.f184690a = context;
        this.f184691b = view;
        this.f184700k = new float[8];
        this.f184701l = new float[8];
        this.f184692c = new Paint();
        this.f184693d = new RectF();
        this.f184694e = new RectF();
        this.f184695f = new RectF();
        this.f184696g = new Path();
        this.f184697h = new Path();
        this.f184698i = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f184704o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194352y);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(xhc0.f194296D, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(xhc0.f194295C, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(xhc0.f194297E, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(xhc0.f194301I, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(xhc0.f194293A, dimension);
        this.f184706q = typedArrayObtainStyledAttributes.getDimension(xhc0.f194300H, dimension4 > 0.0f ? dimension4 : dimension2);
        int i = xhc0.f194302J;
        if (dimension4 <= 0.0f) {
            dimension4 = dimension3;
        }
        this.f184707r = typedArrayObtainStyledAttributes.getDimension(i, dimension4);
        int i2 = xhc0.f194353z;
        if (dimension5 > 0.0f) {
            dimension2 = dimension5;
        }
        this.f184708s = typedArrayObtainStyledAttributes.getDimension(i2, dimension2);
        int i3 = xhc0.f194294B;
        if (dimension5 > 0.0f) {
            dimension3 = dimension5;
        }
        this.f184709t = typedArrayObtainStyledAttributes.getDimension(i3, dimension3);
        this.f184705p = typedArrayObtainStyledAttributes.getDimension(xhc0.f194299G, 0.0f);
        this.f184704o = typedArrayObtainStyledAttributes.getColor(xhc0.f194298F, this.f184704o);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p153l.umd0
    public void onSizeChanged(int i, int i2) {
        this.f184702m = i;
        this.f184703n = i2;
        if (this.f184699j) {
            float fMin = (Math.min(i2, i) * 1.0f) / 2.0f;
            this.f184706q = fMin;
            this.f184707r = fMin;
            this.f184709t = fMin;
            this.f184708s = fMin;
        }
        m201729p();
        RectF rectF = this.f184693d;
        if (rectF != null) {
            float f = this.f184705p;
            rectF.set(f, f, i - f, i2 - f);
        }
        RectF rectF2 = this.f184694e;
        if (rectF2 != null) {
            float f2 = this.f184705p;
            rectF2.set(f2 / 2.0f, f2 / 2.0f, i - (f2 / 2.0f), i2 - (f2 / 2.0f));
        }
        RectF rectF3 = this.f184695f;
        if (rectF3 != null) {
            rectF3.set(0.0f, 0.0f, i, i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m201729p() {
        float[] fArr = this.f184700k;
        float f = this.f184706q;
        float f2 = this.f184705p;
        float f3 = f - f2;
        fArr[1] = f3;
        fArr[0] = f3;
        float f4 = this.f184707r;
        float f5 = f4 - f2;
        fArr[3] = f5;
        fArr[2] = f5;
        float f6 = this.f184709t;
        float f7 = f6 - f2;
        fArr[5] = f7;
        fArr[4] = f7;
        float f8 = this.f184708s;
        float f9 = f8 - f2;
        fArr[7] = f9;
        fArr[6] = f9;
        float[] fArr2 = this.f184701l;
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
