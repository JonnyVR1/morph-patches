package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

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
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardUserAvatarLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f33575a;

    public OnlineMatchNewUiCardUserAvatarLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33575a == null) {
            float width = getWidth() - qa00.m175859d(35.0f);
            int i = qa00.f156319f;
            RectF rectF = new RectF(width, 0 - i, getWidth() + qa00.m175859d(115.0f), getHeight() + i);
            Path path = new Path();
            this.f33575a = path;
            int i2 = qa00.f156325l;
            path.addRoundRect(rectF, i2, i2, Path.Direction.CCW);
            Matrix matrix = new Matrix();
            matrix.postRotate(16.0f, rectF.centerX(), rectF.centerY());
            matrix.postTranslate(qa00.f156321h, qa00.f156326m);
            this.f33575a.transform(matrix);
        }
        canvas.clipPath(this.f33575a, Region.Op.DIFFERENCE);
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
