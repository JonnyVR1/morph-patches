package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import p151v.VImage;
import p151v.VLinear;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallInviteViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48841d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteView f48842e;

    /* JADX INFO: renamed from: f */
    public VLinear f48843f;

    /* JADX INFO: renamed from: g */
    public View f48844g;

    /* JADX INFO: renamed from: h */
    public MultiCallRollAnimView f48845h;

    /* JADX INFO: renamed from: i */
    public VImage f48846i;

    /* JADX INFO: renamed from: j */
    public TabLayout f48847j;

    /* JADX INFO: renamed from: k */
    public ViewPager2 f48848k;

    public LiveMultiCallInviteViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public MultiCallInviteView getRoot() {
        return this.f48842e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73202h0(ViewGroup viewGroup) {
        this.f48842e = (MultiCallInviteView) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f48843f = vLinear;
        String str = vLinear == null ? "_container" : null;
        View childAt = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        this.f48844g = childAt;
        if (childAt == null) {
            str = "_invite_friend_bg";
        }
        MultiCallRollAnimView multiCallRollAnimView = (MultiCallRollAnimView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f48845h = multiCallRollAnimView;
        if (multiCallRollAnimView == null) {
            str = "_roll_view";
        }
        VImage vImage = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        this.f48846i = vImage;
        if (vImage == null) {
            str = "_entrance_arrow";
        }
        TabLayout tabLayout = (TabLayout) viewGroup.getChildAt(1);
        this.f48847j = tabLayout;
        if (tabLayout == null) {
            str = "_tab";
        }
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(mdc0.f135897B4);
        this.f48848k = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48841d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199164m4, viewGroup, false);
        m73202h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73202h0(this);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
