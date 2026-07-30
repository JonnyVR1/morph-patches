package com.p046p1.mobile.putong.core.newui.home.opt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p149l.ax2;

/* JADX INFO: loaded from: classes11.dex */
public class BifrostLayout extends ViewGroup {

    /* JADX INFO: renamed from: c */
    public static String f23320c = "BifrostLayout";

    /* JADX INFO: renamed from: d */
    public static boolean f23321d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f23322e = false;

    /* JADX INFO: renamed from: a */
    public ax2 f23323a;

    /* JADX INFO: renamed from: b */
    public boolean f23324b;

    public BifrostLayout(Context context) {
        super(context);
        this.f23324b = false;
        m38793u();
    }

    private ViewGroup.LayoutParams getDefaultAddParam() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: u */
    private void m38793u() {
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ax2 ax2Var = this.f23323a;
        if (ax2Var != null) {
            ax2Var.m220547o(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f23323a;
        if (ax2Var != null) {
            ax2Var.m220524Z(this, motionEvent);
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
        if (this.f23323a.m220554s() != null) {
            this.f23323a.m220554s().mo102795b(canvas, getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f23323a;
        return ax2Var != null ? ax2Var.m220525a0(this, motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ax2 ax2Var = this.f23323a;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m220526b0(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ax2 ax2Var = this.f23323a;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m220528c0(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ax2 ax2Var = this.f23323a;
        return ax2Var != null ? ax2Var.m220531e0(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX INFO: renamed from: s */
    public void m38794s(View view) {
        addViewInLayout(view, -1, getDefaultAddParam(), true);
    }

    public void setRenderManager(ax2 ax2Var) {
        this.f23323a = ax2Var;
        ax2Var.m220538j0(this);
        this.f23323a.m220529d();
    }

    /* JADX INFO: renamed from: t */
    public void m38795t(View view, int i) {
        addViewInLayout(view, i, getDefaultAddParam(), true);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo38796v(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m38797w() {
        this.f23323a.mo104268z0();
    }

    /* JADX INFO: renamed from: z */
    public void m38798z(float f) {
        ax2 ax2Var = this.f23323a;
        if (ax2Var != null) {
            ax2Var.m220552q0(f);
        }
    }

    public BifrostLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23324b = false;
        m38793u();
    }

    public BifrostLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23324b = false;
        m38793u();
    }
}
