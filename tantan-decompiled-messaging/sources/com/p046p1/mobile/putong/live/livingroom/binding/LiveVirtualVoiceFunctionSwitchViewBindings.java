package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceFunctionSwitchViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48114a;

    /* JADX INFO: renamed from: b */
    public VoicePanelSwitchView f48115b;

    /* JADX INFO: renamed from: c */
    public VText f48116c;

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72039a(ViewGroup viewGroup) {
        this.f48115b = (VoicePanelSwitchView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48116c = vText;
        String str = vText == null ? "_switchFunction" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VoicePanelSwitchView getRoot() {
        return this.f48115b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48114a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168292b7, viewGroup, false);
        m72039a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72039a(this);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionSwitchViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
