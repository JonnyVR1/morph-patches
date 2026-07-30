package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import p151v.VRadioButton;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallMatchStayViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48863d;

    /* JADX INFO: renamed from: e */
    public LiveMultiCallMatchStayView f48864e;

    /* JADX INFO: renamed from: f */
    public VText f48865f;

    /* JADX INFO: renamed from: g */
    public VRadioButton f48866g;

    /* JADX INFO: renamed from: h */
    public View f48867h;

    /* JADX INFO: renamed from: i */
    public VText f48868i;

    /* JADX INFO: renamed from: j */
    public VText f48869j;

    public LiveMultiCallMatchStayViewBindings(Context context) {
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

    public LiveMultiCallMatchStayView getRoot() {
        return this.f48864e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73205h0(ViewGroup viewGroup) {
        this.f48864e = (LiveMultiCallMatchStayView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48865f = vText;
        String str = vText == null ? "_content" : null;
        VRadioButton vRadioButton = (VRadioButton) viewGroup.getChildAt(1);
        this.f48866g = vRadioButton;
        if (vRadioButton == null) {
            str = "_checked";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f48867h = childAt;
        if (childAt == null) {
            str = "_divider";
        }
        VText vText2 = (VText) viewGroup.getChildAt(3);
        this.f48868i = vText2;
        if (vText2 == null) {
            str = "_negative";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f48869j = vText3;
        if (vText3 == null) {
            str = "_positive";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48863d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199216q4, viewGroup, false);
        m73205h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73205h0(this);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMatchStayViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
