package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeRecycleView;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.d5n;
import p153l.nkl0;
import p153l.psd0;
import p153l.u610;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f37958a;

    /* JADX INFO: renamed from: b */
    public int f37959b;

    /* JADX INFO: renamed from: c */
    public int f37960c;

    /* JADX INFO: renamed from: d */
    public int f37961d;

    public IntlPrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m57541E(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m57542F(y20 y20Var, Object obj) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(obj);
        }
    }

    private void init() {
        this.f37958a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: G */
    public <V> void m57543G(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag, C22421c<V> c22421c, final y20<V> y20Var) {
        d5nVar.m153557n(intlVipNewUiFrag, c22421c).subscribe(psd0.m173597H(new y20() { // from class: l.l0p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m57542F(y20Var, obj);
            }
        }, new y20() { // from class: l.n0p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m57541E((Throwable) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM194643c = u610.m194643c(motionEvent);
        int iM194642b = u610.m194642b(motionEvent);
        if (iM194643c == 0) {
            this.f37959b = u610.m194644d(motionEvent, 0);
            this.f37960c = (int) (motionEvent.getX() + 0.5f);
            this.f37961d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iM194643c != 2) {
            if (iM194643c != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f37959b = u610.m194644d(motionEvent, iM194642b);
            this.f37960c = (int) (u610.m194645e(motionEvent, iM194642b) + 0.5f);
            this.f37961d = (int) (u610.m194646f(motionEvent, iM194642b) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iM194641a = u610.m194641a(motionEvent, this.f37959b);
        if (iM194641a < 0) {
            return false;
        }
        int iM194645e = (int) (u610.m194645e(motionEvent, iM194641a) + 0.5f);
        int iM194646f = (int) (u610.m194646f(motionEvent, iM194641a) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iM194645e - this.f37960c;
        int i2 = iM194646f - this.f37961d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f37958a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f37958a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f37958a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f37958a = nkl0.m163648j(viewConfiguration);
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
