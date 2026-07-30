package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;

/* JADX INFO: loaded from: classes4.dex */
public class yq70 extends bk2<LongLinkLiveMessage.PkInviteRejected, LivePkMessage> {
    public yq70(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.PkInviteRejected pkInviteRejected, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo94461z(String str, LongLinkLiveMessage.PkInviteRejected pkInviteRejected) {
        return new LivePkMessage(pkInviteRejected.getPkInviteId(), "pk_invite_reject");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class mo94398b() {
        return LongLinkLiveMessage.PkInviteRejected.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.pk.invite.rejected";
    }
}
