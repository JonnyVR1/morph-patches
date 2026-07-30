package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class FilterRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f25968a;

    /* JADX INFO: renamed from: b */
    public RectF f25969b;

    public FilterRoundedCornerLayout(Context context) {
        super(context);
        m42663a();
    }

    /* JADX INFO: renamed from: a */
    public final void m42663a() {
        this.f25968a = new Path();
        this.f25969b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float f = qa00.f156321h;
        this.f25969b.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f25968a.reset();
        this.f25968a.addRoundRect(this.f25969b, f, f, Path.Direction.CW);
        canvas.clipPath(this.f25968a);
        super.dispatchDraw(canvas);
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m42663a();
    }

    public FilterRoundedCornerLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42663a();
    }
}
