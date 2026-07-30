package com.p000p1.mobile.putong.core.p004ui.alifree;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AliFreeClipFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f4513a;

    public AliFreeClipFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f4513a, Region.Op.INTERSECT);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f4513a;
        if (path == null) {
            this.f4513a = new Path();
        } else {
            path.reset();
        }
        this.f4513a.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), t100.d(24.0f), t100.d(24.0f), Path.Direction.CW);
    }

    public AliFreeClipFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AliFreeClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
