package com.p003p1.mobile.android.p005ui.bubble;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class BubbleBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f1356a;

    /* JADX INFO: renamed from: b */
    public Paint f1357b;

    /* JADX INFO: renamed from: c */
    public int f1358c;

    /* JADX INFO: renamed from: d */
    public Rect f1359d;

    /* JADX INFO: renamed from: e */
    public int f1360e;

    public BubbleBackgroundView(Context context) {
        super(context);
        m1096a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1096a() {
        Paint paint = new Paint();
        this.f1356a = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f1357b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f1356a.setColor(this.f1358c);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f1356a);
        this.f1357b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = new RectF();
        Rect rect = this.f1359d;
        rectF.top = rect.top;
        rectF.left = rect.left;
        rectF.right = rect.right;
        rectF.bottom = rect.bottom;
        canvas.drawRoundRect(rectF, t100.d(this.f1360e), t100.d(this.f1360e), this.f1357b);
        this.f1357b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void setBackgroundPaintColor(int i) {
        this.f1358c = i;
    }

    public void setTargetViewRadius(int i) {
        this.f1360e = i;
    }

    public void setTargetViewRect(Rect rect) {
        this.f1359d = rect;
    }
}
