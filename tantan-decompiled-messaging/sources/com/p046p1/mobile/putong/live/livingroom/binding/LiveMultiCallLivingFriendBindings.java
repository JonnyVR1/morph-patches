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
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallLivingFriendBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48001d;

    /* JADX INFO: renamed from: e */
    public MultiCallLivingFriendView f48002e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f48003f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f48004g;

    /* JADX INFO: renamed from: h */
    public EmptyView f48005h;

    public LiveMultiCallLivingFriendBindings(Context context) {
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

    public MultiCallLivingFriendView getRoot() {
        return this.f48002e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72020h0(ViewGroup viewGroup) {
        this.f48002e = (MultiCallLivingFriendView) viewGroup;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.getChildAt(0);
        this.f48003f = swipeRefreshLayout;
        String str = swipeRefreshLayout == null ? "_refresh" : null;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(g5c0.f100696G3);
        this.f48004g = recyclerView;
        if (recyclerView == null) {
            str = "_living_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f48005h = emptyView;
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
        this.f48001d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168445n4, viewGroup, false);
        m72020h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72020h0(this);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
