package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class MatchBlackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Rect f30486a;

    /* JADX INFO: renamed from: b */
    public Paint f30487b;

    /* JADX INFO: renamed from: c */
    public int f30488c;

    /* JADX INFO: renamed from: d */
    public int f30489d;

    /* JADX INFO: renamed from: e */
    public int f30490e;

    public MatchBlackShadowView(Context context) {
        super(context);
        this.f30490e = t100.m186890d(1.0f);
        m47651a();
    }

    private void setColorAndSize(boolean z) {
        int iM186890d = t100.m186890d(272.0f) + (z ? this.f30489d - ((int) (this.f30488c / 0.56f)) : 0);
        this.f30487b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iM186890d, new int[]{0, -1291845632}, (float[]) null, Shader.TileMode.REPEAT));
        this.f30486a.set(0, this.f30490e, this.f30488c, iM186890d);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m47651a() {
        this.f30487b = new Paint();
        this.f30486a = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30488c <= 0 || this.f30489d <= 0) {
            return;
        }
        canvas.drawRect(this.f30486a, this.f30487b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f30489d != size || this.f30488c != size2) {
            this.f30489d = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i);
            this.f30488c = size3;
            setColorAndSize(((float) size3) / ((float) this.f30489d) <= 0.56f);
        }
        Rect rect = this.f30486a;
        setMeasuredDimension(this.f30488c, rect.bottom - rect.top);
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30490e = t100.m186890d(1.0f);
        m47651a();
    }

    public MatchBlackShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30490e = t100.m186890d(1.0f);
        m47651a();
    }
}
