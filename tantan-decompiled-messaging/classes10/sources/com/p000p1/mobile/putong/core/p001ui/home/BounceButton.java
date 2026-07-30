package com.p000p1.mobile.putong.core.p001ui.home;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p1.mobile.putong.core.ui.BounceView;
import com.p1.mobile.putong.core.ui.a;
import com.tantanapp.common.utils.NullChecker;
import l.e01;
import l.j760;
import l.t100;
import l.t6k;
import l.vwb;
import l.xdl0;
import p003l.h9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BounceButton extends BounceView {

    /* JADX INFO: renamed from: A */
    public boolean f2022A;

    /* JADX INFO: renamed from: B */
    public boolean f2023B;

    /* JADX INFO: renamed from: C */
    public boolean f2024C;

    /* JADX INFO: renamed from: D */
    public float f2025D;

    /* JADX INFO: renamed from: E */
    public RectF f2026E;

    /* JADX INFO: renamed from: F */
    public RectF f2027F;

    /* JADX INFO: renamed from: G */
    public LinearGradient f2028G;

    /* JADX INFO: renamed from: H */
    public LinearGradient f2029H;

    /* JADX INFO: renamed from: b */
    public final String f2030b;

    /* JADX INFO: renamed from: c */
    public int f2031c;

    /* JADX INFO: renamed from: d */
    public final int f2032d;

    /* JADX INFO: renamed from: e */
    public final int f2033e;

    /* JADX INFO: renamed from: f */
    public final int f2034f;

    /* JADX INFO: renamed from: g */
    public final int f2035g;

    /* JADX INFO: renamed from: h */
    public final int f2036h;

    /* JADX INFO: renamed from: i */
    public final int f2037i;

    /* JADX INFO: renamed from: j */
    public final int f2038j;

    /* JADX INFO: renamed from: k */
    public float f2039k;

    /* JADX INFO: renamed from: l */
    public float f2040l;

    /* JADX INFO: renamed from: m */
    public float f2041m;

    /* JADX INFO: renamed from: n */
    public float f2042n;

    /* JADX INFO: renamed from: o */
    public float f2043o;

    /* JADX INFO: renamed from: p */
    public float f2044p;

    /* JADX INFO: renamed from: q */
    public Paint f2045q;

    /* JADX INFO: renamed from: r */
    public Paint f2046r;

    /* JADX INFO: renamed from: s */
    public Paint f2047s;

    /* JADX INFO: renamed from: t */
    public Paint f2048t;

    /* JADX INFO: renamed from: u */
    public Drawable f2049u;

    /* JADX INFO: renamed from: v */
    public Drawable f2050v;

    /* JADX INFO: renamed from: w */
    public Drawable f2051w;

    /* JADX INFO: renamed from: x */
    public float f2052x;

    /* JADX INFO: renamed from: y */
    public e01<Integer, j760<Float, Bitmap>> f2053y;

    /* JADX INFO: renamed from: z */
    public float f2054z;

    public BounceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2030b = getClass().getSimpleName();
        this.f2031c = Color.parseColor("#efede8");
        this.f2032d = Color.parseColor("#1f979797");
        this.f2033e = Color.parseColor("#00979797");
        this.f2034f = Color.parseColor("#00ffffff");
        this.f2035g = Color.parseColor("#85ffffff");
        this.f2036h = Color.parseColor("#ffffff");
        this.f2037i = Color.parseColor("#D8D8D8");
        this.f2038j = Color.parseColor("#ec553f");
        this.f2044p = t100.d(1.0f);
        this.f2049u = null;
        this.f2050v = null;
        this.f2051w = null;
        this.f2053y = new e01<>();
        this.f2022A = true;
        this.f2023B = true;
        m3430d(context, attributeSet);
        m3429c();
    }

    /* JADX INFO: renamed from: b */
    private void m3428b(Canvas canvas, float f) {
        float f2 = f / (((BounceView) this).a.c / 2.0f);
        this.f2047s.setStrokeWidth(this.f2044p);
        this.f2047s.setColor(this.f2037i);
        float f3 = this.f2052x;
        float f4 = this.f2044p;
        canvas.drawCircle(f3, f3 + f4, f - (f4 / 2.0f), this.f2047s);
        this.f2045q.setColor(this.f2036h);
        float f5 = this.f2052x;
        canvas.drawCircle(f5, f5, f, this.f2045q);
        if (NullChecker.a(this.f2049u)) {
            Bitmap bitmap = ((BitmapDrawable) this.f2049u).getBitmap();
            float f6 = this.f2052x;
            float f7 = this.f2041m;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            if (f8 > 0.0f) {
                boolean z = this.f2022A;
                int i = (int) ((z ? 1 : -1) * f8);
                if (!z) {
                    canvas.drawBitmap(t6k.a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f2045q);
                    return;
                }
                if (this.f2053y.containsKey(Integer.valueOf(i))) {
                    canvas.drawBitmap((Bitmap) ((j760) this.f2053y.get(Integer.valueOf(i))).b, ((Float) ((j760) this.f2053y.get(Integer.valueOf(i))).a).floatValue(), ((Float) ((j760) this.f2053y.get(Integer.valueOf(i))).a).floatValue(), this.f2045q);
                    return;
                }
                float f9 = this.f2041m;
                Bitmap bitmapA = t6k.a(bitmap, f9 * f2, f9 * f2);
                canvas.drawBitmap(bitmapA, f8, f8, this.f2045q);
                if (this.f2022A) {
                    this.f2053y.put(Integer.valueOf(i), vwb.Y(Float.valueOf(f8), bitmapA));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3429c() {
        Paint paint = new Paint();
        this.f2045q = paint;
        paint.setAntiAlias(true);
        this.f2045q.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f2046r = paint2;
        paint2.setAntiAlias(true);
        this.f2046r.setStrokeWidth(this.f2044p);
        Paint paint3 = this.f2046r;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f2047s = paint4;
        paint4.setAntiAlias(true);
        this.f2047s.setStyle(style);
        Paint paint5 = new Paint();
        this.f2048t = paint5;
        paint5.setAntiAlias(true);
        this.f2048t.setStyle(style);
        this.f2048t.setStrokeCap(Paint.Cap.ROUND);
        this.f2026E = new RectF();
        this.f2027F = new RectF();
    }

    /* JADX INFO: renamed from: d */
    private void m3430d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h9c0.f4824d);
        this.f2043o = typedArrayObtainStyledAttributes.getDimension(h9c0.f4829i, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(h9c0.f4828h, t100.d(26.0f));
        this.f2042n = dimension;
        this.f2041m = dimension;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(h9c0.f4826f);
        this.f2051w = drawable;
        this.f2049u = drawable;
        this.f2050v = typedArrayObtainStyledAttributes.getDrawable(h9c0.f4827g);
        this.f2023B = typedArrayObtainStyledAttributes.getBoolean(h9c0.f4825e, true);
        this.f2024C = typedArrayObtainStyledAttributes.getBoolean(h9c0.f4830j, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    private int m3431f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m3432a(Canvas canvas, float f) {
        float f2 = this.f2040l / 2.0f;
        float f3 = f2 - f;
        this.f2047s.setStrokeWidth(f3);
        this.f2047s.setColor(this.f2031c);
        float f4 = this.f2052x;
        canvas.drawCircle(f4, f4, (f3 / 2.0f) + f, this.f2047s);
        if (this.f2025D <= 0.0f) {
            this.f2025D = f;
        }
        if (this.f2024C) {
            float f5 = this.f2054z;
            if (f5 > 0.0f && f5 <= 1.0f) {
                float f6 = this.f2052x;
                float f7 = this.f2025D;
                RectF rectF = new RectF(f6 - (((f2 - f7) / 2.0f) + f7), f6 - (((f2 - f7) / 2.0f) + f7), ((f2 - f7) / 2.0f) + f7 + f6, f6 + f7 + ((f2 - f7) / 2.0f));
                this.f2048t.setStrokeWidth(f2 - this.f2025D);
                this.f2048t.setColor(this.f2038j);
                canvas.drawArc(rectF, -90.0f, this.f2054z * 360.0f, false, this.f2048t);
            }
        }
        RectF rectF2 = this.f2027F;
        float f8 = this.f2052x;
        rectF2.set(f8 - f2, f8 - f2, f8 + f2, f8 + f2);
        this.f2046r.setShader(this.f2028G);
        canvas.drawArc(this.f2027F, 0.0f, 360.0f, false, this.f2046r);
        if (this.f2023B) {
            RectF rectF3 = this.f2026E;
            float f9 = this.f2052x;
            float f10 = this.f2044p;
            rectF3.set((f9 - f2) - f10, (f9 - f2) - f10, f9 + f2 + f10, f9 + f2 + f10);
            this.f2046r.setShader(this.f2029H);
            canvas.drawArc(this.f2026E, 0.0f, 360.0f, false, this.f2046r);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3433e() {
        float f = this.f2040l;
        int i = this.f2032d;
        int i2 = this.f2033e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f2028G = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, i2, tileMode);
        this.f2029H = new LinearGradient(0.0f, 0.0f, 0.0f, this.f2040l + (this.f2044p * 2.0f), this.f2034f, this.f2035g, tileMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xdl0.g getInnerButtonPos() {
        xdl0.g gVarI0 = xdl0.i0(this);
        xdl0.g gVar = new xdl0.g();
        gVar.a = (int) (gVarI0.a + ((getWidth() - ((BounceView) this).a.c) / 2.0f));
        float f = gVarI0.b;
        float height = getHeight();
        float f2 = ((BounceView) this).a.c;
        gVar.b = (int) (f + ((height - f2) / 2.0f));
        int i = (int) f2;
        gVar.d = i;
        gVar.c = i;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        float fJ = ((BounceView) this).a.j();
        m3432a(canvas, fJ);
        m3428b(canvas, fJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f2039k = width;
        float f = this.f2043o;
        if (f != 0.0f) {
            this.f2041m = (width / f) * this.f2042n;
        }
        float fD = width - t100.d(4.0f);
        this.f2040l = fD;
        this.f2052x = this.f2039k / 2.0f;
        ((BounceView) this).a.k(fD - (fD / 9.0f));
        m3433e();
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        setMeasuredDimension(m3431f(i), m3431f(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f2053y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (((BounceView) this).a.i(motionEvent)) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBorderOuterCircle(boolean z) {
        if (this.f2023B == z) {
            return;
        }
        this.f2023B = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCenterIconWidth(int i) {
        float f = i;
        this.f2042n = f;
        this.f2041m = f;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        if (drawable == this.f2049u) {
            return;
        }
        this.f2049u = drawable;
        this.f2053y.clear();
        invalidate();
    }

    public void setLongPressingListener(a.d dVar) {
        ((BounceView) this).a.l = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgress(float f) {
        if (this.f2054z == f) {
            return;
        }
        this.f2054z = f;
        invalidate();
    }

    public BounceButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2030b = getClass().getSimpleName();
        this.f2031c = Color.parseColor("#efede8");
        this.f2032d = Color.parseColor("#1f979797");
        this.f2033e = Color.parseColor("#00979797");
        this.f2034f = Color.parseColor("#00ffffff");
        this.f2035g = Color.parseColor("#85ffffff");
        this.f2036h = Color.parseColor("#ffffff");
        this.f2037i = Color.parseColor("#D8D8D8");
        this.f2038j = Color.parseColor("#ec553f");
        this.f2044p = t100.d(1.0f);
        this.f2049u = null;
        this.f2050v = null;
        this.f2051w = null;
        this.f2053y = new e01<>();
        this.f2022A = true;
        this.f2023B = true;
        m3430d(context, attributeSet);
        m3429c();
    }
}
