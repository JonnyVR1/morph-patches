package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import p149l.gt6;

/* JADX INFO: loaded from: classes12.dex */
public class CoordinatorLinearLayout extends LinearLayout implements gt6 {

    /* JADX INFO: renamed from: l */
    public static int f40261l = 500;

    /* JADX INFO: renamed from: a */
    public int f40262a;

    /* JADX INFO: renamed from: b */
    public int f40263b;

    /* JADX INFO: renamed from: c */
    public int f40264c;

    /* JADX INFO: renamed from: d */
    public int f40265d;

    /* JADX INFO: renamed from: e */
    public int f40266e;

    /* JADX INFO: renamed from: f */
    public int f40267f;

    /* JADX INFO: renamed from: g */
    public float f40268g;

    /* JADX INFO: renamed from: h */
    public boolean f40269h;

    /* JADX INFO: renamed from: i */
    public Context f40270i;

    /* JADX INFO: renamed from: j */
    public OverScroller f40271j;

    /* JADX INFO: renamed from: k */
    public int f40272k;

    public CoordinatorLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40262a = 0;
        this.f40270i = context;
        m62199d();
    }

    private int getScrollRange() {
        return this.f40267f;
    }

    @Override // p149l.gt6
    /* JADX INFO: renamed from: a */
    public boolean mo62196a() {
        return this.f40269h;
    }

    @Override // p149l.gt6
    /* JADX INFO: renamed from: b */
    public boolean mo62197b(int i, int i2, int i3, int i4, boolean z) {
        if (i2 < this.f40264c && this.f40262a == 0 && getScrollY() < getScrollRange()) {
            this.f40269h = true;
            setScrollY(this.f40264c - i2);
            return true;
        }
        if (!z || this.f40262a != 1 || i4 >= 0) {
            return false;
        }
        this.f40269h = true;
        setScrollY(this.f40267f + i4);
        return true;
    }

    @Override // p149l.gt6
    /* JADX INFO: renamed from: c */
    public void mo62198c() {
        int i = this.f40262a;
        if (i == 0) {
            if (getScrollY() >= this.f40265d) {
                m62201f();
                return;
            } else {
                m62202g();
                return;
            }
        }
        if (i == 1) {
            if (getScrollY() <= this.f40266e) {
                m62202g();
            } else {
                m62201f();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f40271j.computeScrollOffset()) {
            setScrollY(this.f40271j.getCurrY());
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m62199d() {
        this.f40271j = new OverScroller(this.f40270i);
        this.f40272k = ViewConfiguration.get(this.f40270i).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: e */
    public void m62200e(int i, int i2) {
        this.f40264c = i;
        this.f40263b = i2;
        int i3 = i - i2;
        this.f40267f = i3;
        this.f40265d = i2;
        this.f40266e = i3 - i2;
    }

    /* JADX INFO: renamed from: f */
    public void m62201f() {
        if (!this.f40271j.isFinished()) {
            this.f40271j.abortAnimation();
        }
        this.f40271j.startScroll(0, getScrollY(), 0, getScrollRange() - getScrollY(), f40261l);
        postInvalidate();
        this.f40262a = 1;
        this.f40269h = false;
    }

    /* JADX INFO: renamed from: g */
    public void m62202g() {
        if (!this.f40271j.isFinished()) {
            this.f40271j.abortAnimation();
        }
        this.f40271j.startScroll(0, getScrollY(), 0, -getScrollY(), f40261l);
        postInvalidate();
        this.f40262a = 0;
        this.f40269h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int y = (int) motionEvent.getY();
            this.f40268g = y;
            if (this.f40262a == 1 && y < this.f40263b) {
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
            this.f40268g = rawY;
        } else if (action == 1) {
            int i = (int) (this.f40268g - rawY);
            if (this.f40262a == 1 && Math.abs(i) < this.f40272k) {
                m62202g();
            }
            if (this.f40269h) {
                mo62198c();
                return true;
            }
        } else if (action == 2) {
            float f = rawY;
            int i2 = (int) (this.f40268g - f);
            if (this.f40262a == 1 && i2 < 0) {
                this.f40269h = true;
                setScrollY(this.f40267f + i2);
            }
            this.f40268g = f;
        } else if (action == 3) {
            int i3 = (int) (this.f40268g - rawY);
            if (this.f40262a == 1) {
                m62202g();
            }
            if (this.f40269h) {
                mo62198c();
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
