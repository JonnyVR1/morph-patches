package com.p051p1.mobile.putong.core.p058ui.match.view;

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
import p153l.qa00;
import p153l.rsf0;

/* JADX INFO: loaded from: classes3.dex */
public class FemaleMatchSuccessLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f31328a;

    /* JADX INFO: renamed from: b */
    public final PorterDuffXfermode f31329b;

    /* JADX INFO: renamed from: c */
    public float f31330c;

    /* JADX INFO: renamed from: d */
    public float f31331d;

    public FemaleMatchSuccessLayout(@NonNull Context context) {
        super(context);
        this.f31329b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31330c = (qa00.m175858c().widthPixels / 2.0f) - qa00.f156321h;
        this.f31331d = qa00.m175859d(90.0f) / 2.0f;
        m48832a();
    }

    /* JADX INFO: renamed from: a */
    public final void m48832a() {
        Paint paint = new Paint(1);
        this.f31328a = paint;
        paint.setDither(true);
        this.f31328a.setFilterBitmap(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.translate(width / 2.0f, height / 2.0f);
        float fMin = Math.min((rsf0.m182965i(((int) this.f31331d) * 2) * 0.2069f) - 2.414f, 10.0f);
        float f = this.f31330c;
        float f2 = this.f31331d;
        canvas.drawRoundRect(new RectF(-f, -f2, f, f2), rsf0.m182959c(fMin), rsf0.m182959c(fMin), this.f31328a);
        this.f31328a.setXfermode(this.f31329b);
        canvas.translate((-width) / 2.0f, (-height) / 2.0f);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f31328a, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f31328a.setXfermode(null);
    }

    public void setMoveX(float f) {
        this.f31330c = f;
        invalidate();
    }

    public void setMoveY(float f) {
        this.f31331d = f;
        invalidate();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31329b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31330c = (qa00.m175858c().widthPixels / 2.0f) - qa00.f156321h;
        this.f31331d = qa00.m175859d(90.0f) / 2.0f;
        m48832a();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31329b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31330c = (qa00.m175858c().widthPixels / 2.0f) - qa00.f156321h;
        this.f31331d = qa00.m175859d(90.0f) / 2.0f;
        m48832a();
    }
}
