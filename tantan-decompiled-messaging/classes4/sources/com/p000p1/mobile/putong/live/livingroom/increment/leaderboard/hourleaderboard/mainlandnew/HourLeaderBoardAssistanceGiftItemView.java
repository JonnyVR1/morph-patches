package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem;
import l.hxs;
import l.x8u;
import l.ydt;
import p002l.xhl;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourLeaderBoardAssistanceGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourLeaderBoardAssistanceGiftItemView f6744d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6745e;

    /* JADX INFO: renamed from: f */
    public TextView f6746f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6747g;

    /* JADX INFO: renamed from: h */
    public TextView f6748h;

    /* JADX INFO: renamed from: i */
    public TextView f6749i;

    public HourLeaderBoardAssistanceGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8492h0(View view) {
        xhl.m25943a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8493i0(BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem, boolean z) {
        hxs.s("context_livingAct", this.f6745e, z ? ydt.C : ydt.D);
        hxs.s("context_livingAct", this.f6747g, bLiveHourLeaderBoardBattleGiftItem.giftIcon);
        this.f6746f.setText(x8u.c(bLiveHourLeaderBoardBattleGiftItem.threshold));
        this.f6748h.setText(bLiveHourLeaderBoardBattleGiftItem.giftName);
        this.f6749i.setText(bLiveHourLeaderBoardBattleGiftItem.giftPrice + "探探币");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8492h0(this);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
