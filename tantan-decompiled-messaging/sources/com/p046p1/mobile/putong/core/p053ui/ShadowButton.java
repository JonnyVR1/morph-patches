package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import p149l.e01;
import p149l.j760;
import p149l.r9c0;
import p149l.t100;
import p149l.t6k;
import p149l.vwb;

/* JADX INFO: loaded from: classes8.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f28148b;

    /* JADX INFO: renamed from: c */
    public final int f28149c;

    /* JADX INFO: renamed from: d */
    public int f28150d;

    /* JADX INFO: renamed from: e */
    public int f28151e;

    /* JADX INFO: renamed from: f */
    public float f28152f;

    /* JADX INFO: renamed from: g */
    public float f28153g;

    /* JADX INFO: renamed from: h */
    public float f28154h;

    /* JADX INFO: renamed from: i */
    public float f28155i;

    /* JADX INFO: renamed from: j */
    public Paint f28156j;

    /* JADX INFO: renamed from: k */
    public Paint f28157k;

    /* JADX INFO: renamed from: l */
    public Drawable f28158l;

    /* JADX INFO: renamed from: m */
    public float f28159m;

    /* JADX INFO: renamed from: n */
    public boolean f28160n;

    /* JADX INFO: renamed from: o */
    public boolean f28161o;

    /* JADX INFO: renamed from: p */
    public boolean f28162p;

    /* JADX INFO: renamed from: q */
    public boolean f28163q;

    /* JADX INFO: renamed from: r */
    public boolean f28164r;

    /* JADX INFO: renamed from: s */
    public Drawable f28165s;

    /* JADX INFO: renamed from: t */
    public Drawable f28166t;

    /* JADX INFO: renamed from: u */
    public float f28167u;

    /* JADX INFO: renamed from: v */
    public int f28168v;

    /* JADX INFO: renamed from: w */
    public e01<Integer, j760<Float, Bitmap>> f28169w;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28148b = getClass().getSimpleName();
        this.f28149c = Color.parseColor("#ffffff");
        this.f28158l = null;
        this.f28164r = true;
        this.f28165s = null;
        this.f28166t = null;
        this.f28169w = new e01<>();
        m44066e();
        m44062f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    private void m44062f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158303K);
        this.f28155i = typedArrayObtainStyledAttributes.getDimension(r9c0.f158326d0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : t100.m186890d(4.0f));
        this.f28153g = typedArrayObtainStyledAttributes.getDimension(r9c0.f158318Z, 0.0f);
        this.f28154h = typedArrayObtainStyledAttributes.getDimension(r9c0.f158317Y, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(r9c0.f158315W);
        this.f28166t = drawable;
        this.f28158l = drawable;
        this.f28165s = typedArrayObtainStyledAttributes.getDrawable(r9c0.f158316X);
        this.f28150d = typedArrayObtainStyledAttributes.getColor(r9c0.f158320a0, Color.parseColor("#3dec543d"));
        this.f28151e = typedArrayObtainStyledAttributes.getColor(r9c0.f158322b0, Color.parseColor("#1eec543d"));
        this.f28160n = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158304L, false);
        this.f28161o = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158324c0, false);
        this.f28167u = typedArrayObtainStyledAttributes.getDimension(r9c0.f158306N, 0.0f);
        this.f28168v = typedArrayObtainStyledAttributes.getColor(r9c0.f158305M, -1);
        this.f28163q = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158310R, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m44063a() {
        this.f27971a.m44090e();
    }

    /* JADX INFO: renamed from: b */
    public int m44064b(int i, float f) {
        float f2 = ((f - 1.0f) * 8.0f) + 1.0f;
        float f3 = f2 >= 1.0f ? f2 : 1.0f;
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (iAlpha < 200) {
            float f4 = f3 * iAlpha;
            iAlpha = f4 > 255.0f ? 255 : (int) f4;
        } else {
            float f5 = iRed * f3;
            iRed = f5 > 255.0f ? 255 : (int) f5;
            float f6 = iGreen * f3;
            iGreen = f6 > 255.0f ? 255 : (int) f6;
            float f7 = iBlue * f3;
            iBlue = f7 > 255.0f ? 255 : (int) f7;
        }
        return Color.argb(iAlpha, iRed, iGreen, iBlue);
    }

    /* JADX INFO: renamed from: c */
    public void m44065c(Canvas canvas) {
        this.f28157k.setColor(this.f28168v);
        float fM186890d = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : t100.m186890d(1.0f);
        float f = this.f28167u;
        if (f >= fM186890d) {
            fM186890d = f;
        }
        this.f28157k.setStrokeWidth(fM186890d);
        float f2 = this.f28159m;
        canvas.drawCircle(f2, f2, (this.f27971a.f28190d / 2.0f) - fM186890d, this.f28157k);
    }

    /* JADX INFO: renamed from: d */
    public void mo43893d(Canvas canvas, float f) {
        float f2 = f / (this.f27971a.f28189c / 2.0f);
        this.f28156j.setColor(this.f28149c);
        if (this.f28161o) {
            Paint paint = this.f28156j;
            float f3 = this.f28155i;
            paint.setShadowLayer(f3, 0.0f, f3, m44064b(this.f28150d, f2));
            float f4 = this.f28159m;
            canvas.drawCircle(f4, f4, f, this.f28156j);
            this.f28156j.setShadowLayer(this.f28155i, 0.0f, 0.0f, m44064b(this.f28151e, f2));
        }
        float f5 = this.f28159m;
        canvas.drawCircle(f5, f5, f, this.f28156j);
        this.f28156j.clearShadowLayer();
        if (NullChecker.m81303a(this.f28158l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f28158l).getBitmap();
            float f6 = this.f28159m;
            float f7 = this.f28153g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f28154h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f28164r) {
                canvas.drawBitmap(t6k.m187383a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f28156j);
                return;
            }
            if (this.f28169w.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f28169w.get(Integer.valueOf(i)).f116565b, this.f28169w.get(Integer.valueOf(i)).f116564a.floatValue(), this.f28169w.get(Integer.valueOf(i)).f116564a.floatValue(), this.f28156j);
                return;
            }
            float f10 = this.f28153g;
            Bitmap bitmapM187383a = t6k.m187383a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapM187383a, f8, f8, this.f28156j);
            if (this.f28164r) {
                this.f28169w.put(Integer.valueOf(i), vwb.m200311Y(Float.valueOf(f8), bitmapM187383a));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m44066e() {
        Paint paint = new Paint();
        this.f28156j = paint;
        paint.setAntiAlias(true);
        this.f28156j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f28156j);
        Paint paint2 = new Paint();
        this.f28157k = paint2;
        paint2.setAntiAlias(true);
        this.f28157k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: g */
    public final int m44067g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo43893d(canvas, this.f27971a.m44094j());
        if (this.f28167u > 0.0f) {
            m44065c(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f28152f = width;
        float f = this.f28161o ? this.f28155i : 0.0f;
        this.f28155i = f;
        this.f27971a.m44096l(width - (f * 4.0f), this.f28163q);
        C8275a c8275a = this.f27971a;
        c8275a.f28195i = this.f28160n;
        this.f28159m = this.f28152f / 2.0f;
        float f2 = this.f28153g;
        if (f2 == 0.0f) {
            f2 = c8275a.f28190d / 4.0f;
        }
        this.f28153g = f2;
        float f3 = this.f28154h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f28154h = f2;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f28162p) {
            return;
        }
        setMeasuredDimension(m44067g(i), m44067g(i));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f27971a.m44093i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f28167u = f;
    }

    public void setIcon(Drawable drawable) {
        this.f28158l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f28154h = f;
    }

    public void setIconWidth(float f) {
        this.f28153g = f;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.BounceView
    public void setLongPressingListener(C8275a.d dVar) {
        this.f27971a.f28198l = dVar;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.BounceView
    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28148b = getClass().getSimpleName();
        this.f28149c = Color.parseColor("#ffffff");
        this.f28158l = null;
        this.f28164r = true;
        this.f28165s = null;
        this.f28166t = null;
        this.f28169w = new e01<>();
        m44066e();
        m44062f(context, attributeSet);
    }
}
