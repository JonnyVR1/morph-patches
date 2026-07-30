package com.p003p1.mobile.putong.core.p006ui;

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
import com.p1.mobile.putong.core.ui.BounceView;
import com.tantanapp.common.utils.NullChecker;
import l.e01;
import l.j760;
import l.r9c0;
import l.t100;
import l.vwb;
import p007l.t6k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f1719b;

    /* JADX INFO: renamed from: c */
    public final int f1720c;

    /* JADX INFO: renamed from: d */
    public int f1721d;

    /* JADX INFO: renamed from: e */
    public int f1722e;

    /* JADX INFO: renamed from: f */
    public float f1723f;

    /* JADX INFO: renamed from: g */
    public float f1724g;

    /* JADX INFO: renamed from: h */
    public float f1725h;

    /* JADX INFO: renamed from: i */
    public float f1726i;

    /* JADX INFO: renamed from: j */
    public Paint f1727j;

    /* JADX INFO: renamed from: k */
    public Paint f1728k;

    /* JADX INFO: renamed from: l */
    public Drawable f1729l;

    /* JADX INFO: renamed from: m */
    public float f1730m;

    /* JADX INFO: renamed from: n */
    public boolean f1731n;

    /* JADX INFO: renamed from: o */
    public boolean f1732o;

    /* JADX INFO: renamed from: p */
    public boolean f1733p;

    /* JADX INFO: renamed from: q */
    public boolean f1734q;

    /* JADX INFO: renamed from: r */
    public boolean f1735r;

    /* JADX INFO: renamed from: s */
    public Drawable f1736s;

    /* JADX INFO: renamed from: t */
    public Drawable f1737t;

    /* JADX INFO: renamed from: u */
    public float f1738u;

    /* JADX INFO: renamed from: v */
    public int f1739v;

    /* JADX INFO: renamed from: w */
    public e01<Integer, j760<Float, Bitmap>> f1740w;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1719b = getClass().getSimpleName();
        this.f1720c = Color.parseColor("#ffffff");
        this.f1729l = null;
        this.f1735r = true;
        this.f1736s = null;
        this.f1737t = null;
        this.f1740w = new e01<>();
        m8389e();
        m8384f(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private void m8384f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.K);
        this.f1726i = typedArrayObtainStyledAttributes.getDimension(r9c0.d0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : t100.d(4.0f));
        this.f1724g = typedArrayObtainStyledAttributes.getDimension(r9c0.Z, 0.0f);
        this.f1725h = typedArrayObtainStyledAttributes.getDimension(r9c0.Y, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(r9c0.W);
        this.f1737t = drawable;
        this.f1729l = drawable;
        this.f1736s = typedArrayObtainStyledAttributes.getDrawable(r9c0.X);
        this.f1721d = typedArrayObtainStyledAttributes.getColor(r9c0.a0, Color.parseColor("#3dec543d"));
        this.f1722e = typedArrayObtainStyledAttributes.getColor(r9c0.b0, Color.parseColor("#1eec543d"));
        this.f1731n = typedArrayObtainStyledAttributes.getBoolean(r9c0.L, false);
        this.f1732o = typedArrayObtainStyledAttributes.getBoolean(r9c0.c0, false);
        this.f1738u = typedArrayObtainStyledAttributes.getDimension(r9c0.N, 0.0f);
        this.f1739v = typedArrayObtainStyledAttributes.getColor(r9c0.M, -1);
        this.f1734q = typedArrayObtainStyledAttributes.getBoolean(r9c0.R, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m8385a() {
        ((BounceView) this).a.m8419e();
    }

    /* JADX INFO: renamed from: b */
    public int m8386b(int i, float f) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m8387c(Canvas canvas) {
        this.f1728k.setColor(this.f1739v);
        float fD = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : t100.d(1.0f);
        float f = this.f1738u;
        if (f >= fD) {
            fD = f;
        }
        this.f1728k.setStrokeWidth(fD);
        float f2 = this.f1730m;
        canvas.drawCircle(f2, f2, (((BounceView) this).a.f1761d / 2.0f) - fD, this.f1728k);
    }

    /* JADX INFO: renamed from: d */
    public void m8388d(Canvas canvas, float f) {
        float f2 = f / (((BounceView) this).a.f1760c / 2.0f);
        this.f1727j.setColor(this.f1720c);
        if (this.f1732o) {
            Paint paint = this.f1727j;
            float f3 = this.f1726i;
            paint.setShadowLayer(f3, 0.0f, f3, m8386b(this.f1721d, f2));
            float f4 = this.f1730m;
            canvas.drawCircle(f4, f4, f, this.f1727j);
            this.f1727j.setShadowLayer(this.f1726i, 0.0f, 0.0f, m8386b(this.f1722e, f2));
        }
        float f5 = this.f1730m;
        canvas.drawCircle(f5, f5, f, this.f1727j);
        this.f1727j.clearShadowLayer();
        if (NullChecker.a(this.f1729l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f1729l).getBitmap();
            float f6 = this.f1730m;
            float f7 = this.f1724g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f1725h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f1735r) {
                canvas.drawBitmap(t6k.m10774a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f1727j);
                return;
            }
            if (this.f1740w.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap((Bitmap) ((j760) this.f1740w.get(Integer.valueOf(i))).b, ((Float) ((j760) this.f1740w.get(Integer.valueOf(i))).a).floatValue(), ((Float) ((j760) this.f1740w.get(Integer.valueOf(i))).a).floatValue(), this.f1727j);
                return;
            }
            float f10 = this.f1724g;
            Bitmap bitmapM10774a = t6k.m10774a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapM10774a, f8, f8, this.f1727j);
            if (this.f1735r) {
                this.f1740w.put(Integer.valueOf(i), vwb.Y(Float.valueOf(f8), bitmapM10774a));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m8389e() {
        Paint paint = new Paint();
        this.f1727j = paint;
        paint.setAntiAlias(true);
        this.f1727j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f1727j);
        Paint paint2 = new Paint();
        this.f1728k = paint2;
        paint2.setAntiAlias(true);
        this.f1728k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: g */
    public final int m8390g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        m8388d(canvas, ((BounceView) this).a.m8423j());
        if (this.f1738u > 0.0f) {
            m8387c(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f1723f = width;
        float f = this.f1732o ? this.f1726i : 0.0f;
        this.f1726i = f;
        ((BounceView) this).a.m8425l(width - (f * 4.0f), this.f1734q);
        C0487a c0487a = ((BounceView) this).a;
        c0487a.f1766i = this.f1731n;
        this.f1730m = this.f1723f / 2.0f;
        float f2 = this.f1724g;
        if (f2 == 0.0f) {
            f2 = c0487a.f1761d / 4.0f;
        }
        this.f1724g = f2;
        float f3 = this.f1725h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f1725h = f2;
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (this.f1733p) {
            return;
        }
        setMeasuredDimension(m8390g(i), m8390g(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ((BounceView) this).a.m8422i(motionEvent);
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f1738u = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(Drawable drawable) {
        this.f1729l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f1725h = f;
    }

    public void setIconWidth(float f) {
        this.f1724g = f;
    }

    public void setLongPressingListener(C0487a.d dVar) {
        ((BounceView) this).a.f1769l = dVar;
    }

    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1719b = getClass().getSimpleName();
        this.f1720c = Color.parseColor("#ffffff");
        this.f1729l = null;
        this.f1735r = true;
        this.f1736s = null;
        this.f1737t = null;
        this.f1740w = new e01<>();
        m8389e();
        m8384f(context, attributeSet);
    }
}
