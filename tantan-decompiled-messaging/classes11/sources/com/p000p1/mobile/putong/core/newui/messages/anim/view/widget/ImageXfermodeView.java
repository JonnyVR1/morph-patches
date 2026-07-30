package com.p000p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ImageXfermodeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float f4490o;

    /* JADX INFO: renamed from: p */
    public Paint f4491p;

    /* JADX INFO: renamed from: q */
    public boolean f4492q;

    public ImageXfermodeView(Context context) {
        super(context);
        this.f4490o = 0.0f;
        this.f4492q = false;
        m6433u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private void m6433u() {
        Paint paint = new Paint();
        this.f4491p = paint;
        paint.setAntiAlias(true);
        this.f4491p.setStyle(Paint.Style.FILL);
        this.f4491p.setColor(-1);
        this.f4491p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.onDraw(canvas);
        float height = getHeight();
        float width = getWidth();
        if (this.f4492q) {
            int i = t100.i;
            canvas.drawCircle(width - i, i, t100.d(8.0f), this.f4491p);
        } else {
            float f = height / 2.0f;
            canvas.drawCircle((width / 2.0f) + this.f4490o, f, t100.c + f, this.f4491p);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCustomXYAndRadius(boolean z) {
        this.f4492q = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgress(float f) {
        this.f4490o = f;
        invalidate();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4490o = 0.0f;
        this.f4492q = false;
        m6433u();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4490o = 0.0f;
        this.f4492q = false;
        m6433u();
    }
}
