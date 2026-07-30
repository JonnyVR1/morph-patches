package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoicePanelUnknownViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48141a;

    /* JADX INFO: renamed from: b */
    public PanelUnknownView f48142b;

    /* JADX INFO: renamed from: c */
    public VLinear f48143c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48144d;

    /* JADX INFO: renamed from: e */
    public VText f48145e;

    /* JADX INFO: renamed from: f */
    public VFrame f48146f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f48147g;

    public LiveVirtualVoicePanelUnknownViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72044a(ViewGroup viewGroup) {
        this.f48142b = (PanelUnknownView) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f48143c = vLinear;
        String str = vLinear == null ? "_ll_title" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48144d = vDraweeView;
        if (vDraweeView == null) {
            str = "_ll_title_icon";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48145e = vText;
        if (vText == null) {
            str = "_ll_title_content";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(1);
        this.f48146f = vFrame;
        if (vFrame == null) {
            str = "_expand_view";
        }
        RecyclerView recyclerView = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48147g = recyclerView;
        if (recyclerView == null) {
            str = "_recyclerview";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public PanelUnknownView getRoot() {
        return this.f48142b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48141a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168383i7, viewGroup, false);
        m72044a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72044a(this);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
