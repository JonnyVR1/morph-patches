package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;

/* JADX INFO: loaded from: classes4.dex */
public class owo0 extends jk2<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> {
    public owo0(wbg0<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceSweet.VoiceCpBindMessage> mo95510b() {
        return VoiceSweet.VoiceCpBindMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.cp.bindRelationship";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSweet.VoiceCpBindMessage mo95993z(String str, VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        return voiceCpBindMessage;
    }
}
