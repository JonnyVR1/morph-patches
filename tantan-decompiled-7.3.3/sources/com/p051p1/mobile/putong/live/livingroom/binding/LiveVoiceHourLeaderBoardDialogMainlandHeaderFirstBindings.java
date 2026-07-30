package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardFirstView f49207d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49208e;

    /* JADX INFO: renamed from: f */
    public VImage f49209f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f49210g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f49211h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49212i;

    /* JADX INFO: renamed from: j */
    public VImage f49213j;

    /* JADX INFO: renamed from: k */
    public View f49214k;

    /* JADX INFO: renamed from: l */
    public LivingNewTagView f49215l;

    /* JADX INFO: renamed from: m */
    public VText f49216m;

    /* JADX INFO: renamed from: n */
    public VText f49217n;

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardFirstView getRoot() {
        return this.f49207d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73254h0(ViewGroup viewGroup) {
        this.f49207d = (VoiceHourBoardFirstView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49208e = vDraweeView;
        String str = vDraweeView == null ? "_bg_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f49209f = vImage;
        if (vImage == null) {
            str = "_bg";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(2);
        this.f49210g = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        this.f49211h = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(4);
        this.f49212i = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_mvp";
        }
        VImage vImage2 = (VImage) viewGroup.getChildAt(5);
        this.f49213j = vImage2;
        if (vImage2 == null) {
            str = "_crown";
        }
        View childAt = viewGroup.getChildAt(6);
        this.f49214k = childAt;
        if (childAt == null) {
            str = "_avatar_bottom";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(7);
        this.f49215l = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_living";
        }
        VText vText = (VText) viewGroup.getChildAt(8);
        this.f49216m = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) viewGroup.getChildAt(9);
        this.f49217n = vText2;
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
        m73254h0(this);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
