package p149l;

import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRankingType;

/* JADX INFO: loaded from: classes4.dex */
public class aqn0 extends bk2<VoiceLiveRankingBoard.VoiceLiveRankings, BLiveVoiceLeaderBoardItem> {
    public aqn0(p3g0<BLiveVoiceLeaderBoardItem, BLiveVoiceLeaderBoardItem> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static BLiveVoiceLeaderBoardItem m98309B(VoiceLiveRankingBoard.VoiceLiveRanking voiceLiveRanking, VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItemNew_ = BLiveVoiceLeaderBoardItem.new_();
        bLiveVoiceLeaderBoardItemNew_.anchorId = voiceLiveRanking.getAnchorId();
        bLiveVoiceLeaderBoardItemNew_.rank = voiceLiveRanking.getRank();
        bLiveVoiceLeaderBoardItemNew_.anchorName = voiceLiveRanking.getAnchorName();
        bLiveVoiceLeaderBoardItemNew_.amount = voiceLiveRanking.getAmount();
        bLiveVoiceLeaderBoardItemNew_.anchorImage = voiceLiveRanking.getAnchorImage();
        bLiveVoiceLeaderBoardItemNew_.roomId = voiceLiveRanking.getRoomId();
        bLiveVoiceLeaderBoardItemNew_.liveId = voiceLiveRanking.getLiveId();
        bLiveVoiceLeaderBoardItemNew_.gap = voiceLiveRanking.getGap();
        bLiveVoiceLeaderBoardItemNew_.msgType = BLiveVoiceRankingMsgType.get(voiceLiveRankings.getMsgType().name());
        bLiveVoiceLeaderBoardItemNew_.type = BLiveVoiceRankingType.get(voiceLiveRankings.getType().name());
        if (voiceLiveRanking.getUserLiveState() == VoiceLiveRankingBoard.VoiceLiveStateEnum.onlive) {
            bLiveVoiceLeaderBoardItemNew_.liveState = BLiveState.get("onlive").toString();
            return bLiveVoiceLeaderBoardItemNew_;
        }
        if (voiceLiveRanking.getUserLiveState() == VoiceLiveRankingBoard.VoiceLiveStateEnum.stopped) {
            bLiveVoiceLeaderBoardItemNew_.liveState = BLiveState.get("stopped").toString();
            return bLiveVoiceLeaderBoardItemNew_;
        }
        if (voiceLiveRanking.getUserLiveState() == VoiceLiveRankingBoard.VoiceLiveStateEnum.suspended) {
            bLiveVoiceLeaderBoardItemNew_.liveState = BLiveState.get("suspended").toString();
            return bLiveVoiceLeaderBoardItemNew_;
        }
        if (voiceLiveRanking.getUserLiveState() == VoiceLiveRankingBoard.VoiceLiveStateEnum.UNRECOGNIZED) {
            bLiveVoiceLeaderBoardItemNew_.liveState = BLiveState.get("unknown_").toString();
        }
        return bLiveVoiceLeaderBoardItemNew_;
    }

    /* JADX INFO: renamed from: C */
    public static BLiveVoiceLeaderBoardItem m98310C(VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
        return m98309B(voiceLiveRankings.getRankings(0), voiceLiveRankings);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings, String str) {
        return voiceLiveRankings.getRankingsCount() > 0 && m199212r(voiceLiveRankings.getRankings(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceLeaderBoardItem mo94461z(String str, VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
        return m98310C(voiceLiveRankings);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveRankingBoard.VoiceLiveRankings> mo94398b() {
        return VoiceLiveRankingBoard.VoiceLiveRankings.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.leaderboard.enterEffect";
    }
}
