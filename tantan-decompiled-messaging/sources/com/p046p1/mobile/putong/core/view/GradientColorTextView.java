package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.e9c0;

/* JADX INFO: loaded from: classes10.dex */
public class GradientColorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public LinearGradient f38549a;

    /* JADX INFO: renamed from: b */
    public Paint f38550b;

    /* JADX INFO: renamed from: c */
    public int f38551c;

    /* JADX INFO: renamed from: d */
    public int f38552d;

    /* JADX INFO: renamed from: e */
    public Rect f38553e;

    /* JADX INFO: renamed from: f */
    public int f38554f;

    /* JADX INFO: renamed from: g */
    public int f38555g;

    /* JADX INFO: renamed from: h */
    public boolean f38556h;

    /* JADX INFO: renamed from: i */
    public boolean f38557i;

    /* JADX INFO: renamed from: j */
    public int f38558j;

    public GradientColorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38551c = 0;
        this.f38552d = 0;
        this.f38553e = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f89955F0);
        m59531h(typedArrayObtainStyledAttributes.getColor(e9c0.f89967J0, -272744), typedArrayObtainStyledAttributes.getColor(e9c0.f89961H0, -1916025));
        setEnableGradientColor(typedArrayObtainStyledAttributes.getBoolean(e9c0.f89958G0, true));
        setGradientOrientation(typedArrayObtainStyledAttributes.getInt(e9c0.f89964I0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: h */
    public void m59531h(@ColorInt int i, @ColorInt int i2) {
        if (this.f38554f != i || this.f38555g != i2) {
            this.f38557i = true;
        }
        this.f38554f = i;
        this.f38555g = i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m59532i() {
        if (this.f38557i || this.f38550b.getShader() == null || this.f38549a == null || this.f38550b.getShader() != this.f38549a) {
            int i = this.f38558j;
            if (i == 0) {
                this.f38549a = new LinearGradient(0.0f, 0.0f, this.f38551c, 0.0f, new int[]{this.f38554f, this.f38555g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                this.f38549a = new LinearGradient(0.0f, 0.0f, 0.0f, this.f38552d, new int[]{this.f38554f, this.f38555g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 2) {
                this.f38549a = new LinearGradient(0.0f, this.f38552d, this.f38551c, 0.0f, new int[]{this.f38554f, this.f38555g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 3) {
                this.f38549a = new LinearGradient(0.0f, 0.0f, this.f38551c, this.f38552d, new int[]{this.f38554f, this.f38555g}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.f38549a = new LinearGradient(0.0f, 0.0f, this.f38551c, 0.0f, new int[]{this.f38554f, this.f38555g}, (float[]) null, Shader.TileMode.CLAMP);
            }
            this.f38550b.setShader(this.f38549a);
            this.f38557i = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f38556h) {
            getPaint().setShader(null);
            super.onDraw(canvas);
            return;
        }
        this.f38551c = getMeasuredWidth();
        this.f38552d = getMeasuredHeight();
        this.f38550b = getPaint();
        String string = getText().toString();
        this.f38550b.getTextBounds(string, 0, string.length(), this.f38553e);
        m59532i();
        canvas.drawText(string, (getMeasuredWidth() / 2.0f) - (this.f38553e.width() / 2.0f), (getMeasuredHeight() / 2.0f) + (this.f38553e.height() / 2.0f), this.f38550b);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f38557i = true;
    }

    public void setEnableGradientColor(boolean z) {
        if (this.f38556h != z) {
            this.f38557i = true;
        }
        this.f38556h = z;
    }

    public void setGradientOrientation(int i) {
        if (this.f38558j != i) {
            this.f38557i = true;
        }
        this.f38558j = i;
    }

    public GradientColorTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientColorTextView(Context context) {
        this(context, null);
    }
}
