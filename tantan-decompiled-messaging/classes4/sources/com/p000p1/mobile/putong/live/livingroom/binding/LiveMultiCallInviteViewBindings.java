package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallInviteViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4035d;

    /* JADX INFO: renamed from: e */
    public MultiCallInviteView f4036e;

    /* JADX INFO: renamed from: f */
    public VLinear f4037f;

    /* JADX INFO: renamed from: g */
    public View f4038g;

    /* JADX INFO: renamed from: h */
    public MultiCallRollAnimView f4039h;

    /* JADX INFO: renamed from: i */
    public VImage f4040i;

    /* JADX INFO: renamed from: j */
    public TabLayout f4041j;

    /* JADX INFO: renamed from: k */
    public ViewPager2 f4042k;

    public LiveMultiCallInviteViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5422C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallInviteView getRoot() {
        return this.f4036e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5423h0(ViewGroup viewGroup) {
        this.f4036e = (MultiCallInviteView) viewGroup;
        VLinear childAt = viewGroup.getChildAt(0);
        this.f4037f = childAt;
        String str = childAt == null ? "_container" : null;
        View childAt2 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        this.f4038g = childAt2;
        if (childAt2 == null) {
            str = "_invite_friend_bg";
        }
        MultiCallRollAnimView childAt3 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f4039h = childAt3;
        if (childAt3 == null) {
            str = "_roll_view";
        }
        VImage childAt4 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        this.f4040i = childAt4;
        if (childAt4 == null) {
            str = "_entrance_arrow";
        }
        TabLayout childAt5 = viewGroup.getChildAt(1);
        this.f4041j = childAt5;
        if (childAt5 == null) {
            str = "_tab";
        }
        ViewPager2 viewPager2FindViewById = viewGroup.findViewById(g5c0.f10802B4);
        this.f4042k = viewPager2FindViewById;
        if (viewPager2FindViewById == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5424i1(T t) {
        this.f4035d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19928m4, viewGroup, false);
        m5423h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5423h0(this);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallInviteViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
