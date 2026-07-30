package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsDeputySwitchView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallSettingsViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48036d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsView f48037e;

    /* JADX INFO: renamed from: f */
    public MultiCallSettingsDeputySwitchView f48038f;

    /* JADX INFO: renamed from: g */
    public MultiCallSettingsItemView f48039g;

    /* JADX INFO: renamed from: h */
    public MultiCallSettingsItemView f48040h;

    /* JADX INFO: renamed from: i */
    public TextView f48041i;

    public LiveMultiCallSettingsViewBindings(Context context) {
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

    public MultiCallSettingsView getRoot() {
        return this.f48037e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72025h0(ViewGroup viewGroup) {
        this.f48037e = (MultiCallSettingsView) viewGroup;
        MultiCallSettingsDeputySwitchView multiCallSettingsDeputySwitchView = (MultiCallSettingsDeputySwitchView) viewGroup.getChildAt(0);
        this.f48038f = multiCallSettingsDeputySwitchView;
        String str = multiCallSettingsDeputySwitchView == null ? "_deputy_count_switch" : null;
        MultiCallSettingsItemView multiCallSettingsItemView = (MultiCallSettingsItemView) viewGroup.getChildAt(1);
        this.f48039g = multiCallSettingsItemView;
        if (multiCallSettingsItemView == null) {
            str = "_no_longer_accept";
        }
        MultiCallSettingsItemView multiCallSettingsItemView2 = (MultiCallSettingsItemView) viewGroup.getChildAt(2);
        this.f48040h = multiCallSettingsItemView2;
        if (multiCallSettingsItemView2 == null) {
            str = "_no_invitation_required";
        }
        TextView textView = (TextView) viewGroup.getChildAt(3);
        this.f48041i = textView;
        if (textView == null) {
            str = "_close_call";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48036d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168588y4, viewGroup, false);
        m72025h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72025h0(this);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
