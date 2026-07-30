package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import p153l.ju6;

/* JADX INFO: loaded from: classes13.dex */
public class CoordinatorLinearLayout extends LinearLayout implements ju6 {

    /* JADX INFO: renamed from: l */
    public static int f41109l = 500;

    /* JADX INFO: renamed from: a */
    public int f41110a;

    /* JADX INFO: renamed from: b */
    public int f41111b;

    /* JADX INFO: renamed from: c */
    public int f41112c;

    /* JADX INFO: renamed from: d */
    public int f41113d;

    /* JADX INFO: renamed from: e */
    public int f41114e;

    /* JADX INFO: renamed from: f */
    public int f41115f;

    /* JADX INFO: renamed from: g */
    public float f41116g;

    /* JADX INFO: renamed from: h */
    public boolean f41117h;

    /* JADX INFO: renamed from: i */
    public Context f41118i;

    /* JADX INFO: renamed from: j */
    public OverScroller f41119j;

    /* JADX INFO: renamed from: k */
    public int f41120k;

    public CoordinatorLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41110a = 0;
        this.f41118i = context;
        m63382d();
    }

    private int getScrollRange() {
        return this.f41115f;
    }

    @Override // p153l.ju6
    /* JADX INFO: renamed from: a */
    public boolean mo63379a() {
        return this.f41117h;
    }

    @Override // p153l.ju6
    /* JADX INFO: renamed from: b */
    public boolean mo63380b(int i, int i2, int i3, int i4, boolean z) {
        if (i2 < this.f41112c && this.f41110a == 0 && getScrollY() < getScrollRange()) {
            this.f41117h = true;
            setScrollY(this.f41112c - i2);
            return true;
        }
        if (!z || this.f41110a != 1 || i4 >= 0) {
            return false;
        }
        this.f41117h = true;
        setScrollY(this.f41115f + i4);
        return true;
    }

    @Override // p153l.ju6
    /* JADX INFO: renamed from: c */
    public void mo63381c() {
        int i = this.f41110a;
        if (i == 0) {
            if (getScrollY() >= this.f41113d) {
                m63384f();
                return;
            } else {
                m63385g();
                return;
            }
        }
        if (i == 1) {
            if (getScrollY() <= this.f41114e) {
                m63385g();
            } else {
                m63384f();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f41119j.computeScrollOffset()) {
            setScrollY(this.f41119j.getCurrY());
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m63382d() {
        this.f41119j = new OverScroller(this.f41118i);
        this.f41120k = ViewConfiguration.get(this.f41118i).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: e */
    public void m63383e(int i, int i2) {
        this.f41112c = i;
        this.f41111b = i2;
        int i3 = i - i2;
        this.f41115f = i3;
        this.f41113d = i2;
        this.f41114e = i3 - i2;
    }

    /* JADX INFO: renamed from: f */
    public void m63384f() {
        if (!this.f41119j.isFinished()) {
            this.f41119j.abortAnimation();
        }
        this.f41119j.startScroll(0, getScrollY(), 0, getScrollRange() - getScrollY(), f41109l);
        postInvalidate();
        this.f41110a = 1;
        this.f41117h = false;
    }

    /* JADX INFO: renamed from: g */
    public void m63385g() {
        if (!this.f41119j.isFinished()) {
            this.f41119j.abortAnimation();
        }
        this.f41119j.startScroll(0, getScrollY(), 0, -getScrollY(), f41109l);
        postInvalidate();
        this.f41110a = 0;
        this.f41117h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int y = (int) motionEvent.getY();
            this.f41116g = y;
            if (this.f41110a == 1 && y < this.f41111b) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int rawY = (int) motionEvent.getRawY();
        if (action == 0) {
            this.f41116g = rawY;
        } else if (action == 1) {
            int i = (int) (this.f41116g - rawY);
            if (this.f41110a == 1 && Math.abs(i) < this.f41120k) {
                m63385g();
            }
            if (this.f41117h) {
                mo63381c();
                return true;
            }
        } else if (action == 2) {
            float f = rawY;
            int i2 = (int) (this.f41116g - f);
            if (this.f41110a == 1 && i2 < 0) {
                this.f41117h = true;
                setScrollY(this.f41115f + i2);
            }
            this.f41116g = f;
        } else if (action == 3) {
            int i3 = (int) (this.f41116g - rawY);
            if (this.f41110a == 1) {
                m63385g();
            }
            if (this.f41117h) {
                mo63381c();
                return true;
            }
        }
        return true;
    }

    public CoordinatorLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLinearLayout(Context context) {
        this(context, null);
    }
}
