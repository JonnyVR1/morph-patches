package com.p051p1.mobile.putong.core.p058ui.map;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p153l.cac0;
import p153l.dox;

/* JADX INFO: loaded from: classes3.dex */
public class TouchProxyForMap extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Matrix f31226a;

    /* JADX INFO: renamed from: b */
    public boolean f31227b;

    public TouchProxyForMap(Context context) {
        super(context);
        this.f31226a = new Matrix();
        this.f31227b = false;
    }

    /* JADX INFO: renamed from: a */
    public MapAct m48560a() {
        return (MapAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public MotionEvent m48561b(MotionEvent motionEvent) {
        this.f31226a.reset();
        this.f31226a.setTranslate(0.0f, (getTop() / 2) - m48560a().f31214e.f171028h.getTop());
        motionEvent.transform(this.f31226a);
        return motionEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f31227b = true;
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            this.f31227b = false;
        }
        return m48560a().f31214e.f171028h.dispatchTouchEvent(m48561b(motionEvent));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m48560a().f31214e.f171028h.onInterceptTouchEvent(m48561b(motionEvent));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, dox.m117364b(((View) getParent()).getMeasuredHeight() - getResources().getDimensionPixelSize(cac0.f80572b)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m48560a().f31214e.f171028h.onTouchEvent(m48561b(motionEvent));
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31226a = new Matrix();
        this.f31227b = false;
    }

    public TouchProxyForMap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31226a = new Matrix();
        this.f31227b = false;
    }
}
