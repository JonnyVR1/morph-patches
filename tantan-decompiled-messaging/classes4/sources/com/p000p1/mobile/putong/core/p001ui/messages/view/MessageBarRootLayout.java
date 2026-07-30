package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import l.oic0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageBarRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f197a;

    public MessageBarRootLayout(Context context) {
        super(context);
        m298a();
    }

    /* JADX INFO: renamed from: a */
    public final void m298a() {
        Paint paint = new Paint();
        this.f197a = paint;
        paint.setAntiAlias(true);
        this.f197a.setColor(-65536);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oic0.a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        oic0.a(motionEvent);
        return true;
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m298a();
    }

    public MessageBarRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m298a();
    }
}
