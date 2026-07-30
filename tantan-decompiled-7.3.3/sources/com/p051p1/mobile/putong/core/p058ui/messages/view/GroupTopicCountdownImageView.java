package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class GroupTopicCountdownImageView extends VImage {

    /* JADX INFO: renamed from: d */
    public float f33176d;

    /* JADX INFO: renamed from: e */
    public Paint f33177e;

    /* JADX INFO: renamed from: f */
    public Xfermode f33178f;

    public GroupTopicCountdownImageView(Context context) {
        super(context);
        this.f33176d = 0.0f;
        m50983h();
    }

    /* JADX INFO: renamed from: h */
    private void m50983h() {
        Paint paint = new Paint();
        this.f33177e = paint;
        paint.setAntiAlias(true);
        this.f33177e.setColor(0);
        this.f33178f = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        setWillNotDraw(false);
    }

    @Override // p151v.VImage, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.f33177e.setXfermode(this.f33178f);
        canvas.drawRect(0.0f, 0.0f, width, height * this.f33176d, this.f33177e);
        this.f33177e.setXfermode(null);
    }

    public void setProgress(float f) {
        this.f33176d = f;
        invalidate();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33176d = 0.0f;
        m50983h();
    }

    public GroupTopicCountdownImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33176d = 0.0f;
        m50983h();
    }
}
