package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import p003l.ikf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FemaleMatchSuccessLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f371a;

    /* JADX INFO: renamed from: b */
    public final PorterDuffXfermode f372b;

    /* JADX INFO: renamed from: c */
    public float f373c;

    /* JADX INFO: renamed from: d */
    public float f374d;

    public FemaleMatchSuccessLayout(@NonNull Context context) {
        super(context);
        this.f372b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f373c = (t100.c().widthPixels / 2.0f) - t100.h;
        this.f374d = t100.d(90.0f) / 2.0f;
        m713a();
    }

    /* JADX INFO: renamed from: a */
    public final void m713a() {
        Paint paint = new Paint(1);
        this.f371a = paint;
        paint.setDither(true);
        this.f371a.setFilterBitmap(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.translate(width / 2.0f, height / 2.0f);
        float fMin = Math.min((ikf0.m5152i(((int) this.f374d) * 2) * 0.2069f) - 2.414f, 10.0f);
        float f = this.f373c;
        float f2 = this.f374d;
        canvas.drawRoundRect(new RectF(-f, -f2, f, f2), ikf0.m5146c(fMin), ikf0.m5146c(fMin), this.f371a);
        this.f371a.setXfermode(this.f372b);
        canvas.translate((-width) / 2.0f, (-height) / 2.0f);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f371a, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f371a.setXfermode(null);
    }

    public void setMoveX(float f) {
        this.f373c = f;
        invalidate();
    }

    public void setMoveY(float f) {
        this.f374d = f;
        invalidate();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f372b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f373c = (t100.c().widthPixels / 2.0f) - t100.h;
        this.f374d = t100.d(90.0f) / 2.0f;
        m713a();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f372b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f373c = (t100.c().widthPixels / 2.0f) - t100.h;
        this.f374d = t100.d(90.0f) / 2.0f;
        m713a();
    }
}
