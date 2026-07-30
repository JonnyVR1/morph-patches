package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceFunctionPanelViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4150d;

    /* JADX INFO: renamed from: e */
    public LiveVirtualVoiceFunctionPanelView f4151e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f4152f;

    /* JADX INFO: renamed from: g */
    public VLinear f4153g;

    /* JADX INFO: renamed from: h */
    public VoicePanelSwitchView f4154h;

    /* JADX INFO: renamed from: i */
    public VImage f4155i;

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5473C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public LiveVirtualVoiceFunctionPanelView getRoot() {
        return this.f4151e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5474h0(ViewGroup viewGroup) {
        this.f4151e = (LiveVirtualVoiceFunctionPanelView) viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.getChildAt(0);
        this.f4152f = frameLayout;
        String str = frameLayout == null ? "_container" : null;
        VLinear childAt = viewGroup.getChildAt(1);
        this.f4153g = childAt;
        if (childAt == null) {
            str = "_panel_tool_bar";
        }
        VoicePanelSwitchView childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4154h = childAt2;
        if (childAt2 == null) {
            str = "_panel_tool_bar_switch_view";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f4155i = childAt3;
        if (childAt3 == null) {
            str = "_collapse";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5475i1(T t) {
        this.f4150d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19775a7, viewGroup, false);
        m5474h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5474h0(this);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceFunctionPanelViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
