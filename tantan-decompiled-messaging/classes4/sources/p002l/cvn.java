package p002l;

import com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboardConfig;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
import java.util.ArrayList;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cvn extends bk2<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard, BLiveIntlGiftLeaderboard> {
    public cvn(p3g0<BLiveIntlGiftLeaderboard, BLiveIntlGiftLeaderboard> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard giftLeaderboard, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveIntlGiftLeaderboard mo9251z(String str, LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard giftLeaderboard) {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboardNew_ = BLiveIntlGiftLeaderboard.new_();
        bLiveIntlGiftLeaderboardNew_.open = giftLeaderboard.getOpen();
        bLiveIntlGiftLeaderboardNew_.homeStretch = giftLeaderboard.getHomeStretch();
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfigNew_ = BLiveIntlGiftLeaderboardConfig.new_();
        bLiveIntlGiftLeaderboardConfigNew_.pollingIntervalInSeconds = giftLeaderboard.getConfig().getPollingIntervalInSeconds();
        bLiveIntlGiftLeaderboardConfigNew_.scrollIntervalInSeconds = giftLeaderboard.getConfig().getScrollIntervalInSeconds();
        bLiveIntlGiftLeaderboardNew_.config = bLiveIntlGiftLeaderboardConfigNew_;
        ArrayList arrayList = new ArrayList();
        for (LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardItem giftLeaderboardItem : giftLeaderboard.getCurrentList()) {
            BLiveIntlGiftStarInfo bLiveIntlGiftStarInfoNew_ = BLiveIntlGiftStarInfo.new_();
            bLiveIntlGiftStarInfoNew_.name = giftLeaderboardItem.getName();
            bLiveIntlGiftStarInfoNew_.giftId = giftLeaderboardItem.getGiftId();
            bLiveIntlGiftStarInfoNew_.giftIcon = giftLeaderboardItem.getGiftIcon();
            bLiveIntlGiftStarInfoNew_.amount = giftLeaderboardItem.getAmount();
            bLiveIntlGiftStarInfoNew_.rank = giftLeaderboardItem.getRank();
            bLiveIntlGiftStarInfoNew_.gap = giftLeaderboardItem.getGap();
            arrayList.add(bLiveIntlGiftStarInfoNew_);
        }
        bLiveIntlGiftLeaderboardNew_.current = arrayList;
        bLiveIntlGiftLeaderboardNew_.jumpUrl = giftLeaderboard.getJumpUrl();
        return bLiveIntlGiftLeaderboardNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard> mo9244b() {
        return LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.intl.giftLeaderboard";
    }
}
