package p002l;

import com.p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wj40 extends bk2<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> {
    public wj40(p3g0<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore, String str) {
        return m24095r(voiceLiveBossUserScore.getRoomId(), "no_care", voiceLiveBossUserScore.getLiveId());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceNineMicUserScore.VoiceLiveBossUserScore> mo9244b() {
        return VoiceNineMicUserScore.VoiceLiveBossUserScore.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.bossMode.userScore";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNineMicUserScore.VoiceLiveBossUserScore mo9251z(String str, VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore) {
        return voiceLiveBossUserScore;
    }
}
