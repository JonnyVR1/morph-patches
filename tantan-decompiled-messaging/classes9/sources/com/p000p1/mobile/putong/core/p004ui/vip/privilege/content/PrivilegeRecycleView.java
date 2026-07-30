package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import l.jbl0;
import l.ky00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f7297a;

    /* JADX INFO: renamed from: b */
    public int f7298b;

    /* JADX INFO: renamed from: c */
    public int f7299c;

    /* JADX INFO: renamed from: d */
    public int f7300d;

    public PrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        this.f7297a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iC = ky00.c(motionEvent);
        int iB = ky00.b(motionEvent);
        if (iC == 0) {
            this.f7298b = ky00.d(motionEvent, 0);
            this.f7299c = (int) (motionEvent.getX() + 0.5f);
            this.f7300d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iC != 2) {
            if (iC != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f7298b = ky00.d(motionEvent, iB);
            this.f7299c = (int) (ky00.e(motionEvent, iB) + 0.5f);
            this.f7300d = (int) (ky00.f(motionEvent, iB) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iA = ky00.a(motionEvent, this.f7298b);
        if (iA < 0) {
            return false;
        }
        int iE = (int) (ky00.e(motionEvent, iA) + 0.5f);
        int iF = (int) (ky00.f(motionEvent, iA) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iE - this.f7299c;
        int i2 = iF - this.f7300d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f7297a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f7297a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f7297a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f7297a = jbl0.j(viewConfiguration);
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
