package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoicePanelCollapseViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4179a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualVoicePanelCollapseView f4180b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4181c;

    /* JADX INFO: renamed from: d */
    public HorizontalMarqueeView f4182d;

    public LiveVirtualVoicePanelCollapseViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5486C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5487a(ViewGroup viewGroup) {
        this.f4180b = (LiveVirtualVoicePanelCollapseView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4181c = childAt;
        String str = childAt == null ? "_icon" : null;
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f4182d = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public LiveVirtualVoicePanelCollapseView getRoot() {
        return this.f4180b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5488i1(T t) {
        this.f4179a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19866h7, viewGroup, false);
        m5487a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5487a(this);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelCollapseViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
