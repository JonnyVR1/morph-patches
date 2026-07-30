package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;

/* JADX INFO: loaded from: classes4.dex */
public class us10 extends jk2<LongLinkLiveMultiPk.MultiPkInviteAccepted, LongLinkLiveMultiPk.MultiPkInviteAccepted> {
    public us10(wbg0<LongLinkLiveMultiPk.MultiPkInviteAccepted, LongLinkLiveMultiPk.MultiPkInviteAccepted> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted, String str) {
        return multiPkInviteAccepted != null;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteAccepted> mo95510b() {
        return LongLinkLiveMultiPk.MultiPkInviteAccepted.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.multiPk.invite.accepted";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteAccepted mo95993z(String str, LongLinkLiveMultiPk.MultiPkInviteAccepted multiPkInviteAccepted) {
        return multiPkInviteAccepted;
    }
}
