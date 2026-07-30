package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p147v.VDraweeView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoicePanelCollapseViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48137a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualVoicePanelCollapseView f48138b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48139c;

    /* JADX INFO: renamed from: d */
    public HorizontalMarqueeView f48140d;

    public LiveVirtualVoicePanelCollapseViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72043a(ViewGroup viewGroup) {
        this.f48138b = (LiveVirtualVoicePanelCollapseView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48139c = vDraweeView;
        String str = vDraweeView == null ? "_icon" : null;
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f48140d = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveVirtualVoicePanelCollapseView getRoot() {
        return this.f48138b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48137a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168370h7, viewGroup, false);
        m72043a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72043a(this);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
