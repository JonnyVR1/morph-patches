package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourSuggestConfig;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jqj extends bk2<LongLinkGiftMessage.LiveRankings, List<BLiveHourLeaderBoardItem>> {
    public jqj(p3g0<List<BLiveHourLeaderBoardItem>, List<BLiveHourLeaderBoardItem>> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: C */
    public static BLiveHourLeaderBoardItem m16172C(LongLinkGiftMessage.LiveRanking liveRanking, LongLinkGiftMessage.LiveRankings liveRankings) {
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.userId = liveRanking.getAnchorId();
        bLiveHourLeaderBoardItemNew_.rank = liveRanking.getRank();
        bLiveHourLeaderBoardItemNew_.userName = liveRanking.getUserName();
        bLiveHourLeaderBoardItemNew_.amount = liveRanking.getAmount();
        bLiveHourLeaderBoardItemNew_.userImage = liveRanking.getUserImage();
        bLiveHourLeaderBoardItemNew_.roomId = liveRanking.getRoomId();
        bLiveHourLeaderBoardItemNew_.liveId = liveRanking.getLiveId();
        bLiveHourLeaderBoardItemNew_.isOpen = true;
        bLiveHourLeaderBoardItemNew_.gap = liveRanking.getGap();
        if (liveRanking.getUserLiveState() == LongLinkGiftMessage.LiveStateEnum.onlive) {
            bLiveHourLeaderBoardItemNew_.liveState = BLiveState.get("onlive");
        } else if (liveRanking.getUserLiveState() == LongLinkGiftMessage.LiveStateEnum.stopped) {
            bLiveHourLeaderBoardItemNew_.liveState = BLiveState.get("stopped");
        } else if (liveRanking.getUserLiveState() == LongLinkGiftMessage.LiveStateEnum.suspended) {
            bLiveHourLeaderBoardItemNew_.liveState = BLiveState.get("suspended");
        } else if (liveRanking.getUserLiveState() == LongLinkGiftMessage.LiveStateEnum.UNRECOGNIZED) {
            bLiveHourLeaderBoardItemNew_.liveState = BLiveState.get("unknown_");
        }
        LongLinkGiftMessage.CurrentHourSuggestConfig currentHourSuggestConfig = liveRankings.getCurrentHourSuggestConfig();
        if (NullChecker.a(currentHourSuggestConfig)) {
            BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfigNew_ = BLiveCurrentHourSuggestConfig.new_();
            bLiveCurrentHourSuggestConfigNew_.target = (int) currentHourSuggestConfig.getTarget();
            bLiveCurrentHourSuggestConfigNew_.enable = currentHourSuggestConfig.getEnable();
            bLiveCurrentHourSuggestConfigNew_.nodes = currentHourSuggestConfig.getNodesList();
            bLiveHourLeaderBoardItemNew_.currentHourSuggestConfig = bLiveCurrentHourSuggestConfigNew_;
        }
        bLiveHourLeaderBoardItemNew_.msgType = BLiveRankingMsgType.get(liveRankings.getMsgType().name());
        return bLiveHourLeaderBoardItemNew_;
    }

    /* JADX INFO: renamed from: D */
    public static List<BLiveHourLeaderBoardItem> m16173D(final LongLinkGiftMessage.LiveRankings liveRankings) {
        List rankingsList = liveRankings.getRankingsList();
        final ArrayList arrayList = new ArrayList();
        if (!vwb.J(rankingsList)) {
            vwb.z(rankingsList, new e30() { // from class: l.iqj
                public final void call(Object obj) {
                    arrayList.add(jqj.m16172C((LongLinkGiftMessage.LiveRanking) obj, liveRankings));
                }
            });
        }
        return arrayList;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<BLiveHourLeaderBoardItem> mo9251z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m16173D(liveRankings);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo9244b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.hourLeaderboards";
    }
}
