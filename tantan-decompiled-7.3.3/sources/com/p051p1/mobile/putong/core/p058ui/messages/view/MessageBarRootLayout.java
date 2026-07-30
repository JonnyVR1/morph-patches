package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p153l.vqc0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageBarRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f33223a;

    public MessageBarRootLayout(Context context) {
        super(context);
        m51059a();
    }

    /* JADX INFO: renamed from: a */
    public final void m51059a() {
        Paint paint = new Paint();
        this.f33223a = paint;
        paint.setAntiAlias(true);
        this.f33223a.setColor(-65536);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vqc0.m202372a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vqc0.m202372a(motionEvent);
        return true;
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m51059a();
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m51059a();
    }
}
