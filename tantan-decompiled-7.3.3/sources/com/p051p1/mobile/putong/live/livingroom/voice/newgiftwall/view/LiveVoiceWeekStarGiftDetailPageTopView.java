package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mdc0;
import p153l.obc0;
import p153l.qa00;
import p153l.xau;

/* JADX INFO: loaded from: classes10.dex */
public class LiveVoiceWeekStarGiftDetailPageTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54603d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54604e;

    /* JADX INFO: renamed from: f */
    public VText f54605f;

    /* JADX INFO: renamed from: g */
    public VText f54606g;

    /* JADX INFO: renamed from: h */
    public VText f54607h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54608i;

    /* JADX INFO: renamed from: j */
    public VText f54609j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f54610k;

    /* JADX INFO: renamed from: l */
    public VText f54611l;

    /* JADX INFO: renamed from: m */
    public VText f54612m;

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m79865h0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View.OnClickListener onClickListener) {
        izs.m142874y(this.f54603d, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        bnl0.m105509E0(findViewById(mdc0.f136071U7), onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        VDraweeView vDraweeView = this.f54604e;
        if (userBean != null) {
            izs.m142874y(vDraweeView, userBean.avatar);
            this.f54605f.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.name);
        } else {
            vDraweeView.setController(null);
            this.f54605f.setText(R$string.f47994ba);
        }
        int i = giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold;
        VText vText = this.f54612m;
        if (i > 0) {
            vText.setText(xau.m209911u(R$string.f48326qd, Integer.valueOf(i)));
            xau.m209900E(this.f54612m, Color.parseColor("#FE7E1D"), this.f54612m.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold + "");
        } else {
            vText.setText(xau.m209911u(R$string.f47691N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
        }
        this.f54607h.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.price + "");
        this.f54606g.setText(giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.score + "");
        List<GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward> list = giftWallV3GiftWeekStarGiftMainDetail.top1Rewards;
        if (list.size() == 2) {
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward = list.get(0);
            izs.m142874y(this.f54608i, top1Reward.icon);
            this.f54609j.setText(top1Reward.name);
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward2 = list.get(1);
            izs.m142874y(this.f54610k, top1Reward2.icon);
            this.f54611l.setText(top1Reward2.name);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54603d = (VDraweeView) findViewById(mdc0.f136150d2);
        this.f54604e = (VDraweeView) findViewById(mdc0.f135947H0);
        this.f54605f = (VText) findViewById(mdc0.f135965J0);
        this.f54612m = (VText) findViewById(mdc0.f135956I0);
        this.f54606g = (VText) findViewById(mdc0.f135997M5);
        this.f54607h = (VText) findViewById(mdc0.f136169f1);
        this.f54608i = (VDraweeView) findViewById(mdc0.f135960I4);
        this.f54609j = (VText) findViewById(mdc0.f135978K4);
        this.f54610k = (VDraweeView) findViewById(mdc0.f135969J4);
        this.f54611l = (VText) findViewById(mdc0.f135987L4);
        Drawable drawable = getContext().getDrawable(obc0.f146087K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, qa00.m175859d(13.0f), qa00.m175859d(13.0f));
            this.f54607h.setCompoundDrawables(drawable, null, null, null);
            this.f54607h.setCompoundDrawablePadding(qa00.m175859d(2.0f));
        }
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
