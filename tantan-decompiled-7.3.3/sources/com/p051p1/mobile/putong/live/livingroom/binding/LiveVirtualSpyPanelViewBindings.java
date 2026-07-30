package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy.VirtualWebPanelView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualSpyPanelViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48933d;

    /* JADX INFO: renamed from: e */
    public VirtualWebPanelView f48934e;

    /* JADX INFO: renamed from: f */
    public LiveVirtualVoicePanelCollapseView f48935f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f48936g;

    public LiveVirtualSpyPanelViewBindings(Context context) {
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

    public VirtualWebPanelView getRoot() {
        return this.f48934e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73216h0(ViewGroup viewGroup) {
        this.f48934e = (VirtualWebPanelView) viewGroup;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(0);
        this.f48935f = liveVirtualVoicePanelCollapseView;
        String str = liveVirtualVoicePanelCollapseView == null ? "_collapse_view" : null;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(1);
        this.f48936g = frameLayout;
        if (frameLayout == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48933d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198926T6, viewGroup, false);
        m73216h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73216h0(this);
    }

    public LiveVirtualSpyPanelViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualSpyPanelViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
