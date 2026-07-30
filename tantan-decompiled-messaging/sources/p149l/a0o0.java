package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class a0o0 extends bk2<LongLinkLiveMessage.VoiceMemberUpdate, LongLinkLiveMessage.VoiceMemberUpdate> {
    public a0o0(p3g0<LongLinkLiveMessage.VoiceMemberUpdate, LongLinkLiveMessage.VoiceMemberUpdate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceMemberUpdate> mo94398b() {
        return LongLinkLiveMessage.VoiceMemberUpdate.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.memberUpdate";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceMemberUpdate mo94461z(String str, LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        return voiceMemberUpdate;
    }
}
