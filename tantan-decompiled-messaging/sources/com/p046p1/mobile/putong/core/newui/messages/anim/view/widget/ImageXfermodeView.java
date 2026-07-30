package com.p046p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class ImageXfermodeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float f25712o;

    /* JADX INFO: renamed from: p */
    public Paint f25713p;

    /* JADX INFO: renamed from: q */
    public boolean f25714q;

    public ImageXfermodeView(Context context) {
        super(context);
        this.f25712o = 0.0f;
        this.f25714q = false;
        m42284u();
    }

    /* JADX INFO: renamed from: u */
    private void m42284u() {
        Paint paint = new Paint();
        this.f25713p = paint;
        paint.setAntiAlias(true);
        this.f25713p.setStyle(Paint.Style.FILL);
        this.f25713p.setColor(-1);
        this.f25713p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.onDraw(canvas);
        float height = getHeight();
        float width = getWidth();
        if (this.f25714q) {
            int i = t100.f167260i;
            canvas.drawCircle(width - i, i, t100.m186890d(8.0f), this.f25713p);
        } else {
            float f = height / 2.0f;
            canvas.drawCircle((width / 2.0f) + this.f25712o, f, t100.f167254c + f, this.f25713p);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public void setCustomXYAndRadius(boolean z) {
        this.f25714q = z;
        invalidate();
    }

    public void setProgress(float f) {
        this.f25712o = f;
        invalidate();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25712o = 0.0f;
        this.f25714q = false;
        m42284u();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25712o = 0.0f;
        this.f25714q = false;
        m42284u();
    }
}
