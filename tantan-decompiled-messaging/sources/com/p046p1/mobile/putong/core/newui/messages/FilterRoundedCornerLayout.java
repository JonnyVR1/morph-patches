package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class FilterRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f25226a;

    /* JADX INFO: renamed from: b */
    public RectF f25227b;

    public FilterRoundedCornerLayout(Context context) {
        super(context);
        m41652a();
    }

    /* JADX INFO: renamed from: a */
    public final void m41652a() {
        this.f25226a = new Path();
        this.f25227b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float f = t100.f167259h;
        this.f25227b.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f25226a.reset();
        this.f25226a.addRoundRect(this.f25227b, f, f, Path.Direction.CW);
        canvas.clipPath(this.f25226a);
        super.dispatchDraw(canvas);
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m41652a();
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41652a();
    }
}
