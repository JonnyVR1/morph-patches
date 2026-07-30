package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceHourListItemMainlandBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardItemView f49218d;

    /* JADX INFO: renamed from: e */
    public VText f49219e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f49220f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49221g;

    /* JADX INFO: renamed from: h */
    public LivingNewTagView f49222h;

    /* JADX INFO: renamed from: i */
    public VText f49223i;

    /* JADX INFO: renamed from: j */
    public LiveGenderMedalView f49224j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f49225k;

    /* JADX INFO: renamed from: l */
    public VText f49226l;

    public LiveVoiceHourListItemMainlandBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardItemView getRoot() {
        return this.f49218d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73255h0(ViewGroup viewGroup) {
        this.f49218d = (VoiceHourBoardItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f49219e = vText;
        String str = vText == null ? "_rank" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f49220f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(2);
        this.f49221g = vDraweeView;
        if (vDraweeView == null) {
            str = "_mvp";
        }
        LivingNewTagView livingNewTagView = (LivingNewTagView) viewGroup.getChildAt(3);
        this.f49222h = livingNewTagView;
        if (livingNewTagView == null) {
            str = "_live_tag";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f49223i = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        LiveGenderMedalView liveGenderMedalView = (LiveGenderMedalView) viewGroup.getChildAt(5);
        this.f49224j = liveGenderMedalView;
        if (liveGenderMedalView == null) {
            str = "_gender";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(6);
        this.f49225k = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_level";
        }
        VText vText3 = (VText) viewGroup.getChildAt(7);
        this.f49226l = vText3;
        if (vText3 == null) {
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
        m73255h0(this);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
