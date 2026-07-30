package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPlayer;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;

/* JADX INFO: loaded from: classes5.dex */
public class rl10 {
    /* JADX INFO: renamed from: a */
    public static boolean m179774a(h4t h4tVar, String str) {
        return ((Boolean) h4tVar.m129297F3(new ik10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m136756e(str))).booleanValue() && ((Boolean) h4tVar.m129297F3(new jk10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179775b(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals("playing");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m179776c(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals("playing") || multiPk.getStage().equals(BLivePkStage.punishing);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m179777d(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals(BLivePkStage.punishing);
    }

    /* JADX INFO: renamed from: e */
    public static LongLinkLiveMultiPk.MultiPk m179778e(BLiveMultiPkDetail bLiveMultiPkDetail) {
        LongLinkLiveMultiPk.MultiPk.Builder winnerUserId = LongLinkLiveMultiPk.MultiPk.newBuilder().setId(bLiveMultiPkDetail.f44407id).setStage(bLiveMultiPkDetail.stage).setStartTs(bLiveMultiPkDetail.startTs).setDuration(bLiveMultiPkDetail.duration).setWinnerUserId(bLiveMultiPkDetail.winnerUserId);
        for (int i = 0; i < bLiveMultiPkDetail.players.size(); i++) {
            BLiveMultiPkPlayer bLiveMultiPkPlayer = bLiveMultiPkDetail.players.get(i);
            winnerUserId.addPlayers(i, LongLinkLiveMultiPk.MultiPkPlayer.newBuilder().setUserId(bLiveMultiPkPlayer.userId).setPosition(bLiveMultiPkPlayer.position).setRole(bLiveMultiPkPlayer.role).setRoomId(bLiveMultiPkPlayer.roomId).setLiveId(bLiveMultiPkPlayer.liveId).setPoint(bLiveMultiPkPlayer.point).setRank(bLiveMultiPkPlayer.rank).build());
        }
        return winnerUserId.build();
    }
}
