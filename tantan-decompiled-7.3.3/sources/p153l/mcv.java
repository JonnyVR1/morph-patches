package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;

/* JADX INFO: loaded from: classes4.dex */
public class mcv extends jk2<voiceSingTogether.VoiceSing, BLiveVoiceSingTogether> {
    public mcv(wbg0<BLiveVoiceSingTogether, BLiveVoiceSingTogether> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public final String m157936B(voiceSingTogether.CurrentSing currentSing) {
        if (currentSing == null) {
            return "";
        }
        return "userId :" + currentSing.getUserId() + SignParameters.NEW_LINE;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(voiceSingTogether.VoiceSing voiceSing, String str) {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final String m157938D(voiceSingTogether.NextSing nextSing) {
        if (nextSing == null) {
            return "";
        }
        return "userId :" + nextSing.getUserId() + SignParameters.NEW_LINE;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceSingTogether mo95993z(String str, voiceSingTogether.VoiceSing voiceSing) {
        voiceSing.getStatus();
        voiceSing.getId();
        m157936B(voiceSing.getCurrentSing());
        m157938D(voiceSing.getNextSing());
        voiceSing.toString();
        return f7t.m124494n(voiceSing);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<voiceSingTogether.VoiceSing> mo95510b() {
        return voiceSingTogether.VoiceSing.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "intl.voice.sing";
    }
}
