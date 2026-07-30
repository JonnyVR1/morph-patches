package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class LiveAvatarNumberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f22149a;

    /* JADX INFO: renamed from: b */
    public boolean f22150b;

    public LiveAvatarNumberItemView(Context context) {
        super(context);
        this.f22149a = new Path();
        this.f22150b = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22150b) {
            this.f22149a.addCircle(getWidth() * 1.5f, getHeight() / 2.0f, (getWidth() / 2.0f) + t100.f167258g, Path.Direction.CCW);
            canvas.clipPath(this.f22149a, Region.Op.DIFFERENCE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public void setCanEffect(boolean z) {
        this.f22150b = z;
        invalidate();
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22149a = new Path();
        this.f22150b = true;
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22149a = new Path();
        this.f22150b = true;
    }
}
