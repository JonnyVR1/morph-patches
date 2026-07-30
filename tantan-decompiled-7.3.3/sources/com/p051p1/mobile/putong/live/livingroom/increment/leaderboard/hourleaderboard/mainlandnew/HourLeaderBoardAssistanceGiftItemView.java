package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem;
import p151v.VDraweeView;
import p153l.izs;
import p153l.okl;
import p153l.yau;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class HourLeaderBoardAssistanceGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourLeaderBoardAssistanceGiftItemView f51550d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51551e;

    /* JADX INFO: renamed from: f */
    public TextView f51552f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51553g;

    /* JADX INFO: renamed from: h */
    public TextView f51554h;

    /* JADX INFO: renamed from: i */
    public TextView f51555i;

    public HourLeaderBoardAssistanceGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76073h0(View view) {
        okl.m168039a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m76074i0(BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem, boolean z) {
        izs.m142868s("context_livingAct", this.f51551e, z ? zft.f204195C : zft.f204196D);
        izs.m142868s("context_livingAct", this.f51553g, bLiveHourLeaderBoardBattleGiftItem.giftIcon);
        this.f51552f.setText(yau.m214935c(bLiveHourLeaderBoardBattleGiftItem.threshold));
        this.f51554h.setText(bLiveHourLeaderBoardBattleGiftItem.giftName);
        this.f51555i.setText(bLiveHourLeaderBoardBattleGiftItem.giftPrice + "探探币");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76073h0(this);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourLeaderBoardAssistanceGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
