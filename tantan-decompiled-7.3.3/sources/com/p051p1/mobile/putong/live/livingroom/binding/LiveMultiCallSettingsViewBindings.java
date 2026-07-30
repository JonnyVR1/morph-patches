package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsDeputySwitchView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallSettingsViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48884d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsView f48885e;

    /* JADX INFO: renamed from: f */
    public MultiCallSettingsDeputySwitchView f48886f;

    /* JADX INFO: renamed from: g */
    public MultiCallSettingsItemView f48887g;

    /* JADX INFO: renamed from: h */
    public MultiCallSettingsItemView f48888h;

    /* JADX INFO: renamed from: i */
    public TextView f48889i;

    public LiveMultiCallSettingsViewBindings(Context context) {
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

    public MultiCallSettingsView getRoot() {
        return this.f48885e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73208h0(ViewGroup viewGroup) {
        this.f48885e = (MultiCallSettingsView) viewGroup;
        MultiCallSettingsDeputySwitchView multiCallSettingsDeputySwitchView = (MultiCallSettingsDeputySwitchView) viewGroup.getChildAt(0);
        this.f48886f = multiCallSettingsDeputySwitchView;
        String str = multiCallSettingsDeputySwitchView == null ? "_deputy_count_switch" : null;
        MultiCallSettingsItemView multiCallSettingsItemView = (MultiCallSettingsItemView) viewGroup.getChildAt(1);
        this.f48887g = multiCallSettingsItemView;
        if (multiCallSettingsItemView == null) {
            str = "_no_longer_accept";
        }
        MultiCallSettingsItemView multiCallSettingsItemView2 = (MultiCallSettingsItemView) viewGroup.getChildAt(2);
        this.f48888h = multiCallSettingsItemView2;
        if (multiCallSettingsItemView2 == null) {
            str = "_no_invitation_required";
        }
        TextView textView = (TextView) viewGroup.getChildAt(3);
        this.f48889i = textView;
        if (textView == null) {
            str = "_close_call";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48884d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199320y4, viewGroup, false);
        m73208h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73208h0(this);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
