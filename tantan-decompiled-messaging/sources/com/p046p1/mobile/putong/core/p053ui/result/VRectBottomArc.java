package com.p046p1.mobile.putong.core.p053ui.result;

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

/* JADX INFO: loaded from: classes9.dex */
public class VRectBottomArc extends View {

    /* JADX INFO: renamed from: a */
    public Paint f35640a;

    /* JADX INFO: renamed from: b */
    public Path f35641b;

    /* JADX INFO: renamed from: c */
    public int f35642c;

    /* JADX INFO: renamed from: d */
    public int f35643d;

    /* JADX INFO: renamed from: e */
    public float f35644e;

    public VRectBottomArc(Context context) {
        super(context);
        this.f35640a = new Paint();
        this.f35641b = new Path();
        this.f35642c = Color.parseColor("#c42d16");
        this.f35643d = Color.parseColor("#d46813");
        this.f35644e = 0.2f;
        m54793b();
    }

    /* JADX INFO: renamed from: a */
    public final void m54792a(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i = (int) (height * this.f35644e);
        float f = width;
        this.f35641b.lineTo(f, 0.0f);
        this.f35641b.lineTo(f, height - i);
        int i2 = -width;
        this.f35641b.rQuadTo(i2 / 2, i, i2, 0.0f);
        this.f35641b.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.f35641b, this.f35640a);
        this.f35641b.reset();
    }

    /* JADX INFO: renamed from: b */
    public final void m54793b() {
        this.f35640a.setStyle(Paint.Style.FILL);
        this.f35640a.setAntiAlias(true);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m54792a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f35642c == 0 || this.f35643d == 0) {
            return;
        }
        this.f35640a.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, this.f35642c, this.f35643d, Shader.TileMode.CLAMP));
    }

    public void setArcRation(float f) {
        this.f35644e = f;
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35640a = new Paint();
        this.f35641b = new Path();
        this.f35642c = Color.parseColor("#c42d16");
        this.f35643d = Color.parseColor("#d46813");
        this.f35644e = 0.2f;
        m54793b();
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35640a = new Paint();
        this.f35641b = new Path();
        this.f35642c = Color.parseColor("#c42d16");
        this.f35643d = Color.parseColor("#d46813");
        this.f35644e = 0.2f;
        m54793b();
    }
}
