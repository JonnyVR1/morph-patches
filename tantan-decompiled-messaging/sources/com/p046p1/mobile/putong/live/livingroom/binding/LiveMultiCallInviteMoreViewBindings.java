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
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import p147v.VImage;
import p147v.VText;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallInviteMoreViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f47984d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteMoreView f47985e;

    /* JADX INFO: renamed from: f */
    public VText f47986f;

    /* JADX INFO: renamed from: g */
    public VImage f47987g;

    /* JADX INFO: renamed from: h */
    public VText f47988h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f47989i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f47990j;

    /* JADX INFO: renamed from: k */
    public EmptyView f47991k;

    /* JADX INFO: renamed from: l */
    public VText f47992l;

    public LiveMultiCallInviteMoreViewBindings(Context context) {
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

    public MultiCallInviteMoreView getRoot() {
        return this.f47985e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72018h0(ViewGroup viewGroup) {
        this.f47985e = (MultiCallInviteMoreView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f47986f = vText;
        String str = vText == null ? "_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f47987g = vImage;
        if (vImage == null) {
            str = "_live_guard_back";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f47988h = vText2;
        if (vText2 == null) {
            str = "_invite_hint";
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.getChildAt(3);
        this.f47989i = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            str = "_refresh";
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(g5c0.f100758N2);
        this.f47990j = recyclerView;
        if (recyclerView == null) {
            str = "_invited_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(4);
        this.f47991k = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        VText vText3 = (VText) viewGroup.getChildAt(5);
        this.f47992l = vText3;
        if (vText3 == null) {
            str = "_confirm";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f47984d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168419l4, viewGroup, false);
        m72018h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72018h0(this);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
