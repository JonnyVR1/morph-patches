package com.p051p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ImageXfermodeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float f26454o;

    /* JADX INFO: renamed from: p */
    public Paint f26455p;

    /* JADX INFO: renamed from: q */
    public boolean f26456q;

    public ImageXfermodeView(Context context) {
        super(context);
        this.f26454o = 0.0f;
        this.f26456q = false;
        m43295u();
    }

    /* JADX INFO: renamed from: u */
    private void m43295u() {
        Paint paint = new Paint();
        this.f26455p = paint;
        paint.setAntiAlias(true);
        this.f26455p.setStyle(Paint.Style.FILL);
        this.f26455p.setColor(-1);
        this.f26455p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.onDraw(canvas);
        float height = getHeight();
        float width = getWidth();
        if (this.f26456q) {
            int i = qa00.f156322i;
            canvas.drawCircle(width - i, i, qa00.m175859d(8.0f), this.f26455p);
        } else {
            float f = height / 2.0f;
            canvas.drawCircle((width / 2.0f) + this.f26454o, f, qa00.f156316c + f, this.f26455p);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public void setCustomXYAndRadius(boolean z) {
        this.f26456q = z;
        invalidate();
    }

    public void setProgress(float f) {
        this.f26454o = f;
        invalidate();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26454o = 0.0f;
        this.f26456q = false;
        m43295u();
    }

    public ImageXfermodeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26454o = 0.0f;
        this.f26456q = false;
        m43295u();
    }
}
