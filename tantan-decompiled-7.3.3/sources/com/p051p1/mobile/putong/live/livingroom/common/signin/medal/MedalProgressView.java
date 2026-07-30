package com.p051p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.fc2;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class MedalProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f50189a;

    /* JADX INFO: renamed from: b */
    public final Drawable f50190b;

    public MedalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(fc2.m124971a(867565635, qa00.m175859d(9.0f), false));
        this.f50190b = fc2.m124975e(new int[]{-75878, -72799}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(9.0f), false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f50189a;
        if (f != 0.0f) {
            int width = (int) (f * (getWidth() - qa00.f156318e));
            Drawable drawable = this.f50190b;
            int i = qa00.f156316c;
            drawable.setBounds(i, i, width + i, getHeight() - i);
            this.f50190b.draw(canvas);
        }
    }

    public void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f50189a = f;
        invalidate();
    }
}
