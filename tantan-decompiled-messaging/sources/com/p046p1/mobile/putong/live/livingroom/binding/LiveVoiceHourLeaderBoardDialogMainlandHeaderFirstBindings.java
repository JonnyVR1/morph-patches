package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardFirstView f48359d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48360e;

    /* JADX INFO: renamed from: f */
    public VImage f48361f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f48362g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f48363h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f48364i;

    /* JADX INFO: renamed from: j */
    public VImage f48365j;

    /* JADX INFO: renamed from: k */
    public View f48366k;

    /* JADX INFO: renamed from: l */
    public LivingNewTagView f48367l;

    /* JADX INFO: renamed from: m */
    public VText f48368m;

    /* JADX INFO: renamed from: n */
    public VText f48369n;

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardFirstView getRoot() {
        return this.f48359d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72071h0(ViewGroup viewGroup) {
        this.f48359d = (VoiceHourBoardFirstView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48360e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f48361f = vImage;
        if (vImage == null) {
            str = "_bg";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(2);
        this.f48362g = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        this.f48363h = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(4);
        this.f48364i = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_mvp";
        }
        VImage vImage2 = (VImage) viewGroup.getChildAt(5);
        this.f48365j = vImage2;
        if (vImage2 == null) {
            str = "_crown";
        }
        View childAt = viewGroup.getChildAt(6);
        this.f48366k = childAt;
        if (childAt == null) {
            str = "_avatar_bottom";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(7);
        this.f48367l = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_living";
        }
        VText vText = (VText) viewGroup.getChildAt(8);
        this.f48368m = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(9);
        this.f48369n = vText2;
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
        m72071h0(this);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
