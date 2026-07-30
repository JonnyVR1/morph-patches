package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreCardColonView extends View {

    /* JADX INFO: renamed from: a */
    public int f2627a;

    /* JADX INFO: renamed from: b */
    public int f2628b;

    /* JADX INFO: renamed from: c */
    public int f2629c;

    /* JADX INFO: renamed from: d */
    public int f2630d;

    /* JADX INFO: renamed from: e */
    public Paint f2631e;

    public CoreCardColonView(Context context) {
        super(context);
        m3156a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3156a() {
        this.f2627a = t100.d(16.0f);
        this.f2628b = t100.d(32.0f);
        this.f2630d = t100.d(2.5f);
        this.f2629c = this.f2628b / 5;
        Paint paint = new Paint();
        this.f2631e = paint;
        paint.setAntiAlias(true);
        this.f2631e.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f2627a / 2, (this.f2628b / 2) - this.f2629c, this.f2630d, this.f2631e);
        canvas.drawCircle(this.f2627a / 2, (this.f2628b / 2) + this.f2629c, this.f2630d, this.f2631e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f2627a, this.f2628b);
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3156a();
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3156a();
    }
}
