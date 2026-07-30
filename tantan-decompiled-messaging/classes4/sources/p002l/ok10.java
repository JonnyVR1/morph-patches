package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ok10 extends bk2<LongLinkLiveMultiPk.MultiPkInviteRejected, LongLinkLiveMultiPk.MultiPkInviteRejected> {
    public ok10(p3g0<LongLinkLiveMultiPk.MultiPkInviteRejected, LongLinkLiveMultiPk.MultiPkInviteRejected> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected, String str) {
        return multiPkInviteRejected != null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteRejected> mo9244b() {
        return LongLinkLiveMultiPk.MultiPkInviteRejected.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multiPk.invite.rejected";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteRejected mo9251z(String str, LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected) {
        return multiPkInviteRejected;
    }
}
