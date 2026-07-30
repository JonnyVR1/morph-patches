package com.p000p1.mobile.putong.core.newui.home.opt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p009l.ax2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BifrostLayout extends ViewGroup {

    /* JADX INFO: renamed from: c */
    public static String f2098c = "BifrostLayout";

    /* JADX INFO: renamed from: d */
    public static boolean f2099d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f2100e = false;

    /* JADX INFO: renamed from: a */
    public ax2 f2101a;

    /* JADX INFO: renamed from: b */
    public boolean f2102b;

    public BifrostLayout(Context context) {
        super(context);
        this.f2102b = false;
        m2789u();
    }

    private ViewGroup.LayoutParams getDefaultAddParam() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: u */
    private void m2789u() {
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ax2 ax2Var = this.f2101a;
        if (ax2Var != null) {
            ax2Var.m26029o(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f2101a;
        if (ax2Var != null) {
            ax2Var.m26006Z(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2101a.m26036s() != null) {
            this.f2101a.m26036s().mo12156b(canvas, getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f2101a;
        return ax2Var != null ? ax2Var.m26007a0(this, motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ax2 ax2Var = this.f2101a;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m26008b0(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ax2 ax2Var = this.f2101a;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m26010c0(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f2101a;
        return ax2Var != null ? ax2Var.m26013e0(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX INFO: renamed from: s */
    public void m2790s(View view) {
        addViewInLayout(view, -1, getDefaultAddParam(), true);
    }

    public void setRenderManager(ax2 ax2Var) {
        this.f2101a = ax2Var;
        ax2Var.m26020j0(this);
        this.f2101a.m26011d();
    }

    /* JADX INFO: renamed from: t */
    public void m2791t(View view, int i) {
        addViewInLayout(view, i, getDefaultAddParam(), true);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo2792v(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m2793w() {
        this.f2101a.mo12321z0();
    }

    /* JADX INFO: renamed from: z */
    public void m2794z(float f) {
        ax2 ax2Var = this.f2101a;
        if (ax2Var != null) {
            ax2Var.m26034q0(f);
        }
    }

    public BifrostLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2102b = false;
        m2789u();
    }

    public BifrostLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2102b = false;
        m2789u();
    }
}
