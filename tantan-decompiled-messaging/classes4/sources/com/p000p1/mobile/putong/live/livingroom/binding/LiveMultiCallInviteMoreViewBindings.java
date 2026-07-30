package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p1.mobile.putong.live.base.view.EmptyView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallInviteMoreViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4026d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteMoreView f4027e;

    /* JADX INFO: renamed from: f */
    public VText f4028f;

    /* JADX INFO: renamed from: g */
    public VImage f4029g;

    /* JADX INFO: renamed from: h */
    public VText f4030h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f4031i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f4032j;

    /* JADX INFO: renamed from: k */
    public EmptyView f4033k;

    /* JADX INFO: renamed from: l */
    public VText f4034l;

    public LiveMultiCallInviteMoreViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5419C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallInviteMoreView getRoot() {
        return this.f4027e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5420h0(ViewGroup viewGroup) {
        this.f4027e = (MultiCallInviteMoreView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4028f = childAt;
        String str = childAt == null ? "_title" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f4029g = childAt2;
        if (childAt2 == null) {
            str = "_live_guard_back";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f4030h = childAt3;
        if (childAt3 == null) {
            str = "_invite_hint";
        }
        SwipeRefreshLayout childAt4 = viewGroup.getChildAt(3);
        this.f4031i = childAt4;
        if (childAt4 == null) {
            str = "_refresh";
        }
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f10908N2);
        this.f4032j = recyclerViewFindViewById;
        if (recyclerViewFindViewById == null) {
            str = "_invited_list";
        }
        EmptyView childAt5 = viewGroup.getChildAt(4);
        this.f4033k = childAt5;
        if (childAt5 == null) {
            str = "_rv_empty_view";
        }
        VText childAt6 = viewGroup.getChildAt(5);
        this.f4034l = childAt6;
        if (childAt6 == null) {
            str = "_confirm";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5421i1(T t) {
        this.f4026d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19915l4, viewGroup, false);
        m5420h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5420h0(this);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteMoreViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
