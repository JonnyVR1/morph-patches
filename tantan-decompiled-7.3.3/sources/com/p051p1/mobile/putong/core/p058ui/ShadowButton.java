package com.p051p1.mobile.putong.core.p058ui;

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
import p153l.jyb;
import p153l.l01;
import p153l.l9k;
import p153l.pf60;
import p153l.qa00;
import p153l.xhc0;

/* JADX INFO: loaded from: classes6.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f28996b;

    /* JADX INFO: renamed from: c */
    public final int f28997c;

    /* JADX INFO: renamed from: d */
    public int f28998d;

    /* JADX INFO: renamed from: e */
    public int f28999e;

    /* JADX INFO: renamed from: f */
    public float f29000f;

    /* JADX INFO: renamed from: g */
    public float f29001g;

    /* JADX INFO: renamed from: h */
    public float f29002h;

    /* JADX INFO: renamed from: i */
    public float f29003i;

    /* JADX INFO: renamed from: j */
    public Paint f29004j;

    /* JADX INFO: renamed from: k */
    public Paint f29005k;

    /* JADX INFO: renamed from: l */
    public Drawable f29006l;

    /* JADX INFO: renamed from: m */
    public float f29007m;

    /* JADX INFO: renamed from: n */
    public boolean f29008n;

    /* JADX INFO: renamed from: o */
    public boolean f29009o;

    /* JADX INFO: renamed from: p */
    public boolean f29010p;

    /* JADX INFO: renamed from: q */
    public boolean f29011q;

    /* JADX INFO: renamed from: r */
    public boolean f29012r;

    /* JADX INFO: renamed from: s */
    public Drawable f29013s;

    /* JADX INFO: renamed from: t */
    public Drawable f29014t;

    /* JADX INFO: renamed from: u */
    public float f29015u;

    /* JADX INFO: renamed from: v */
    public int f29016v;

    /* JADX INFO: renamed from: w */
    public l01<Integer, pf60<Float, Bitmap>> f29017w;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28996b = getClass().getSimpleName();
        this.f28997c = Color.parseColor("#ffffff");
        this.f29006l = null;
        this.f29012r = true;
        this.f29013s = null;
        this.f29014t = null;
        this.f29017w = new l01<>();
        m45249e();
        m45245f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    private void m45245f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194303K);
        this.f29003i = typedArrayObtainStyledAttributes.getDimension(xhc0.f194326d0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : qa00.m175859d(4.0f));
        this.f29001g = typedArrayObtainStyledAttributes.getDimension(xhc0.f194318Z, 0.0f);
        this.f29002h = typedArrayObtainStyledAttributes.getDimension(xhc0.f194317Y, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(xhc0.f194315W);
        this.f29014t = drawable;
        this.f29006l = drawable;
        this.f29013s = typedArrayObtainStyledAttributes.getDrawable(xhc0.f194316X);
        this.f28998d = typedArrayObtainStyledAttributes.getColor(xhc0.f194320a0, Color.parseColor("#3dec543d"));
        this.f28999e = typedArrayObtainStyledAttributes.getColor(xhc0.f194322b0, Color.parseColor("#1eec543d"));
        this.f29008n = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194304L, false);
        this.f29009o = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194324c0, false);
        this.f29015u = typedArrayObtainStyledAttributes.getDimension(xhc0.f194306N, 0.0f);
        this.f29016v = typedArrayObtainStyledAttributes.getColor(xhc0.f194305M, -1);
        this.f29011q = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194310R, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m45246a() {
        this.f28819a.m45273e();
    }

    /* JADX INFO: renamed from: b */
    public int m45247b(int i, float f) {
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
    public void m45248c(Canvas canvas) {
        this.f29005k.setColor(this.f29016v);
        float fM175859d = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : qa00.m175859d(1.0f);
        float f = this.f29015u;
        if (f >= fM175859d) {
            fM175859d = f;
        }
        this.f29005k.setStrokeWidth(fM175859d);
        float f2 = this.f29007m;
        canvas.drawCircle(f2, f2, (this.f28819a.f29038d / 2.0f) - fM175859d, this.f29005k);
    }

    /* JADX INFO: renamed from: d */
    public void mo45079d(Canvas canvas, float f) {
        float f2 = f / (this.f28819a.f29037c / 2.0f);
        this.f29004j.setColor(this.f28997c);
        if (this.f29009o) {
            Paint paint = this.f29004j;
            float f3 = this.f29003i;
            paint.setShadowLayer(f3, 0.0f, f3, m45247b(this.f28998d, f2));
            float f4 = this.f29007m;
            canvas.drawCircle(f4, f4, f, this.f29004j);
            this.f29004j.setShadowLayer(this.f29003i, 0.0f, 0.0f, m45247b(this.f28999e, f2));
        }
        float f5 = this.f29007m;
        canvas.drawCircle(f5, f5, f, this.f29004j);
        this.f29004j.clearShadowLayer();
        if (NullChecker.m82486a(this.f29006l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f29006l).getBitmap();
            float f6 = this.f29007m;
            float f7 = this.f29001g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f29002h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f29012r) {
                canvas.drawBitmap(l9k.m153435a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f29004j);
                return;
            }
            if (this.f29017w.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f29017w.get(Integer.valueOf(i)).f152157b, this.f29017w.get(Integer.valueOf(i)).f152156a.floatValue(), this.f29017w.get(Integer.valueOf(i)).f152156a.floatValue(), this.f29004j);
                return;
            }
            float f10 = this.f29001g;
            Bitmap bitmapM153435a = l9k.m153435a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapM153435a, f8, f8, this.f29004j);
            if (this.f29012r) {
                this.f29017w.put(Integer.valueOf(i), jyb.m147494Y(Float.valueOf(f8), bitmapM153435a));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m45249e() {
        Paint paint = new Paint();
        this.f29004j = paint;
        paint.setAntiAlias(true);
        this.f29004j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f29004j);
        Paint paint2 = new Paint();
        this.f29005k = paint2;
        paint2.setAntiAlias(true);
        this.f29005k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: g */
    public final int m45250g(int i) {
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
        mo45079d(canvas, this.f28819a.m45277j());
        if (this.f29015u > 0.0f) {
            m45248c(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f29000f = width;
        float f = this.f29009o ? this.f29003i : 0.0f;
        this.f29003i = f;
        this.f28819a.m45279l(width - (f * 4.0f), this.f29011q);
        C8438a c8438a = this.f28819a;
        c8438a.f29043i = this.f29008n;
        this.f29007m = this.f29000f / 2.0f;
        float f2 = this.f29001g;
        if (f2 == 0.0f) {
            f2 = c8438a.f29038d / 4.0f;
        }
        this.f29001g = f2;
        float f3 = this.f29002h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f29002h = f2;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f29010p) {
            return;
        }
        setMeasuredDimension(m45250g(i), m45250g(i));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f28819a.m45276i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f29015u = f;
    }

    public void setIcon(Drawable drawable) {
        this.f29006l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f29002h = f;
    }

    public void setIconWidth(float f) {
        this.f29001g = f;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.BounceView
    public void setLongPressingListener(C8438a.d dVar) {
        this.f28819a.f29046l = dVar;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.BounceView
    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28996b = getClass().getSimpleName();
        this.f28997c = Color.parseColor("#ffffff");
        this.f29006l = null;
        this.f29012r = true;
        this.f29013s = null;
        this.f29014t = null;
        this.f29017w = new l01<>();
        m45249e();
        m45245f(context, attributeSet);
    }
}
