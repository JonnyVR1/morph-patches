package com.p046p1.mobile.putong.core.p053ui.home;

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
import com.p046p1.mobile.putong.core.p053ui.BounceView;
import com.p046p1.mobile.putong.core.p053ui.C8275a;
import com.tantanapp.common.utils.NullChecker;
import p149l.e01;
import p149l.h9c0;
import p149l.j760;
import p149l.t100;
import p149l.t6k;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class BounceButton extends BounceView {

    /* JADX INFO: renamed from: A */
    public boolean f29628A;

    /* JADX INFO: renamed from: B */
    public boolean f29629B;

    /* JADX INFO: renamed from: C */
    public boolean f29630C;

    /* JADX INFO: renamed from: D */
    public float f29631D;

    /* JADX INFO: renamed from: E */
    public RectF f29632E;

    /* JADX INFO: renamed from: F */
    public RectF f29633F;

    /* JADX INFO: renamed from: G */
    public LinearGradient f29634G;

    /* JADX INFO: renamed from: H */
    public LinearGradient f29635H;

    /* JADX INFO: renamed from: b */
    public final String f29636b;

    /* JADX INFO: renamed from: c */
    public int f29637c;

    /* JADX INFO: renamed from: d */
    public final int f29638d;

    /* JADX INFO: renamed from: e */
    public final int f29639e;

    /* JADX INFO: renamed from: f */
    public final int f29640f;

    /* JADX INFO: renamed from: g */
    public final int f29641g;

    /* JADX INFO: renamed from: h */
    public final int f29642h;

    /* JADX INFO: renamed from: i */
    public final int f29643i;

    /* JADX INFO: renamed from: j */
    public final int f29644j;

    /* JADX INFO: renamed from: k */
    public float f29645k;

    /* JADX INFO: renamed from: l */
    public float f29646l;

    /* JADX INFO: renamed from: m */
    public float f29647m;

    /* JADX INFO: renamed from: n */
    public float f29648n;

    /* JADX INFO: renamed from: o */
    public float f29649o;

    /* JADX INFO: renamed from: p */
    public float f29650p;

    /* JADX INFO: renamed from: q */
    public Paint f29651q;

    /* JADX INFO: renamed from: r */
    public Paint f29652r;

    /* JADX INFO: renamed from: s */
    public Paint f29653s;

    /* JADX INFO: renamed from: t */
    public Paint f29654t;

    /* JADX INFO: renamed from: u */
    public Drawable f29655u;

    /* JADX INFO: renamed from: v */
    public Drawable f29656v;

    /* JADX INFO: renamed from: w */
    public Drawable f29657w;

    /* JADX INFO: renamed from: x */
    public float f29658x;

    /* JADX INFO: renamed from: y */
    public e01<Integer, j760<Float, Bitmap>> f29659y;

    /* JADX INFO: renamed from: z */
    public float f29660z;

    public BounceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29636b = getClass().getSimpleName();
        this.f29637c = Color.parseColor("#efede8");
        this.f29638d = Color.parseColor("#1f979797");
        this.f29639e = Color.parseColor("#00979797");
        this.f29640f = Color.parseColor("#00ffffff");
        this.f29641g = Color.parseColor("#85ffffff");
        this.f29642h = Color.parseColor("#ffffff");
        this.f29643i = Color.parseColor("#D8D8D8");
        this.f29644j = Color.parseColor("#ec553f");
        this.f29650p = t100.m186890d(1.0f);
        this.f29655u = null;
        this.f29656v = null;
        this.f29657w = null;
        this.f29659y = new e01<>();
        this.f29628A = true;
        this.f29629B = true;
        m46069d(context, attributeSet);
        m46068c();
    }

    /* JADX INFO: renamed from: b */
    private void m46067b(Canvas canvas, float f) {
        float f2 = f / (this.f27971a.f28189c / 2.0f);
        this.f29653s.setStrokeWidth(this.f29650p);
        this.f29653s.setColor(this.f29643i);
        float f3 = this.f29658x;
        float f4 = this.f29650p;
        canvas.drawCircle(f3, f3 + f4, f - (f4 / 2.0f), this.f29653s);
        this.f29651q.setColor(this.f29642h);
        float f5 = this.f29658x;
        canvas.drawCircle(f5, f5, f, this.f29651q);
        if (NullChecker.m81303a(this.f29655u)) {
            Bitmap bitmap = ((BitmapDrawable) this.f29655u).getBitmap();
            float f6 = this.f29658x;
            float f7 = this.f29647m;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            if (f8 > 0.0f) {
                boolean z = this.f29628A;
                int i = (int) ((z ? 1 : -1) * f8);
                if (!z) {
                    canvas.drawBitmap(t6k.m187383a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f29651q);
                    return;
                }
                if (this.f29659y.containsKey(Integer.valueOf(i))) {
                    canvas.drawBitmap(this.f29659y.get(Integer.valueOf(i)).f116565b, this.f29659y.get(Integer.valueOf(i)).f116564a.floatValue(), this.f29659y.get(Integer.valueOf(i)).f116564a.floatValue(), this.f29651q);
                    return;
                }
                float f9 = this.f29647m;
                Bitmap bitmapM187383a = t6k.m187383a(bitmap, f9 * f2, f9 * f2);
                canvas.drawBitmap(bitmapM187383a, f8, f8, this.f29651q);
                if (this.f29628A) {
                    this.f29659y.put(Integer.valueOf(i), vwb.m200311Y(Float.valueOf(f8), bitmapM187383a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m46068c() {
        Paint paint = new Paint();
        this.f29651q = paint;
        paint.setAntiAlias(true);
        this.f29651q.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f29652r = paint2;
        paint2.setAntiAlias(true);
        this.f29652r.setStrokeWidth(this.f29650p);
        Paint paint3 = this.f29652r;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f29653s = paint4;
        paint4.setAntiAlias(true);
        this.f29653s.setStyle(style);
        Paint paint5 = new Paint();
        this.f29654t = paint5;
        paint5.setAntiAlias(true);
        this.f29654t.setStyle(style);
        this.f29654t.setStrokeCap(Paint.Cap.ROUND);
        this.f29632E = new RectF();
        this.f29633F = new RectF();
    }

    /* JADX INFO: renamed from: d */
    private void m46069d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h9c0.f106547d);
        this.f29649o = typedArrayObtainStyledAttributes.getDimension(h9c0.f106552i, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(h9c0.f106551h, t100.m186890d(26.0f));
        this.f29648n = dimension;
        this.f29647m = dimension;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(h9c0.f106549f);
        this.f29657w = drawable;
        this.f29655u = drawable;
        this.f29656v = typedArrayObtainStyledAttributes.getDrawable(h9c0.f106550g);
        this.f29629B = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106548e, true);
        this.f29630C = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106553j, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    private int m46070f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m46071a(Canvas canvas, float f) {
        float f2 = this.f29646l / 2.0f;
        float f3 = f2 - f;
        this.f29653s.setStrokeWidth(f3);
        this.f29653s.setColor(this.f29637c);
        float f4 = this.f29658x;
        canvas.drawCircle(f4, f4, (f3 / 2.0f) + f, this.f29653s);
        if (this.f29631D <= 0.0f) {
            this.f29631D = f;
        }
        if (this.f29630C) {
            float f5 = this.f29660z;
            if (f5 > 0.0f && f5 <= 1.0f) {
                float f6 = this.f29658x;
                float f7 = this.f29631D;
                RectF rectF = new RectF(f6 - (((f2 - f7) / 2.0f) + f7), f6 - (((f2 - f7) / 2.0f) + f7), ((f2 - f7) / 2.0f) + f7 + f6, f6 + f7 + ((f2 - f7) / 2.0f));
                this.f29654t.setStrokeWidth(f2 - this.f29631D);
                this.f29654t.setColor(this.f29644j);
                canvas.drawArc(rectF, -90.0f, this.f29660z * 360.0f, false, this.f29654t);
            }
        }
        RectF rectF2 = this.f29633F;
        float f8 = this.f29658x;
        rectF2.set(f8 - f2, f8 - f2, f8 + f2, f8 + f2);
        this.f29652r.setShader(this.f29634G);
        canvas.drawArc(this.f29633F, 0.0f, 360.0f, false, this.f29652r);
        if (this.f29629B) {
            RectF rectF3 = this.f29632E;
            float f9 = this.f29658x;
            float f10 = this.f29650p;
            rectF3.set((f9 - f2) - f10, (f9 - f2) - f10, f9 + f2 + f10, f9 + f2 + f10);
            this.f29652r.setShader(this.f29635H);
            canvas.drawArc(this.f29632E, 0.0f, 360.0f, false, this.f29652r);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m46072e() {
        float f = this.f29646l;
        int i = this.f29638d;
        int i2 = this.f29639e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29634G = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, i2, tileMode);
        this.f29635H = new LinearGradient(0.0f, 0.0f, 0.0f, this.f29646l + (this.f29650p * 2.0f), this.f29640f, this.f29641g, tileMode);
    }

    public xdl0.C21104g getInnerButtonPos() {
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this);
        xdl0.C21104g c21104g = new xdl0.C21104g();
        c21104g.f192418a = (int) (c21104gM208380i0.f192418a + ((getWidth() - this.f27971a.f28189c) / 2.0f));
        float f = c21104gM208380i0.f192419b;
        float height = getHeight();
        float f2 = this.f27971a.f28189c;
        c21104g.f192419b = (int) (f + ((height - f2) / 2.0f));
        int i = (int) f2;
        c21104g.f192421d = i;
        c21104g.f192420c = i;
        return c21104g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fM44094j = this.f27971a.m44094j();
        m46071a(canvas, fM44094j);
        m46067b(canvas, fM44094j);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f29645k = width;
        float f = this.f29649o;
        if (f != 0.0f) {
            this.f29647m = (width / f) * this.f29648n;
        }
        float fM186890d = width - t100.m186890d(4.0f);
        this.f29646l = fM186890d;
        this.f29658x = this.f29645k / 2.0f;
        this.f27971a.m44095k(fM186890d - (fM186890d / 9.0f));
        m46072e();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m46070f(i), m46070f(i));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f29659y.clear();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f27971a.m44093i(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBorderOuterCircle(boolean z) {
        if (this.f29629B == z) {
            return;
        }
        this.f29629B = z;
        invalidate();
    }

    public void setCenterIconWidth(int i) {
        float f = i;
        this.f29648n = f;
        this.f29647m = f;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f29655u) {
            return;
        }
        this.f29655u = drawable;
        this.f29659y.clear();
        invalidate();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.BounceView
    public void setLongPressingListener(C8275a.d dVar) {
        this.f27971a.f28198l = dVar;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.BounceView
    public void setProgress(float f) {
        if (this.f29660z == f) {
            return;
        }
        this.f29660z = f;
        invalidate();
    }

    public BounceButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29636b = getClass().getSimpleName();
        this.f29637c = Color.parseColor("#efede8");
        this.f29638d = Color.parseColor("#1f979797");
        this.f29639e = Color.parseColor("#00979797");
        this.f29640f = Color.parseColor("#00ffffff");
        this.f29641g = Color.parseColor("#85ffffff");
        this.f29642h = Color.parseColor("#ffffff");
        this.f29643i = Color.parseColor("#D8D8D8");
        this.f29644j = Color.parseColor("#ec553f");
        this.f29650p = t100.m186890d(1.0f);
        this.f29655u = null;
        this.f29656v = null;
        this.f29657w = null;
        this.f29659y = new e01<>();
        this.f29628A = true;
        this.f29629B = true;
        m46069d(context, attributeSet);
        m46068c();
    }
}
