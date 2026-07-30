package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view.LiveVoiceWeekStarGiftDetailPageTopView;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pbv extends d1q<LiveVoiceWeekStarGiftDetailPageTopView> {

    /* JADX INFO: renamed from: a */
    public final GiftWallV3GiftWeekStarGiftMainDetail f18460a;

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f18461b;

    public pbv(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        this.f18460a = giftWallV3GiftWeekStarGiftMainDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m20124u(LiveVoiceWeekStarGiftDetailPageTopView liveVoiceWeekStarGiftDetailPageTopView) {
        super.u(liveVoiceWeekStarGiftDetailPageTopView);
        GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail = this.f18460a;
        if (giftWallV3GiftWeekStarGiftMainDetail != null) {
            liveVoiceWeekStarGiftDetailPageTopView.m8898h0(giftWallV3GiftWeekStarGiftMainDetail, this.f18461b);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m20122I(View.OnClickListener onClickListener) {
        this.f18461b = onClickListener;
    }

    /* JADX INFO: renamed from: o */
    public int m20123o() {
        return t6c0.nb;
    }
}
