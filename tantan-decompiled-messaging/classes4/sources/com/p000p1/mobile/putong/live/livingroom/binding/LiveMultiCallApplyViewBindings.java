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
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallApplyViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4011d;

    /* JADX INFO: renamed from: e */
    public MultiCallApplyView f4012e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f4013f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f4014g;

    /* JADX INFO: renamed from: h */
    public EmptyView f4015h;

    public LiveMultiCallApplyViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5410C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallApplyView getRoot() {
        return this.f4012e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5411h0(ViewGroup viewGroup) {
        this.f4012e = (MultiCallApplyView) viewGroup;
        SwipeRefreshLayout childAt = viewGroup.getChildAt(0);
        this.f4013f = childAt;
        String str = childAt == null ? "_refresh" : null;
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f11168p);
        this.f4014g = recyclerViewFindViewById;
        if (recyclerViewFindViewById == null) {
            str = "_apply_list";
        }
        EmptyView childAt2 = viewGroup.getChildAt(1);
        this.f4015h = childAt2;
        if (childAt2 == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5412i1(T t) {
        this.f4011d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19772a4, viewGroup, false);
        m5411h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5411h0(this);
    }

    public LiveMultiCallApplyViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallApplyViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
