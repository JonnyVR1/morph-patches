package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceMemberItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMemberItemView f48969d;

    /* JADX INFO: renamed from: e */
    public View f48970e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f48971f;

    /* JADX INFO: renamed from: g */
    public ImageView f48972g;

    /* JADX INFO: renamed from: h */
    public VFrame f48973h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f48974i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f48975j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f48976k;

    /* JADX INFO: renamed from: l */
    public VText f48977l;

    /* JADX INFO: renamed from: m */
    public View f48978m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f48979n;

    public LiveVirtualVoiceMemberItemViewBindings(Context context) {
        super(context);
    }

    public VirtualVoiceMemberItemView getRoot() {
        return this.f48969d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73224h0(ViewGroup viewGroup) {
        this.f48969d = (VirtualVoiceMemberItemView) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f48970e = childAt;
        String str = childAt == null ? "_background" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f48971f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(2);
        this.f48972g = imageView;
        if (imageView == null) {
            str = "_state";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(3);
        this.f48973h = vFrame;
        if (vFrame == null) {
            str = "_state_container";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f48974i = vDraweeView;
        if (vDraweeView == null) {
            str = "_state_background";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        this.f48975j = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_mute_icon";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        this.f48976k = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_volume_svg";
        }
        VText vText = (VText) viewGroup.getChildAt(4);
        this.f48977l = vText;
        if (vText == null) {
            str = "_index";
        }
        View childAt2 = viewGroup.getChildAt(5);
        this.f48978m = childAt2;
        if (childAt2 == null) {
            str = "_place_line";
        }
        AnimEffectPlayer animEffectPlayer2 = (AnimEffectPlayer) viewGroup.getChildAt(6);
        this.f48979n = animEffectPlayer2;
        if (animEffectPlayer2 == null) {
            str = "_svga_cp";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73224h0(this);
    }

    public LiveVirtualVoiceMemberItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceMemberItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
