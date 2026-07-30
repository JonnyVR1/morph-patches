package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class ney {
    /* JADX INFO: renamed from: a */
    public static boolean m159134a(long j) {
        return j >= 38;
    }

    /* JADX INFO: renamed from: b */
    public static void m159135b(h4t h4tVar) {
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(1100));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX INFO: renamed from: c */
    public static void m159136c(h4t h4tVar, String str) {
        if (h4tVar.m206027E2().m132146l0() == null) {
            return;
        }
        h4tVar.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(IMediaPlayer.MEDIA_INFO_INITBUFFERING_START).userId(str).setSource("liveLeaderboard").setFromIdentity(bqq.m103386a(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, str, 1100)).setTo(bqq.m103389d(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, str, 1100)).setScene("live").trackFrom("liveOnlineUser").build());
    }
}
