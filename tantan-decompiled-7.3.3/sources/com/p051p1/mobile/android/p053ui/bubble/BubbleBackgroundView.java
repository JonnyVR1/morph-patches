package com.p051p1.mobile.android.p053ui.bubble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p153l.qa00;

/* JADX INFO: loaded from: classes8.dex */
public class BubbleBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f16376a;

    /* JADX INFO: renamed from: b */
    public Paint f16377b;

    /* JADX INFO: renamed from: c */
    public int f16378c;

    /* JADX INFO: renamed from: d */
    public Rect f16379d;

    /* JADX INFO: renamed from: e */
    public int f16380e;

    public BubbleBackgroundView(Context context) {
        super(context);
        m21824a();
    }

    /* JADX INFO: renamed from: a */
    public final void m21824a() {
        Paint paint = new Paint();
        this.f16376a = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f16377b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f16376a.setColor(this.f16378c);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f16376a);
        this.f16377b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = new RectF();
        Rect rect = this.f16379d;
        rectF.top = rect.top;
        rectF.left = rect.left;
        rectF.right = rect.right;
        rectF.bottom = rect.bottom;
        canvas.drawRoundRect(rectF, qa00.m175859d(this.f16380e), qa00.m175859d(this.f16380e), this.f16377b);
        this.f16377b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void setBackgroundPaintColor(int i) {
        this.f16378c = i;
    }

    public void setTargetViewRadius(int i) {
        this.f16380e = i;
    }

    public void setTargetViewRect(Rect rect) {
        this.f16379d = rect;
    }
}
