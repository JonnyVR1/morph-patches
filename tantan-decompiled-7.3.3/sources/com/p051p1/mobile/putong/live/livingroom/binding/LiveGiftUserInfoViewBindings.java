package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftUserInfoViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48808d;

    /* JADX INFO: renamed from: e */
    public GiftUserInfoView f48809e;

    /* JADX INFO: renamed from: f */
    public Group f48810f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f48811g;

    /* JADX INFO: renamed from: h */
    public VText f48812h;

    /* JADX INFO: renamed from: i */
    public ImageView f48813i;

    /* JADX INFO: renamed from: j */
    public View f48814j;

    /* JADX INFO: renamed from: k */
    public VText f48815k;

    /* JADX INFO: renamed from: l */
    public VText f48816l;

    public LiveGiftUserInfoViewBindings(Context context) {
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

    public GiftUserInfoView getRoot() {
        return this.f48809e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73195h0(ViewGroup viewGroup) {
        this.f48809e = (GiftUserInfoView) viewGroup;
        Group group = (Group) viewGroup.getChildAt(0);
        this.f48810f = group;
        String str = group == null ? "_sp_group" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f48811g = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_iv_head";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48812h = vText;
        if (vText == null) {
            str = "_live_tv_name";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(3);
        this.f48813i = imageView;
        if (imageView == null) {
            str = "_live_indicator";
        }
        View childAt = viewGroup.getChildAt(4);
        this.f48814j = childAt;
        if (childAt == null) {
            str = "_user";
        }
        VText vText2 = (VText) viewGroup.getChildAt(5);
        this.f48815k = vText2;
        if (vText2 == null) {
            str = "_tv_user_info";
        }
        VText vText3 = (VText) viewGroup.getChildAt(6);
        this.f48816l = vText3;
        if (vText3 == null) {
            str = "_tv_contribute";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48808d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198741E1, viewGroup, false);
        m73195h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73195h0(this);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
