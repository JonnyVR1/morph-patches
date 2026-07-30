package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourListItemMainlandBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardItemView f48370d;

    /* JADX INFO: renamed from: e */
    public VText f48371e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f48372f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48373g;

    /* JADX INFO: renamed from: h */
    public LivingNewTagView f48374h;

    /* JADX INFO: renamed from: i */
    public VText f48375i;

    /* JADX INFO: renamed from: j */
    public LiveGenderMedalView f48376j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f48377k;

    /* JADX INFO: renamed from: l */
    public VText f48378l;

    public LiveVoiceHourListItemMainlandBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardItemView getRoot() {
        return this.f48370d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72072h0(ViewGroup viewGroup) {
        this.f48370d = (VoiceHourBoardItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48371e = vText;
        String str = vText == null ? "_rank" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f48372f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(2);
        this.f48373g = vDraweeView;
        if (vDraweeView == null) {
            str = "_mvp";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(3);
        this.f48374h = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_live_tag";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f48375i = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        LiveGenderMedalView liveGenderMedalView = (LiveGenderMedalView) viewGroup.getChildAt(5);
        this.f48376j = liveGenderMedalView;
        if (liveGenderMedalView == null) {
            str = "_gender";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(6);
        this.f48377k = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_level";
        }
        VText vText3 = (VText) viewGroup.getChildAt(7);
        this.f48378l = vText3;
        if (vText3 == null) {
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
        m72072h0(this);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
