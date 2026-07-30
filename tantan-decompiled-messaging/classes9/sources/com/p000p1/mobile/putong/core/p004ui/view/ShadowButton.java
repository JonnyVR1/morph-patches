package com.p000p1.mobile.putong.core.p004ui.view;

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
import l.e01;
import l.i9c0;
import l.j760;
import l.t100;
import l.t6k;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f6633b;

    /* JADX INFO: renamed from: c */
    public final int f6634c;

    /* JADX INFO: renamed from: d */
    public int f6635d;

    /* JADX INFO: renamed from: e */
    public int f6636e;

    /* JADX INFO: renamed from: f */
    public float f6637f;

    /* JADX INFO: renamed from: g */
    public float f6638g;

    /* JADX INFO: renamed from: h */
    public float f6639h;

    /* JADX INFO: renamed from: i */
    public float f6640i;

    /* JADX INFO: renamed from: j */
    public Paint f6641j;

    /* JADX INFO: renamed from: k */
    public Paint f6642k;

    /* JADX INFO: renamed from: l */
    public Drawable f6643l;

    /* JADX INFO: renamed from: m */
    public float f6644m;

    /* JADX INFO: renamed from: n */
    public boolean f6645n;

    /* JADX INFO: renamed from: o */
    public boolean f6646o;

    /* JADX INFO: renamed from: p */
    public boolean f6647p;

    /* JADX INFO: renamed from: q */
    public boolean f6648q;

    /* JADX INFO: renamed from: r */
    public Drawable f6649r;

    /* JADX INFO: renamed from: s */
    public Drawable f6650s;

    /* JADX INFO: renamed from: t */
    public float f6651t;

    /* JADX INFO: renamed from: u */
    public int f6652u;

    /* JADX INFO: renamed from: v */
    public e01<Integer, j760<Float, Bitmap>> f6653v;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6633b = getClass().getSimpleName();
        this.f6634c = Color.parseColor("#ffffff");
        this.f6643l = null;
        this.f6648q = true;
        this.f6649r = null;
        this.f6650s = null;
        this.f6653v = new e01<>();
        m9595d();
        m9592e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m9592e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f0);
        this.f6640i = typedArrayObtainStyledAttributes.getDimension(i9c0.x0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : t100.d(4.0f));
        this.f6638g = typedArrayObtainStyledAttributes.getDimension(i9c0.t0, 0.0f);
        this.f6639h = typedArrayObtainStyledAttributes.getDimension(i9c0.s0, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i9c0.q0);
        this.f6650s = drawable;
        this.f6643l = drawable;
        this.f6649r = typedArrayObtainStyledAttributes.getDrawable(i9c0.r0);
        this.f6635d = typedArrayObtainStyledAttributes.getColor(i9c0.u0, Color.parseColor("#3dec543d"));
        this.f6636e = typedArrayObtainStyledAttributes.getColor(i9c0.v0, Color.parseColor("#1eec543d"));
        this.f6645n = typedArrayObtainStyledAttributes.getBoolean(i9c0.g0, false);
        this.f6646o = typedArrayObtainStyledAttributes.getBoolean(i9c0.w0, false);
        this.f6651t = typedArrayObtainStyledAttributes.getDimension(i9c0.i0, 0.0f);
        this.f6652u = typedArrayObtainStyledAttributes.getColor(i9c0.h0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public int m9593a(int i, float f) {
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

    /* JADX INFO: renamed from: b */
    public void m9594b(Canvas canvas) {
        this.f6642k.setColor(this.f6652u);
        float fD = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : t100.d(1.0f);
        float f = this.f6651t;
        if (f >= fD) {
            fD = f;
        }
        this.f6642k.setStrokeWidth(fD);
        float f2 = this.f6644m;
        canvas.drawCircle(f2, f2, (this.f6506a.f6687d / 2.0f) - fD, this.f6642k);
    }

    /* JADX INFO: renamed from: c */
    public void mo9535c(Canvas canvas, float f) {
        float f2 = f / (this.f6506a.f6686c / 2.0f);
        this.f6641j.setColor(this.f6634c);
        if (this.f6646o) {
            Paint paint = this.f6641j;
            float f3 = this.f6640i;
            paint.setShadowLayer(f3, 0.0f, f3, m9593a(this.f6635d, f2));
            float f4 = this.f6644m;
            canvas.drawCircle(f4, f4, f, this.f6641j);
            this.f6641j.setShadowLayer(this.f6640i, 0.0f, 0.0f, m9593a(this.f6636e, f2));
        }
        float f5 = this.f6644m;
        canvas.drawCircle(f5, f5, f, this.f6641j);
        this.f6641j.clearShadowLayer();
        if (NullChecker.a(this.f6643l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f6643l).getBitmap();
            float f6 = this.f6644m;
            float f7 = this.f6638g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f6639h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f6648q) {
                canvas.drawBitmap(t6k.a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f6641j);
                return;
            }
            if (this.f6653v.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap((Bitmap) ((j760) this.f6653v.get(Integer.valueOf(i))).b, ((Float) ((j760) this.f6653v.get(Integer.valueOf(i))).a).floatValue(), ((Float) ((j760) this.f6653v.get(Integer.valueOf(i))).a).floatValue(), this.f6641j);
                return;
            }
            float f10 = this.f6638g;
            Bitmap bitmapA = t6k.a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapA, f8, f8, this.f6641j);
            if (this.f6648q) {
                this.f6653v.put(Integer.valueOf(i), vwb.Y(Float.valueOf(f8), bitmapA));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9595d() {
        Paint paint = new Paint();
        this.f6641j = paint;
        paint.setAntiAlias(true);
        this.f6641j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f6641j);
        Paint paint2 = new Paint();
        this.f6642k = paint2;
        paint2.setAntiAlias(true);
        this.f6642k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: f */
    public final int m9596f(int i) {
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
        mo9535c(canvas, this.f6506a.m9620j());
        if (this.f6651t > 0.0f) {
            m9594b(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f6637f = width;
        float f = this.f6646o ? this.f6640i : 0.0f;
        this.f6640i = f;
        this.f6506a.m9621k(width - (f * 4.0f));
        C0371a c0371a = this.f6506a;
        c0371a.f6692i = this.f6645n;
        this.f6644m = this.f6637f / 2.0f;
        float f2 = this.f6638g;
        if (f2 == 0.0f) {
            f2 = c0371a.f6687d / 4.0f;
        }
        this.f6638g = f2;
        float f3 = this.f6639h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f6639h = f2;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6647p) {
            return;
        }
        setMeasuredDimension(m9596f(i), m9596f(i));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6506a.m9619i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f6651t = f;
    }

    public void setIcon(Drawable drawable) {
        this.f6643l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f6639h = f;
    }

    public void setIconWidth(float f) {
        this.f6638g = f;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.BounceView
    public void setLongPressingListener(C0371a.d dVar) {
        this.f6506a.getClass();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.BounceView
    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6633b = getClass().getSimpleName();
        this.f6634c = Color.parseColor("#ffffff");
        this.f6643l = null;
        this.f6648q = true;
        this.f6649r = null;
        this.f6650s = null;
        this.f6653v = new e01<>();
        m9595d();
        m9592e(context, attributeSet);
    }
}
