package com.p046p1.mobile.android.p048ui.bubble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p149l.t100;

/* JADX INFO: loaded from: classes8.dex */
public class BubbleBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f15657a;

    /* JADX INFO: renamed from: b */
    public Paint f15658b;

    /* JADX INFO: renamed from: c */
    public int f15659c;

    /* JADX INFO: renamed from: d */
    public Rect f15660d;

    /* JADX INFO: renamed from: e */
    public int f15661e;

    public BubbleBackgroundView(Context context) {
        super(context);
        m20825a();
    }

    /* JADX INFO: renamed from: a */
    public final void m20825a() {
        Paint paint = new Paint();
        this.f15657a = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f15658b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f15657a.setColor(this.f15659c);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f15657a);
        this.f15658b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = new RectF();
        Rect rect = this.f15660d;
        rectF.top = rect.top;
        rectF.left = rect.left;
        rectF.right = rect.right;
        rectF.bottom = rect.bottom;
        canvas.drawRoundRect(rectF, t100.m186890d(this.f15661e), t100.m186890d(this.f15661e), this.f15658b);
        this.f15658b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void setBackgroundPaintColor(int i) {
        this.f15659c = i;
    }

    public void setTargetViewRadius(int i) {
        this.f15661e = i;
    }

    public void setTargetViewRect(Rect rect) {
        this.f15660d = rect;
    }
}
