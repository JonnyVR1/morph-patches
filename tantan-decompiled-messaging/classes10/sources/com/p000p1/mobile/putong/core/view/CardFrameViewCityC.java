package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.e9c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardFrameViewCityC extends View {

    /* JADX INFO: renamed from: a */
    public int f2336a;

    /* JADX INFO: renamed from: b */
    public int f2337b;

    /* JADX INFO: renamed from: c */
    public Paint f2338c;

    /* JADX INFO: renamed from: d */
    public Paint f2339d;

    /* JADX INFO: renamed from: e */
    public Paint f2340e;

    /* JADX INFO: renamed from: f */
    public int f2341f;

    /* JADX INFO: renamed from: g */
    public boolean f2342g;

    /* JADX INFO: renamed from: h */
    public boolean f2343h;

    /* JADX INFO: renamed from: i */
    public boolean f2344i;

    /* JADX INFO: renamed from: j */
    public int f2345j;

    /* JADX INFO: renamed from: k */
    public int f2346k;

    /* JADX INFO: renamed from: l */
    public int f2347l;

    /* JADX INFO: renamed from: m */
    public int f2348m;

    /* JADX INFO: renamed from: n */
    public int f2349n;

    /* JADX INFO: renamed from: o */
    public int f2350o;

    /* JADX INFO: renamed from: p */
    public int f2351p;

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2341f = t100.d(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f);
        this.f2342g = typedArrayObtainStyledAttributes.getBoolean(e9c0.g, false);
        this.f2343h = typedArrayObtainStyledAttributes.getBoolean(e9c0.h, false);
        this.f2344i = typedArrayObtainStyledAttributes.getBoolean(e9c0.i, false);
        this.f2345j = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.k, 0);
        this.f2346k = typedArrayObtainStyledAttributes.getInteger(e9c0.j, 0);
        this.f2347l = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.m, 0);
        this.f2348m = typedArrayObtainStyledAttributes.getInteger(e9c0.l, 0);
        this.f2349n = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.o, 0);
        this.f2350o = typedArrayObtainStyledAttributes.getInteger(e9c0.n, 0);
        this.f2351p = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.p, 0);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
        m4896a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4896a() {
        if (this.f2342g) {
            Paint paint = new Paint();
            this.f2338c = paint;
            paint.setAntiAlias(true);
            this.f2338c.setStyle(Paint.Style.STROKE);
            this.f2338c.setStrokeWidth(this.f2345j);
        }
        if (this.f2343h) {
            Paint paint2 = new Paint();
            this.f2339d = paint2;
            paint2.setAntiAlias(true);
            this.f2339d.setStyle(Paint.Style.STROKE);
            this.f2339d.setColor(Color.parseColor("#212121"));
            this.f2339d.setStrokeWidth(this.f2347l);
        }
        if (this.f2344i) {
            Paint paint3 = new Paint();
            this.f2340e = paint3;
            paint3.setAntiAlias(true);
            this.f2340e.setStyle(Paint.Style.STROKE);
            this.f2340e.setColor(Color.parseColor("#212121"));
            this.f2340e.setStrokeWidth(this.f2349n);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2338c != null) {
            RectF rectF = new RectF();
            float f = this.f2345j / 2;
            float f2 = f + 0.0f;
            rectF.top = f2;
            rectF.left = f2;
            rectF.right = this.f2336a - f;
            rectF.bottom = this.f2337b - f;
            canvas.drawRoundRect(rectF, t100.d(this.f2346k), t100.d(this.f2346k), this.f2338c);
        }
        if (this.f2339d != null) {
            RectF rectF2 = new RectF();
            float f3 = (this.f2347l / 2) - 1;
            float f4 = f3 + 0.0f;
            rectF2.top = f4;
            rectF2.left = f4;
            rectF2.right = this.f2336a - f3;
            rectF2.bottom = this.f2337b - f3;
            canvas.drawRoundRect(rectF2, t100.d(this.f2348m), t100.d(this.f2348m), this.f2339d);
        }
        if (this.f2340e != null) {
            RectF rectF3 = new RectF();
            float f5 = (this.f2349n / 2) + this.f2351p;
            float f6 = 0.0f + f5;
            rectF3.top = f6;
            rectF3.left = f6;
            rectF3.right = this.f2336a - f5;
            rectF3.bottom = this.f2337b - f5;
            canvas.drawRoundRect(rectF3, t100.d(this.f2350o), t100.d(this.f2350o), this.f2340e);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2336a = getMeasuredWidth();
        this.f2337b = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2338c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f2337b, Color.parseColor("#DBBD7A"), Color.parseColor("#9E8345"), Shader.TileMode.CLAMP));
    }

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFrameViewCityC(@NonNull Context context) {
        this(context, null);
    }
}
