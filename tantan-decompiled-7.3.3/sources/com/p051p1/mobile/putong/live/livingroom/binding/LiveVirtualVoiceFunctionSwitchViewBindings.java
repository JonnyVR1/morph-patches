package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceFunctionSwitchViewBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48962a;

    /* JADX INFO: renamed from: b */
    public VoicePanelSwitchView f48963b;

    /* JADX INFO: renamed from: c */
    public VText f48964c;

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73222a(ViewGroup viewGroup) {
        this.f48963b = (VoicePanelSwitchView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48964c = vText;
        String str = vText == null ? "_switchFunction" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VoicePanelSwitchView getRoot() {
        return this.f48963b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48962a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199024b7, viewGroup, false);
        m73222a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73222a(this);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
