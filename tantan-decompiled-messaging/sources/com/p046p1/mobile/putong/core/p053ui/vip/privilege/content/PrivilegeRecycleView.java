package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p149l.jbl0;
import p149l.ky00;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f37516a;

    /* JADX INFO: renamed from: b */
    public int f37517b;

    /* JADX INFO: renamed from: c */
    public int f37518c;

    /* JADX INFO: renamed from: d */
    public int f37519d;

    public PrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.f37516a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM147817c = ky00.m147817c(motionEvent);
        int iM147816b = ky00.m147816b(motionEvent);
        if (iM147817c == 0) {
            this.f37517b = ky00.m147818d(motionEvent, 0);
            this.f37518c = (int) (motionEvent.getX() + 0.5f);
            this.f37519d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iM147817c != 2) {
            if (iM147817c != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f37517b = ky00.m147818d(motionEvent, iM147816b);
            this.f37518c = (int) (ky00.m147819e(motionEvent, iM147816b) + 0.5f);
            this.f37519d = (int) (ky00.m147820f(motionEvent, iM147816b) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iM147815a = ky00.m147815a(motionEvent, this.f37517b);
        if (iM147815a < 0) {
            return false;
        }
        int iM147819e = (int) (ky00.m147819e(motionEvent, iM147815a) + 0.5f);
        int iM147820f = (int) (ky00.m147820f(motionEvent, iM147815a) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iM147819e - this.f37518c;
        int i2 = iM147820f - this.f37519d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f37516a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f37516a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f37516a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f37516a = jbl0.m140793j(viewConfiguration);
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
