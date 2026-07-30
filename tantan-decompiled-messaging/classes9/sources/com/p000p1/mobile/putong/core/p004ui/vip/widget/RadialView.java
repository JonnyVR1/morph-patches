package com.p000p1.mobile.putong.core.p004ui.vip.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;
import p006l.e9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RadialView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f7818a;

    /* JADX INFO: renamed from: b */
    public RectF f7819b;

    /* JADX INFO: renamed from: c */
    public float[] f7820c;

    /* JADX INFO: renamed from: d */
    public float[] f7821d;

    /* JADX INFO: renamed from: e */
    public float f7822e;

    /* JADX INFO: renamed from: f */
    public Paint f7823f;

    /* JADX INFO: renamed from: g */
    public int f7824g;

    /* JADX INFO: renamed from: h */
    public float f7825h;

    /* JADX INFO: renamed from: i */
    public int f7826i;

    /* JADX INFO: renamed from: j */
    public int f7827j;

    /* JADX INFO: renamed from: k */
    public float f7828k;

    /* JADX INFO: renamed from: l */
    public Drawable f7829l;

    /* JADX INFO: renamed from: m */
    public Path f7830m;

    /* JADX INFO: renamed from: n */
    public float f7831n;

    /* JADX INFO: renamed from: o */
    public int f7832o;

    /* JADX INFO: renamed from: p */
    public int f7833p;

    /* JADX INFO: renamed from: q */
    public float f7834q;

    /* JADX INFO: renamed from: r */
    public float f7835r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f7836s;

    public RadialView(Context context) {
        super(context);
        this.f7818a = new RectF();
        this.f7819b = new RectF();
        this.f7820c = new float[2];
        this.f7834q = 0.0f;
        this.f7835r = 0.0f;
        m11268b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11267a() {
        int i = this.f7824g;
        this.f7821d = new float[i];
        float f = 360 / i;
        float f2 = 0.4333f * f;
        this.f7822e = f2;
        float f3 = f2 / 2.0f;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f7821d;
            if (i2 >= fArr.length) {
                return;
            }
            fArr[i2] = (i2 * f) - f3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11268b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f10993r1);
        this.f7828k = typedArrayObtainStyledAttributes.getDimension(e9c0.f10999t1, t100.i);
        this.f7829l = typedArrayObtainStyledAttributes.getDrawable(e9c0.f10996s1);
        this.f7824g = typedArrayObtainStyledAttributes.getInt(e9c0.f11002u1, 8);
        this.f7826i = typedArrayObtainStyledAttributes.getColor(e9c0.f11008w1, Color.parseColor("#00ffffff"));
        this.f7827j = typedArrayObtainStyledAttributes.getColor(e9c0.f11005v1, Color.parseColor("#22ffffff"));
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.f11011x1, 0.5f);
        this.f7825h = typedArrayObtainStyledAttributes.getFloat(e9c0.f11014y1, 0.618f);
        typedArrayObtainStyledAttributes.recycle();
        this.f7832o = getContext().getResources().getDisplayMetrics().widthPixels;
        int iX0 = xdl0.x0(getContext());
        this.f7833p = iX0;
        int i = this.f7832o;
        float f2 = i * f * i * f;
        float f3 = this.f7825h;
        this.f7831n = (float) Math.sqrt(f2 + (iX0 * f3 * iX0 * f3));
        Paint paint = new Paint();
        this.f7823f = paint;
        paint.setColor(-1);
        this.f7823f.setStyle(Paint.Style.FILL);
        m11267a();
        if (this.f7829l == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f7829l = gradientDrawable;
            gradientDrawable.setGradientType(0);
            ((GradientDrawable) this.f7829l).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        }
    }

    public float getRadiateTranslationY() {
        float f = this.f7820c[1];
        int i = this.f7833p;
        return (this.f7825h - (f / i)) * i;
    }

    @Keep
    public float getRotateAngle() {
        return this.f7834q;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!NullChecker.a(this.f7836s) || this.f7836s.isRunning()) {
            return;
        }
        this.f7836s.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (NullChecker.a(this.f7830m)) {
            canvas.clipPath(this.f7830m);
        }
        this.f7829l.draw(canvas);
        canvas.rotate(this.f7834q, this.f7818a.centerX(), this.f7818a.centerY() + this.f7835r);
        canvas.translate(0.0f, this.f7835r);
        for (float f : this.f7821d) {
            canvas.drawArc(this.f7818a, f, this.f7822e, true, this.f7823f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float[] fArr = this.f7820c;
        this.f7823f.setShader(new RadialGradient(fArr[0], fArr[1], this.f7831n, this.f7826i, this.f7827j, Shader.TileMode.CLAMP));
        RectF rectF = this.f7818a;
        float f = i >> 1;
        float f2 = this.f7831n;
        float f3 = f - f2;
        rectF.left = f3;
        float f4 = f + f2;
        rectF.right = f4;
        float f5 = i2 >> 1;
        float f6 = f5 - f2;
        rectF.top = f6;
        float f7 = f5 + f2;
        rectF.bottom = f7;
        this.f7829l.setBounds((int) f3, (int) f6, (int) f4, (int) f7);
        setVisualRect(new RectF(0.0f, 0.0f, i, i2));
    }

    @Keep
    public void setRotateAngle(float f) {
        if (this.f7834q != f) {
            this.f7834q = f;
            invalidate();
        }
    }

    public void setVisualRect(RectF rectF) {
        this.f7819b.set(rectF);
        Path path = this.f7830m;
        if (path == null) {
            this.f7830m = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.f7830m;
        RectF rectF2 = this.f7819b;
        float f = this.f7828k;
        path2.addRoundRect(rectF2, f, f, Path.Direction.CW);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7818a = new RectF();
        this.f7819b = new RectF();
        this.f7820c = new float[2];
        this.f7834q = 0.0f;
        this.f7835r = 0.0f;
        m11268b(context, attributeSet);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7818a = new RectF();
        this.f7819b = new RectF();
        this.f7820c = new float[2];
        this.f7834q = 0.0f;
        this.f7835r = 0.0f;
        m11268b(context, attributeSet);
    }
}
