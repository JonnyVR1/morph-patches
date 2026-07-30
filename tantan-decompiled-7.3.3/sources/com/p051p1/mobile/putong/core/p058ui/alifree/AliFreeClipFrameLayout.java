package com.p051p1.mobile.putong.core.p058ui.alifree;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class AliFreeClipFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f29294a;

    public AliFreeClipFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f29294a, Region.Op.INTERSECT);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f29294a;
        if (path == null) {
            this.f29294a = new Path();
        } else {
            path.reset();
        }
        this.f29294a.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), qa00.m175859d(24.0f), qa00.m175859d(24.0f), Path.Direction.CW);
    }

    public AliFreeClipFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AliFreeClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
