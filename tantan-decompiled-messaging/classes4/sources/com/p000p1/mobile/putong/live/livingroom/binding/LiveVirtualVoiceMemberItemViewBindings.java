package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import l.jfd0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceMemberItemViewBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMemberItemView f4163d;

    /* JADX INFO: renamed from: e */
    public View f4164e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f4165f;

    /* JADX INFO: renamed from: g */
    public ImageView f4166g;

    /* JADX INFO: renamed from: h */
    public VFrame f4167h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4168i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f4169j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f4170k;

    /* JADX INFO: renamed from: l */
    public VText f4171l;

    /* JADX INFO: renamed from: m */
    public View f4172m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f4173n;

    public LiveVirtualVoiceMemberItemViewBindings(Context context) {
        super(context);
    }

    public VirtualVoiceMemberItemView getRoot() {
        return this.f4163d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5482h0(ViewGroup viewGroup) {
        this.f4163d = (VirtualVoiceMemberItemView) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f4164e = childAt;
        String str = childAt == null ? "_background" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f4165f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        ImageView imageView = (ImageView) viewGroup.getChildAt(2);
        this.f4166g = imageView;
        if (imageView == null) {
            str = "_state";
        }
        VFrame childAt2 = viewGroup.getChildAt(3);
        this.f4167h = childAt2;
        if (childAt2 == null) {
            str = "_state_container";
        }
        VDraweeView childAt3 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f4168i = childAt3;
        if (childAt3 == null) {
            str = "_state_background";
        }
        VDraweeView childAt4 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        this.f4169j = childAt4;
        if (childAt4 == null) {
            str = "_mute_icon";
        }
        AnimEffectPlayer childAt5 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        this.f4170k = childAt5;
        if (childAt5 == null) {
            str = "_volume_svg";
        }
        VText childAt6 = viewGroup.getChildAt(4);
        this.f4171l = childAt6;
        if (childAt6 == null) {
            str = "_index";
        }
        View childAt7 = viewGroup.getChildAt(5);
        this.f4172m = childAt7;
        if (childAt7 == null) {
            str = "_place_line";
        }
        AnimEffectPlayer childAt8 = viewGroup.getChildAt(6);
        this.f4173n = childAt8;
        if (childAt8 == null) {
            str = "_svga_cp";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5482h0(this);
    }

    public LiveVirtualVoiceMemberItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceMemberItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
