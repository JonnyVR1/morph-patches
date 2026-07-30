package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LiveAvatarClipItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f53861a;

    public LiveAvatarClipItemView(Context context) {
        super(context);
        this.f53861a = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f53861a;
        int width = getWidth();
        int i = qa00.f156321h;
        path.addCircle(width - i, getHeight() - i, qa00.f156322i, Path.Direction.CCW);
        canvas.clipPath(this.f53861a, Region.Op.DIFFERENCE);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
    }

    public LiveAvatarClipItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53861a = new Path();
    }

    public LiveAvatarClipItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53861a = new Path();
    }
}
