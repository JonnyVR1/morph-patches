package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VRectBottomArc extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5421a;

    /* JADX INFO: renamed from: b */
    public Path f5422b;

    /* JADX INFO: renamed from: c */
    public int f5423c;

    /* JADX INFO: renamed from: d */
    public int f5424d;

    /* JADX INFO: renamed from: e */
    public float f5425e;

    public VRectBottomArc(Context context) {
        super(context);
        this.f5421a = new Paint();
        this.f5422b = new Path();
        this.f5423c = Color.parseColor("#c42d16");
        this.f5424d = Color.parseColor("#d46813");
        this.f5425e = 0.2f;
        m8151b();
    }

    /* JADX INFO: renamed from: a */
    public final void m8150a(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i = (int) (height * this.f5425e);
        float f = width;
        this.f5422b.lineTo(f, 0.0f);
        this.f5422b.lineTo(f, height - i);
        int i2 = -width;
        this.f5422b.rQuadTo(i2 / 2, i, i2, 0.0f);
        this.f5422b.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.f5422b, this.f5421a);
        this.f5422b.reset();
    }

    /* JADX INFO: renamed from: b */
    public final void m8151b() {
        this.f5421a.setStyle(Paint.Style.FILL);
        this.f5421a.setAntiAlias(true);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m8150a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5423c == 0 || this.f5424d == 0) {
            return;
        }
        this.f5421a.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, this.f5423c, this.f5424d, Shader.TileMode.CLAMP));
    }

    public void setArcRation(float f) {
        this.f5425e = f;
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5421a = new Paint();
        this.f5422b = new Path();
        this.f5423c = Color.parseColor("#c42d16");
        this.f5424d = Color.parseColor("#d46813");
        this.f5425e = 0.2f;
        m8151b();
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5421a = new Paint();
        this.f5422b = new Path();
        this.f5423c = Color.parseColor("#c42d16");
        this.f5424d = Color.parseColor("#d46813");
        this.f5425e = 0.2f;
        m8151b();
    }
}
