package p002l;

import com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lav extends bk2<voiceSingTogether.VoiceSing, BLiveVoiceSingTogether> {
    public lav(p3g0<BLiveVoiceSingTogether, BLiveVoiceSingTogether> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final String m17120B(voiceSingTogether.CurrentSing currentSing) {
        if (currentSing == null) {
            return "";
        }
        return "userId :" + currentSing.getUserId() + "\n";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(voiceSingTogether.VoiceSing voiceSing, String str) {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final String m17122D(voiceSingTogether.NextSing nextSing) {
        if (nextSing == null) {
            return "";
        }
        return "userId :" + nextSing.getUserId() + "\n";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSingTogether mo9251z(String str, voiceSingTogether.VoiceSing voiceSing) {
        voiceSing.getStatus();
        voiceSing.getId();
        m17120B(voiceSing.getCurrentSing());
        m17122D(voiceSing.getNextSing());
        voiceSing.toString();
        return e5t.m12209n(voiceSing);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<voiceSingTogether.VoiceSing> mo9244b() {
        return voiceSingTogether.VoiceSing.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "intl.voice.sing";
    }
}
