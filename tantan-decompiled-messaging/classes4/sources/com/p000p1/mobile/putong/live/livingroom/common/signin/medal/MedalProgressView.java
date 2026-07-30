package com.p000p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import l.yb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MedalProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f5383a;

    /* JADX INFO: renamed from: b */
    public final Drawable f5384b;

    public MedalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(yb2.a(867565635, t100.d(9.0f), false));
        this.f5384b = yb2.e(new int[]{-75878, -72799}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(9.0f), false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f5383a;
        if (f != 0.0f) {
            int width = (int) (f * (getWidth() - t100.e));
            Drawable drawable = this.f5384b;
            int i = t100.c;
            drawable.setBounds(i, i, width + i, getHeight() - i);
            this.f5384b.draw(canvas);
        }
    }

    public void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f5383a = f;
        invalidate();
    }
}
