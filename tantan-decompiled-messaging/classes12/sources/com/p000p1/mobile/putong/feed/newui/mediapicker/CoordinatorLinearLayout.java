package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import p007l.gt6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CoordinatorLinearLayout extends LinearLayout implements gt6 {

    /* JADX INFO: renamed from: l */
    public static int f1722l = 500;

    /* JADX INFO: renamed from: a */
    public int f1723a;

    /* JADX INFO: renamed from: b */
    public int f1724b;

    /* JADX INFO: renamed from: c */
    public int f1725c;

    /* JADX INFO: renamed from: d */
    public int f1726d;

    /* JADX INFO: renamed from: e */
    public int f1727e;

    /* JADX INFO: renamed from: f */
    public int f1728f;

    /* JADX INFO: renamed from: g */
    public float f1729g;

    /* JADX INFO: renamed from: h */
    public boolean f1730h;

    /* JADX INFO: renamed from: i */
    public Context f1731i;

    /* JADX INFO: renamed from: j */
    public OverScroller f1732j;

    /* JADX INFO: renamed from: k */
    public int f1733k;

    public CoordinatorLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1723a = 0;
        this.f1731i = context;
        m3181d();
    }

    private int getScrollRange() {
        return this.f1728f;
    }

    @Override // p007l.gt6
    /* JADX INFO: renamed from: a */
    public boolean mo3178a() {
        return this.f1730h;
    }

    @Override // p007l.gt6
    /* JADX INFO: renamed from: b */
    public boolean mo3179b(int i, int i2, int i3, int i4, boolean z) {
        if (i2 < this.f1725c && this.f1723a == 0 && getScrollY() < getScrollRange()) {
            this.f1730h = true;
            setScrollY(this.f1725c - i2);
            return true;
        }
        if (!z || this.f1723a != 1 || i4 >= 0) {
            return false;
        }
        this.f1730h = true;
        setScrollY(this.f1728f + i4);
        return true;
    }

    @Override // p007l.gt6
    /* JADX INFO: renamed from: c */
    public void mo3180c() {
        int i = this.f1723a;
        if (i == 0) {
            if (getScrollY() >= this.f1726d) {
                m3183f();
                return;
            } else {
                m3184g();
                return;
            }
        }
        if (i == 1) {
            if (getScrollY() <= this.f1727e) {
                m3184g();
            } else {
                m3183f();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f1732j.computeScrollOffset()) {
            setScrollY(this.f1732j.getCurrY());
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3181d() {
        this.f1732j = new OverScroller(this.f1731i);
        this.f1733k = ViewConfiguration.get(this.f1731i).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: e */
    public void m3182e(int i, int i2) {
        this.f1725c = i;
        this.f1724b = i2;
        int i3 = i - i2;
        this.f1728f = i3;
        this.f1726d = i2;
        this.f1727e = i3 - i2;
    }

    /* JADX INFO: renamed from: f */
    public void m3183f() {
        if (!this.f1732j.isFinished()) {
            this.f1732j.abortAnimation();
        }
        this.f1732j.startScroll(0, getScrollY(), 0, getScrollRange() - getScrollY(), f1722l);
        postInvalidate();
        this.f1723a = 1;
        this.f1730h = false;
    }

    /* JADX INFO: renamed from: g */
    public void m3184g() {
        if (!this.f1732j.isFinished()) {
            this.f1732j.abortAnimation();
        }
        this.f1732j.startScroll(0, getScrollY(), 0, -getScrollY(), f1722l);
        postInvalidate();
        this.f1723a = 0;
        this.f1730h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int y = (int) motionEvent.getY();
            this.f1729g = y;
            if (this.f1723a == 1 && y < this.f1724b) {
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
            this.f1729g = rawY;
        } else if (action == 1) {
            int i = (int) (this.f1729g - rawY);
            if (this.f1723a == 1 && Math.abs(i) < this.f1733k) {
                m3184g();
            }
            if (this.f1730h) {
                mo3180c();
                return true;
            }
        } else if (action == 2) {
            float f = rawY;
            int i2 = (int) (this.f1729g - f);
            if (this.f1723a == 1 && i2 < 0) {
                this.f1730h = true;
                setScrollY(this.f1728f + i2);
            }
            this.f1729g = f;
        } else if (action == 3) {
            int i3 = (int) (this.f1729g - rawY);
            if (this.f1723a == 1) {
                m3184g();
            }
            if (this.f1730h) {
                mo3180c();
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
