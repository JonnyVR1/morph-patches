package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardSecondOrThirdView f49196d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49197e;

    /* JADX INFO: renamed from: f */
    public VImage f49198f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f49199g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f49200h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49201i;

    /* JADX INFO: renamed from: j */
    public VImage f49202j;

    /* JADX INFO: renamed from: k */
    public View f49203k;

    /* JADX INFO: renamed from: l */
    public LivingNewTagView f49204l;

    /* JADX INFO: renamed from: m */
    public VText f49205m;

    /* JADX INFO: renamed from: n */
    public VText f49206n;

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardSecondOrThirdView getRoot() {
        return this.f49196d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73253h0(ViewGroup viewGroup) {
        this.f49196d = (VoiceHourBoardSecondOrThirdView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49197e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f49198f = vImage;
        if (vImage == null) {
            str = "_bg";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(2);
        this.f49199g = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        this.f49200h = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(4);
        this.f49201i = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_mvp";
        }
        VImage vImage2 = (VImage) viewGroup.getChildAt(5);
        this.f49202j = vImage2;
        if (vImage2 == null) {
            str = "_crown";
        }
        View childAt = viewGroup.getChildAt(6);
        this.f49203k = childAt;
        if (childAt == null) {
            str = "_avatar_bottom";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(7);
        this.f49204l = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_living";
        }
        VText vText = (VText) viewGroup.getChildAt(8);
        this.f49205m = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(9);
        this.f49206n = vText2;
        if (vText2 == null) {
            str = "_heart";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73253h0(this);
    }

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
