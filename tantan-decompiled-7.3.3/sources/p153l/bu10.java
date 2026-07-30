package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPlayer;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;

/* JADX INFO: loaded from: classes5.dex */
public class bu10 {
    /* JADX INFO: renamed from: a */
    public static boolean m106416a(i6t i6tVar, String str) {
        return ((Boolean) i6tVar.m138856F3(new ss10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m187670e(str))).booleanValue() && ((Boolean) i6tVar.m138856F3(new ts10(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106417b(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals("playing");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m106418c(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals("playing") || multiPk.getStage().equals(BLivePkStage.punishing);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m106419d(LongLinkLiveMultiPk.MultiPk multiPk) {
        if (multiPk == null) {
            return false;
        }
        return multiPk.getStage().equals(BLivePkStage.punishing);
    }

    /* JADX INFO: renamed from: e */
    public static LongLinkLiveMultiPk.MultiPk m106420e(BLiveMultiPkDetail bLiveMultiPkDetail) {
        LongLinkLiveMultiPk.MultiPk.Builder winnerUserId = LongLinkLiveMultiPk.MultiPk.newBuilder().setId(bLiveMultiPkDetail.f45255id).setStage(bLiveMultiPkDetail.stage).setStartTs(bLiveMultiPkDetail.startTs).setDuration(bLiveMultiPkDetail.duration).setWinnerUserId(bLiveMultiPkDetail.winnerUserId);
        for (int i = 0; i < bLiveMultiPkDetail.players.size(); i++) {
            BLiveMultiPkPlayer bLiveMultiPkPlayer = bLiveMultiPkDetail.players.get(i);
            winnerUserId.addPlayers(i, LongLinkLiveMultiPk.MultiPkPlayer.newBuilder().setUserId(bLiveMultiPkPlayer.userId).setPosition(bLiveMultiPkPlayer.position).setRole(bLiveMultiPkPlayer.role).setRoomId(bLiveMultiPkPlayer.roomId).setLiveId(bLiveMultiPkPlayer.liveId).setPoint(bLiveMultiPkPlayer.point).setRank(bLiveMultiPkPlayer.rank).build());
        }
        return winnerUserId.build();
    }
}
