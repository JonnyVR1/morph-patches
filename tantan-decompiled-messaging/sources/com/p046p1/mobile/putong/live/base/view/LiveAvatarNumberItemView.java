package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveAvatarNumberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f44655a;

    public LiveAvatarNumberItemView(Context context) {
        super(context);
        this.f44655a = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f44655a.addCircle(getWidth() * 1.5f, getHeight() / 2.0f, (getWidth() / 2.0f) + t100.f167255d, Path.Direction.CCW);
        canvas.clipPath(this.f44655a, Region.Op.DIFFERENCE);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44655a = new Path();
    }

    public LiveAvatarNumberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44655a = new Path();
    }
}
