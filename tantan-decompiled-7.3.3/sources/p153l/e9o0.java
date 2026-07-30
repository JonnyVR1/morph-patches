package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class e9o0 extends jk2<LongLinkLiveMessage.VoiceMemberUpdate, LongLinkLiveMessage.VoiceMemberUpdate> {
    public e9o0(wbg0<LongLinkLiveMessage.VoiceMemberUpdate, LongLinkLiveMessage.VoiceMemberUpdate> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceMemberUpdate> mo95510b() {
        return LongLinkLiveMessage.VoiceMemberUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.memberUpdate";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceMemberUpdate mo95993z(String str, LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        return voiceMemberUpdate;
    }
}
