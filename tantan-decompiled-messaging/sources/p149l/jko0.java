package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;

/* JADX INFO: loaded from: classes4.dex */
public class jko0 extends bk2<LongLinkLiveMessage.VoiceSongGameUserNotice, VoiceSongGameMessage> {
    public jko0(p3g0<VoiceSongGameMessage, VoiceSongGameMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSongGameMessage mo94461z(String str, LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice) {
        return new VoiceSongGameMessage(voiceSongGameUserNotice);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSongGameUserNotice> mo94398b() {
        return LongLinkLiveMessage.VoiceSongGameUserNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.game.voiceSongGameUserNotice";
    }
}
