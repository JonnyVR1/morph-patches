package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class CoreCardColonView extends View {

    /* JADX INFO: renamed from: a */
    public int f24591a;

    /* JADX INFO: renamed from: b */
    public int f24592b;

    /* JADX INFO: renamed from: c */
    public int f24593c;

    /* JADX INFO: renamed from: d */
    public int f24594d;

    /* JADX INFO: renamed from: e */
    public Paint f24595e;

    public CoreCardColonView(Context context) {
        super(context);
        m40143a();
    }

    /* JADX INFO: renamed from: a */
    public final void m40143a() {
        this.f24591a = qa00.m175859d(16.0f);
        this.f24592b = qa00.m175859d(32.0f);
        this.f24594d = qa00.m175859d(2.5f);
        this.f24593c = this.f24592b / 5;
        Paint paint = new Paint();
        this.f24595e = paint;
        paint.setAntiAlias(true);
        this.f24595e.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f24591a / 2, (this.f24592b / 2) - this.f24593c, this.f24594d, this.f24595e);
        canvas.drawCircle(this.f24591a / 2, (this.f24592b / 2) + this.f24593c, this.f24594d, this.f24595e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f24591a, this.f24592b);
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m40143a();
    }

    public CoreCardColonView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40143a();
    }
}
