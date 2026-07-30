package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardUserAvatarLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f32727a;

    public OnlineMatchNewUiCardUserAvatarLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32727a == null) {
            float width = getWidth() - t100.m186890d(35.0f);
            int i = t100.f167257f;
            RectF rectF = new RectF(width, 0 - i, getWidth() + t100.m186890d(115.0f), getHeight() + i);
            Path path = new Path();
            this.f32727a = path;
            int i2 = t100.f167263l;
            path.addRoundRect(rectF, i2, i2, Path.Direction.CCW);
            Matrix matrix = new Matrix();
            matrix.postRotate(16.0f, rectF.centerX(), rectF.centerY());
            matrix.postTranslate(t100.f167259h, t100.f167264m);
            this.f32727a.transform(matrix);
        }
        canvas.clipPath(this.f32727a, Region.Op.DIFFERENCE);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public OnlineMatchNewUiCardUserAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCardUserAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OnlineMatchNewUiCardUserAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
