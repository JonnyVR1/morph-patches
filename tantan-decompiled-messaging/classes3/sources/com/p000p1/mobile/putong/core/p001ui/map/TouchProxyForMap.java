package com.p000p1.mobile.putong.core.p001ui.map;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import l.ffx;
import l.v1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TouchProxyForMap extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Matrix f269a;

    /* JADX INFO: renamed from: b */
    public boolean f270b;

    public TouchProxyForMap(Context context) {
        super(context);
        this.f269a = new Matrix();
        this.f270b = false;
    }

    /* JADX INFO: renamed from: a */
    public MapAct m410a() {
        return (MapAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public MotionEvent m411b(MotionEvent motionEvent) {
        this.f269a.reset();
        this.f269a.setTranslate(0.0f, (getTop() / 2) - m410a().f257e.f7735h.getTop());
        motionEvent.transform(this.f269a);
        return motionEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f270b = true;
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            this.f270b = false;
        }
        return m410a().f257e.f7735h.dispatchTouchEvent(m411b(motionEvent));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m410a().f257e.f7735h.onInterceptTouchEvent(m411b(motionEvent));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, ffx.b(((View) getParent()).getMeasuredHeight() - getResources().getDimensionPixelSize(v1c0.b)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m410a().f257e.f7735h.onTouchEvent(m411b(motionEvent));
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f269a = new Matrix();
        this.f270b = false;
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f269a = new Matrix();
        this.f270b = false;
    }
}
