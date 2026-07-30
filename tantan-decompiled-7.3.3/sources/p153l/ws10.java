package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;

/* JADX INFO: loaded from: classes4.dex */
public class ws10 extends jk2<LongLinkLiveMultiPk.MultiPkInviteNotify, LongLinkLiveMultiPk.MultiPkInviteNotify> {
    public ws10(wbg0<LongLinkLiveMultiPk.MultiPkInviteNotify, LongLinkLiveMultiPk.MultiPkInviteNotify> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify, String str) {
        return multiPkInviteNotify != null;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkInviteNotify> mo95510b() {
        return LongLinkLiveMultiPk.MultiPkInviteNotify.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.multiPk.invite.notify";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkInviteNotify mo95993z(String str, LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        return multiPkInviteNotify;
    }
}
