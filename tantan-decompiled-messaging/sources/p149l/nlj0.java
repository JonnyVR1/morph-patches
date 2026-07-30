package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGameResult;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVoteResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class nlj0 {
    /* JADX INFO: renamed from: a */
    public static BLiveUndercoverGame m160060a(VoiceUndercoverBean.VoiceUndercover voiceUndercover) {
        BLiveUndercoverGame bLiveUndercoverGame = new BLiveUndercoverGame();
        if (voiceUndercover == null) {
            return bLiveUndercoverGame;
        }
        if (voiceUndercover.getCurrentPlayersList() != null) {
            bLiveUndercoverGame.currentPlayers = m160062c(voiceUndercover, voiceUndercover.getCurrentPlayersList());
        }
        bLiveUndercoverGame.remainSeconds = voiceUndercover.getRemainSeconds();
        bLiveUndercoverGame.countDownSeconds = voiceUndercover.getCountDownSeconds();
        if (voiceUndercover.getVotesList() != null) {
            bLiveUndercoverGame.votes = m160063d(voiceUndercover.getVotesList());
        }
        if (voiceUndercover.getVoteResult() != null) {
            bLiveUndercoverGame.voteResult = m160064e(voiceUndercover.getVoteResult());
        }
        if (voiceUndercover.getGameResult() != null) {
            bLiveUndercoverGame.gameResult = m160061b(voiceUndercover.getGameResult());
        }
        bLiveUndercoverGame.status = voiceUndercover.getStatus();
        bLiveUndercoverGame.f44464id = voiceUndercover.getId();
        bLiveUndercoverGame.liveId = voiceUndercover.getLiveId();
        bLiveUndercoverGame.toast = voiceUndercover.getToast();
        return bLiveUndercoverGame;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveUndercoverGameResult m160061b(VoiceUndercoverBean.VoiceUndercover.GameResult gameResult) {
        BLiveUndercoverGameResult bLiveUndercoverGameResult = new BLiveUndercoverGameResult();
        bLiveUndercoverGameResult.winnerRole = gameResult.getWinnerRole();
        if (gameResult.getNormalMasksList() != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < gameResult.getNormalMasksList().size(); i++) {
                arrayList.add(rxn0.m181617a(gameResult.getNormalMasks(i)));
            }
            bLiveUndercoverGameResult.normalMasks = arrayList;
        }
        bLiveUndercoverGameResult.normalWord = gameResult.getNormalWord();
        if (gameResult.getUndercoverMasksList() != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < gameResult.getUndercoverMasksList().size(); i2++) {
                arrayList2.add(rxn0.m181617a(gameResult.getUndercoverMasks(i2)));
            }
            bLiveUndercoverGameResult.undercoverMasks = arrayList2;
        }
        bLiveUndercoverGameResult.undercoverWord = gameResult.getUndercoverWord();
        return bLiveUndercoverGameResult;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<BLiveUndercoverCurrentPlayer> m160062c(VoiceUndercoverBean.VoiceUndercover voiceUndercover, List<VoiceUndercoverBean.VoiceUndercover.Player> list) {
        ArrayList<BLiveUndercoverCurrentPlayer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer = new BLiveUndercoverCurrentPlayer();
            VoiceUndercoverBean.VoiceUndercover.Player player = list.get(i);
            if (player != null && !TextUtils.isEmpty(player.getUserId())) {
                bLiveUndercoverCurrentPlayer.userId = player.getUserId();
                bLiveUndercoverCurrentPlayer.number = player.getNumber();
                bLiveUndercoverCurrentPlayer.mask = rxn0.m181617a(player.getMask());
                bLiveUndercoverCurrentPlayer.role = player.getRole();
                bLiveUndercoverCurrentPlayer.word = voiceUndercover.getWord();
                arrayList.add(bLiveUndercoverCurrentPlayer);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<BLiveUndercoverVote> m160063d(List<VoiceUndercoverBean.VoiceUndercover.Vote> list) {
        ArrayList<BLiveUndercoverVote> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            BLiveUndercoverVote bLiveUndercoverVote = new BLiveUndercoverVote();
            VoiceUndercoverBean.VoiceUndercover.Vote vote = list.get(i);
            bLiveUndercoverVote.candidateMask = rxn0.m181617a(vote.getCandidateMask());
            bLiveUndercoverVote.number = vote.getNumber();
            bLiveUndercoverVote.voterNumbers = vote.getVoterNumbersList();
            arrayList.add(bLiveUndercoverVote);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveUndercoverVoteResult m160064e(VoiceUndercoverBean.VoiceUndercover.VoteResult voteResult) {
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = new BLiveUndercoverVoteResult();
        bLiveUndercoverVoteResult.isDraw = voteResult.getIsDraw();
        bLiveUndercoverVoteResult.resultStr = voteResult.getResult();
        bLiveUndercoverVoteResult.outUserRole = voteResult.getOutUserRole();
        bLiveUndercoverVoteResult.outUserMask = rxn0.m181617a(voteResult.getOutUserMask());
        return bLiveUndercoverVoteResult;
    }
}
