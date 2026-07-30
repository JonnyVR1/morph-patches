package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;

/* JADX INFO: loaded from: classes4.dex */
public class qwo0 extends jk2<VoiceSweet.VoiceCpHouseUpgradeMessage, VoiceSweet.VoiceCpHouseUpgradeMessage> {
    public qwo0(wbg0<VoiceSweet.VoiceCpHouseUpgradeMessage, VoiceSweet.VoiceCpHouseUpgradeMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceSweet.VoiceCpHouseUpgradeMessage> mo95510b() {
        return VoiceSweet.VoiceCpHouseUpgradeMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.cp.houseUpgrade";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSweet.VoiceCpHouseUpgradeMessage mo95993z(String str, VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        return voiceCpHouseUpgradeMessage;
    }
}
