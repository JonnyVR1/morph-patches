package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import p147v.VRecyclerView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceUserCardMiddleViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48185a;

    /* JADX INFO: renamed from: b */
    public VoiceVirtualUserCardMiddleView f48186b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f48187c;

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72050a(ViewGroup viewGroup) {
        this.f48186b = (VoiceVirtualUserCardMiddleView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f48187c = vRecyclerView;
        String str = vRecyclerView == null ? "_entrance" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VoiceVirtualUserCardMiddleView getRoot() {
        return this.f48186b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48185a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168461o7, viewGroup, false);
        m72050a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72050a(this);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
