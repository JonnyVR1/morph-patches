package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FilterRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f4004a;

    /* JADX INFO: renamed from: b */
    public RectF f4005b;

    public FilterRoundedCornerLayout(Context context) {
        super(context);
        m5774a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5774a() {
        this.f4004a = new Path();
        this.f4005b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float f = t100.h;
        this.f4005b.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f4004a.reset();
        this.f4004a.addRoundRect(this.f4005b, f, f, Path.Direction.CW);
        canvas.clipPath(this.f4004a);
        super.dispatchDraw(canvas);
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5774a();
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5774a();
    }
}
