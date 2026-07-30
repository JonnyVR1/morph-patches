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
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallLivingFriendBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4043d;

    /* JADX INFO: renamed from: e */
    public MultiCallLivingFriendView f4044e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f4045f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f4046g;

    /* JADX INFO: renamed from: h */
    public EmptyView f4047h;

    public LiveMultiCallLivingFriendBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5425C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallLivingFriendView getRoot() {
        return this.f4044e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5426h0(ViewGroup viewGroup) {
        this.f4044e = (MultiCallLivingFriendView) viewGroup;
        SwipeRefreshLayout childAt = viewGroup.getChildAt(0);
        this.f4045f = childAt;
        String str = childAt == null ? "_refresh" : null;
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f10846G3);
        this.f4046g = recyclerViewFindViewById;
        if (recyclerViewFindViewById == null) {
            str = "_living_list";
        }
        EmptyView childAt2 = viewGroup.getChildAt(1);
        this.f4047h = childAt2;
        if (childAt2 == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5427i1(T t) {
        this.f4043d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19941n4, viewGroup, false);
        m5426h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5426h0(this);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallLivingFriendBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
