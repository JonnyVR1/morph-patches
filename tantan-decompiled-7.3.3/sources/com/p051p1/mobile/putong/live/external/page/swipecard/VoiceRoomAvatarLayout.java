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
public class VoiceRoomAvatarLayout extends FrameLayout {
    public VoiceRoomAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = qa00.f156327n;
        int height = getHeight();
        int i2 = qa00.f156325l;
        RectF rectF = new RectF(i, height - i2, getWidth() - i, getHeight() + i2);
        Path path = new Path();
        path.addRoundRect(rectF, i2, i2, Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }
}
