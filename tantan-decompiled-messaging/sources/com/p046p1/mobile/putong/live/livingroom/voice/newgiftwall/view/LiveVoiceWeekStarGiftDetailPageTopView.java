package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveVoiceWeekStarGiftDetailPageTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53755d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53756e;

    /* JADX INFO: renamed from: f */
    public VText f53757f;

    /* JADX INFO: renamed from: g */
    public VText f53758g;

    /* JADX INFO: renamed from: h */
    public VText f53759h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53760i;

    /* JADX INFO: renamed from: j */
    public VText f53761j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f53762k;

    /* JADX INFO: renamed from: l */
    public VText f53763l;

    /* JADX INFO: renamed from: m */
    public VText f53764m;

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m78682h0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View.OnClickListener onClickListener) {
        hxs.m133412y(this.f53755d, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        xdl0.m208329E0(findViewById(g5c0.f100826U7), onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        VDraweeView vDraweeView = this.f53756e;
        if (userBean != null) {
            hxs.m133412y(vDraweeView, userBean.avatar);
            this.f53757f.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.name);
        } else {
            vDraweeView.setController(null);
            this.f53757f.setText(R$string.f47146ba);
        }
        int i = giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold;
        VText vText = this.f53764m;
        if (i > 0) {
            vText.setText(w8u.m202218u(R$string.f47478qd, Integer.valueOf(i)));
            w8u.m202207E(this.f53764m, Color.parseColor("#FE7E1D"), this.f53764m.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold + "");
        } else {
            vText.setText(w8u.m202218u(R$string.f46843N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
        }
        this.f53759h.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.price + "");
        this.f53758g.setText(giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.score + "");
        List<GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward> list = giftWallV3GiftWeekStarGiftMainDetail.top1Rewards;
        if (list.size() == 2) {
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward = list.get(0);
            hxs.m133412y(this.f53760i, top1Reward.icon);
            this.f53761j.setText(top1Reward.name);
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward2 = list.get(1);
            hxs.m133412y(this.f53762k, top1Reward2.icon);
            this.f53763l.setText(top1Reward2.name);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53755d = (VDraweeView) findViewById(g5c0.f100905d2);
        this.f53756e = (VDraweeView) findViewById(g5c0.f100702H0);
        this.f53757f = (VText) findViewById(g5c0.f100720J0);
        this.f53764m = (VText) findViewById(g5c0.f100711I0);
        this.f53758g = (VText) findViewById(g5c0.f100752M5);
        this.f53759h = (VText) findViewById(g5c0.f100924f1);
        this.f53760i = (VDraweeView) findViewById(g5c0.f100715I4);
        this.f53761j = (VText) findViewById(g5c0.f100733K4);
        this.f53762k = (VDraweeView) findViewById(g5c0.f100724J4);
        this.f53763l = (VText) findViewById(g5c0.f100742L4);
        Drawable drawable = getContext().getDrawable(i3c0.f110759K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, t100.m186890d(13.0f), t100.m186890d(13.0f));
            this.f53759h.setCompoundDrawables(drawable, null, null, null);
            this.f53759h.setCompoundDrawablePadding(t100.m186890d(2.0f));
        }
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
