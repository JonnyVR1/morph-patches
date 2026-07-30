package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p149l.oic0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageBarRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f32375a;

    public MessageBarRootLayout(Context context) {
        super(context);
        m49876a();
    }

    /* JADX INFO: renamed from: a */
    public final void m49876a() {
        Paint paint = new Paint();
        this.f32375a = paint;
        paint.setAntiAlias(true);
        this.f32375a.setColor(-65536);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oic0.m164504a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        oic0.m164504a(motionEvent);
        return true;
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49876a();
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49876a();
    }
}
