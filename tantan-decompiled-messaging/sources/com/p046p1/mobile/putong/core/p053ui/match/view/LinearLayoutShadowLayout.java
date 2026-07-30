package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutShadowLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Paint f30484a;

    /* JADX INFO: renamed from: b */
    public float f30485b;

    public LinearLayoutShadowLayout(Context context) {
        super(context);
        m47650a();
    }

    /* JADX INFO: renamed from: a */
    public final void m47650a() {
        Paint paint = new Paint();
        this.f30484a = paint;
        paint.setColor(-1);
        this.f30484a.setAntiAlias(true);
        this.f30485b = t100.m186890d(10.0f);
        this.f30484a.setShadowLayer(t100.m186890d(5.0f), 0.0f, t100.m186890d(2.0f), 419430400);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float f = this.f30485b;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f30484a);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m47650a();
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47650a();
    }
}
