package com.p051p1.mobile.putong.core.p058ui.result;

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

/* JADX INFO: loaded from: classes12.dex */
public class VRectBottomArc extends View {

    /* JADX INFO: renamed from: a */
    public Paint f36488a;

    /* JADX INFO: renamed from: b */
    public Path f36489b;

    /* JADX INFO: renamed from: c */
    public int f36490c;

    /* JADX INFO: renamed from: d */
    public int f36491d;

    /* JADX INFO: renamed from: e */
    public float f36492e;

    public VRectBottomArc(Context context) {
        super(context);
        this.f36488a = new Paint();
        this.f36489b = new Path();
        this.f36490c = Color.parseColor("#c42d16");
        this.f36491d = Color.parseColor("#d46813");
        this.f36492e = 0.2f;
        m55976b();
    }

    /* JADX INFO: renamed from: a */
    public final void m55975a(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i = (int) (height * this.f36492e);
        float f = width;
        this.f36489b.lineTo(f, 0.0f);
        this.f36489b.lineTo(f, height - i);
        int i2 = -width;
        this.f36489b.rQuadTo(i2 / 2, i, i2, 0.0f);
        this.f36489b.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.f36489b, this.f36488a);
        this.f36489b.reset();
    }

    /* JADX INFO: renamed from: b */
    public final void m55976b() {
        this.f36488a.setStyle(Paint.Style.FILL);
        this.f36488a.setAntiAlias(true);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m55975a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f36490c == 0 || this.f36491d == 0) {
            return;
        }
        this.f36488a.setShader(new LinearGradient(0.0f, 0.0f, i, 0.0f, this.f36490c, this.f36491d, Shader.TileMode.CLAMP));
    }

    public void setArcRation(float f) {
        this.f36492e = f;
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36488a = new Paint();
        this.f36489b = new Path();
        this.f36490c = Color.parseColor("#c42d16");
        this.f36491d = Color.parseColor("#d46813");
        this.f36492e = 0.2f;
        m55976b();
    }

    public VRectBottomArc(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36488a = new Paint();
        this.f36489b = new Path();
        this.f36490c = Color.parseColor("#c42d16");
        this.f36491d = Color.parseColor("#d46813");
        this.f36492e = 0.2f;
        m55976b();
    }
}
