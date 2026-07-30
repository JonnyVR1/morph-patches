package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.x8u;
import p149l.xhl;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class HourLeaderBoardAssistanceGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourLeaderBoardAssistanceGiftItemView f50702d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50703e;

    /* JADX INFO: renamed from: f */
    public TextView f50704f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50705g;

    /* JADX INFO: renamed from: h */
    public TextView f50706h;

    /* JADX INFO: renamed from: i */
    public TextView f50707i;

    public HourLeaderBoardAssistanceGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74890h0(View view) {
        xhl.m208799a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74891i0(BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem, boolean z) {
        hxs.m133406s("context_livingAct", this.f50703e, z ? ydt.f197600C : ydt.f197601D);
        hxs.m133406s("context_livingAct", this.f50705g, bLiveHourLeaderBoardBattleGiftItem.giftIcon);
        this.f50704f.setText(x8u.m207433c(bLiveHourLeaderBoardBattleGiftItem.threshold));
        this.f50706h.setText(bLiveHourLeaderBoardBattleGiftItem.giftName);
        this.f50707i.setText(bLiveHourLeaderBoardBattleGiftItem.giftPrice + "探探币");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74890h0(this);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
