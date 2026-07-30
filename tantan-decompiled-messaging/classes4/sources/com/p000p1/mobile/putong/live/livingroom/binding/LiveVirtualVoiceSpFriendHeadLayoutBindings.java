package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.cp.VirtualVoiceSpFriendHeadView;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.cp.VirtualVoiceSpFriendItemView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceSpFriendHeadLayoutBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4190a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceSpFriendHeadView f4191b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4192c;

    /* JADX INFO: renamed from: d */
    public TextView f4193d;

    /* JADX INFO: renamed from: e */
    public VLinear f4194e;

    /* JADX INFO: renamed from: f */
    public VirtualVoiceSpFriendItemView f4195f;

    /* JADX INFO: renamed from: g */
    public VirtualVoiceSpFriendItemView f4196g;

    /* JADX INFO: renamed from: h */
    public VirtualVoiceSpFriendItemView f4197h;

    /* JADX INFO: renamed from: i */
    public VirtualVoiceSpFriendItemView f4198i;

    /* JADX INFO: renamed from: j */
    public VImage f4199j;

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5492C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5493a(ViewGroup viewGroup) {
        this.f4191b = (VirtualVoiceSpFriendHeadView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4192c = childAt;
        String str = childAt == null ? "_background" : null;
        TextView textView = (TextView) viewGroup.getChildAt(1);
        this.f4193d = textView;
        if (textView == null) {
            str = "_title";
        }
        VLinear childAt2 = viewGroup.getChildAt(2);
        this.f4194e = childAt2;
        if (childAt2 == null) {
            str = "_linear_list";
        }
        VirtualVoiceSpFriendItemView childAt3 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f4195f = childAt3;
        if (childAt3 == null) {
            str = "_linear_list_item1";
        }
        VirtualVoiceSpFriendItemView childAt4 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f4196g = childAt4;
        if (childAt4 == null) {
            str = "_linear_list_item2";
        }
        VirtualVoiceSpFriendItemView childAt5 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f4197h = childAt5;
        if (childAt5 == null) {
            str = "_linear_list_item3";
        }
        VirtualVoiceSpFriendItemView childAt6 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f4198i = childAt6;
        if (childAt6 == null) {
            str = "_linear_list_item4";
        }
        VImage childAt7 = viewGroup.getChildAt(3);
        this.f4199j = childAt7;
        if (childAt7 == null) {
            str = "_more_bt";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VirtualVoiceSpFriendHeadView getRoot() {
        return this.f4191b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5494i1(T t) {
        this.f4190a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19892j7, viewGroup, false);
        m5493a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5493a(this);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
