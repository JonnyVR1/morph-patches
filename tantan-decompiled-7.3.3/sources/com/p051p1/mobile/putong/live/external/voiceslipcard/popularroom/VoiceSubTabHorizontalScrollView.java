package com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceSubTabHorizontalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public float f47381a;

    /* JADX INFO: renamed from: b */
    public float f47382b;

    public VoiceSubTabHorizontalScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47381a = motionEvent.getX();
            this.f47382b = motionEvent.getY();
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f47381a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f47382b);
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
