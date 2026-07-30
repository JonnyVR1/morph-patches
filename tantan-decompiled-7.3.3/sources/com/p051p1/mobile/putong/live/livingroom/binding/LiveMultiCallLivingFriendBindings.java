package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallLivingFriendBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48849d;

    /* JADX INFO: renamed from: e */
    public MultiCallLivingFriendView f48850e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f48851f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f48852g;

    /* JADX INFO: renamed from: h */
    public EmptyView f48853h;

    public LiveMultiCallLivingFriendBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public MultiCallLivingFriendView getRoot() {
        return this.f48850e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73203h0(ViewGroup viewGroup) {
        this.f48850e = (MultiCallLivingFriendView) viewGroup;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.getChildAt(0);
        this.f48851f = swipeRefreshLayout;
        String str = swipeRefreshLayout == null ? "_refresh" : null;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(mdc0.f135941G3);
        this.f48852g = recyclerView;
        if (recyclerView == null) {
            str = "_living_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f48853h = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48849d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199177n4, viewGroup, false);
        m73203h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73203h0(this);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
