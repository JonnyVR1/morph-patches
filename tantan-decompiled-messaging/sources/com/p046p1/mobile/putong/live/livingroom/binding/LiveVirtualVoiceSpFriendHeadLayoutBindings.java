package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp.VirtualVoiceSpFriendHeadView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp.VirtualVoiceSpFriendItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceSpFriendHeadLayoutBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48148a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceSpFriendHeadView f48149b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48150c;

    /* JADX INFO: renamed from: d */
    public TextView f48151d;

    /* JADX INFO: renamed from: e */
    public VLinear f48152e;

    /* JADX INFO: renamed from: f */
    public VirtualVoiceSpFriendItemView f48153f;

    /* JADX INFO: renamed from: g */
    public VirtualVoiceSpFriendItemView f48154g;

    /* JADX INFO: renamed from: h */
    public VirtualVoiceSpFriendItemView f48155h;

    /* JADX INFO: renamed from: i */
    public VirtualVoiceSpFriendItemView f48156i;

    /* JADX INFO: renamed from: j */
    public VImage f48157j;

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72045a(ViewGroup viewGroup) {
        this.f48149b = (VirtualVoiceSpFriendHeadView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48150c = vDraweeView;
        String str = vDraweeView == null ? "_background" : null;
        TextView textView = (TextView) viewGroup.getChildAt(1);
        this.f48151d = textView;
        if (textView == null) {
            str = "_title";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(2);
        this.f48152e = vLinear;
        if (vLinear == null) {
            str = "_linear_list";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f48153f = virtualVoiceSpFriendItemView;
        if (virtualVoiceSpFriendItemView == null) {
            str = "_linear_list_item1";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView2 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f48154g = virtualVoiceSpFriendItemView2;
        if (virtualVoiceSpFriendItemView2 == null) {
            str = "_linear_list_item2";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView3 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f48155h = virtualVoiceSpFriendItemView3;
        if (virtualVoiceSpFriendItemView3 == null) {
            str = "_linear_list_item3";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView4 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f48156i = virtualVoiceSpFriendItemView4;
        if (virtualVoiceSpFriendItemView4 == null) {
            str = "_linear_list_item4";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(3);
        this.f48157j = vImage;
        if (vImage == null) {
            str = "_more_bt";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VirtualVoiceSpFriendHeadView getRoot() {
        return this.f48149b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48148a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168396j7, viewGroup, false);
        m72045a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72045a(this);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
