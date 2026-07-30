package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view.LiveVoiceWeekStarGiftDetailPageTopView;

/* JADX INFO: loaded from: classes11.dex */
public class pbv extends d1q<LiveVoiceWeekStarGiftDetailPageTopView> {

    /* JADX INFO: renamed from: a */
    public final GiftWallV3GiftWeekStarGiftMainDetail f148116a;

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f148117b;

    public pbv(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        this.f148116a = giftWallV3GiftWeekStarGiftMainDetail;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVoiceWeekStarGiftDetailPageTopView liveVoiceWeekStarGiftDetailPageTopView) {
        super.mo70566u(liveVoiceWeekStarGiftDetailPageTopView);
        GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail = this.f148116a;
        if (giftWallV3GiftWeekStarGiftMainDetail != null) {
            liveVoiceWeekStarGiftDetailPageTopView.m78682h0(giftWallV3GiftWeekStarGiftMainDetail, this.f148117b);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m168254I(View.OnClickListener onClickListener) {
        this.f148117b = onClickListener;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168452nb;
    }
}
