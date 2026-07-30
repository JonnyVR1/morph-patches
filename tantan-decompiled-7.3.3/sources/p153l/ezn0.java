package p153l;

import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveRankingBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRankingType;

/* JADX INFO: loaded from: classes4.dex */
public class ezn0 extends jk2<VoiceLiveRankingBoard.VoiceLiveRankings, BLiveVoiceLeaderBoardItem> {
    public ezn0(wbg0<BLiveVoiceLeaderBoardItem, BLiveVoiceLeaderBoardItem> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static BLiveVoiceLeaderBoardItem m123385B(VoiceLiveRankingBoard.VoiceLiveRanking voiceLiveRanking, VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
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
    public static BLiveVoiceLeaderBoardItem m123386C(VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
        return m123385B(voiceLiveRankings.getRankings(0), voiceLiveRankings);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings, String str) {
        return voiceLiveRankings.getRankingsCount() > 0 && m159460r(voiceLiveRankings.getRankings(0).getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceLeaderBoardItem mo95993z(String str, VoiceLiveRankingBoard.VoiceLiveRankings voiceLiveRankings) {
        return m123386C(voiceLiveRankings);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveRankingBoard.VoiceLiveRankings> mo95510b() {
        return VoiceLiveRankingBoard.VoiceLiveRankings.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.leaderboard.enterEffect";
    }
}
