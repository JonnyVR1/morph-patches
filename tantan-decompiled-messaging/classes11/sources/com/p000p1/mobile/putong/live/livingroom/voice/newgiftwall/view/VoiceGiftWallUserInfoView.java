package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserLevel;
import l.g5c0;
import l.hxs;
import l.kvc0;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceGiftWallUserInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7392d;

    /* JADX INFO: renamed from: e */
    public VText f7393e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7394f;

    /* JADX INFO: renamed from: g */
    public RoundedProgressBar f7395g;

    /* JADX INFO: renamed from: h */
    public VText f7396h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7397i;

    /* JADX INFO: renamed from: j */
    public VText f7398j;

    public VoiceGiftWallUserInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m8905h0(GiftWallV3MainDetail giftWallV3MainDetail) {
        hxs.y(this.f7392d, giftWallV3MainDetail.level.smallBgImage);
        hxs.o("context_single_room", this.f7394f, giftWallV3MainDetail.user.avatar);
        this.f7393e.setText(giftWallV3MainDetail.user.name);
        this.f7396h.setText(giftWallV3MainDetail.level.ownedGiftCount + "/" + giftWallV3MainDetail.level.nextLevelGiftCount);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3MainDetail.level.image);
        VDraweeView vDraweeView = this.f7397i;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
        } else {
            hxs.o("context_single_room", vDraweeView, giftWallV3MainDetail.level.image);
            xdl0.M(this.f7397i, true);
        }
        this.f7398j.setText(giftWallV3MainDetail.ownedGiftCount + "/" + giftWallV3MainDetail.totalGiftCount);
        this.f7395g.setProgressColor(kvc0.g(giftWallV3MainDetail.level.progressColor));
        this.f7395g.setBackgroundColor(kvc0.g(giftWallV3MainDetail.level.progressBgColor));
        UserLevel userLevel = giftWallV3MainDetail.level;
        int i = userLevel.ownedGiftCount;
        int i2 = (int) ((i * 100.0f) / userLevel.nextLevelGiftCount);
        this.f7395g.setProgress((i <= 0 || i2 != 0) ? i2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7392d = findViewById(g5c0.O7);
        this.f7393e = findViewById(g5c0.S7);
        this.f7394f = findViewById(g5c0.L7);
        this.f7395g = (RoundedProgressBar) findViewById(g5c0.K7);
        this.f7396h = findViewById(g5c0.J7);
        this.f7397i = findViewById(g5c0.t2);
        this.f7398j = findViewById(g5c0.q3);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
