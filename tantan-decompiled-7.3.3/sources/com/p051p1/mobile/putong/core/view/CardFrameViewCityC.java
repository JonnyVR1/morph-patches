package com.p051p1.mobile.putong.core.view;

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
import p153l.khc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class CardFrameViewCityC extends View {

    /* JADX INFO: renamed from: a */
    public int f39242a;

    /* JADX INFO: renamed from: b */
    public int f39243b;

    /* JADX INFO: renamed from: c */
    public Paint f39244c;

    /* JADX INFO: renamed from: d */
    public Paint f39245d;

    /* JADX INFO: renamed from: e */
    public Paint f39246e;

    /* JADX INFO: renamed from: f */
    public int f39247f;

    /* JADX INFO: renamed from: g */
    public boolean f39248g;

    /* JADX INFO: renamed from: h */
    public boolean f39249h;

    /* JADX INFO: renamed from: i */
    public boolean f39250i;

    /* JADX INFO: renamed from: j */
    public int f39251j;

    /* JADX INFO: renamed from: k */
    public int f39252k;

    /* JADX INFO: renamed from: l */
    public int f39253l;

    /* JADX INFO: renamed from: m */
    public int f39254m;

    /* JADX INFO: renamed from: n */
    public int f39255n;

    /* JADX INFO: renamed from: o */
    public int f39256o;

    /* JADX INFO: renamed from: p */
    public int f39257p;

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39247f = qa00.m175859d(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126798f);
        this.f39248g = typedArrayObtainStyledAttributes.getBoolean(khc0.f126801g, false);
        this.f39249h = typedArrayObtainStyledAttributes.getBoolean(khc0.f126804h, false);
        this.f39250i = typedArrayObtainStyledAttributes.getBoolean(khc0.f126807i, false);
        this.f39251j = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126813k, 0);
        this.f39252k = typedArrayObtainStyledAttributes.getInteger(khc0.f126810j, 0);
        this.f39253l = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126819m, 0);
        this.f39254m = typedArrayObtainStyledAttributes.getInteger(khc0.f126816l, 0);
        this.f39255n = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126825o, 0);
        this.f39256o = typedArrayObtainStyledAttributes.getInteger(khc0.f126822n, 0);
        this.f39257p = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126828p, 0);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
        m60671a();
    }

    /* JADX INFO: renamed from: a */
    public final void m60671a() {
        if (this.f39248g) {
            Paint paint = new Paint();
            this.f39244c = paint;
            paint.setAntiAlias(true);
            this.f39244c.setStyle(Paint.Style.STROKE);
            this.f39244c.setStrokeWidth(this.f39251j);
        }
        if (this.f39249h) {
            Paint paint2 = new Paint();
            this.f39245d = paint2;
            paint2.setAntiAlias(true);
            this.f39245d.setStyle(Paint.Style.STROKE);
            this.f39245d.setColor(Color.parseColor("#212121"));
            this.f39245d.setStrokeWidth(this.f39253l);
        }
        if (this.f39250i) {
            Paint paint3 = new Paint();
            this.f39246e = paint3;
            paint3.setAntiAlias(true);
            this.f39246e.setStyle(Paint.Style.STROKE);
            this.f39246e.setColor(Color.parseColor("#212121"));
            this.f39246e.setStrokeWidth(this.f39255n);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39244c != null) {
            RectF rectF = new RectF();
            float f = this.f39251j / 2;
            float f2 = f + 0.0f;
            rectF.top = f2;
            rectF.left = f2;
            rectF.right = this.f39242a - f;
            rectF.bottom = this.f39243b - f;
            canvas.drawRoundRect(rectF, qa00.m175859d(this.f39252k), qa00.m175859d(this.f39252k), this.f39244c);
        }
        if (this.f39245d != null) {
            RectF rectF2 = new RectF();
            float f3 = (this.f39253l / 2) - 1;
            float f4 = f3 + 0.0f;
            rectF2.top = f4;
            rectF2.left = f4;
            rectF2.right = this.f39242a - f3;
            rectF2.bottom = this.f39243b - f3;
            canvas.drawRoundRect(rectF2, qa00.m175859d(this.f39254m), qa00.m175859d(this.f39254m), this.f39245d);
        }
        if (this.f39246e != null) {
            RectF rectF3 = new RectF();
            float f5 = (this.f39255n / 2) + this.f39257p;
            float f6 = 0.0f + f5;
            rectF3.top = f6;
            rectF3.left = f6;
            rectF3.right = this.f39242a - f5;
            rectF3.bottom = this.f39243b - f5;
            canvas.drawRoundRect(rectF3, qa00.m175859d(this.f39256o), qa00.m175859d(this.f39256o), this.f39246e);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f39242a = getMeasuredWidth();
        this.f39243b = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f39244c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f39243b, Color.parseColor("#DBBD7A"), Color.parseColor("#9E8345"), Shader.TileMode.CLAMP));
    }

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFrameViewCityC(@NonNull Context context) {
        this(context, null);
    }
}
