package p149l;

import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;

/* JADX INFO: loaded from: classes4.dex */
public class wj40 extends bk2<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> {
    public wj40(p3g0<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore, String str) {
        return m199212r(voiceLiveBossUserScore.getRoomId(), "no_care", voiceLiveBossUserScore.getLiveId());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceNineMicUserScore.VoiceLiveBossUserScore> mo94398b() {
        return VoiceNineMicUserScore.VoiceLiveBossUserScore.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.bossMode.userScore";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNineMicUserScore.VoiceLiveBossUserScore mo94461z(String str, VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore) {
        return voiceLiveBossUserScore;
    }
}
