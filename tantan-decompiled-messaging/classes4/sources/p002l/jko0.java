package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jko0 extends bk2<LongLinkLiveMessage.VoiceSongGameUserNotice, VoiceSongGameMessage> {
    public jko0(p3g0<VoiceSongGameMessage, VoiceSongGameMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSongGameMessage mo9251z(String str, LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice) {
        return new VoiceSongGameMessage(voiceSongGameUserNotice);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSongGameUserNotice> mo9244b() {
        return LongLinkLiveMessage.VoiceSongGameUserNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.game.voiceSongGameUserNotice";
    }
}
