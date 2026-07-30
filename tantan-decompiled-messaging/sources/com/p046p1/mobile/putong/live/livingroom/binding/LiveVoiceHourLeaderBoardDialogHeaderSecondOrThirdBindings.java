package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardSecondOrThirdView f48348d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48349e;

    /* JADX INFO: renamed from: f */
    public VImage f48350f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f48351g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f48352h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f48353i;

    /* JADX INFO: renamed from: j */
    public VImage f48354j;

    /* JADX INFO: renamed from: k */
    public View f48355k;

    /* JADX INFO: renamed from: l */
    public LivingNewTagView f48356l;

    /* JADX INFO: renamed from: m */
    public VText f48357m;

    /* JADX INFO: renamed from: n */
    public VText f48358n;

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardSecondOrThirdView getRoot() {
        return this.f48348d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72070h0(ViewGroup viewGroup) {
        this.f48348d = (VoiceHourBoardSecondOrThirdView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48349e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f48350f = vImage;
        if (vImage == null) {
            str = "_bg";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(2);
        this.f48351g = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        this.f48352h = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(4);
        this.f48353i = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_mvp";
        }
        VImage vImage2 = (VImage) viewGroup.getChildAt(5);
        this.f48354j = vImage2;
        if (vImage2 == null) {
            str = "_crown";
        }
        View childAt = viewGroup.getChildAt(6);
        this.f48355k = childAt;
        if (childAt == null) {
            str = "_avatar_bottom";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(7);
        this.f48356l = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_living";
        }
        VText vText = (VText) viewGroup.getChildAt(8);
        this.f48357m = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(9);
        this.f48358n = vText2;
        if (vText2 == null) {
            str = "_heart";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72070h0(this);
    }

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
