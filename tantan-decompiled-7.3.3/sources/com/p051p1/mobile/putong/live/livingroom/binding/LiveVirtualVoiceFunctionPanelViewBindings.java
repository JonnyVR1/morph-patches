package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import p151v.VImage;
import p151v.VLinear;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceFunctionPanelViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48956d;

    /* JADX INFO: renamed from: e */
    public LiveVirtualVoiceFunctionPanelView f48957e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f48958f;

    /* JADX INFO: renamed from: g */
    public VLinear f48959g;

    /* JADX INFO: renamed from: h */
    public VoicePanelSwitchView f48960h;

    /* JADX INFO: renamed from: i */
    public VImage f48961i;

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context) {
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

    public LiveVirtualVoiceFunctionPanelView getRoot() {
        return this.f48957e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73221h0(ViewGroup viewGroup) {
        this.f48957e = (LiveVirtualVoiceFunctionPanelView) viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        this.f48958f = frameLayout;
        String str = frameLayout == null ? "_container" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f48959g = vLinear;
        if (vLinear == null) {
            str = "_panel_tool_bar";
        }
        VoicePanelSwitchView voicePanelSwitchView = (VoicePanelSwitchView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48960h = voicePanelSwitchView;
        if (voicePanelSwitchView == null) {
            str = "_panel_tool_bar_switch_view";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48961i = vImage;
        if (vImage == null) {
            str = "_collapse";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48956d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199011a7, viewGroup, false);
        m73221h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73221h0(this);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
