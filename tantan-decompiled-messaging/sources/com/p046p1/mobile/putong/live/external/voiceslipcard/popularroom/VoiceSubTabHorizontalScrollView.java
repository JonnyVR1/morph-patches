package com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceSubTabHorizontalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public float f46533a;

    /* JADX INFO: renamed from: b */
    public float f46534b;

    public VoiceSubTabHorizontalScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46533a = motionEvent.getX();
            this.f46534b = motionEvent.getY();
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f46533a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f46534b);
            if ((fAbs > 0.0f || fAbs2 > 0.0f) && fAbs >= fAbs2) {
                getParent().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public VoiceSubTabHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSubTabHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
