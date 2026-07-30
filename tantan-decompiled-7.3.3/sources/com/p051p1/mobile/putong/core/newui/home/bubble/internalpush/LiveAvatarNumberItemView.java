package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LiveAvatarNumberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f22891a;

    /* JADX INFO: renamed from: b */
    public boolean f22892b;

    public LiveAvatarNumberItemView(Context context) {
        super(context);
        this.f22891a = new Path();
        this.f22892b = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22892b) {
            this.f22891a.addCircle(getWidth() * 1.5f, getHeight() / 2.0f, (getWidth() / 2.0f) + qa00.f156320g, Path.Direction.CCW);
            canvas.clipPath(this.f22891a, Region.Op.DIFFERENCE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public void setCanEffect(boolean z) {
        this.f22892b = z;
        invalidate();
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22891a = new Path();
        this.f22892b = true;
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22891a = new Path();
        this.f22892b = true;
    }
}
