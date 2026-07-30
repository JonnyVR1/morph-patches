package com.p000p1.mobile.putong.core.p001ui.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TouchProxyForCurrentLocation extends View {
    public TouchProxyForCurrentLocation(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public MapAct m409a() {
        return (MapAct) getContext();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m409a().f257e.f7744q.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m409a().f257e.f7744q.onTouchEvent(motionEvent);
    }

    public TouchProxyForCurrentLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchProxyForCurrentLocation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
