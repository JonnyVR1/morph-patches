package com.p046p1.mobile.putong.live.external.page.swipecard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class SpecialAvatarLayout extends FrameLayout {
    public SpecialAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m70802a(Canvas canvas) {
        float width = getWidth() / 2.0f;
        int i = t100.f167262k;
        int height = getHeight();
        int i2 = t100.f167261j;
        RectF rectF = new RectF(width - i, height - i2, (getWidth() / 2.0f) + i, getHeight() + i2);
        Path path = new Path();
        path.addRoundRect(rectF, t100.m186890d(9.0f), t100.m186890d(9.0f), Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m70802a(canvas);
    }

    public void setShowType(String str) {
        invalidate();
    }
}
