package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceMemberViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48132a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceMembersView f48133b;

    /* JADX INFO: renamed from: c */
    public TouchSwallowView f48134c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f48135d;

    /* JADX INFO: renamed from: e */
    public VText f48136e;

    public LiveVirtualVoiceMemberViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72042a(ViewGroup viewGroup) {
        this.f48133b = (VirtualVoiceMembersView) viewGroup;
        TouchSwallowView touchSwallowView = (TouchSwallowView) viewGroup.getChildAt(0);
        this.f48134c = touchSwallowView;
        String str = touchSwallowView == null ? "_memberSwallowView" : null;
        VRecyclerView vRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48135d = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_rv_member_list";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48136e = vText;
        if (vText == null) {
            str = "_member_count";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VirtualVoiceMembersView getRoot() {
        return this.f48133b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48132a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168357g7, viewGroup, false);
        m72042a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72042a(this);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
