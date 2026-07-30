package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeRecycleView;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.c3n;
import p149l.e30;
import p149l.jbl0;
import p149l.ky00;
import p149l.mkd0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f37870a;

    /* JADX INFO: renamed from: b */
    public int f37871b;

    /* JADX INFO: renamed from: c */
    public int f37872c;

    /* JADX INFO: renamed from: d */
    public int f37873d;

    public IntlPrivilegeRecycleView(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m57519E(e30 e30Var, Object obj) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(obj);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m57520F(Throwable th) {
    }

    private void init() {
        this.f37870a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: G */
    public <V> void m57521G(c3n c3nVar, VipNewUiFrag vipNewUiFrag, C22306c<V> c22306c, final e30<V> e30Var) {
        c3nVar.m115452n(vipNewUiFrag, c22306c).subscribe(mkd0.m154956H(new e30() { // from class: l.kyo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m57519E(e30Var, obj);
            }
        }, new e30() { // from class: l.myo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeRecycleView.m57520F((Throwable) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM147817c = ky00.m147817c(motionEvent);
        int iM147816b = ky00.m147816b(motionEvent);
        if (iM147817c == 0) {
            this.f37871b = ky00.m147818d(motionEvent, 0);
            this.f37872c = (int) (motionEvent.getX() + 0.5f);
            this.f37873d = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iM147817c != 2) {
            if (iM147817c != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f37871b = ky00.m147818d(motionEvent, iM147816b);
            this.f37872c = (int) (ky00.m147819e(motionEvent, iM147816b) + 0.5f);
            this.f37873d = (int) (ky00.m147820f(motionEvent, iM147816b) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iM147815a = ky00.m147815a(motionEvent, this.f37871b);
        if (iM147815a < 0) {
            return false;
        }
        int iM147819e = (int) (ky00.m147819e(motionEvent, iM147815a) + 0.5f);
        int iM147820f = (int) (ky00.m147820f(motionEvent, iM147815a) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = iM147819e - this.f37872c;
        int i2 = iM147820f - this.f37873d;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f37870a && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f37870a && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f37870a = viewConfiguration.getScaledTouchSlop();
        } else {
            if (i != 1) {
                return;
            }
            this.f37870a = jbl0.m140793j(viewConfiguration);
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
