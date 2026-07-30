package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import p151v.VRecyclerView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceUserCardMiddleViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49033a;

    /* JADX INFO: renamed from: b */
    public VoiceVirtualUserCardMiddleView f49034b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f49035c;

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73233a(ViewGroup viewGroup) {
        this.f49034b = (VoiceVirtualUserCardMiddleView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f49035c = vRecyclerView;
        String str = vRecyclerView == null ? "_entrance" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VoiceVirtualUserCardMiddleView getRoot() {
        return this.f49034b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49033a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199193o7, viewGroup, false);
        m73233a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73233a(this);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
