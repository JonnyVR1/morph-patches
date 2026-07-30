package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class kny {
    /* JADX INFO: renamed from: a */
    public static boolean m150553a(long j) {
        return j >= 38;
    }

    /* JADX INFO: renamed from: b */
    public static void m150554b(i6t i6tVar) {
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(1100));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2] */
    /* JADX INFO: renamed from: c */
    public static void m150555c(i6t i6tVar, String str) {
        if (i6tVar.m213810E2().m168532l0() == null) {
            return;
        }
        i6tVar.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(IMediaPlayer.MEDIA_INFO_INITBUFFERING_START).userId(str).setSource("liveLeaderboard").setFromIdentity(csq.m112227a(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, str, 1100)).setTo(csq.m112230d(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, str, 1100)).setScene("live").trackFrom("liveOnlineUser").build());
    }
}
