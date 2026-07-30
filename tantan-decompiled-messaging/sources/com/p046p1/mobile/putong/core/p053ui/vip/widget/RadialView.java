package com.p046p1.mobile.putong.core.p053ui.vip.widget;

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
import p149l.e9c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class RadialView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f38037a;

    /* JADX INFO: renamed from: b */
    public RectF f38038b;

    /* JADX INFO: renamed from: c */
    public float[] f38039c;

    /* JADX INFO: renamed from: d */
    public float[] f38040d;

    /* JADX INFO: renamed from: e */
    public float f38041e;

    /* JADX INFO: renamed from: f */
    public Paint f38042f;

    /* JADX INFO: renamed from: g */
    public int f38043g;

    /* JADX INFO: renamed from: h */
    public float f38044h;

    /* JADX INFO: renamed from: i */
    public int f38045i;

    /* JADX INFO: renamed from: j */
    public int f38046j;

    /* JADX INFO: renamed from: k */
    public float f38047k;

    /* JADX INFO: renamed from: l */
    public Drawable f38048l;

    /* JADX INFO: renamed from: m */
    public Path f38049m;

    /* JADX INFO: renamed from: n */
    public float f38050n;

    /* JADX INFO: renamed from: o */
    public int f38051o;

    /* JADX INFO: renamed from: p */
    public int f38052p;

    /* JADX INFO: renamed from: q */
    public float f38053q;

    /* JADX INFO: renamed from: r */
    public float f38054r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f38055s;

    public RadialView(Context context) {
        super(context);
        this.f38037a = new RectF();
        this.f38038b = new RectF();
        this.f38039c = new float[2];
        this.f38053q = 0.0f;
        this.f38054r = 0.0f;
        m57769b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m57768a() {
        int i = this.f38043g;
        this.f38040d = new float[i];
        float f = 360 / i;
        float f2 = 0.4333f * f;
        this.f38041e = f2;
        float f3 = f2 / 2.0f;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f38040d;
            if (i2 >= fArr.length) {
                return;
            }
            fArr[i2] = (i2 * f) - f3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57769b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90066r1);
        this.f38047k = typedArrayObtainStyledAttributes.getDimension(e9c0.f90072t1, t100.f167260i);
        this.f38048l = typedArrayObtainStyledAttributes.getDrawable(e9c0.f90069s1);
        this.f38043g = typedArrayObtainStyledAttributes.getInt(e9c0.f90075u1, 8);
        this.f38045i = typedArrayObtainStyledAttributes.getColor(e9c0.f90081w1, Color.parseColor("#00ffffff"));
        this.f38046j = typedArrayObtainStyledAttributes.getColor(e9c0.f90078v1, Color.parseColor("#22ffffff"));
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.f90084x1, 0.5f);
        this.f38044h = typedArrayObtainStyledAttributes.getFloat(e9c0.f90087y1, 0.618f);
        typedArrayObtainStyledAttributes.recycle();
        this.f38051o = getContext().getResources().getDisplayMetrics().widthPixels;
        int iM208410x0 = xdl0.m208410x0(getContext());
        this.f38052p = iM208410x0;
        int i = this.f38051o;
        float f2 = i * f * i * f;
        float f3 = this.f38044h;
        this.f38050n = (float) Math.sqrt(f2 + (iM208410x0 * f3 * iM208410x0 * f3));
        Paint paint = new Paint();
        this.f38042f = paint;
        paint.setColor(-1);
        this.f38042f.setStyle(Paint.Style.FILL);
        m57768a();
        if (this.f38048l == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f38048l = gradientDrawable;
            gradientDrawable.setGradientType(0);
            ((GradientDrawable) this.f38048l).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        }
    }

    public float getRadiateTranslationY() {
        float f = this.f38039c[1];
        int i = this.f38052p;
        return (this.f38044h - (f / i)) * i;
    }

    @Keep
    public float getRotateAngle() {
        return this.f38053q;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!NullChecker.m81303a(this.f38055s) || this.f38055s.isRunning()) {
            return;
        }
        this.f38055s.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (NullChecker.m81303a(this.f38049m)) {
            canvas.clipPath(this.f38049m);
        }
        this.f38048l.draw(canvas);
        canvas.rotate(this.f38053q, this.f38037a.centerX(), this.f38037a.centerY() + this.f38054r);
        canvas.translate(0.0f, this.f38054r);
        for (float f : this.f38040d) {
            canvas.drawArc(this.f38037a, f, this.f38041e, true, this.f38042f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float[] fArr = this.f38039c;
        this.f38042f.setShader(new RadialGradient(fArr[0], fArr[1], this.f38050n, this.f38045i, this.f38046j, Shader.TileMode.CLAMP));
        RectF rectF = this.f38037a;
        float f = i >> 1;
        float f2 = this.f38050n;
        float f3 = f - f2;
        rectF.left = f3;
        float f4 = f + f2;
        rectF.right = f4;
        float f5 = i2 >> 1;
        float f6 = f5 - f2;
        rectF.top = f6;
        float f7 = f5 + f2;
        rectF.bottom = f7;
        this.f38048l.setBounds((int) f3, (int) f6, (int) f4, (int) f7);
        setVisualRect(new RectF(0.0f, 0.0f, i, i2));
    }

    @Keep
    public void setRotateAngle(float f) {
        if (this.f38053q != f) {
            this.f38053q = f;
            invalidate();
        }
    }

    public void setVisualRect(RectF rectF) {
        this.f38038b.set(rectF);
        Path path = this.f38049m;
        if (path == null) {
            this.f38049m = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.f38049m;
        RectF rectF2 = this.f38038b;
        float f = this.f38047k;
        path2.addRoundRect(rectF2, f, f, Path.Direction.CW);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38037a = new RectF();
        this.f38038b = new RectF();
        this.f38039c = new float[2];
        this.f38053q = 0.0f;
        this.f38054r = 0.0f;
        m57769b(context, attributeSet);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38037a = new RectF();
        this.f38038b = new RectF();
        this.f38039c = new float[2];
        this.f38053q = 0.0f;
        this.f38054r = 0.0f;
        m57769b(context, attributeSet);
    }
}
