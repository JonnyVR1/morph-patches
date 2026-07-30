package com.p051p1.mobile.putong.core.view;

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
import p153l.khc0;

/* JADX INFO: loaded from: classes12.dex */
public class GradientColorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public LinearGradient f39397a;

    /* JADX INFO: renamed from: b */
    public Paint f39398b;

    /* JADX INFO: renamed from: c */
    public int f39399c;

    /* JADX INFO: renamed from: d */
    public int f39400d;

    /* JADX INFO: renamed from: e */
    public Rect f39401e;

    /* JADX INFO: renamed from: f */
    public int f39402f;

    /* JADX INFO: renamed from: g */
    public int f39403g;

    /* JADX INFO: renamed from: h */
    public boolean f39404h;

    /* JADX INFO: renamed from: i */
    public boolean f39405i;

    /* JADX INFO: renamed from: j */
    public int f39406j;

    public GradientColorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39399c = 0;
        this.f39400d = 0;
        this.f39401e = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126725F0);
        m60715h(typedArrayObtainStyledAttributes.getColor(khc0.f126737J0, -272744), typedArrayObtainStyledAttributes.getColor(khc0.f126731H0, -1916025));
        setEnableGradientColor(typedArrayObtainStyledAttributes.getBoolean(khc0.f126728G0, true));
        setGradientOrientation(typedArrayObtainStyledAttributes.getInt(khc0.f126734I0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: h */
    public void m60715h(@ColorInt int i, @ColorInt int i2) {
        if (this.f39402f != i || this.f39403g != i2) {
            this.f39405i = true;
        }
        this.f39402f = i;
        this.f39403g = i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m60716i() {
        if (this.f39405i || this.f39398b.getShader() == null || this.f39397a == null || this.f39398b.getShader() != this.f39397a) {
            int i = this.f39406j;
            if (i == 0) {
                this.f39397a = new LinearGradient(0.0f, 0.0f, this.f39399c, 0.0f, new int[]{this.f39402f, this.f39403g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                this.f39397a = new LinearGradient(0.0f, 0.0f, 0.0f, this.f39400d, new int[]{this.f39402f, this.f39403g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 2) {
                this.f39397a = new LinearGradient(0.0f, this.f39400d, this.f39399c, 0.0f, new int[]{this.f39402f, this.f39403g}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 3) {
                this.f39397a = new LinearGradient(0.0f, 0.0f, this.f39399c, this.f39400d, new int[]{this.f39402f, this.f39403g}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.f39397a = new LinearGradient(0.0f, 0.0f, this.f39399c, 0.0f, new int[]{this.f39402f, this.f39403g}, (float[]) null, Shader.TileMode.CLAMP);
            }
            this.f39398b.setShader(this.f39397a);
            this.f39405i = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f39404h) {
            getPaint().setShader(null);
            super.onDraw(canvas);
            return;
        }
        this.f39399c = getMeasuredWidth();
        this.f39400d = getMeasuredHeight();
        this.f39398b = getPaint();
        String string = getText().toString();
        this.f39398b.getTextBounds(string, 0, string.length(), this.f39401e);
        m60716i();
        canvas.drawText(string, (getMeasuredWidth() / 2.0f) - (this.f39401e.width() / 2.0f), (getMeasuredHeight() / 2.0f) + (this.f39401e.height() / 2.0f), this.f39398b);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f39405i = true;
    }

    public void setEnableGradientColor(boolean z) {
        if (this.f39404h != z) {
            this.f39405i = true;
        }
        this.f39404h = z;
    }

    public void setGradientOrientation(int i) {
        if (this.f39406j != i) {
            this.f39405i = true;
        }
        this.f39406j = i;
    }

    public GradientColorTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientColorTextView(Context context) {
        this(context, null);
    }
}
