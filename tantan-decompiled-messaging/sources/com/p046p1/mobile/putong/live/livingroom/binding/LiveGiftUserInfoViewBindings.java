package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftUserInfoViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f47960d;

    /* JADX INFO: renamed from: e */
    public GiftUserInfoView f47961e;

    /* JADX INFO: renamed from: f */
    public Group f47962f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f47963g;

    /* JADX INFO: renamed from: h */
    public VText f47964h;

    /* JADX INFO: renamed from: i */
    public ImageView f47965i;

    /* JADX INFO: renamed from: j */
    public View f47966j;

    /* JADX INFO: renamed from: k */
    public VText f47967k;

    /* JADX INFO: renamed from: l */
    public VText f47968l;

    public LiveGiftUserInfoViewBindings(Context context) {
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

    public GiftUserInfoView getRoot() {
        return this.f47961e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72012h0(ViewGroup viewGroup) {
        this.f47961e = (GiftUserInfoView) viewGroup;
        Group group = (Group) viewGroup.getChildAt(0);
        this.f47962f = group;
        String str = group == null ? "_sp_group" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f47963g = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_iv_head";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f47964h = vText;
        if (vText == null) {
            str = "_live_tv_name";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(3);
        this.f47965i = imageView;
        if (imageView == null) {
            str = "_live_indicator";
        }
        View childAt = viewGroup.getChildAt(4);
        this.f47966j = childAt;
        if (childAt == null) {
            str = "_user";
        }
        VText vText2 = (VText) viewGroup.getChildAt(5);
        this.f47967k = vText2;
        if (vText2 == null) {
            str = "_tv_user_info";
        }
        VText vText3 = (VText) viewGroup.getChildAt(6);
        this.f47968l = vText3;
        if (vText3 == null) {
            str = "_tv_contribute";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f47960d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168009E1, viewGroup, false);
        m72012h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72012h0(this);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftUserInfoViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
