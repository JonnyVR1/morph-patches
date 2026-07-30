package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LinearLayoutShadowLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Paint f375a;

    /* JADX INFO: renamed from: b */
    public float f376b;

    public LinearLayoutShadowLayout(Context context) {
        super(context);
        m714a();
    }

    /* JADX INFO: renamed from: a */
    public final void m714a() {
        Paint paint = new Paint();
        this.f375a = paint;
        paint.setColor(-1);
        this.f375a.setAntiAlias(true);
        this.f376b = t100.d(10.0f);
        this.f375a.setShadowLayer(t100.d(5.0f), 0.0f, t100.d(2.0f), 419430400);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float f = this.f376b;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f375a);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m714a();
    }

    public LinearLayoutShadowLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m714a();
    }
}
