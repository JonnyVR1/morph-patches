package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import p147v.VImage;
import p147v.VLinear;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallInviteViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f47993d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteView f47994e;

    /* JADX INFO: renamed from: f */
    public VLinear f47995f;

    /* JADX INFO: renamed from: g */
    public View f47996g;

    /* JADX INFO: renamed from: h */
    public MultiCallRollAnimView f47997h;

    /* JADX INFO: renamed from: i */
    public VImage f47998i;

    /* JADX INFO: renamed from: j */
    public TabLayout f47999j;

    /* JADX INFO: renamed from: k */
    public ViewPager2 f48000k;

    public LiveMultiCallInviteViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public MultiCallInviteView getRoot() {
        return this.f47994e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72019h0(ViewGroup viewGroup) {
        this.f47994e = (MultiCallInviteView) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f47995f = vLinear;
        String str = vLinear == null ? "_container" : null;
        View childAt = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        this.f47996g = childAt;
        if (childAt == null) {
            str = "_invite_friend_bg";
        }
        MultiCallRollAnimView multiCallRollAnimView = (MultiCallRollAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f47997h = multiCallRollAnimView;
        if (multiCallRollAnimView == null) {
            str = "_roll_view";
        }
        VImage vImage = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        this.f47998i = vImage;
        if (vImage == null) {
            str = "_entrance_arrow";
        }
        TabLayout tabLayout = (TabLayout) viewGroup.getChildAt(1);
        this.f47999j = tabLayout;
        if (tabLayout == null) {
            str = "_tab";
        }
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(g5c0.f100652B4);
        this.f48000k = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f47993d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168432m4, viewGroup, false);
        m72019h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72019h0(this);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
