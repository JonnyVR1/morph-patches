package com.p000p1.mobile.putong.core.p004ui.alifree;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AliFreeClipLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Path f4514a;

    public AliFreeClipLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f4514a, Region.Op.INTERSECT);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f4514a;
        if (path == null) {
            this.f4514a = new Path();
        } else {
            path.reset();
        }
        this.f4514a.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), t100.d(24.0f), t100.d(24.0f), Path.Direction.CW);
    }

    public AliFreeClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AliFreeClipLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
