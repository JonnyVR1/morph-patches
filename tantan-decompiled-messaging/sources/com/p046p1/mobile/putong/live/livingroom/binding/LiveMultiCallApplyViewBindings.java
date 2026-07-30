package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallApplyViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f47969d;

    /* JADX INFO: renamed from: e */
    public MultiCallApplyView f47970e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f47971f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f47972g;

    /* JADX INFO: renamed from: h */
    public EmptyView f47973h;

    public LiveMultiCallApplyViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public MultiCallApplyView getRoot() {
        return this.f47970e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72013h0(ViewGroup viewGroup) {
        this.f47970e = (MultiCallApplyView) viewGroup;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.getChildAt(0);
        this.f47971f = swipeRefreshLayout;
        String str = swipeRefreshLayout == null ? "_refresh" : null;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(g5c0.f101018p);
        this.f47972g = recyclerView;
        if (recyclerView == null) {
            str = "_apply_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f47973h = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f47969d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168276a4, viewGroup, false);
        m72013h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72013h0(this);
    }

    public LiveMultiCallApplyViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallApplyViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
