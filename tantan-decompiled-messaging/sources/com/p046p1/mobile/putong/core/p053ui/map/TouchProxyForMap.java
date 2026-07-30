package com.p046p1.mobile.putong.core.p053ui.map;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p149l.ffx;
import p149l.v1c0;

/* JADX INFO: loaded from: classes3.dex */
public class TouchProxyForMap extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Matrix f30378a;

    /* JADX INFO: renamed from: b */
    public boolean f30379b;

    public TouchProxyForMap(Context context) {
        super(context);
        this.f30378a = new Matrix();
        this.f30379b = false;
    }

    /* JADX INFO: renamed from: a */
    public MapAct m47377a() {
        return (MapAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public MotionEvent m47378b(MotionEvent motionEvent) {
        this.f30378a.reset();
        this.f30378a.setTranslate(0.0f, (getTop() / 2) - m47377a().f30366e.f172076h.getTop());
        motionEvent.transform(this.f30378a);
        return motionEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f30379b = true;
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            this.f30379b = false;
        }
        return m47377a().f30366e.f172076h.dispatchTouchEvent(m47378b(motionEvent));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m47377a().f30366e.f172076h.onInterceptTouchEvent(m47378b(motionEvent));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, ffx.m121199b(((View) getParent()).getMeasuredHeight() - getResources().getDimensionPixelSize(v1c0.f179226b)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m47377a().f30366e.f172076h.onTouchEvent(m47378b(motionEvent));
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30378a = new Matrix();
        this.f30379b = false;
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30378a = new Matrix();
        this.f30379b = false;
    }
}
