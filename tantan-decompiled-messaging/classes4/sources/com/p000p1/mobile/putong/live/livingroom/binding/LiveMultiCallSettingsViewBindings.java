package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsDeputySwitchView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallSettingsViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4078d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsView f4079e;

    /* JADX INFO: renamed from: f */
    public MultiCallSettingsDeputySwitchView f4080f;

    /* JADX INFO: renamed from: g */
    public MultiCallSettingsItemView f4081g;

    /* JADX INFO: renamed from: h */
    public MultiCallSettingsItemView f4082h;

    /* JADX INFO: renamed from: i */
    public TextView f4083i;

    public LiveMultiCallSettingsViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5440C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallSettingsView getRoot() {
        return this.f4079e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5441h0(ViewGroup viewGroup) {
        this.f4079e = (MultiCallSettingsView) viewGroup;
        MultiCallSettingsDeputySwitchView childAt = viewGroup.getChildAt(0);
        this.f4080f = childAt;
        String str = childAt == null ? "_deputy_count_switch" : null;
        MultiCallSettingsItemView childAt2 = viewGroup.getChildAt(1);
        this.f4081g = childAt2;
        if (childAt2 == null) {
            str = "_no_longer_accept";
        }
        MultiCallSettingsItemView childAt3 = viewGroup.getChildAt(2);
        this.f4082h = childAt3;
        if (childAt3 == null) {
            str = "_no_invitation_required";
        }
        TextView textView = (TextView) viewGroup.getChildAt(3);
        this.f4083i = textView;
        if (textView == null) {
            str = "_close_call";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5442i1(T t) {
        this.f4078d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20084y4, viewGroup, false);
        m5441h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5441h0(this);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
