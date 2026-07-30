package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceMemberViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48980a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceMembersView f48981b;

    /* JADX INFO: renamed from: c */
    public TouchSwallowView f48982c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f48983d;

    /* JADX INFO: renamed from: e */
    public VText f48984e;

    public LiveVirtualVoiceMemberViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73225a(ViewGroup viewGroup) {
        this.f48981b = (VirtualVoiceMembersView) viewGroup;
        TouchSwallowView touchSwallowView = (TouchSwallowView) viewGroup.getChildAt(0);
        this.f48982c = touchSwallowView;
        String str = touchSwallowView == null ? "_memberSwallowView" : null;
        VRecyclerView vRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48983d = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_rv_member_list";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48984e = vText;
        if (vText == null) {
            str = "_member_count";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VirtualVoiceMembersView getRoot() {
        return this.f48981b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48980a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199089g7, viewGroup, false);
        m73225a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73225a(this);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
