package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class MatchBlackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Rect f31334a;

    /* JADX INFO: renamed from: b */
    public Paint f31335b;

    /* JADX INFO: renamed from: c */
    public int f31336c;

    /* JADX INFO: renamed from: d */
    public int f31337d;

    /* JADX INFO: renamed from: e */
    public int f31338e;

    public MatchBlackShadowView(Context context) {
        super(context);
        this.f31338e = qa00.m175859d(1.0f);
        m48834a();
    }

    private void setColorAndSize(boolean z) {
        int iM175859d = qa00.m175859d(272.0f) + (z ? this.f31337d - ((int) (this.f31336c / 0.56f)) : 0);
        this.f31335b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iM175859d, new int[]{0, -1291845632}, (float[]) null, Shader.TileMode.REPEAT));
        this.f31334a.set(0, this.f31338e, this.f31336c, iM175859d);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m48834a() {
        this.f31335b = new Paint();
        this.f31334a = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f31336c <= 0 || this.f31337d <= 0) {
            return;
        }
        canvas.drawRect(this.f31334a, this.f31335b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f31337d != size || this.f31336c != size2) {
            this.f31337d = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i);
            this.f31336c = size3;
            setColorAndSize(((float) size3) / ((float) this.f31337d) <= 0.56f);
        }
        Rect rect = this.f31334a;
        setMeasuredDimension(this.f31336c, rect.bottom - rect.top);
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31338e = qa00.m175859d(1.0f);
        m48834a();
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31338e = qa00.m175859d(1.0f);
        m48834a();
    }
}
