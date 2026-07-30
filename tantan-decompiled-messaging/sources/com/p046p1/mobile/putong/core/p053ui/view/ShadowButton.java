package com.p046p1.mobile.putong.core.p053ui.view;

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
import p149l.i9c0;
import p149l.j760;
import p149l.t100;
import p149l.t6k;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class ShadowButton extends BounceView {

    /* JADX INFO: renamed from: b */
    public final String f36852b;

    /* JADX INFO: renamed from: c */
    public final int f36853c;

    /* JADX INFO: renamed from: d */
    public int f36854d;

    /* JADX INFO: renamed from: e */
    public int f36855e;

    /* JADX INFO: renamed from: f */
    public float f36856f;

    /* JADX INFO: renamed from: g */
    public float f36857g;

    /* JADX INFO: renamed from: h */
    public float f36858h;

    /* JADX INFO: renamed from: i */
    public float f36859i;

    /* JADX INFO: renamed from: j */
    public Paint f36860j;

    /* JADX INFO: renamed from: k */
    public Paint f36861k;

    /* JADX INFO: renamed from: l */
    public Drawable f36862l;

    /* JADX INFO: renamed from: m */
    public float f36863m;

    /* JADX INFO: renamed from: n */
    public boolean f36864n;

    /* JADX INFO: renamed from: o */
    public boolean f36865o;

    /* JADX INFO: renamed from: p */
    public boolean f36866p;

    /* JADX INFO: renamed from: q */
    public boolean f36867q;

    /* JADX INFO: renamed from: r */
    public Drawable f36868r;

    /* JADX INFO: renamed from: s */
    public Drawable f36869s;

    /* JADX INFO: renamed from: t */
    public float f36870t;

    /* JADX INFO: renamed from: u */
    public int f36871u;

    /* JADX INFO: renamed from: v */
    public e01<Integer, j760<Float, Bitmap>> f36872v;

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36852b = getClass().getSimpleName();
        this.f36853c = Color.parseColor("#ffffff");
        this.f36862l = null;
        this.f36867q = true;
        this.f36868r = null;
        this.f36869s = null;
        this.f36872v = new e01<>();
        m56168d();
        m56165e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m56165e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112169f0);
        this.f36859i = typedArrayObtainStyledAttributes.getDimension(i9c0.f112205x0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 4.0f : t100.m186890d(4.0f));
        this.f36857g = typedArrayObtainStyledAttributes.getDimension(i9c0.f112197t0, 0.0f);
        this.f36858h = typedArrayObtainStyledAttributes.getDimension(i9c0.f112195s0, 0.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i9c0.f112191q0);
        this.f36869s = drawable;
        this.f36862l = drawable;
        this.f36868r = typedArrayObtainStyledAttributes.getDrawable(i9c0.f112193r0);
        this.f36854d = typedArrayObtainStyledAttributes.getColor(i9c0.f112199u0, Color.parseColor("#3dec543d"));
        this.f36855e = typedArrayObtainStyledAttributes.getColor(i9c0.f112201v0, Color.parseColor("#1eec543d"));
        this.f36864n = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112171g0, false);
        this.f36865o = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112203w0, false);
        this.f36870t = typedArrayObtainStyledAttributes.getDimension(i9c0.f112175i0, 0.0f);
        this.f36871u = typedArrayObtainStyledAttributes.getColor(i9c0.f112173h0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public int m56166a(int i, float f) {
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
    public void m56167b(Canvas canvas) {
        this.f36861k.setColor(this.f36871u);
        float fM186890d = isInEditMode() ? getContext().getResources().getDisplayMetrics().density * 1.0f : t100.m186890d(1.0f);
        float f = this.f36870t;
        if (f >= fM186890d) {
            fM186890d = f;
        }
        this.f36861k.setStrokeWidth(fM186890d);
        float f2 = this.f36863m;
        canvas.drawCircle(f2, f2, (this.f36725a.f36906d / 2.0f) - fM186890d, this.f36861k);
    }

    /* JADX INFO: renamed from: c */
    public void mo56110c(Canvas canvas, float f) {
        float f2 = f / (this.f36725a.f36905c / 2.0f);
        this.f36860j.setColor(this.f36853c);
        if (this.f36865o) {
            Paint paint = this.f36860j;
            float f3 = this.f36859i;
            paint.setShadowLayer(f3, 0.0f, f3, m56166a(this.f36854d, f2));
            float f4 = this.f36863m;
            canvas.drawCircle(f4, f4, f, this.f36860j);
            this.f36860j.setShadowLayer(this.f36859i, 0.0f, 0.0f, m56166a(this.f36855e, f2));
        }
        float f5 = this.f36863m;
        canvas.drawCircle(f5, f5, f, this.f36860j);
        this.f36860j.clearShadowLayer();
        if (NullChecker.m81303a(this.f36862l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f36862l).getBitmap();
            float f6 = this.f36863m;
            float f7 = this.f36857g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = f6 - ((this.f36858h / 2.0f) * f2);
            if (f8 <= 0.0f || f9 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f36867q) {
                canvas.drawBitmap(t6k.m187383a(bitmap, f7 * f2, f7 * f2), f8, f8, this.f36860j);
                return;
            }
            if (this.f36872v.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f36872v.get(Integer.valueOf(i)).f116565b, this.f36872v.get(Integer.valueOf(i)).f116564a.floatValue(), this.f36872v.get(Integer.valueOf(i)).f116564a.floatValue(), this.f36860j);
                return;
            }
            float f10 = this.f36857g;
            Bitmap bitmapM187383a = t6k.m187383a(bitmap, f10 * f2, f10 * f2);
            canvas.drawBitmap(bitmapM187383a, f8, f8, this.f36860j);
            if (this.f36867q) {
                this.f36872v.put(Integer.valueOf(i), vwb.m200311Y(Float.valueOf(f8), bitmapM187383a));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56168d() {
        Paint paint = new Paint();
        this.f36860j = paint;
        paint.setAntiAlias(true);
        this.f36860j.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f36860j);
        Paint paint2 = new Paint();
        this.f36861k = paint2;
        paint2.setAntiAlias(true);
        this.f36861k.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: f */
    public final int m56169f(int i) {
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
        mo56110c(canvas, this.f36725a.m56193j());
        if (this.f36870t > 0.0f) {
            m56167b(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width = getWidth();
        this.f36856f = width;
        float f = this.f36865o ? this.f36859i : 0.0f;
        this.f36859i = f;
        this.f36725a.m56194k(width - (f * 4.0f));
        C8935a c8935a = this.f36725a;
        c8935a.f36911i = this.f36864n;
        this.f36863m = this.f36856f / 2.0f;
        float f2 = this.f36857g;
        if (f2 == 0.0f) {
            f2 = c8935a.f36906d / 4.0f;
        }
        this.f36857g = f2;
        float f3 = this.f36858h;
        if (f3 != 0.0f) {
            f2 = f3;
        }
        this.f36858h = f2;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f36866p) {
            return;
        }
        setMeasuredDimension(m56169f(i), m56169f(i));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36725a.m56192i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setBordersize(float f) {
        this.f36870t = f;
    }

    public void setIcon(Drawable drawable) {
        this.f36862l = drawable;
        invalidate();
    }

    public void setIconHeight(float f) {
        this.f36858h = f;
    }

    public void setIconWidth(float f) {
        this.f36857g = f;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.BounceView
    public void setLongPressingListener(C8935a.d dVar) {
        this.f36725a.getClass();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.BounceView
    public void setProgress(float f) {
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36852b = getClass().getSimpleName();
        this.f36853c = Color.parseColor("#ffffff");
        this.f36862l = null;
        this.f36867q = true;
        this.f36868r = null;
        this.f36869s = null;
        this.f36872v = new e01<>();
        m56168d();
        m56165e(context, attributeSet);
    }
}
