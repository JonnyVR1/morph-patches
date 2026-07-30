package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import p147v.VImage;
import p147v.VLinear;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceFunctionPanelViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48108d;

    /* JADX INFO: renamed from: e */
    public LiveVirtualVoiceFunctionPanelView f48109e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f48110f;

    /* JADX INFO: renamed from: g */
    public VLinear f48111g;

    /* JADX INFO: renamed from: h */
    public VoicePanelSwitchView f48112h;

    /* JADX INFO: renamed from: i */
    public VImage f48113i;

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context) {
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

    public LiveVirtualVoiceFunctionPanelView getRoot() {
        return this.f48109e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72038h0(ViewGroup viewGroup) {
        this.f48109e = (LiveVirtualVoiceFunctionPanelView) viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        this.f48110f = frameLayout;
        String str = frameLayout == null ? "_container" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f48111g = vLinear;
        if (vLinear == null) {
            str = "_panel_tool_bar";
        }
        VoicePanelSwitchView voicePanelSwitchView = (VoicePanelSwitchView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48112h = voicePanelSwitchView;
        if (voicePanelSwitchView == null) {
            str = "_panel_tool_bar_switch_view";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48113i = vImage;
        if (vImage == null) {
            str = "_collapse";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48108d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168279a7, viewGroup, false);
        m72038h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72038h0(this);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
