package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view.LiveVoiceWeekStarGiftDetailPageTopView;

/* JADX INFO: loaded from: classes10.dex */
public class qdv extends d3q<LiveVoiceWeekStarGiftDetailPageTopView> {

    /* JADX INFO: renamed from: a */
    public final GiftWallV3GiftWeekStarGiftMainDetail f156771a;

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f156772b;

    public qdv(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        this.f156771a = giftWallV3GiftWeekStarGiftMainDetail;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVoiceWeekStarGiftDetailPageTopView liveVoiceWeekStarGiftDetailPageTopView) {
        super.mo71749u(liveVoiceWeekStarGiftDetailPageTopView);
        GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail = this.f156771a;
        if (giftWallV3GiftWeekStarGiftMainDetail != null) {
            liveVoiceWeekStarGiftDetailPageTopView.m79865h0(giftWallV3GiftWeekStarGiftMainDetail, this.f156772b);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m176208I(View.OnClickListener onClickListener) {
        this.f156772b = onClickListener;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199184nb;
    }
}
