package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mk10 extends bk2<LongLinkLiveMultiPk.MultiPkInviteNotify, LongLinkLiveMultiPk.MultiPkInviteNotify> {
    public mk10(p3g0<LongLinkLiveMultiPk.MultiPkInviteNotify, LongLinkLiveMultiPk.MultiPkInviteNotify> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify, String str) {
        return multiPkInviteNotify != null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteNotify> mo9244b() {
        return LongLinkLiveMultiPk.MultiPkInviteNotify.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multiPk.invite.notify";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteNotify mo9251z(String str, LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        return multiPkInviteNotify;
    }
}
