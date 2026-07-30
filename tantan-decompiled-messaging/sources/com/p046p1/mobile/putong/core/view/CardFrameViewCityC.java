package com.p046p1.mobile.putong.core.view;

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
import p149l.e9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes10.dex */
public class CardFrameViewCityC extends View {

    /* JADX INFO: renamed from: a */
    public int f38394a;

    /* JADX INFO: renamed from: b */
    public int f38395b;

    /* JADX INFO: renamed from: c */
    public Paint f38396c;

    /* JADX INFO: renamed from: d */
    public Paint f38397d;

    /* JADX INFO: renamed from: e */
    public Paint f38398e;

    /* JADX INFO: renamed from: f */
    public int f38399f;

    /* JADX INFO: renamed from: g */
    public boolean f38400g;

    /* JADX INFO: renamed from: h */
    public boolean f38401h;

    /* JADX INFO: renamed from: i */
    public boolean f38402i;

    /* JADX INFO: renamed from: j */
    public int f38403j;

    /* JADX INFO: renamed from: k */
    public int f38404k;

    /* JADX INFO: renamed from: l */
    public int f38405l;

    /* JADX INFO: renamed from: m */
    public int f38406m;

    /* JADX INFO: renamed from: n */
    public int f38407n;

    /* JADX INFO: renamed from: o */
    public int f38408o;

    /* JADX INFO: renamed from: p */
    public int f38409p;

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38399f = t100.m186890d(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90028f);
        this.f38400g = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90031g, false);
        this.f38401h = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90034h, false);
        this.f38402i = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90037i, false);
        this.f38403j = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90043k, 0);
        this.f38404k = typedArrayObtainStyledAttributes.getInteger(e9c0.f90040j, 0);
        this.f38405l = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90049m, 0);
        this.f38406m = typedArrayObtainStyledAttributes.getInteger(e9c0.f90046l, 0);
        this.f38407n = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90055o, 0);
        this.f38408o = typedArrayObtainStyledAttributes.getInteger(e9c0.f90052n, 0);
        this.f38409p = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90058p, 0);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
        m59487a();
    }

    /* JADX INFO: renamed from: a */
    public final void m59487a() {
        if (this.f38400g) {
            Paint paint = new Paint();
            this.f38396c = paint;
            paint.setAntiAlias(true);
            this.f38396c.setStyle(Paint.Style.STROKE);
            this.f38396c.setStrokeWidth(this.f38403j);
        }
        if (this.f38401h) {
            Paint paint2 = new Paint();
            this.f38397d = paint2;
            paint2.setAntiAlias(true);
            this.f38397d.setStyle(Paint.Style.STROKE);
            this.f38397d.setColor(Color.parseColor("#212121"));
            this.f38397d.setStrokeWidth(this.f38405l);
        }
        if (this.f38402i) {
            Paint paint3 = new Paint();
            this.f38398e = paint3;
            paint3.setAntiAlias(true);
            this.f38398e.setStyle(Paint.Style.STROKE);
            this.f38398e.setColor(Color.parseColor("#212121"));
            this.f38398e.setStrokeWidth(this.f38407n);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38396c != null) {
            RectF rectF = new RectF();
            float f = this.f38403j / 2;
            float f2 = f + 0.0f;
            rectF.top = f2;
            rectF.left = f2;
            rectF.right = this.f38394a - f;
            rectF.bottom = this.f38395b - f;
            canvas.drawRoundRect(rectF, t100.m186890d(this.f38404k), t100.m186890d(this.f38404k), this.f38396c);
        }
        if (this.f38397d != null) {
            RectF rectF2 = new RectF();
            float f3 = (this.f38405l / 2) - 1;
            float f4 = f3 + 0.0f;
            rectF2.top = f4;
            rectF2.left = f4;
            rectF2.right = this.f38394a - f3;
            rectF2.bottom = this.f38395b - f3;
            canvas.drawRoundRect(rectF2, t100.m186890d(this.f38406m), t100.m186890d(this.f38406m), this.f38397d);
        }
        if (this.f38398e != null) {
            RectF rectF3 = new RectF();
            float f5 = (this.f38407n / 2) + this.f38409p;
            float f6 = 0.0f + f5;
            rectF3.top = f6;
            rectF3.left = f6;
            rectF3.right = this.f38394a - f5;
            rectF3.bottom = this.f38395b - f5;
            canvas.drawRoundRect(rectF3, t100.m186890d(this.f38408o), t100.m186890d(this.f38408o), this.f38398e);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f38394a = getMeasuredWidth();
        this.f38395b = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f38396c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f38395b, Color.parseColor("#DBBD7A"), Color.parseColor("#9E8345"), Shader.TileMode.CLAMP));
    }

    public CardFrameViewCityC(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFrameViewCityC(@NonNull Context context) {
        this(context, null);
    }
}
