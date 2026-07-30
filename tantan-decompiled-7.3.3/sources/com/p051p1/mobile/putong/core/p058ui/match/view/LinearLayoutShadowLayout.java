package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutShadowLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Paint f31332a;

    /* JADX INFO: renamed from: b */
    public float f31333b;

    public LinearLayoutShadowLayout(Context context) {
        super(context);
        m48833a();
    }

    /* JADX INFO: renamed from: a */
    public final void m48833a() {
        Paint paint = new Paint();
        this.f31332a = paint;
        paint.setColor(-1);
        this.f31332a.setAntiAlias(true);
        this.f31333b = qa00.m175859d(10.0f);
        this.f31332a.setShadowLayer(qa00.m175859d(5.0f), 0.0f, qa00.m175859d(2.0f), 419430400);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float f = this.f31333b;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f31332a);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m48833a();
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48833a();
    }
}
