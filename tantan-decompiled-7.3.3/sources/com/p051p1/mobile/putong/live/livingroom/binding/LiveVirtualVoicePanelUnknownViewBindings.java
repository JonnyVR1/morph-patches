package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoicePanelUnknownViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48989a;

    /* JADX INFO: renamed from: b */
    public PanelUnknownView f48990b;

    /* JADX INFO: renamed from: c */
    public VLinear f48991c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48992d;

    /* JADX INFO: renamed from: e */
    public VText f48993e;

    /* JADX INFO: renamed from: f */
    public VFrame f48994f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f48995g;

    public LiveVirtualVoicePanelUnknownViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73227a(ViewGroup viewGroup) {
        this.f48990b = (PanelUnknownView) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f48991c = vLinear;
        String str = vLinear == null ? "_ll_title" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48992d = vDraweeView;
        if (vDraweeView == null) {
            str = "_ll_title_icon";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48993e = vText;
        if (vText == null) {
            str = "_ll_title_content";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(1);
        this.f48994f = vFrame;
        if (vFrame == null) {
            str = "_expand_view";
        }
        RecyclerView recyclerView = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48995g = recyclerView;
        if (recyclerView == null) {
            str = "_recyclerview";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public PanelUnknownView getRoot() {
        return this.f48990b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48989a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199115i7, viewGroup, false);
        m73227a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73227a(this);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
