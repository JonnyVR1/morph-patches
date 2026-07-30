package p153l;

import com.p051p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboardConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cxn extends jk2<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard, BLiveIntlGiftLeaderboard> {
    public cxn(wbg0<BLiveIntlGiftLeaderboard, BLiveIntlGiftLeaderboard> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard giftLeaderboard, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveIntlGiftLeaderboard mo95993z(String str, LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard giftLeaderboard) {
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

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard> mo95510b() {
        return LongLinkLiveIntlGiftLeaderboard.GiftLeaderboard.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.intl.giftLeaderboard";
    }
}
