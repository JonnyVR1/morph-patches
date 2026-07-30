package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p153l.nkl0;
import p153l.u610;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f38364a;

    /* JADX INFO: renamed from: b */
    public int f38365b;

    /* JADX INFO: renamed from: c */
    public int f38366c;

    /* JADX INFO: renamed from: d */
    public int f38367d;

    public PrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.f38364a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM194643c = u610.m194643c(motionEvent);
        int iM194642b = u610.m194642b(motionEvent);
        if (iM194643c == 0) {
            this.f38365b = u610.m194644d(motionEvent, 0);
            this.f38366c = (int) (motionEvent.getX() + 0.5f);
            this.f38367d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iM194643c != 2) {
            if (iM194643c != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f38365b = u610.m194644d(motionEvent, iM194642b);
            this.f38366c = (int) (u610.m194645e(motionEvent, iM194642b) + 0.5f);
            this.f38367d = (int) (u610.m194646f(motionEvent, iM194642b) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iM194641a = u610.m194641a(motionEvent, this.f38365b);
        if (iM194641a < 0) {
            return false;
        }
        int iM194645e = (int) (u610.m194645e(motionEvent, iM194641a) + 0.5f);
        int iM194646f = (int) (u610.m194646f(motionEvent, iM194641a) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iM194645e - this.f38366c;
        int i2 = iM194646f - this.f38367d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f38364a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f38364a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f38364a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f38364a = nkl0.m163648j(viewConfiguration);
        }
    }

    public PrivilegeRecycleView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PrivilegeRecycleView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
