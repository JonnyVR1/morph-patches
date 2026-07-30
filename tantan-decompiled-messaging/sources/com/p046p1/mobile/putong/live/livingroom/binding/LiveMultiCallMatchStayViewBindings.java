package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import p147v.VRadioButton;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallMatchStayViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48015d;

    /* JADX INFO: renamed from: e */
    public LiveMultiCallMatchStayView f48016e;

    /* JADX INFO: renamed from: f */
    public VText f48017f;

    /* JADX INFO: renamed from: g */
    public VRadioButton f48018g;

    /* JADX INFO: renamed from: h */
    public View f48019h;

    /* JADX INFO: renamed from: i */
    public VText f48020i;

    /* JADX INFO: renamed from: j */
    public VText f48021j;

    public LiveMultiCallMatchStayViewBindings(Context context) {
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

    public LiveMultiCallMatchStayView getRoot() {
        return this.f48016e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72022h0(ViewGroup viewGroup) {
        this.f48016e = (LiveMultiCallMatchStayView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48017f = vText;
        String str = vText == null ? "_content" : null;
        VRadioButton vRadioButton = (VRadioButton) viewGroup.getChildAt(1);
        this.f48018g = vRadioButton;
        if (vRadioButton == null) {
            str = "_checked";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f48019h = childAt;
        if (childAt == null) {
            str = "_divider";
        }
        VText vText2 = (VText) viewGroup.getChildAt(3);
        this.f48020i = vText2;
        if (vText2 == null) {
            str = "_negative";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f48021j = vText3;
        if (vText3 == null) {
            str = "_positive";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48015d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168484q4, viewGroup, false);
        m72022h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72022h0(this);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
