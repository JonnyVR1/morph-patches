package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GroupTopicCountdownImageView extends VImage {

    /* JADX INFO: renamed from: d */
    public float f150d;

    /* JADX INFO: renamed from: e */
    public Paint f151e;

    /* JADX INFO: renamed from: f */
    public Xfermode f152f;

    public GroupTopicCountdownImageView(Context context) {
        super(context);
        this.f150d = 0.0f;
        m218h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m218h() {
        Paint paint = new Paint();
        this.f151e = paint;
        paint.setAntiAlias(true);
        this.f151e.setColor(0);
        this.f152f = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        setWillNotDraw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f151e.setXfermode(this.f152f);
        canvas.drawRect(0.0f, 0.0f, width, height * this.f150d, this.f151e);
        this.f151e.setXfermode(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgress(float f) {
        this.f150d = f;
        invalidate();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150d = 0.0f;
        m218h();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f150d = 0.0f;
        m218h();
    }
}
