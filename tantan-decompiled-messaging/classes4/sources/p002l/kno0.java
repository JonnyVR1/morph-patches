package p002l;

import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kno0 extends bk2<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> {
    public kno0(p3g0<VoiceSweet.VoiceCpBindMessage, VoiceSweet.VoiceCpBindMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceSweet.VoiceCpBindMessage> mo9244b() {
        return VoiceSweet.VoiceCpBindMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.cp.bindRelationship";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSweet.VoiceCpBindMessage mo9251z(String str, VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        return voiceCpBindMessage;
    }
}
