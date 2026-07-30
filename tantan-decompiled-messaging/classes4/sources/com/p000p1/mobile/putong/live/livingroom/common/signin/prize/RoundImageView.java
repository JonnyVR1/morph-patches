package com.p000p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public RectF f5421c;

    /* JADX INFO: renamed from: d */
    public Path f5422d;

    public RoundImageView(Context context) {
        super(context);
        m6813f();
    }

    /* JADX INFO: renamed from: f */
    private void m6813f() {
        this.f5421c = new RectF();
        this.f5422d = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final void m6814d(float f, int i) {
        RectF rectF = this.f5421c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = f;
        rectF.bottom = i;
        this.f5422d.addRoundRect(rectF, t100.d(10.0f), t100.d(10.0f), Path.Direction.CW);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.f5422d);
        super/*android.view.View*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
    }

    public void setImageViewWidth(float f) {
        m6814d(f, t100.d(12.0f));
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6813f();
    }
}
