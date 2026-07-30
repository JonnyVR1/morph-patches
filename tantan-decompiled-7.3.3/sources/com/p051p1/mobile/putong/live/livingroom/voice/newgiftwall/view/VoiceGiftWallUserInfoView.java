package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserLevel;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mdc0;
import p153l.n3d0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceGiftWallUserInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54634d;

    /* JADX INFO: renamed from: e */
    public VText f54635e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54636f;

    /* JADX INFO: renamed from: g */
    public RoundedProgressBar f54637g;

    /* JADX INFO: renamed from: h */
    public VText f54638h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54639i;

    /* JADX INFO: renamed from: j */
    public VText f54640j;

    public VoiceGiftWallUserInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m79872h0(GiftWallV3MainDetail giftWallV3MainDetail) {
        izs.m142874y(this.f54634d, giftWallV3MainDetail.level.smallBgImage);
        izs.m142864o("context_single_room", this.f54636f, giftWallV3MainDetail.user.avatar);
        this.f54635e.setText(giftWallV3MainDetail.user.name);
        this.f54638h.setText(giftWallV3MainDetail.level.ownedGiftCount + "/" + giftWallV3MainDetail.level.nextLevelGiftCount);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3MainDetail.level.image);
        VDraweeView vDraweeView = this.f54639i;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            izs.m142864o("context_single_room", vDraweeView, giftWallV3MainDetail.level.image);
            bnl0.m105524M(this.f54639i, true);
        }
        this.f54640j.setText(giftWallV3MainDetail.ownedGiftCount + "/" + giftWallV3MainDetail.totalGiftCount);
        this.f54637g.setProgressColor(n3d0.m161283g(giftWallV3MainDetail.level.progressColor));
        this.f54637g.setBackgroundColor(n3d0.m161283g(giftWallV3MainDetail.level.progressBgColor));
        UserLevel userLevel = giftWallV3MainDetail.level;
        int i = userLevel.ownedGiftCount;
        int i2 = (int) ((i * 100.0f) / userLevel.nextLevelGiftCount);
        this.f54637g.setProgress((i <= 0 || i2 != 0) ? i2 : 1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54634d = (VDraweeView) findViewById(mdc0.f136017O7);
        this.f54635e = (VText) findViewById(mdc0.f136053S7);
        this.f54636f = (VDraweeView) findViewById(mdc0.f135990L7);
        this.f54637g = (RoundedProgressBar) findViewById(mdc0.f135981K7);
        this.f54638h = (VText) findViewById(mdc0.f135972J7);
        this.f54639i = (VDraweeView) findViewById(mdc0.f136302t2);
        this.f54640j = (VText) findViewById(mdc0.f136276q3);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
