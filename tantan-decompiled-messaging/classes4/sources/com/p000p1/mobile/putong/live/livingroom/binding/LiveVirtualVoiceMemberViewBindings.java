package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceMemberViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4174a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceMembersView f4175b;

    /* JADX INFO: renamed from: c */
    public TouchSwallowView f4176c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f4177d;

    /* JADX INFO: renamed from: e */
    public VText f4178e;

    public LiveVirtualVoiceMemberViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5483C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5484a(ViewGroup viewGroup) {
        this.f4175b = (VirtualVoiceMembersView) viewGroup;
        TouchSwallowView childAt = viewGroup.getChildAt(0);
        this.f4176c = childAt;
        String str = childAt == null ? "_memberSwallowView" : null;
        VRecyclerView childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4177d = childAt2;
        if (childAt2 == null) {
            str = "_rv_member_list";
        }
        VText childAt3 = viewGroup.getChildAt(1);
        this.f4178e = childAt3;
        if (childAt3 == null) {
            str = "_member_count";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VirtualVoiceMembersView getRoot() {
        return this.f4175b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5485i1(T t) {
        this.f4174a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19853g7, viewGroup, false);
        m5484a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5484a(this);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceMemberViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
