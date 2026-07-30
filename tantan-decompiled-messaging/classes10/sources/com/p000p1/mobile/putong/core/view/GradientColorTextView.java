package com.p000p1.mobile.putong.core.view;

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
import l.e9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GradientColorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public LinearGradient f2491a;

    /* JADX INFO: renamed from: b */
    public Paint f2492b;

    /* JADX INFO: renamed from: c */
    public int f2493c;

    /* JADX INFO: renamed from: d */
    public int f2494d;

    /* JADX INFO: renamed from: e */
    public Rect f2495e;

    /* JADX INFO: renamed from: f */
    public int f2496f;

    /* JADX INFO: renamed from: g */
    public int f2497g;

    /* JADX INFO: renamed from: h */
    public boolean f2498h;

    /* JADX INFO: renamed from: i */
    public boolean f2499i;

    /* JADX INFO: renamed from: j */
    public int f2500j;

    public GradientColorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2493c = 0;
        this.f2494d = 0;
        this.f2495e = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.F0);
        m4940h(typedArrayObtainStyledAttributes.getColor(e9c0.J0, -272744), typedArrayObtainStyledAttributes.getColor(e9c0.H0, -1916025));
        setEnableGradientColor(typedArrayObtainStyledAttributes.getBoolean(e9c0.G0, true));
        setGradientOrientation(typedArrayObtainStyledAttributes.getInt(e9c0.I0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: h */
    public void m4940h(@ColorInt int i, @ColorInt int i2) {
        if (this.f2496f != i || this.f2497g != i2) {
            this.f2499i = true;
        }
        this.f2496f = i;
        this.f2497g = i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m4941i() {
        if (this.f2499i || this.f2492b.getShader() == null || this.f2491a == null || this.f2492b.getShader() != this.f2491a) {
            int i = this.f2500j;
            if (i == 0) {
                this.f2491a = new LinearGradient(0.0f, 0.0f, this.f2493c, 0.0f, new int[]{this.f2496f, this.f2497g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                this.f2491a = new LinearGradient(0.0f, 0.0f, 0.0f, this.f2494d, new int[]{this.f2496f, this.f2497g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 2) {
                this.f2491a = new LinearGradient(0.0f, this.f2494d, this.f2493c, 0.0f, new int[]{this.f2496f, this.f2497g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 3) {
                this.f2491a = new LinearGradient(0.0f, 0.0f, this.f2493c, this.f2494d, new int[]{this.f2496f, this.f2497g}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.f2491a = new LinearGradient(0.0f, 0.0f, this.f2493c, 0.0f, new int[]{this.f2496f, this.f2497g}, (float[]) null, Shader.TileMode.CLAMP);
            }
            this.f2492b.setShader(this.f2491a);
            this.f2499i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        if (!this.f2498h) {
            getPaint().setShader(null);
            super/*android.view.View*/.onDraw(canvas);
            return;
        }
        this.f2493c = getMeasuredWidth();
        this.f2494d = getMeasuredHeight();
        this.f2492b = getPaint();
        String string = getText().toString();
        this.f2492b.getTextBounds(string, 0, string.length(), this.f2495e);
        m4941i();
        canvas.drawText(string, (getMeasuredWidth() / 2.0f) - (this.f2495e.width() / 2.0f), (getMeasuredHeight() / 2.0f) + (this.f2495e.height() / 2.0f), this.f2492b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f2499i = true;
    }

    public void setEnableGradientColor(boolean z) {
        if (this.f2498h != z) {
            this.f2499i = true;
        }
        this.f2498h = z;
    }

    public void setGradientOrientation(int i) {
        if (this.f2500j != i) {
            this.f2499i = true;
        }
        this.f2500j = i;
    }

    public GradientColorTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientColorTextView(Context context) {
        this(context, null);
    }
}
