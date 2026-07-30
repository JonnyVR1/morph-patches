package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveCurrentHourSuggestConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRankingMsgType;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zsj extends jk2<LongLinkGiftMessage.LiveRankings, List<BLiveHourLeaderBoardItem>> {
    public zsj(wbg0<List<BLiveHourLeaderBoardItem>, List<BLiveHourLeaderBoardItem>> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: C */
    public static BLiveHourLeaderBoardItem m221347C(LongLinkGiftMessage.LiveRanking liveRanking, LongLinkGiftMessage.LiveRankings liveRankings) {
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
        if (NullChecker.m82486a(currentHourSuggestConfig)) {
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
    public static List<BLiveHourLeaderBoardItem> m221348D(final LongLinkGiftMessage.LiveRankings liveRankings) {
        List<LongLinkGiftMessage.LiveRanking> rankingsList = liveRankings.getRankingsList();
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(rankingsList)) {
            jyb.m147537z(rankingsList, new y20() { // from class: l.ysj
                @Override // p153l.y20
                public final void call(Object obj) {
                    arrayList.add(zsj.m221347C((LongLinkGiftMessage.LiveRanking) obj, liveRankings));
                }
            });
        }
        return arrayList;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveRankings liveRankings, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<BLiveHourLeaderBoardItem> mo95993z(String str, LongLinkGiftMessage.LiveRankings liveRankings) {
        return m221348D(liveRankings);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveRankings> mo95510b() {
        return LongLinkGiftMessage.LiveRankings.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.hourLeaderboards";
    }
}
