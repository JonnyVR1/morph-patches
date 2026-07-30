package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourSuggestConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jqj extends bk2<LongLinkGiftMessage.LiveRankings, List<BLiveHourLeaderBoardItem>> {
    public jqj(p3g0<List<BLiveHourLeaderBoardItem>, List<BLiveHourLeaderBoardItem>> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: C */
    public static BLiveHourLeaderBoardItem m142810C(LongLinkGiftMessage.LiveRanking liveRanking, LongLinkGiftMessage.LiveRankings liveRankings) {
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
        if (NullChecker.m81303a(currentHourSuggestConfig)) {
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
    public static List<BLiveHourLeaderBoardItem> m142811D(final LongLinkGiftMessage.LiveRankings liveRankings) {
        List<LongLinkGiftMessage.LiveRanking> rankingsList = liveRankings.getRankingsList();
        final ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(rankingsList)) {
            vwb.m200354z(rankingsList, new e30() { // from class: l.iqj
                @Override // p149l.e30
                public final void call(Object obj) {
                    arrayList.add(jqj.m142810C((LongLinkGiftMessage.LiveRanking) obj, liveRankings));
                }
            });
        }
        return arrayList;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<BLiveHourLeaderBoardItem> mo94461z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m142811D(liveRankings);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo94398b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.hourLeaderboards";
    }
}
