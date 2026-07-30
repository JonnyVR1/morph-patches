package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallMatchStayViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4057d;

    /* JADX INFO: renamed from: e */
    public LiveMultiCallMatchStayView f4058e;

    /* JADX INFO: renamed from: f */
    public VText f4059f;

    /* JADX INFO: renamed from: g */
    public VRadioButton f4060g;

    /* JADX INFO: renamed from: h */
    public View f4061h;

    /* JADX INFO: renamed from: i */
    public VText f4062i;

    /* JADX INFO: renamed from: j */
    public VText f4063j;

    public LiveMultiCallMatchStayViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5431C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public LiveMultiCallMatchStayView getRoot() {
        return this.f4058e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5432h0(ViewGroup viewGroup) {
        this.f4058e = (LiveMultiCallMatchStayView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4059f = childAt;
        String str = childAt == null ? "_content" : null;
        VRadioButton childAt2 = viewGroup.getChildAt(1);
        this.f4060g = childAt2;
        if (childAt2 == null) {
            str = "_checked";
        }
        View childAt3 = viewGroup.getChildAt(2);
        this.f4061h = childAt3;
        if (childAt3 == null) {
            str = "_divider";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f4062i = childAt4;
        if (childAt4 == null) {
            str = "_negative";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f4063j = childAt5;
        if (childAt5 == null) {
            str = "_positive";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5433i1(T t) {
        this.f4057d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19980q4, viewGroup, false);
        m5432h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5432h0(this);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
