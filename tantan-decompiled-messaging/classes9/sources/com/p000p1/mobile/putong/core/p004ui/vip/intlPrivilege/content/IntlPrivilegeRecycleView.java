package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeRecycleView;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jbl0;
import l.ky00;
import l.mkd0;
import p006l.d3n;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f6891a;

    /* JADX INFO: renamed from: b */
    public int f6892b;

    /* JADX INFO: renamed from: c */
    public int f6893c;

    /* JADX INFO: renamed from: d */
    public int f6894d;

    public IntlPrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m9796E(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m9797F(e30 e30Var, Object obj) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        this.f6891a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: G */
    public <V> void m9798G(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag, c<V> cVar, final e30<V> e30Var) {
        d3nVar.n(intlVipNewUiFrag, cVar).subscribe(mkd0.H(new e30() { // from class: l.lyo
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m9797F(e30Var, obj);
            }
        }, new e30() { // from class: l.nyo
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m9796E((Throwable) obj);
            }
        }));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iC = ky00.c(motionEvent);
        int iB = ky00.b(motionEvent);
        if (iC == 0) {
            this.f6892b = ky00.d(motionEvent, 0);
            this.f6893c = (int) (motionEvent.getX() + 0.5f);
            this.f6894d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iC != 2) {
            if (iC != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f6892b = ky00.d(motionEvent, iB);
            this.f6893c = (int) (ky00.e(motionEvent, iB) + 0.5f);
            this.f6894d = (int) (ky00.f(motionEvent, iB) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iA = ky00.a(motionEvent, this.f6892b);
        if (iA < 0) {
            return false;
        }
        int iE = (int) (ky00.e(motionEvent, iA) + 0.5f);
        int iF = (int) (ky00.f(motionEvent, iA) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iE - this.f6893c;
        int i2 = iF - this.f6894d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f6891a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f6891a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f6891a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f6891a = jbl0.j(viewConfiguration);
        }
    }

    public IntlPrivilegeRecycleView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntlPrivilegeRecycleView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
