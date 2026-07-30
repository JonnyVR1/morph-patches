package p002l;

import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mno0 extends bk2<VoiceSweet.VoiceCpHouseUpgradeMessage, VoiceSweet.VoiceCpHouseUpgradeMessage> {
    public mno0(p3g0<VoiceSweet.VoiceCpHouseUpgradeMessage, VoiceSweet.VoiceCpHouseUpgradeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceSweet.VoiceCpHouseUpgradeMessage> mo9244b() {
        return VoiceSweet.VoiceCpHouseUpgradeMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.cp.houseUpgrade";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSweet.VoiceCpHouseUpgradeMessage mo9251z(String str, VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        return voiceCpHouseUpgradeMessage;
    }
}
