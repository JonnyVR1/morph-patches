package com.p051p1.mobile.putong.live.external.page.swipecard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class SpecialAvatarLayout extends FrameLayout {
    public SpecialAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m71985a(Canvas canvas) {
        float width = getWidth() / 2.0f;
        int i = qa00.f156324k;
        int height = getHeight();
        int i2 = qa00.f156323j;
        RectF rectF = new RectF(width - i, height - i2, (getWidth() / 2.0f) + i, getHeight() + i2);
        Path path = new Path();
        path.addRoundRect(rectF, qa00.m175859d(9.0f), qa00.m175859d(9.0f), Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m71985a(canvas);
    }

    public void setShowType(String str) {
        invalidate();
    }
}
