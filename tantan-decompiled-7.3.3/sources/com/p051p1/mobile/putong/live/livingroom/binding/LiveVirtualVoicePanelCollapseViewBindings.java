package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p151v.VDraweeView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoicePanelCollapseViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48985a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualVoicePanelCollapseView f48986b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48987c;

    /* JADX INFO: renamed from: d */
    public HorizontalMarqueeView f48988d;

    public LiveVirtualVoicePanelCollapseViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73226a(ViewGroup viewGroup) {
        this.f48986b = (LiveVirtualVoicePanelCollapseView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48987c = vDraweeView;
        String str = vDraweeView == null ? "_icon" : null;
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f48988d = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveVirtualVoicePanelCollapseView getRoot() {
        return this.f48986b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48985a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199102h7, viewGroup, false);
        m73226a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73226a(this);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
