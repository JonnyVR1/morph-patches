package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ClipRectFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f34943a;

    /* JADX INFO: renamed from: b */
    public Path f34944b;

    public ClipRectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34943a = qa00.m175859d(10.0f);
        m54073a();
    }

    /* JADX INFO: renamed from: a */
    public final void m54073a() {
        this.f34944b = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        canvas.clipPath(this.f34944b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f34944b;
        if (path == null) {
            this.f34944b = new Path();
        } else {
            path.reset();
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Path path2 = this.f34944b;
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        int i5 = this.f34943a;
        path2.addRoundRect(rectF, i5, i5, Path.Direction.CW);
    }

    public ClipRectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ClipRectFrameLayout(@NonNull Context context) {
        this(context, null);
    }
}
