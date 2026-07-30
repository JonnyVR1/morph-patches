package com.p051p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public RectF f50227c;

    /* JADX INFO: renamed from: d */
    public Path f50228d;

    public RoundImageView(Context context) {
        super(context);
        m74461f();
    }

    /* JADX INFO: renamed from: f */
    private void m74461f() {
        this.f50227c = new RectF();
        this.f50228d = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final void m74462d(float f, int i) {
        RectF rectF = this.f50227c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = f;
        rectF.bottom = i;
        this.f50228d.addRoundRect(rectF, qa00.m175859d(10.0f), qa00.m175859d(10.0f), Path.Direction.CW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.f50228d);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setImageViewWidth(float f) {
        m74462d(f, qa00.m175859d(12.0f));
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m74461f();
    }
}
