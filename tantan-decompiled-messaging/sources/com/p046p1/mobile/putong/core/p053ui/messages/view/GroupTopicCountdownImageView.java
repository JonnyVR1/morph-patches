package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class GroupTopicCountdownImageView extends VImage {

    /* JADX INFO: renamed from: d */
    public float f32328d;

    /* JADX INFO: renamed from: e */
    public Paint f32329e;

    /* JADX INFO: renamed from: f */
    public Xfermode f32330f;

    public GroupTopicCountdownImageView(Context context) {
        super(context);
        this.f32328d = 0.0f;
        m49800h();
    }

    /* JADX INFO: renamed from: h */
    private void m49800h() {
        Paint paint = new Paint();
        this.f32329e = paint;
        paint.setAntiAlias(true);
        this.f32329e.setColor(0);
        this.f32330f = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        setWillNotDraw(false);
    }

    @Override // p147v.VImage, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f32329e.setXfermode(this.f32330f);
        canvas.drawRect(0.0f, 0.0f, width, height * this.f32328d, this.f32329e);
        this.f32329e.setXfermode(null);
    }

    public void setProgress(float f) {
        this.f32328d = f;
        invalidate();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32328d = 0.0f;
        m49800h();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32328d = 0.0f;
        m49800h();
    }
}
