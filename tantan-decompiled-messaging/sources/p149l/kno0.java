package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;

/* JADX INFO: loaded from: classes4.dex */
public class kno0 extends bk2<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> {
    public kno0(p3g0<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceSweet.VoiceCpBindMessage> mo94398b() {
        return VoiceSweet.VoiceCpBindMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.cp.bindRelationship";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSweet.VoiceCpBindMessage mo94461z(String str, VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        return voiceCpBindMessage;
    }
}
