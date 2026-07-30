package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class CoreCardColonView extends View {

    /* JADX INFO: renamed from: a */
    public int f23849a;

    /* JADX INFO: renamed from: b */
    public int f23850b;

    /* JADX INFO: renamed from: c */
    public int f23851c;

    /* JADX INFO: renamed from: d */
    public int f23852d;

    /* JADX INFO: renamed from: e */
    public Paint f23853e;

    public CoreCardColonView(Context context) {
        super(context);
        m39140a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39140a() {
        this.f23849a = t100.m186890d(16.0f);
        this.f23850b = t100.m186890d(32.0f);
        this.f23852d = t100.m186890d(2.5f);
        this.f23851c = this.f23850b / 5;
        Paint paint = new Paint();
        this.f23853e = paint;
        paint.setAntiAlias(true);
        this.f23853e.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f23849a / 2, (this.f23850b / 2) - this.f23851c, this.f23852d, this.f23853e);
        canvas.drawCircle(this.f23849a / 2, (this.f23850b / 2) + this.f23851c, this.f23852d, this.f23853e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f23849a, this.f23850b);
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m39140a();
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39140a();
    }
}
