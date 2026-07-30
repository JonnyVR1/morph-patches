package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy.VirtualWebPanelView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualSpyPanelViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4127d;

    /* JADX INFO: renamed from: e */
    public VirtualWebPanelView f4128e;

    /* JADX INFO: renamed from: f */
    public LiveVirtualVoicePanelCollapseView f4129f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f4130g;

    public LiveVirtualSpyPanelViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5458C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public VirtualWebPanelView getRoot() {
        return this.f4128e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5459h0(ViewGroup viewGroup) {
        this.f4128e = (VirtualWebPanelView) viewGroup;
        LiveVirtualVoicePanelCollapseView childAt = viewGroup.getChildAt(0);
        this.f4129f = childAt;
        String str = childAt == null ? "_collapse_view" : null;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(1);
        this.f4130g = frameLayout;
        if (frameLayout == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5460i1(T t) {
        this.f4127d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19690T6, viewGroup, false);
        m5459h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5459h0(this);
    }

    public LiveVirtualSpyPanelViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualSpyPanelViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
