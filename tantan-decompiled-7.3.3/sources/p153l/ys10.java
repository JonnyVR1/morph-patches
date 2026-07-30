package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;

/* JADX INFO: loaded from: classes4.dex */
public class ys10 extends jk2<LongLinkLiveMultiPk.MultiPkInviteRejected, LongLinkLiveMultiPk.MultiPkInviteRejected> {
    public ys10(wbg0<LongLinkLiveMultiPk.MultiPkInviteRejected, LongLinkLiveMultiPk.MultiPkInviteRejected> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected, String str) {
        return multiPkInviteRejected != null;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteRejected> mo95510b() {
        return LongLinkLiveMultiPk.MultiPkInviteRejected.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.multiPk.invite.rejected";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteRejected mo95993z(String str, LongLinkLiveMultiPk.MultiPkInviteRejected multiPkInviteRejected) {
        return multiPkInviteRejected;
    }
}
