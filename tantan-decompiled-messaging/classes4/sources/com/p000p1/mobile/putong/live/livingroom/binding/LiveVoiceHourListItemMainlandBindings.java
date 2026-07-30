package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceHourListItemMainlandBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardItemView f4412d;

    /* JADX INFO: renamed from: e */
    public VText f4413e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f4414f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4415g;

    /* JADX INFO: renamed from: h */
    public LivingNewTagView f4416h;

    /* JADX INFO: renamed from: i */
    public VText f4417i;

    /* JADX INFO: renamed from: j */
    public LiveGenderMedalView f4418j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f4419k;

    /* JADX INFO: renamed from: l */
    public VText f4420l;

    public LiveVoiceHourListItemMainlandBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardItemView getRoot() {
        return this.f4412d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5541h0(ViewGroup viewGroup) {
        this.f4412d = (VoiceHourBoardItemView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4413e = childAt;
        String str = childAt == null ? "_rank" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f4414f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView childAt2 = viewGroup.getChildAt(2);
        this.f4415g = childAt2;
        if (childAt2 == null) {
            str = "_mvp";
        }
        LivingNewTagView childAt3 = viewGroup.getChildAt(3);
        this.f4416h = childAt3;
        if (childAt3 == null) {
            str = "_live_tag";
        }
        VText childAt4 = viewGroup.getChildAt(4);
        this.f4417i = childAt4;
        if (childAt4 == null) {
            str = "_name";
        }
        LiveGenderMedalView liveGenderMedalView = (LiveGenderMedalView) viewGroup.getChildAt(5);
        this.f4418j = liveGenderMedalView;
        if (liveGenderMedalView == null) {
            str = "_gender";
        }
        VDraweeView childAt5 = viewGroup.getChildAt(6);
        this.f4419k = childAt5;
        if (childAt5 == null) {
            str = "_level";
        }
        VText childAt6 = viewGroup.getChildAt(7);
        this.f4420l = childAt6;
        if (childAt6 == null) {
            str = "_heart";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5541h0(this);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourListItemMainlandBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
