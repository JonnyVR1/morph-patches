package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;

/* JADX INFO: loaded from: classes4.dex */
public class lav extends bk2<voiceSingTogether.VoiceSing, BLiveVoiceSingTogether> {
    public lav(p3g0<BLiveVoiceSingTogether, BLiveVoiceSingTogether> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final String m149177B(voiceSingTogether.CurrentSing currentSing) {
        if (currentSing == null) {
            return "";
        }
        return "userId :" + currentSing.getUserId() + SignParameters.NEW_LINE;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(voiceSingTogether.VoiceSing voiceSing, String str) {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final String m149179D(voiceSingTogether.NextSing nextSing) {
        if (nextSing == null) {
            return "";
        }
        return "userId :" + nextSing.getUserId() + SignParameters.NEW_LINE;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSingTogether mo94461z(String str, voiceSingTogether.VoiceSing voiceSing) {
        voiceSing.getStatus();
        voiceSing.getId();
        m149177B(voiceSing.getCurrentSing());
        m149179D(voiceSing.getNextSing());
        voiceSing.toString();
        return e5t.m114910n(voiceSing);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<voiceSingTogether.VoiceSing> mo94398b() {
        return voiceSingTogether.VoiceSing.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "intl.voice.sing";
    }
}
