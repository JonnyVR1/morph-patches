package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftUserInfoViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4002d;

    /* JADX INFO: renamed from: e */
    public GiftUserInfoView f4003e;

    /* JADX INFO: renamed from: f */
    public Group f4004f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f4005g;

    /* JADX INFO: renamed from: h */
    public VText f4006h;

    /* JADX INFO: renamed from: i */
    public ImageView f4007i;

    /* JADX INFO: renamed from: j */
    public View f4008j;

    /* JADX INFO: renamed from: k */
    public VText f4009k;

    /* JADX INFO: renamed from: l */
    public VText f4010l;

    public LiveGiftUserInfoViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5407C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public GiftUserInfoView getRoot() {
        return this.f4003e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public void m5408h0(ViewGroup viewGroup) {
        this.f4003e = (GiftUserInfoView) viewGroup;
        Group childAt = viewGroup.getChildAt(0);
        this.f4004f = childAt;
        String str = childAt == null ? "_sp_group" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f4005g = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_iv_head";
        }
        VText childAt2 = viewGroup.getChildAt(2);
        this.f4006h = childAt2;
        if (childAt2 == null) {
            str = "_live_tv_name";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(3);
        this.f4007i = imageView;
        if (imageView == null) {
            str = "_live_indicator";
        }
        View childAt3 = viewGroup.getChildAt(4);
        this.f4008j = childAt3;
        if (childAt3 == null) {
            str = "_user";
        }
        VText childAt4 = viewGroup.getChildAt(5);
        this.f4009k = childAt4;
        if (childAt4 == null) {
            str = "_tv_user_info";
        }
        VText childAt5 = viewGroup.getChildAt(6);
        this.f4010l = childAt5;
        if (childAt5 == null) {
            str = "_tv_contribute";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5409i1(T t) {
        this.f4002d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19505E1, viewGroup, false);
        m5408h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5408h0(this);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
