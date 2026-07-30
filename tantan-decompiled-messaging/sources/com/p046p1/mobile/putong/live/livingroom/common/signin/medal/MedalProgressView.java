package com.p046p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class MedalProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f49341a;

    /* JADX INFO: renamed from: b */
    public final Drawable f49342b;

    public MedalProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(yb2.m213876a(867565635, t100.m186890d(9.0f), false));
        this.f49342b = yb2.m213880e(new int[]{-75878, -72799}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(9.0f), false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f49341a;
        if (f != 0.0f) {
            int width = (int) (f * (getWidth() - t100.f167256e));
            Drawable drawable = this.f49342b;
            int i = t100.f167254c;
            drawable.setBounds(i, i, width + i, getHeight() - i);
            this.f49342b.draw(canvas);
        }
    }

    public void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f49341a = f;
        invalidate();
    }
}
