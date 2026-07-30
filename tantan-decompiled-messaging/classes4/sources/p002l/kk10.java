package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kk10 extends bk2<LongLinkLiveMultiPk.MultiPkInviteAccepted, LongLinkLiveMultiPk.MultiPkInviteAccepted> {
    public kk10(p3g0<LongLinkLiveMultiPk.MultiPkInviteAccepted, LongLinkLiveMultiPk.MultiPkInviteAccepted> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted, String str) {
        return multiPkInviteAccepted != null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteAccepted> mo9244b() {
        return LongLinkLiveMultiPk.MultiPkInviteAccepted.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multiPk.invite.accepted";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteAccepted mo9251z(String str, LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted) {
        return multiPkInviteAccepted;
    }
}
