package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveAvatarNumberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f927a;

    /* JADX INFO: renamed from: b */
    public boolean f928b;

    public LiveAvatarNumberItemView(Context context) {
        super(context);
        this.f927a = new Path();
        this.f928b = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f928b) {
            this.f927a.addCircle(getWidth() * 1.5f, getHeight() / 2.0f, (getWidth() / 2.0f) + t100.g, Path.Direction.CCW);
            canvas.clipPath(this.f927a, Region.Op.DIFFERENCE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public void setCanEffect(boolean z) {
        this.f928b = z;
        invalidate();
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f927a = new Path();
        this.f928b = true;
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f927a = new Path();
        this.f928b = true;
    }
}
