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
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import p151v.VImage;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallInviteMoreViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48832d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteMoreView f48833e;

    /* JADX INFO: renamed from: f */
    public VText f48834f;

    /* JADX INFO: renamed from: g */
    public VImage f48835g;

    /* JADX INFO: renamed from: h */
    public VText f48836h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f48837i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f48838j;

    /* JADX INFO: renamed from: k */
    public EmptyView f48839k;

    /* JADX INFO: renamed from: l */
    public VText f48840l;

    public LiveMultiCallInviteMoreViewBindings(Context context) {
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

    public MultiCallInviteMoreView getRoot() {
        return this.f48833e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73201h0(ViewGroup viewGroup) {
        this.f48833e = (MultiCallInviteMoreView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48834f = vText;
        String str = vText == null ? "_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f48835g = vImage;
        if (vImage == null) {
            str = "_live_guard_back";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48836h = vText2;
        if (vText2 == null) {
            str = "_invite_hint";
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.getChildAt(3);
        this.f48837i = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            str = "_refresh";
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(mdc0.f136003N2);
        this.f48838j = recyclerView;
        if (recyclerView == null) {
            str = "_invited_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(4);
        this.f48839k = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        VText vText3 = (VText) viewGroup.getChildAt(5);
        this.f48840l = vText3;
        if (vText3 == null) {
            str = "_confirm";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48832d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199151l4, viewGroup, false);
        m73201h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73201h0(this);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
