package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchBlackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Rect f377a;

    /* JADX INFO: renamed from: b */
    public Paint f378b;

    /* JADX INFO: renamed from: c */
    public int f379c;

    /* JADX INFO: renamed from: d */
    public int f380d;

    /* JADX INFO: renamed from: e */
    public int f381e;

    public MatchBlackShadowView(Context context) {
        super(context);
        this.f381e = t100.d(1.0f);
        m715a();
    }

    private void setColorAndSize(boolean z) {
        int iD = t100.d(272.0f) + (z ? this.f380d - ((int) (this.f379c / 0.56f)) : 0);
        this.f378b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iD, new int[]{0, -1291845632}, (float[]) null, Shader.TileMode.REPEAT));
        this.f377a.set(0, this.f381e, this.f379c, iD);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m715a() {
        this.f378b = new Paint();
        this.f377a = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f379c <= 0 || this.f380d <= 0) {
            return;
        }
        canvas.drawRect(this.f377a, this.f378b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f380d != size || this.f379c != size2) {
            this.f380d = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i);
            this.f379c = size3;
            setColorAndSize(((float) size3) / ((float) this.f380d) <= 0.56f);
        }
        Rect rect = this.f377a;
        setMeasuredDimension(this.f379c, rect.bottom - rect.top);
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f381e = t100.d(1.0f);
        m715a();
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f381e = t100.d(1.0f);
        m715a();
    }
}
