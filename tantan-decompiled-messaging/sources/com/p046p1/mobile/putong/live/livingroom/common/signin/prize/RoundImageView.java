package com.p046p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public RectF f49379c;

    /* JADX INFO: renamed from: d */
    public Path f49380d;

    public RoundImageView(Context context) {
        super(context);
        m73278f();
    }

    /* JADX INFO: renamed from: f */
    private void m73278f() {
        this.f49379c = new RectF();
        this.f49380d = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final void m73279d(float f, int i) {
        RectF rectF = this.f49379c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = f;
        rectF.bottom = i;
        this.f49380d.addRoundRect(rectF, t100.m186890d(10.0f), t100.m186890d(10.0f), Path.Direction.CW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.f49380d);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setImageViewWidth(float f) {
        m73279d(f, t100.m186890d(12.0f));
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m73278f();
    }
}
