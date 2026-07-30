package com.p051p1.mobile.putong.core.newui.home.opt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p153l.px2;

/* JADX INFO: loaded from: classes11.dex */
public class BifrostLayout extends ViewGroup {

    /* JADX INFO: renamed from: c */
    public static String f24062c = "BifrostLayout";

    /* JADX INFO: renamed from: d */
    public static boolean f24063d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f24064e = false;

    /* JADX INFO: renamed from: a */
    public px2 f24065a;

    /* JADX INFO: renamed from: b */
    public boolean f24066b;

    public BifrostLayout(Context context) {
        super(context);
        this.f24066b = false;
        m39796u();
    }

    private ViewGroup.LayoutParams getDefaultAddParam() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: u */
    private void m39796u() {
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        px2 px2Var = this.f24065a;
        if (px2Var != null) {
            px2Var.m169661o(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        px2 px2Var = this.f24065a;
        if (px2Var != null) {
            px2Var.m169637Z(this, motionEvent);
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
        if (this.f24065a.m169668s() != null) {
            this.f24065a.m169668s().mo136417b(canvas, getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        px2 px2Var = this.f24065a;
        return px2Var != null ? px2Var.m169638a0(this, motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        px2 px2Var = this.f24065a;
        if (px2Var == null) {
            return;
        }
        px2Var.m169639b0(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        px2 px2Var = this.f24065a;
        if (px2Var == null) {
            return;
        }
        px2Var.m169641c0(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        px2 px2Var = this.f24065a;
        return px2Var != null ? px2Var.m169644e0(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX INFO: renamed from: s */
    public void m39797s(View view) {
        addViewInLayout(view, -1, getDefaultAddParam(), true);
    }

    public void setRenderManager(px2 px2Var) {
        this.f24065a = px2Var;
        px2Var.m169652j0(this);
        this.f24065a.m169642d();
    }

    /* JADX INFO: renamed from: t */
    public void m39798t(View view, int i) {
        addViewInLayout(view, i, getDefaultAddParam(), true);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo39799v(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m39800w() {
        this.f24065a.mo160621z0();
    }

    /* JADX INFO: renamed from: z */
    public void m39801z(float f) {
        px2 px2Var = this.f24065a;
        if (px2Var != null) {
            px2Var.m169666q0(f);
        }
    }

    public BifrostLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24066b = false;
        m39796u();
    }

    public BifrostLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24066b = false;
        m39796u();
    }
}
