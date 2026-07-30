package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardMeItemView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualFansBoardItemMeBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualFansBoardMeItemView f48927d;

    /* JADX INFO: renamed from: e */
    public VText f48928e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f48929f;

    /* JADX INFO: renamed from: g */
    public VText f48930g;

    /* JADX INFO: renamed from: h */
    public LiveGenderMedalView f48931h;

    /* JADX INFO: renamed from: i */
    public VText f48932i;

    public LiveVirtualFansBoardItemMeBindings(Context context) {
        super(context);
    }

    public VirtualFansBoardMeItemView getRoot() {
        return this.f48927d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73215h0(ViewGroup viewGroup) {
        this.f48927d = (VirtualFansBoardMeItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48928e = vText;
        String str = vText == null ? "_rank" : null;
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        this.f48929f = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_avatar";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48930g = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        LiveGenderMedalView liveGenderMedalView = (LiveGenderMedalView) viewGroup.getChildAt(3);
        this.f48931h = liveGenderMedalView;
        if (liveGenderMedalView == null) {
            str = "_gender";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f48932i = vText3;
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
        m73215h0(this);
    }

    public LiveVirtualFansBoardItemMeBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualFansBoardItemMeBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
