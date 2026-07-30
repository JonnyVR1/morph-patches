package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp.VirtualVoiceSpFriendHeadView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp.VirtualVoiceSpFriendItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceSpFriendHeadLayoutBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48996a;

    /* JADX INFO: renamed from: b */
    public VirtualVoiceSpFriendHeadView f48997b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48998c;

    /* JADX INFO: renamed from: d */
    public TextView f48999d;

    /* JADX INFO: renamed from: e */
    public VLinear f49000e;

    /* JADX INFO: renamed from: f */
    public VirtualVoiceSpFriendItemView f49001f;

    /* JADX INFO: renamed from: g */
    public VirtualVoiceSpFriendItemView f49002g;

    /* JADX INFO: renamed from: h */
    public VirtualVoiceSpFriendItemView f49003h;

    /* JADX INFO: renamed from: i */
    public VirtualVoiceSpFriendItemView f49004i;

    /* JADX INFO: renamed from: j */
    public VImage f49005j;

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73228a(ViewGroup viewGroup) {
        this.f48997b = (VirtualVoiceSpFriendHeadView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48998c = vDraweeView;
        String str = vDraweeView == null ? "_background" : null;
        TextView textView = (TextView) viewGroup.getChildAt(1);
        this.f48999d = textView;
        if (textView == null) {
            str = "_title";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(2);
        this.f49000e = vLinear;
        if (vLinear == null) {
            str = "_linear_list";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f49001f = virtualVoiceSpFriendItemView;
        if (virtualVoiceSpFriendItemView == null) {
            str = "_linear_list_item1";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView2 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f49002g = virtualVoiceSpFriendItemView2;
        if (virtualVoiceSpFriendItemView2 == null) {
            str = "_linear_list_item2";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView3 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f49003h = virtualVoiceSpFriendItemView3;
        if (virtualVoiceSpFriendItemView3 == null) {
            str = "_linear_list_item3";
        }
        VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView4 = (VirtualVoiceSpFriendItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f49004i = virtualVoiceSpFriendItemView4;
        if (virtualVoiceSpFriendItemView4 == null) {
            str = "_linear_list_item4";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(3);
        this.f49005j = vImage;
        if (vImage == null) {
            str = "_more_bt";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VirtualVoiceSpFriendHeadView getRoot() {
        return this.f48997b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48996a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199128j7, viewGroup, false);
        m73228a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73228a(this);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceSpFriendHeadLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
