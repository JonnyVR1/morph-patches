package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserLevel;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceGiftWallUserInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53786d;

    /* JADX INFO: renamed from: e */
    public VText f53787e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53788f;

    /* JADX INFO: renamed from: g */
    public RoundedProgressBar f53789g;

    /* JADX INFO: renamed from: h */
    public VText f53790h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53791i;

    /* JADX INFO: renamed from: j */
    public VText f53792j;

    public VoiceGiftWallUserInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m78689h0(GiftWallV3MainDetail giftWallV3MainDetail) {
        hxs.m133412y(this.f53786d, giftWallV3MainDetail.level.smallBgImage);
        hxs.m133402o("context_single_room", this.f53788f, giftWallV3MainDetail.user.avatar);
        this.f53787e.setText(giftWallV3MainDetail.user.name);
        this.f53790h.setText(giftWallV3MainDetail.level.ownedGiftCount + "/" + giftWallV3MainDetail.level.nextLevelGiftCount);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3MainDetail.level.image);
        VDraweeView vDraweeView = this.f53791i;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            hxs.m133402o("context_single_room", vDraweeView, giftWallV3MainDetail.level.image);
            xdl0.m208344M(this.f53791i, true);
        }
        this.f53792j.setText(giftWallV3MainDetail.ownedGiftCount + "/" + giftWallV3MainDetail.totalGiftCount);
        this.f53789g.setProgressColor(kvc0.m147358g(giftWallV3MainDetail.level.progressColor));
        this.f53789g.setBackgroundColor(kvc0.m147358g(giftWallV3MainDetail.level.progressBgColor));
        UserLevel userLevel = giftWallV3MainDetail.level;
        int i = userLevel.ownedGiftCount;
        int i2 = (int) ((i * 100.0f) / userLevel.nextLevelGiftCount);
        this.f53789g.setProgress((i <= 0 || i2 != 0) ? i2 : 1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53786d = (VDraweeView) findViewById(g5c0.f100772O7);
        this.f53787e = (VText) findViewById(g5c0.f100808S7);
        this.f53788f = (VDraweeView) findViewById(g5c0.f100745L7);
        this.f53789g = (RoundedProgressBar) findViewById(g5c0.f100736K7);
        this.f53790h = (VText) findViewById(g5c0.f100727J7);
        this.f53791i = (VDraweeView) findViewById(g5c0.f101057t2);
        this.f53792j = (VText) findViewById(g5c0.f101031q3);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
