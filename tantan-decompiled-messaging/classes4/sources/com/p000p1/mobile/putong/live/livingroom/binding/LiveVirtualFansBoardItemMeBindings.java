package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardMeItemView;
import l.jfd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualFansBoardItemMeBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualFansBoardMeItemView f4121d;

    /* JADX INFO: renamed from: e */
    public VText f4122e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f4123f;

    /* JADX INFO: renamed from: g */
    public VText f4124g;

    /* JADX INFO: renamed from: h */
    public LiveGenderMedalView f4125h;

    /* JADX INFO: renamed from: i */
    public VText f4126i;

    public LiveVirtualFansBoardItemMeBindings(Context context) {
        super(context);
    }

    public VirtualFansBoardMeItemView getRoot() {
        return this.f4121d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5457h0(ViewGroup viewGroup) {
        this.f4121d = (VirtualFansBoardMeItemView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4122e = childAt;
        String str = childAt == null ? "_rank" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f4123f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VText childAt2 = viewGroup.getChildAt(2);
        this.f4124g = childAt2;
        if (childAt2 == null) {
            str = "_name";
        }
        LiveGenderMedalView liveGenderMedalView = (LiveGenderMedalView) viewGroup.getChildAt(3);
        this.f4125h = liveGenderMedalView;
        if (liveGenderMedalView == null) {
            str = "_gender";
        }
        VText childAt3 = viewGroup.getChildAt(4);
        this.f4126i = childAt3;
        if (childAt3 == null) {
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
        m5457h0(this);
    }

    public LiveVirtualFansBoardItemMeBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualFansBoardItemMeBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
