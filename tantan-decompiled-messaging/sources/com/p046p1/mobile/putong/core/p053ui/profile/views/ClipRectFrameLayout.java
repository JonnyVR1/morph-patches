package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class ClipRectFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f34095a;

    /* JADX INFO: renamed from: b */
    public Path f34096b;

    public ClipRectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34095a = t100.m186890d(10.0f);
        m52890a();
    }

    /* JADX INFO: renamed from: a */
    public final void m52890a() {
        this.f34096b = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        canvas.clipPath(this.f34096b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f34096b;
        if (path == null) {
            this.f34096b = new Path();
        } else {
            path.reset();
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Path path2 = this.f34096b;
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        int i5 = this.f34095a;
        path2.addRoundRect(rectF, i5, i5, Path.Direction.CW);
    }

    public ClipRectFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ClipRectFrameLayout(@NonNull Context context) {
        this(context, null);
    }
}
