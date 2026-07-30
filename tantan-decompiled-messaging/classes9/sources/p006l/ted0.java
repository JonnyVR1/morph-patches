package p006l;

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
import l.r9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ted0 implements sed0 {

    /* JADX INFO: renamed from: a */
    public Context f22056a;

    /* JADX INFO: renamed from: b */
    public View f22057b;

    /* JADX INFO: renamed from: c */
    public Paint f22058c;

    /* JADX INFO: renamed from: d */
    public RectF f22059d;

    /* JADX INFO: renamed from: e */
    public RectF f22060e;

    /* JADX INFO: renamed from: f */
    public RectF f22061f;

    /* JADX INFO: renamed from: g */
    public Path f22062g;

    /* JADX INFO: renamed from: h */
    public Path f22063h;

    /* JADX INFO: renamed from: i */
    public Xfermode f22064i;

    /* JADX INFO: renamed from: j */
    public boolean f22065j;

    /* JADX INFO: renamed from: k */
    public float[] f22066k;

    /* JADX INFO: renamed from: l */
    public float[] f22067l;

    /* JADX INFO: renamed from: m */
    public int f22068m;

    /* JADX INFO: renamed from: n */
    public int f22069n;

    /* JADX INFO: renamed from: o */
    public int f22070o;

    /* JADX INFO: renamed from: p */
    public float f22071p;

    /* JADX INFO: renamed from: q */
    public float f22072q;

    /* JADX INFO: renamed from: r */
    public float f22073r;

    /* JADX INFO: renamed from: s */
    public float f22074s;

    /* JADX INFO: renamed from: t */
    public float f22075t;

    @Override // p006l.sed0
    /* JADX INFO: renamed from: a */
    public void mo23707a(boolean z) {
        this.f22065j = z;
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: b */
    public void mo23708b(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        float fM26765a = wtd.m26765a(context, f);
        this.f22072q = fM26765a;
        this.f22073r = fM26765a;
        this.f22074s = fM26765a;
        this.f22075t = fM26765a;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: c */
    public void mo23709c(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        this.f22072q = wtd.m26765a(context, f);
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: d */
    public void mo23710d(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        float fM26765a = wtd.m26765a(context, f);
        this.f22072q = fM26765a;
        this.f22073r = fM26765a;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: e */
    public void mo23711e(int i) {
        this.f22070o = i;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: f */
    public void mo23712f(Canvas canvas) {
        this.f22058c.reset();
        this.f22062g.reset();
        this.f22058c.setAntiAlias(true);
        this.f22058c.setStyle(Paint.Style.FILL);
        this.f22058c.setXfermode(this.f22064i);
        Path path = this.f22062g;
        RectF rectF = this.f22059d;
        float[] fArr = this.f22066k;
        Path.Direction direction = Path.Direction.CCW;
        path.addRoundRect(rectF, fArr, direction);
        this.f22063h.reset();
        this.f22063h.addRect(this.f22061f, direction);
        this.f22063h.op(this.f22062g, Path.Op.DIFFERENCE);
        canvas.drawPath(this.f22063h, this.f22058c);
        this.f22058c.setXfermode(null);
        canvas.restore();
        this.f22058c.setXfermode(null);
        if (this.f22071p > 0.0f) {
            this.f22058c.setStyle(Paint.Style.STROKE);
            this.f22058c.setStrokeWidth(this.f22071p);
            this.f22058c.setColor(this.f22070o);
            this.f22062g.reset();
            this.f22062g.addRoundRect(this.f22060e, this.f22067l, direction);
            canvas.drawPath(this.f22062g, this.f22058c);
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: g */
    public void mo23713g(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        float fM26765a = wtd.m26765a(context, f);
        this.f22073r = fM26765a;
        this.f22075t = fM26765a;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: h */
    public void mo23714h(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        float fM26765a = wtd.m26765a(context, f);
        this.f22072q = fM26765a;
        this.f22074s = fM26765a;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: i */
    public void mo23715i(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        this.f22075t = wtd.m26765a(context, f);
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: j */
    public void mo23716j(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        this.f22071p = wtd.m26765a(context, f);
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: k */
    public void mo23717k(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        this.f22074s = wtd.m26765a(context, f);
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: l */
    public void mo23718l(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        float fM26765a = wtd.m26765a(context, f);
        this.f22074s = fM26765a;
        this.f22075t = fM26765a;
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: m */
    public void mo23719m(Canvas canvas) {
        canvas.saveLayer(this.f22059d, null, 31);
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: n */
    public void mo23720n(float f) {
        Context context = this.f22056a;
        if (context == null) {
            return;
        }
        this.f22073r = wtd.m26765a(context, f);
        if (this.f22057b != null) {
            onSizeChanged(this.f22068m, this.f22069n);
            this.f22057b.invalidate();
        }
    }

    @Override // p006l.sed0
    /* JADX INFO: renamed from: o */
    public void mo23721o(Context context, AttributeSet attributeSet, View view) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.parseColor("#00000000"));
        }
        view.setLayerType(0, null);
        this.f22056a = context;
        this.f22057b = view;
        this.f22066k = new float[8];
        this.f22067l = new float[8];
        this.f22058c = new Paint();
        this.f22059d = new RectF();
        this.f22060e = new RectF();
        this.f22061f = new RectF();
        this.f22062g = new Path();
        this.f22063h = new Path();
        this.f22064i = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f22070o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.y);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(r9c0.D, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(r9c0.C, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(r9c0.E, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(r9c0.I, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(r9c0.A, dimension);
        this.f22072q = typedArrayObtainStyledAttributes.getDimension(r9c0.H, dimension4 > 0.0f ? dimension4 : dimension2);
        int i = r9c0.J;
        if (dimension4 <= 0.0f) {
            dimension4 = dimension3;
        }
        this.f22073r = typedArrayObtainStyledAttributes.getDimension(i, dimension4);
        int i2 = r9c0.z;
        if (dimension5 > 0.0f) {
            dimension2 = dimension5;
        }
        this.f22074s = typedArrayObtainStyledAttributes.getDimension(i2, dimension2);
        int i3 = r9c0.B;
        if (dimension5 > 0.0f) {
            dimension3 = dimension5;
        }
        this.f22075t = typedArrayObtainStyledAttributes.getDimension(i3, dimension3);
        this.f22071p = typedArrayObtainStyledAttributes.getDimension(r9c0.G, 0.0f);
        this.f22070o = typedArrayObtainStyledAttributes.getColor(r9c0.F, this.f22070o);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p006l.sed0
    public void onSizeChanged(int i, int i2) {
        this.f22068m = i;
        this.f22069n = i2;
        if (this.f22065j) {
            float fMin = (Math.min(i2, i) * 1.0f) / 2.0f;
            this.f22072q = fMin;
            this.f22073r = fMin;
            this.f22075t = fMin;
            this.f22074s = fMin;
        }
        m24664p();
        RectF rectF = this.f22059d;
        if (rectF != null) {
            float f = this.f22071p;
            rectF.set(f, f, i - f, i2 - f);
        }
        RectF rectF2 = this.f22060e;
        if (rectF2 != null) {
            float f2 = this.f22071p;
            rectF2.set(f2 / 2.0f, f2 / 2.0f, i - (f2 / 2.0f), i2 - (f2 / 2.0f));
        }
        RectF rectF3 = this.f22061f;
        if (rectF3 != null) {
            rectF3.set(0.0f, 0.0f, i, i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m24664p() {
        float[] fArr = this.f22066k;
        float f = this.f22072q;
        float f2 = this.f22071p;
        float f3 = f - f2;
        fArr[1] = f3;
        fArr[0] = f3;
        float f4 = this.f22073r;
        float f5 = f4 - f2;
        fArr[3] = f5;
        fArr[2] = f5;
        float f6 = this.f22075t;
        float f7 = f6 - f2;
        fArr[5] = f7;
        fArr[4] = f7;
        float f8 = this.f22074s;
        float f9 = f8 - f2;
        fArr[7] = f9;
        fArr[6] = f9;
        float[] fArr2 = this.f22067l;
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
