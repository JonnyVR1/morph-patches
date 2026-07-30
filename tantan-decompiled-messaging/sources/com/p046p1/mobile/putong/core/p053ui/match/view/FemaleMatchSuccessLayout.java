package com.p046p1.mobile.putong.core.p053ui.match.view;

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
import p149l.ikf0;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class FemaleMatchSuccessLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f30480a;

    /* JADX INFO: renamed from: b */
    public final PorterDuffXfermode f30481b;

    /* JADX INFO: renamed from: c */
    public float f30482c;

    /* JADX INFO: renamed from: d */
    public float f30483d;

    public FemaleMatchSuccessLayout(@NonNull Context context) {
        super(context);
        this.f30481b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30482c = (t100.m186889c().widthPixels / 2.0f) - t100.f167259h;
        this.f30483d = t100.m186890d(90.0f) / 2.0f;
        m47649a();
    }

    /* JADX INFO: renamed from: a */
    public final void m47649a() {
        Paint paint = new Paint(1);
        this.f30480a = paint;
        paint.setDither(true);
        this.f30480a.setFilterBitmap(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.translate(width / 2.0f, height / 2.0f);
        float fMin = Math.min((ikf0.m136795i(((int) this.f30483d) * 2) * 0.2069f) - 2.414f, 10.0f);
        float f = this.f30482c;
        float f2 = this.f30483d;
        canvas.drawRoundRect(new RectF(-f, -f2, f, f2), ikf0.m136789c(fMin), ikf0.m136789c(fMin), this.f30480a);
        this.f30480a.setXfermode(this.f30481b);
        canvas.translate((-width) / 2.0f, (-height) / 2.0f);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f30480a, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f30480a.setXfermode(null);
    }

    public void setMoveX(float f) {
        this.f30482c = f;
        invalidate();
    }

    public void setMoveY(float f) {
        this.f30483d = f;
        invalidate();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30481b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30482c = (t100.m186889c().widthPixels / 2.0f) - t100.f167259h;
        this.f30483d = t100.m186890d(90.0f) / 2.0f;
        m47649a();
    }

    public FemaleMatchSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30481b = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30482c = (t100.m186889c().widthPixels / 2.0f) - t100.f167259h;
        this.f30483d = t100.m186890d(90.0f) / 2.0f;
        m47649a();
    }
}
