package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceFunctionSwitchViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4156a;

    /* JADX INFO: renamed from: b */
    public VoicePanelSwitchView f4157b;

    /* JADX INFO: renamed from: c */
    public VText f4158c;

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5476C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5477a(ViewGroup viewGroup) {
        this.f4157b = (VoicePanelSwitchView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4158c = childAt;
        String str = childAt == null ? "_switchFunction" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VoicePanelSwitchView getRoot() {
        return this.f4157b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5478i1(T t) {
        this.f4156a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19788b7, viewGroup, false);
        m5477a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5477a(this);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
