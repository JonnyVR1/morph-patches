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
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallAudienceView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallAudienceBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4016d;

    /* JADX INFO: renamed from: e */
    public MultiCallAudienceView f4017e;

    /* JADX INFO: renamed from: f */
    public SwipeRefreshLayout f4018f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f4019g;

    /* JADX INFO: renamed from: h */
    public EmptyView f4020h;

    public LiveMultiCallAudienceBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5413C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallAudienceView getRoot() {
        return this.f4017e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5414h0(ViewGroup viewGroup) {
        this.f4017e = (MultiCallAudienceView) viewGroup;
        SwipeRefreshLayout childAt = viewGroup.getChildAt(0);
        this.f4018f = childAt;
        String str = childAt == null ? "_refresh" : null;
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f11186r);
        this.f4019g = recyclerViewFindViewById;
        if (recyclerViewFindViewById == null) {
            str = "_audience_list";
        }
        EmptyView childAt2 = viewGroup.getChildAt(1);
        this.f4020h = childAt2;
        if (childAt2 == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5415i1(T t) {
        this.f4016d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19785b4, viewGroup, false);
        m5414h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5414h0(this);
    }

    public LiveMultiCallAudienceBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallAudienceBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
