package p153l;

import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;

/* JADX INFO: loaded from: classes4.dex */
public class ks40 extends jk2<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> {
    public ks40(wbg0<VoiceNineMicUserScore.VoiceLiveBossUserScore, VoiceNineMicUserScore.VoiceLiveBossUserScore> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore, String str) {
        return m159460r(voiceLiveBossUserScore.getRoomId(), "no_care", voiceLiveBossUserScore.getLiveId());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceNineMicUserScore.VoiceLiveBossUserScore> mo95510b() {
        return VoiceNineMicUserScore.VoiceLiveBossUserScore.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.bossMode.userScore";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNineMicUserScore.VoiceLiveBossUserScore mo95993z(String str, VoiceNineMicUserScore.VoiceLiveBossUserScore voiceLiveBossUserScore) {
        return voiceLiveBossUserScore;
    }
}
