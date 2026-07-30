package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.List;
import l.g5c0;
import l.hce;
import l.hxs;
import l.i3c0;
import l.t100;
import l.w8u;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveVoiceWeekStarGiftDetailPageTopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7361d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7362e;

    /* JADX INFO: renamed from: f */
    public VText f7363f;

    /* JADX INFO: renamed from: g */
    public VText f7364g;

    /* JADX INFO: renamed from: h */
    public VText f7365h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7366i;

    /* JADX INFO: renamed from: j */
    public VText f7367j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f7368k;

    /* JADX INFO: renamed from: l */
    public VText f7369l;

    /* JADX INFO: renamed from: m */
    public VText f7370m;

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public void m8898h0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View.OnClickListener onClickListener) {
        hxs.y(this.f7361d, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        xdl0.E0(findViewById(g5c0.U7), onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        VDraweeView vDraweeView = this.f7362e;
        if (userBean != null) {
            hxs.y(vDraweeView, userBean.avatar);
            this.f7363f.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.name);
        } else {
            vDraweeView.setController((hce) null);
            this.f7363f.setText(R.string.ba);
        }
        int i = giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold;
        VText vText = this.f7370m;
        if (i > 0) {
            vText.setText(w8u.u(R.string.qd, Integer.valueOf(i)));
            w8u.E(this.f7370m, Color.parseColor("#FE7E1D"), this.f7370m.getText().toString(), giftWallV3GiftWeekStarGiftMainDetail.leaderboardThreshold + "");
        } else {
            vText.setText(w8u.u(R.string.N2, giftWallV3GiftWeekStarGiftMainDetail.user.name));
        }
        this.f7365h.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.price + "");
        this.f7364g.setText(giftWallV3GiftWeekStarGiftMainDetail.myLeaderboard.score + "");
        List<GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward> list = giftWallV3GiftWeekStarGiftMainDetail.top1Rewards;
        if (list.size() == 2) {
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward = list.get(0);
            hxs.y(this.f7366i, top1Reward.icon);
            this.f7367j.setText(top1Reward.name);
            GiftWallV3GiftWeekStarGiftMainDetail.Top1Reward top1Reward2 = list.get(1);
            hxs.y(this.f7368k, top1Reward2.icon);
            this.f7369l.setText(top1Reward2.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7361d = findViewById(g5c0.d2);
        this.f7362e = findViewById(g5c0.H0);
        this.f7363f = findViewById(g5c0.J0);
        this.f7370m = findViewById(g5c0.I0);
        this.f7364g = findViewById(g5c0.M5);
        this.f7365h = findViewById(g5c0.f1);
        this.f7366i = findViewById(g5c0.I4);
        this.f7367j = findViewById(g5c0.K4);
        this.f7368k = findViewById(g5c0.J4);
        this.f7369l = findViewById(g5c0.L4);
        Drawable drawable = getContext().getDrawable(i3c0.K1);
        if (drawable != null) {
            drawable.setBounds(0, 0, t100.d(13.0f), t100.d(13.0f));
            this.f7365h.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f7365h.setCompoundDrawablePadding(t100.d(2.0f));
        }
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceWeekStarGiftDetailPageTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
