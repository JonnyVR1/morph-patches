package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x8n0 extends bk2<LongLinkLiveMessage.VoiceLiveGame, LongLinkLiveMessage.VoiceLiveGame> {
    public x8n0(p3g0<LongLinkLiveMessage.VoiceLiveGame, LongLinkLiveMessage.VoiceLiveGame> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceLiveGame voiceLiveGame, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveGame> mo9244b() {
        return LongLinkLiveMessage.VoiceLiveGame.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.games";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveGame mo9251z(String str, LongLinkLiveMessage.VoiceLiveGame voiceLiveGame) {
        return voiceLiveGame;
    }
}
