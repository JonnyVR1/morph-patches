package com.p051p1.mobile.putong.core.p058ui.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class TouchProxyForCurrentLocation extends View {
    public TouchProxyForCurrentLocation(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public MapAct m48559a() {
        return (MapAct) getContext();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m48559a().f31214e.f171037q.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m48559a().f31214e.f171037q.onTouchEvent(motionEvent);
    }

    public TouchProxyForCurrentLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchProxyForCurrentLocation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
