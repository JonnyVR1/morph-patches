package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import l.jfd0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceHourBoardFirstView f4401d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4402e;

    /* JADX INFO: renamed from: f */
    public VImage f4403f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f4404g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f4405h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4406i;

    /* JADX INFO: renamed from: j */
    public VImage f4407j;

    /* JADX INFO: renamed from: k */
    public View f4408k;

    /* JADX INFO: renamed from: l */
    public LivingNewTagView f4409l;

    /* JADX INFO: renamed from: m */
    public VText f4410m;

    /* JADX INFO: renamed from: n */
    public VText f4411n;

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context) {
        super(context);
    }

    public VoiceHourBoardFirstView getRoot() {
        return this.f4401d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5540h0(ViewGroup viewGroup) {
        this.f4401d = (VoiceHourBoardFirstView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4402e = childAt;
        String str = childAt == null ? "_bg_view" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f4403f = childAt2;
        if (childAt2 == null) {
            str = "_bg";
        }
        AnimEffectPlayer childAt3 = viewGroup.getChildAt(2);
        this.f4404g = childAt3;
        if (childAt3 == null) {
            str = "_rank_svga";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        this.f4405h = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VDraweeView childAt4 = viewGroup.getChildAt(4);
        this.f4406i = childAt4;
        if (childAt4 == null) {
            str = "_mvp";
        }
        VImage childAt5 = viewGroup.getChildAt(5);
        this.f4407j = childAt5;
        if (childAt5 == null) {
            str = "_crown";
        }
        View childAt6 = viewGroup.getChildAt(6);
        this.f4408k = childAt6;
        if (childAt6 == null) {
            str = "_avatar_bottom";
        }
        LivingNewTagView childAt7 = viewGroup.getChildAt(7);
        this.f4409l = childAt7;
        if (childAt7 == null) {
            str = "_living";
        }
        VText childAt8 = viewGroup.getChildAt(8);
        this.f4410m = childAt8;
        if (childAt8 == null) {
            str = "_name";
        }
        VText childAt9 = viewGroup.getChildAt(9);
        this.f4411n = childAt9;
        if (childAt9 == null) {
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
        m5540h0(this);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
